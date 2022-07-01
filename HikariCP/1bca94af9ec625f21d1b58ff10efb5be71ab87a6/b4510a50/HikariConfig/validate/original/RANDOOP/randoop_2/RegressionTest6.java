import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
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
        int int27 = hikariConfig26.getAcquireRetries();
        hikariConfig26.setInitializationFailFast(true);
        hikariConfig26.setConnectionTestQuery("HikariPool-888");
        long long32 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.setMinimumPoolSize(3);
        int int35 = hikariConfig26.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
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
        hikariConfig1.setConnectionInitSql("HikariPool-2872");
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries(0);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (short) -1);
        hikariConfig1.setMinimumPoolSize(0);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
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
        hikariConfig1.setDataSourceClassName("HikariPool-594");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        hikariConfig18.setCatalog("HikariPool-143");
        int int25 = hikariConfig18.getMinimumPoolSize();
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        boolean boolean32 = hikariConfig31.isInitializationFailFast();
        hikariConfig31.setInitializationFailFast(true);
        boolean boolean35 = hikariConfig31.isJdbc4ConnectionTest();
        long long36 = hikariConfig31.getConnectionTimeout();
        hikariConfig31.setAcquireIncrement(100);
        hikariConfig31.setTransactionIsolation("hi!");
        int int41 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setAcquireRetries((int) (byte) 1);
        int int44 = hikariConfig31.getMinimumPoolSize();
        long long45 = hikariConfig31.getLeakDetectionThreshold();
        hikariConfig31.setTransactionIsolation("HikariPool-391");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        boolean boolean50 = hikariConfig49.isInitializationFailFast();
        hikariConfig49.setInitializationFailFast(true);
        int int53 = hikariConfig49.getAcquireRetries();
        long long54 = hikariConfig49.getMaxLifetime();
        hikariConfig49.setMaxLifetime((long) (short) 0);
        long long57 = hikariConfig49.getIdleTimeout();
        boolean boolean58 = hikariConfig49.isRegisterMbeans();
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        boolean boolean61 = hikariConfig60.isInitializationFailFast();
        hikariConfig60.setLeakDetectionThreshold((long) '4');
        java.lang.String str64 = hikariConfig60.getConnectionCustomizerClassName();
        java.util.Properties properties65 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties65);
        boolean boolean67 = hikariConfig66.isInitializationFailFast();
        hikariConfig66.setInitializationFailFast(true);
        javax.sql.DataSource dataSource70 = null;
        hikariConfig66.setDataSource(dataSource70);
        hikariConfig66.setAcquireRetryDelay((long) 'a');
        java.lang.String str74 = hikariConfig66.getConnectionCustomizerClassName();
        java.util.Properties properties75 = hikariConfig66.getDataSourceProperties();
        java.util.Properties properties76 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties76);
        java.util.Properties properties78 = hikariConfig77.getDataSourceProperties();
        hikariConfig66.setDataSourceProperties(properties78);
        hikariConfig60.setDataSourceProperties(properties78);
        hikariConfig49.setDataSourceProperties(properties78);
        hikariConfig31.setDataSourceProperties(properties78);
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties78);
        hikariConfig1.setDataSourceProperties(properties78);
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1800000L + "'", long54 == 1800000L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 600000L + "'", long57 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(properties75);
        org.junit.Assert.assertNotNull(properties78);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
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
        boolean boolean29 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setAcquireRetryDelay(0L);
        long long32 = hikariConfig1.getAcquireRetryDelay();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
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
        hikariConfig1.setIdleTimeout((long) 10);
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAcquireIncrement(0);
        int int24 = hikariConfig1.getAcquireIncrement();
        java.lang.Class<?> wildcardClass25 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
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
        hikariConfig1.setAutoCommit(false);
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
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
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        hikariConfig1.setRegisterMbeans(false);
        int int20 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-963");
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
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
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setAcquireRetries(100);
        boolean boolean47 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTimeout(0L);
        javax.sql.DataSource dataSource50 = null;
        hikariConfig1.setDataSource(dataSource50);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
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
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.lang.String str25 = hikariConfig16.getConnectionInitSql();
        long long26 = hikariConfig16.getLeakDetectionThreshold();
        hikariConfig16.setConnectionTestQuery("HikariPool-393");
        hikariConfig16.setDataSourceClassName("HikariPool-481");
        hikariConfig16.setPoolName("hi!");
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setTransactionIsolation("");
        hikariConfig34.setConnectionTestQuery("HikariPool-143");
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        boolean boolean41 = hikariConfig40.isInitializationFailFast();
        hikariConfig40.setInitializationFailFast(true);
        hikariConfig40.setAcquireRetryDelay(1L);
        boolean boolean46 = hikariConfig40.isAutoCommit();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        java.util.Properties properties49 = hikariConfig48.getDataSourceProperties();
        hikariConfig40.setDataSourceProperties(properties49);
        hikariConfig34.setDataSourceProperties(properties49);
        hikariConfig16.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig1.addDataSourceProperty("HikariPool-7715", (java.lang.Object) properties49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        boolean boolean20 = hikariConfig16.isJdbc4ConnectionTest();
        long long21 = hikariConfig16.getConnectionTimeout();
        hikariConfig16.setPoolName("hi!");
        hikariConfig16.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties26 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties26);
        long long28 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-907");
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
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
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-7243");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
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
        hikariConfig1.setCatalog("HikariPool-5236");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4119");
        hikariConfig1.setInitializationFailFast(true);
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
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
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("HikariPool-1455");
        hikariConfig1.validate();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAcquireRetries(1);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) 3);
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.getConnectionTimeout();
        long long4 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
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
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setConnectionTimeout(100L);
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime((long) 60);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-18303");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
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
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-5236");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
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
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        long long18 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-27732" + "'", str12, "HikariPool-27732");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
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
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        hikariConfig1.setTransactionIsolation("HikariPool-2722");
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str23 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
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
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
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
        hikariConfig1.setDataSourceClassName("HikariPool-700");
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-18500");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
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
        hikariConfig1.setAcquireIncrement((int) (short) -1);
        int int25 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-4550");
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        hikariConfig32.setAcquireRetryDelay((long) 'a');
        java.lang.String str40 = hikariConfig32.getConnectionCustomizerClassName();
        java.lang.String str41 = hikariConfig32.getConnectionInitSql();
        long long42 = hikariConfig32.getLeakDetectionThreshold();
        hikariConfig32.setConnectionTestQuery("HikariPool-393");
        hikariConfig32.setJdbc4ConnectionTest(false);
        java.lang.String str47 = hikariConfig32.getConnectionInitSql();
        java.lang.String str48 = hikariConfig32.getConnectionInitSql();
        java.util.Properties properties49 = hikariConfig32.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-13348", (java.lang.Object) properties49);
        hikariConfig1.setMinimumPoolSize(0);
        boolean boolean53 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
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
        hikariConfig34.setIdleTimeout((long) '4');
        hikariConfig34.setAcquireRetries((int) (byte) 100);
        int int53 = hikariConfig34.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        long long3 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("HikariPool-6728");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
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
        java.lang.Class<?> wildcardClass25 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
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
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAutoCommit(false);
        int int10 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-477");
        int int31 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-9269");
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-27790" + "'", str26, "HikariPool-27790");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26999");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26999 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        int int25 = hikariConfig16.getAcquireRetries();
        java.lang.String str26 = hikariConfig16.getDataSourceClassName();
        hikariConfig16.setIdleTimeout((long) 60);
        int int29 = hikariConfig16.getAcquireIncrement();
        int int30 = hikariConfig16.getAcquireIncrement();
        int int31 = hikariConfig16.getMinimumPoolSize();
        java.util.Properties properties32 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
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
        javax.sql.DataSource dataSource33 = hikariConfig1.getDataSource();
        boolean boolean34 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-27584");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-27584 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
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
        hikariConfig1.setTransactionIsolation("HikariPool-27056");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
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
        hikariConfig7.setUseInstrumentation(false);
        long long27 = hikariConfig7.getConnectionTimeout();
        hikariConfig7.setTransactionIsolation("HikariPool-18402");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
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
        int int14 = hikariConfig1.getMinimumPoolSize();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-16756");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-16756 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
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
        int int27 = hikariConfig26.getAcquireRetries();
        java.lang.String str28 = hikariConfig26.getConnectionInitSql();
        hikariConfig26.setConnectionCustomizerClassName("HikariPool-5174");
        long long31 = hikariConfig26.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource32 = null;
        hikariConfig26.setDataSource(dataSource32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str37 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13622");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
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
        hikariConfig1.setCatalog("HikariPool-1644");
        int int18 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str20 = hikariConfig1.getCatalog();
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-27857" + "'", str15, "HikariPool-27857");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-143" + "'", str19, "HikariPool-143");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-1644" + "'", str20, "HikariPool-1644");
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-1639");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.setDataSourceClassName("HikariPool-4238");
        hikariConfig1.setAcquireRetries(35);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("HikariPool-1455");
        hikariConfig1.validate();
        hikariConfig1.setDataSourceClassName("HikariPool-2035");
        boolean boolean12 = hikariConfig1.isAutoCommit();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
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
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        int int26 = hikariConfig1.getAcquireIncrement();
        java.lang.String str27 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionTestQuery("");
        int int30 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isInitializationFailFast();
        hikariConfig33.setInitializationFailFast(true);
        javax.sql.DataSource dataSource37 = null;
        hikariConfig33.setDataSource(dataSource37);
        java.lang.String str39 = hikariConfig33.getCatalog();
        javax.sql.DataSource dataSource40 = null;
        hikariConfig33.setDataSource(dataSource40);
        java.lang.String str42 = hikariConfig33.getCatalog();
        javax.sql.DataSource dataSource43 = hikariConfig33.getDataSource();
        int int44 = hikariConfig33.getMaximumPoolSize();
        long long45 = hikariConfig33.getLeakDetectionThreshold();
        hikariConfig33.setTransactionIsolation("HikariPool-3158");
        hikariConfig1.addDataSourceProperty("HikariPool-10947", (java.lang.Object) "HikariPool-3158");
        int int49 = hikariConfig1.getAcquireIncrement();
        java.lang.String str50 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
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
        java.util.Properties properties26 = hikariConfig23.getDataSourceProperties();
        int int27 = hikariConfig23.getMaximumPoolSize();
        hikariConfig23.setUseInstrumentation(true);
        java.lang.String str30 = hikariConfig23.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-27877" + "'", str30, "HikariPool-27877");
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        long long16 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-27878" + "'", str8, "HikariPool-27878");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-17369");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-17369 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-25458");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        int int5 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
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
        hikariConfig1.setDataSourceClassName("hi!");
        long long18 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaxLifetime(0L);
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
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
        hikariConfig1.setPoolName("HikariPool-184");
        java.lang.String str21 = hikariConfig1.getCatalog();
        long long22 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(60);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setInitializationFailFast(true);
        java.lang.String str31 = hikariConfig27.getConnectionTestQuery();
        boolean boolean32 = hikariConfig27.isRegisterMbeans();
        hikariConfig27.setDataSourceClassName("hi!");
        hikariConfig27.setConnectionInitSql("");
        java.lang.String str37 = hikariConfig27.getCatalog();
        java.lang.String str38 = hikariConfig27.getPoolName();
        java.lang.String str39 = hikariConfig27.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-7309", (java.lang.Object) str39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-27907" + "'", str38, "HikariPool-27907");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        int int8 = hikariConfig1.getMinimumPoolSize();
        int int9 = hikariConfig1.getAcquireIncrement();
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setCatalog("HikariPool-6283");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
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
        hikariConfig1.setMaxLifetime(10L);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setCatalog("HikariPool-4383");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
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
        int int17 = hikariConfig1.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getMaxLifetime();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setTransactionIsolation("HikariPool-674");
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.getPoolName();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6418");
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.setAutoCommit(false);
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-27919" + "'", str10, "HikariPool-27919");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-6418" + "'", str14, "HikariPool-6418");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-14329");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.setDataSource(dataSource14);
        hikariConfig10.setAcquireRetryDelay((long) 'a');
        java.lang.String str18 = hikariConfig10.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig10.getDataSourceProperties();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig21.setDataSource(dataSource25);
        hikariConfig21.setAcquireRetryDelay((long) 'a');
        java.lang.String str29 = hikariConfig21.getConnectionCustomizerClassName();
        java.util.Properties properties30 = hikariConfig21.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties30);
        boolean boolean32 = hikariConfig10.isJdbc4ConnectionTest();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        hikariConfig34.setAcquireRetryDelay((long) 'a');
        java.lang.String str42 = hikariConfig34.getConnectionCustomizerClassName();
        java.util.Properties properties43 = hikariConfig34.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        hikariConfig1.setCatalog("HikariPool-2120");
        java.lang.String str48 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource49 = null;
        hikariConfig1.setDataSource(dataSource49);
        long long51 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties43);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-27923" + "'", str48, "HikariPool-27923");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 600000L + "'", long51 == 600000L);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-27927" + "'", str5, "HikariPool-27927");
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9457");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9457 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig8.getConnectionInitSql();
        boolean boolean18 = hikariConfig8.isRegisterMbeans();
        java.lang.String str19 = hikariConfig8.getCatalog();
        java.util.Properties properties20 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        int int24 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int27 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        long long9 = hikariConfig1.getIdleTimeout();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
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
        int int33 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
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
        java.util.Properties properties34 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay(52L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
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
        long long26 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        int int32 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
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
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        int int20 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setLeakDetectionThreshold((long) '4');
        java.lang.String str27 = hikariConfig23.getConnectionCustomizerClassName();
        hikariConfig23.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig23.setLeakDetectionThreshold((long) (short) 10);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isInitializationFailFast();
        hikariConfig33.setInitializationFailFast(true);
        javax.sql.DataSource dataSource37 = null;
        hikariConfig33.setDataSource(dataSource37);
        hikariConfig33.setAcquireRetryDelay((long) 'a');
        java.lang.String str41 = hikariConfig33.getConnectionCustomizerClassName();
        java.util.Properties properties42 = hikariConfig33.getDataSourceProperties();
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        boolean boolean45 = hikariConfig44.isInitializationFailFast();
        hikariConfig44.setInitializationFailFast(true);
        javax.sql.DataSource dataSource48 = null;
        hikariConfig44.setDataSource(dataSource48);
        hikariConfig44.setAcquireRetryDelay((long) 'a');
        java.lang.String str52 = hikariConfig44.getConnectionCustomizerClassName();
        java.util.Properties properties53 = hikariConfig44.getDataSourceProperties();
        hikariConfig33.setDataSourceProperties(properties53);
        hikariConfig23.setDataSourceProperties(properties53);
        hikariConfig23.setTransactionIsolation("HikariPool-3119");
        hikariConfig1.addDataSourceProperty("HikariPool-8010", (java.lang.Object) "HikariPool-3119");
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setConnectionTestQuery("HikariPool-1951");
        hikariConfig1.setLeakDetectionThreshold(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAutoCommit(false);
        int int20 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireIncrement((int) '4');
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
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
        hikariConfig1.setMinimumPoolSize(3);
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str24 = hikariConfig1.getPoolName();
        long long25 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-28008" + "'", str24, "HikariPool-28008");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
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
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        boolean boolean21 = hikariConfig1.isAutoCommit();
        boolean boolean22 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-477");
        int int31 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-9269");
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-28015" + "'", str26, "HikariPool-28015");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        long long6 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setAcquireRetryDelay((long) 'a');
        java.lang.String str17 = hikariConfig9.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.setDataSourceClassName("");
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.util.Properties properties34 = hikariConfig33.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties34);
        hikariConfig9.setDataSourceProperties(properties34);
        long long37 = hikariConfig9.getLeakDetectionThreshold();
        java.util.Properties properties38 = hikariConfig9.getDataSourceProperties();
        java.lang.String str39 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        hikariConfig41.setInitializationFailFast(true);
        boolean boolean45 = hikariConfig41.isJdbc4ConnectionTest();
        long long46 = hikariConfig41.getConnectionTimeout();
        hikariConfig41.setPoolName("hi!");
        hikariConfig41.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties51 = hikariConfig41.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig9.setDataSourceProperties(properties51);
        hikariConfig1.addDataSourceProperty("HikariPool-8073", (java.lang.Object) hikariConfig9);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str57 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5000L + "'", long46 == 5000L);
        org.junit.Assert.assertNotNull(properties51);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "HikariPool-28023" + "'", str57, "HikariPool-28023");
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
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
        hikariConfig7.setInitializationFailFast(false);
        boolean boolean29 = hikariConfig7.isAutoCommit();
        hikariConfig7.setIdleTimeout((long) 35);
        hikariConfig7.setTransactionIsolation("HikariPool-14898");
        hikariConfig7.setInitializationFailFast(false);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
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
        hikariConfig1.setAcquireRetries(1);
        long long18 = hikariConfig1.getMaxLifetime();
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
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
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setAcquireRetries(100);
        boolean boolean47 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionInitSql("HikariPool-4560");
        long long52 = hikariConfig1.getMaxLifetime();
        java.lang.String str53 = hikariConfig1.getDataSourceClassName();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1800000L + "'", long52 == 1800000L);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
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
        java.lang.String str15 = hikariConfig14.getPoolName();
        hikariConfig14.setTransactionIsolation("HikariPool-1797");
        hikariConfig14.setMaximumPoolSize(3);
        boolean boolean20 = hikariConfig14.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28051" + "'", str15, "HikariPool-28051");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4494");
        hikariConfig1.setIdleTimeout((long) (short) -1);
        java.lang.String str36 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetryDelay((long) 100);
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
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
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
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionTestQuery("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.addDataSourceProperty("HikariPool-609", (java.lang.Object) "HikariPool-1797");
        long long9 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        java.lang.String str17 = hikariConfig11.getCatalog();
        int int18 = hikariConfig11.getMinimumPoolSize();
        java.lang.String str19 = hikariConfig11.getCatalog();
        long long20 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.setJdbc4ConnectionTest(false);
        boolean boolean23 = hikariConfig11.isInitializationFailFast();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        int int29 = hikariConfig25.getAcquireRetries();
        long long30 = hikariConfig25.getMaxLifetime();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        javax.sql.DataSource dataSource34 = null;
        hikariConfig32.setDataSource(dataSource34);
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setInitializationFailFast(true);
        boolean boolean41 = hikariConfig37.isJdbc4ConnectionTest();
        long long42 = hikariConfig37.getConnectionTimeout();
        hikariConfig37.setPoolName("hi!");
        hikariConfig37.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties47 = hikariConfig37.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties47);
        hikariConfig25.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig11.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig1.setDataSourceProperties(properties47);
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        boolean boolean57 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1800000L + "'", long30 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        java.lang.String str8 = hikariConfig1.getPoolName();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        hikariConfig1.setIdleTimeout((long) 60);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-2948");
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-28099" + "'", str8, "HikariPool-28099");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setPoolName("HikariPool-5458");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-17191");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5127");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5127 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) 3);
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime((long) ' ');
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        hikariConfig1.setPoolName("HikariPool-6917");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isRegisterMbeans();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        hikariConfig17.setAcquireRetryDelay(1L);
        boolean boolean23 = hikariConfig17.isAutoCommit();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties26);
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.Class<?> wildcardClass31 = hikariConfig30.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
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
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isInitializationFailFast();
        hikariConfig33.setInitializationFailFast(true);
        hikariConfig33.setAcquireRetryDelay(1L);
        hikariConfig33.setAcquireIncrement((int) (byte) 100);
        int int41 = hikariConfig33.getTransactionIsolation();
        int int42 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setIdleTimeout((long) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-963", (java.lang.Object) hikariConfig33);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setDataSourceClassName("HikariPool-4272");
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig1.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-393");
        hikariConfig1.setMaxLifetime((long) 1);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
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
        hikariConfig1.setTransactionIsolation("HikariPool-27600");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
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
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        boolean boolean25 = hikariConfig1.isInitializationFailFast();
        java.lang.Class<?> wildcardClass26 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        long long9 = hikariConfig1.getIdleTimeout();
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetryDelay((long) (short) -1);
        hikariConfig1.setAcquireIncrement(10);
        hikariConfig1.setAcquireRetryDelay((long) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setTransactionIsolation("hi!");
        java.util.Properties properties13 = hikariConfig9.getDataSourceProperties();
        long long14 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig9.isAutoCommit();
        javax.sql.DataSource dataSource18 = hikariConfig9.getDataSource();
        java.util.Properties properties19 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties19);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        hikariConfig1.setConnectionTestQuery("HikariPool-5475");
        int int25 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
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
        int int17 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-859");
        hikariConfig1.setConnectionInitSql("HikariPool-1867");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setLeakDetectionThreshold(10L);
        int int15 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
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
        hikariConfig1.setAutoCommit(false);
        int int33 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str34 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(60);
        java.lang.String str37 = hikariConfig1.getPoolName();
        long long38 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-28179" + "'", str37, "HikariPool-28179");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
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
        hikariConfig1.setRegisterMbeans(false);
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout(1800000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setLeakDetectionThreshold(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setDataSourceClassName("HikariPool-18328");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
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
        java.lang.String str40 = hikariConfig9.getCatalog();
        hikariConfig9.setConnectionTestQuery("HikariPool-7573");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig9.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-28194" + "'", str35, "HikariPool-28194");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
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
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setInitializationFailFast(true);
        javax.sql.DataSource dataSource40 = null;
        hikariConfig36.setDataSource(dataSource40);
        hikariConfig36.setAcquireRetryDelay((long) 'a');
        java.lang.String str44 = hikariConfig36.getConnectionCustomizerClassName();
        java.lang.String str45 = hikariConfig36.getConnectionInitSql();
        long long46 = hikariConfig36.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long46);
        long long48 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetries((int) '4');
        java.lang.String str51 = hikariConfig1.getCatalog();
        long long52 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str55 = hikariConfig1.getConnectionTestQuery();
        int int56 = hikariConfig1.getAcquireRetries();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5000L + "'", long46 == 5000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setTransactionIsolation("HikariPool-2824");
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
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
        hikariConfig1.setConnectionInitSql("HikariPool-143");
        hikariConfig1.setMaximumPoolSize(35);
        long long18 = hikariConfig1.getIdleTimeout();
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("HikariPool-13562");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
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
        java.lang.String str27 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-477");
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setTransactionIsolation("hi!");
        java.util.Properties properties36 = hikariConfig32.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        long long38 = hikariConfig37.getMaxLifetime();
        java.lang.String str39 = hikariConfig37.getConnectionTestQuery();
        hikariConfig37.setMinimumPoolSize((int) '4');
        java.util.Properties properties42 = hikariConfig37.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-17720", (java.lang.Object) properties42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1800000L + "'", long38 == 1800000L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
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
        hikariConfig1.setAcquireIncrement(0);
        long long31 = hikariConfig1.getMaxLifetime();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
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
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        int int17 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        long long20 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setConnectionInitSql("HikariPool-3119");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        int int10 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str23 = hikariConfig14.getConnectionInitSql();
        hikariConfig14.setDataSourceClassName("");
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setInitializationFailFast(true);
        javax.sql.DataSource dataSource31 = null;
        hikariConfig27.setDataSource(dataSource31);
        hikariConfig27.setAcquireRetryDelay((long) 'a');
        java.lang.String str35 = hikariConfig27.getConnectionCustomizerClassName();
        java.util.Properties properties36 = hikariConfig27.getDataSourceProperties();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        java.util.Properties properties39 = hikariConfig38.getDataSourceProperties();
        hikariConfig27.setDataSourceProperties(properties39);
        hikariConfig14.setDataSourceProperties(properties39);
        hikariConfig14.setUseInstrumentation(true);
        int int44 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setLeakDetectionThreshold((long) (byte) 0);
        int int47 = hikariConfig14.getAcquireRetries();
        int int48 = hikariConfig14.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-3865", (java.lang.Object) hikariConfig14);
        hikariConfig14.setIdleTimeout((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-28240" + "'", str11, "HikariPool-28240");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
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
        boolean boolean27 = hikariConfig1.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
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
        int int34 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties35 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setInitializationFailFast(true);
        java.lang.String str41 = hikariConfig37.getConnectionTestQuery();
        boolean boolean42 = hikariConfig37.isRegisterMbeans();
        hikariConfig37.setDataSourceClassName("hi!");
        hikariConfig37.setConnectionInitSql("");
        java.lang.String str47 = hikariConfig37.getCatalog();
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        boolean boolean50 = hikariConfig49.isInitializationFailFast();
        hikariConfig49.setInitializationFailFast(true);
        javax.sql.DataSource dataSource53 = null;
        hikariConfig49.setDataSource(dataSource53);
        hikariConfig49.setAcquireRetryDelay((long) 'a');
        java.lang.String str57 = hikariConfig49.getConnectionCustomizerClassName();
        java.util.Properties properties58 = hikariConfig49.getDataSourceProperties();
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        boolean boolean61 = hikariConfig60.isInitializationFailFast();
        hikariConfig60.setInitializationFailFast(true);
        javax.sql.DataSource dataSource64 = null;
        hikariConfig60.setDataSource(dataSource64);
        hikariConfig60.setAcquireRetryDelay((long) 'a');
        java.lang.String str68 = hikariConfig60.getConnectionCustomizerClassName();
        java.util.Properties properties69 = hikariConfig60.getDataSourceProperties();
        hikariConfig49.setDataSourceProperties(properties69);
        hikariConfig37.setDataSourceProperties(properties69);
        hikariConfig1.setDataSourceProperties(properties69);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(properties69);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26782");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26782 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        int int9 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setJdbc4ConnectionTest(false);
        hikariConfig11.setDataSourceClassName("HikariPool-393");
        java.lang.String str20 = hikariConfig11.getDataSourceClassName();
        long long21 = hikariConfig11.getConnectionTimeout();
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-393" + "'", str20, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setAcquireRetryDelay((-1L));
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        java.lang.String str9 = hikariConfig8.getCatalog();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        int int6 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1743");
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize(32);
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-1743" + "'", str13, "HikariPool-1743");
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
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
        hikariConfig1.setMaxLifetime(32L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4272");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4272 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(52L);
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-22418");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaximumPoolSize(32);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setAcquireRetries(3);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionTimeout((long) 100);
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetries((int) '#');
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setInitializationFailFast(true);
        int int23 = hikariConfig1.getAcquireIncrement();
        int int24 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-414");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setPoolName("HikariPool-3695");
        long long13 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long21 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.setTransactionIsolation("HikariPool-4530");
        hikariConfig20.setTransactionIsolation("HikariPool-8327");
        hikariConfig20.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
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
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        hikariConfig1.setTransactionIsolation("HikariPool-2722");
        long long20 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaxLifetime(5000L);
        hikariConfig1.setConnectionTestQuery("HikariPool-19509");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
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
        java.util.Properties properties34 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setMaxLifetime((-1L));
        hikariConfig1.setPoolName("HikariPool-12156");
        boolean boolean41 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
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
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        int int64 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties66 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties66);
        boolean boolean68 = hikariConfig67.isInitializationFailFast();
        hikariConfig67.setInitializationFailFast(true);
        boolean boolean71 = hikariConfig67.isJdbc4ConnectionTest();
        long long72 = hikariConfig67.getConnectionTimeout();
        hikariConfig67.setPoolName("hi!");
        hikariConfig67.setAutoCommit(false);
        hikariConfig67.setIdleTimeout(10L);
        hikariConfig67.setAcquireRetries((int) (byte) 100);
        long long81 = hikariConfig67.getIdleTimeout();
        java.lang.String str82 = hikariConfig67.getConnectionTestQuery();
        hikariConfig1.addDataSourceProperty("HikariPool-3266", (java.lang.Object) hikariConfig67);
        java.util.Properties properties84 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties84);
        boolean boolean86 = hikariConfig85.isInitializationFailFast();
        hikariConfig85.setInitializationFailFast(true);
        boolean boolean89 = hikariConfig85.isJdbc4ConnectionTest();
        long long90 = hikariConfig85.getConnectionTimeout();
        hikariConfig85.setPoolName("hi!");
        hikariConfig85.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties95 = hikariConfig85.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig96 = new com.zaxxer.hikari.HikariConfig(properties95);
        com.zaxxer.hikari.HikariConfig hikariConfig97 = new com.zaxxer.hikari.HikariConfig(properties95);
        hikariConfig67.setDataSourceProperties(properties95);
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 5000L + "'", long72 == 5000L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 5000L + "'", long90 == 5000L);
        org.junit.Assert.assertNotNull(properties95);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str10 = hikariConfig1.getCatalog();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetries(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
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
        int int35 = hikariConfig1.getAcquireRetries();
        long long36 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getTransactionIsolation();
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setLeakDetectionThreshold(100L);
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setConnectionTimeout(600000L);
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.util.Properties properties18 = hikariConfig17.getDataSourceProperties();
        int int19 = hikariConfig17.getTransactionIsolation();
        long long20 = hikariConfig17.getIdleTimeout();
        java.lang.String str21 = hikariConfig17.getConnectionInitSql();
        int int22 = hikariConfig17.getMaximumPoolSize();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig24.setDataSource(dataSource26);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        boolean boolean33 = hikariConfig29.isJdbc4ConnectionTest();
        long long34 = hikariConfig29.getConnectionTimeout();
        hikariConfig29.setPoolName("hi!");
        hikariConfig29.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties39 = hikariConfig29.getDataSourceProperties();
        hikariConfig24.setDataSourceProperties(properties39);
        hikariConfig17.setDataSourceProperties(properties39);
        hikariConfig1.setDataSourceProperties(properties39);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str45 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        int int9 = hikariConfig1.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setPoolName("HikariPool-10928");
        hikariConfig1.setMinimumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3351");
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
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
        long long37 = hikariConfig34.getIdleTimeout();
        long long38 = hikariConfig34.getIdleTimeout();
        java.util.Properties properties39 = hikariConfig34.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 600000L + "'", long37 == 600000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 600000L + "'", long38 == 600000L);
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-1195");
        long long13 = hikariConfig1.getIdleTimeout();
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
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
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        long long16 = hikariConfig1.getIdleTimeout();
        int int17 = hikariConfig1.getMinimumPoolSize();
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-4238");
        hikariConfig1.setAcquireIncrement(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        java.lang.String str22 = hikariConfig1.getCatalog();
        java.util.Properties properties23 = hikariConfig1.getDataSourceProperties();
        boolean boolean24 = hikariConfig1.isAutoCommit();
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig12.setAutoCommit(false);
        int int24 = hikariConfig12.getMaximumPoolSize();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(true);
        int int30 = hikariConfig26.getAcquireRetries();
        long long31 = hikariConfig26.getMaxLifetime();
        hikariConfig26.setMaxLifetime((long) (short) 0);
        long long34 = hikariConfig26.getIdleTimeout();
        boolean boolean35 = hikariConfig26.isRegisterMbeans();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setLeakDetectionThreshold((long) '4');
        java.lang.String str41 = hikariConfig37.getConnectionCustomizerClassName();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setInitializationFailFast(true);
        javax.sql.DataSource dataSource47 = null;
        hikariConfig43.setDataSource(dataSource47);
        hikariConfig43.setAcquireRetryDelay((long) 'a');
        java.lang.String str51 = hikariConfig43.getConnectionCustomizerClassName();
        java.util.Properties properties52 = hikariConfig43.getDataSourceProperties();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        java.util.Properties properties55 = hikariConfig54.getDataSourceProperties();
        hikariConfig43.setDataSourceProperties(properties55);
        hikariConfig37.setDataSourceProperties(properties55);
        hikariConfig26.setDataSourceProperties(properties55);
        hikariConfig12.setDataSourceProperties(properties55);
        hikariConfig1.setDataSourceProperties(properties55);
        long long61 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1800000L + "'", long61 == 1800000L);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.lang.String str22 = hikariConfig13.getConnectionInitSql();
        boolean boolean23 = hikariConfig13.isRegisterMbeans();
        hikariConfig13.setConnectionTestQuery("HikariPool-888");
        hikariConfig1.addDataSourceProperty("HikariPool-1797", (java.lang.Object) hikariConfig13);
        hikariConfig1.setAcquireRetries(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
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
        int int19 = hikariConfig1.getAcquireRetries();
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        hikariConfig1.setMinimumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
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
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        int int22 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
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
        hikariConfig1.setCatalog("HikariPool-907");
        hikariConfig1.setAcquireRetries((int) (short) 1);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
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
        hikariConfig11.setIdleTimeout(32L);
        hikariConfig11.setConnectionInitSql("HikariPool-18951");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        boolean boolean20 = hikariConfig18.isJdbc4ConnectionTest();
        hikariConfig18.setDataSourceClassName("hi!");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        hikariConfig25.setAcquireRetryDelay((long) 'a');
        java.lang.String str33 = hikariConfig25.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig25.getDataSourceProperties();
        hikariConfig25.setAutoCommit(false);
        hikariConfig25.setInitializationFailFast(false);
        int int39 = hikariConfig25.getMaximumPoolSize();
        boolean boolean40 = hikariConfig25.isRegisterMbeans();
        hikariConfig18.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean40);
        boolean boolean42 = hikariConfig18.isRegisterMbeans();
        long long43 = hikariConfig18.getMaxLifetime();
        hikariConfig11.addDataSourceProperty("HikariPool-28008", (java.lang.Object) long43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
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
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAcquireRetries(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setMaxLifetime((long) 10);
        boolean boolean15 = hikariConfig1.isAutoCommit();
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
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
        hikariConfig23.setAcquireIncrement((int) '#');
        hikariConfig23.setDataSourceClassName("HikariPool-3053");
        hikariConfig23.setMaximumPoolSize((int) (short) 1);
        javax.sql.DataSource dataSource32 = hikariConfig23.getDataSource();
        long long33 = hikariConfig23.getAcquireRetryDelay();
        java.lang.String str34 = hikariConfig23.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-3053" + "'", str34, "HikariPool-3053");
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-28476" + "'", str8, "HikariPool-28476");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
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
        long long34 = hikariConfig12.getAcquireRetryDelay();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setLeakDetectionThreshold((long) '4');
        java.lang.String str41 = hikariConfig37.getPoolName();
        hikariConfig37.setAcquireRetries((int) 'a');
        hikariConfig37.setIdleTimeout((long) (byte) 1);
        hikariConfig12.addDataSourceProperty("HikariPool-11810", (java.lang.Object) hikariConfig37);
        hikariConfig12.setAcquireRetries((int) '4');
        int int49 = hikariConfig12.getAcquireIncrement();
        boolean boolean50 = hikariConfig12.isJdbc4ConnectionTest();
        java.util.Properties properties51 = hikariConfig12.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HikariPool-28480" + "'", str41, "HikariPool-28480");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaxLifetime(0L);
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-6499");
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int47 = hikariConfig1.getAcquireRetries();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
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
        boolean boolean29 = hikariConfig1.isAutoCommit();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
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
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setPoolName("");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3156");
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-963");
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMinimumPoolSize(32);
        long long21 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-28507" + "'", str12, "HikariPool-28507");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
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
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setInitializationFailFast(true);
        javax.sql.DataSource dataSource40 = null;
        hikariConfig36.setDataSource(dataSource40);
        hikariConfig36.setAcquireRetryDelay((long) 'a');
        java.lang.String str44 = hikariConfig36.getConnectionCustomizerClassName();
        java.lang.String str45 = hikariConfig36.getConnectionInitSql();
        long long46 = hikariConfig36.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long46);
        long long48 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setDataSourceClassName("HikariPool-4601");
        hikariConfig1.setUseInstrumentation(false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5000L + "'", long46 == 5000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
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
        hikariConfig1.setAutoCommit(false);
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long22 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireIncrement(1);
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setConnectionInitSql("HikariPool-4272");
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        long long17 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
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
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        long long19 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMinimumPoolSize(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
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
        int int13 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        hikariConfig13.setAcquireRetryDelay(1L);
        boolean boolean19 = hikariConfig13.isAutoCommit();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.util.Properties properties22 = hikariConfig21.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties22);
        hikariConfig13.setAcquireRetries((int) '4');
        hikariConfig13.setAcquireIncrement((int) '#');
        hikariConfig13.setDataSourceClassName("HikariPool-700");
        hikariConfig13.setIdleTimeout((long) 0);
        hikariConfig13.setPoolName("HikariPool-11038");
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        hikariConfig35.setInitializationFailFast(true);
        javax.sql.DataSource dataSource39 = null;
        hikariConfig35.setDataSource(dataSource39);
        long long41 = hikariConfig35.getLeakDetectionThreshold();
        hikariConfig35.setAcquireRetryDelay((long) ' ');
        java.lang.String str44 = hikariConfig35.getCatalog();
        javax.sql.DataSource dataSource45 = null;
        hikariConfig35.setDataSource(dataSource45);
        int int47 = hikariConfig35.getMaximumPoolSize();
        hikariConfig35.setUseInstrumentation(false);
        java.util.Properties properties50 = hikariConfig35.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties50);
        hikariConfig1.setDataSourceProperties(properties50);
        java.lang.Class<?> wildcardClass53 = properties50.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-481" + "'", str11, "HikariPool-481");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setPoolName("HikariPool-184");
        hikariConfig1.setDataSourceClassName("HikariPool-1341");
        int int13 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetryDelay(60L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
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
        long long23 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionInitSql("HikariPool-6700");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        boolean boolean10 = hikariConfig1.isAutoCommit();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28588" + "'", str5, "HikariPool-28588");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-414");
        int int9 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        long long13 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
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
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        hikariConfig23.setAcquireRetryDelay((long) 'a');
        java.lang.String str31 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties32 = hikariConfig23.getDataSourceProperties();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        java.util.Properties properties35 = hikariConfig34.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties35);
        hikariConfig23.setCatalog("hi!");
        boolean boolean39 = hikariConfig23.isJdbc4ConnectionTest();
        hikariConfig23.setAutoCommit(true);
        hikariConfig23.setConnectionCustomizerClassName("HikariPool-477");
        long long44 = hikariConfig23.getIdleTimeout();
        java.lang.String str45 = hikariConfig23.getDataSourceClassName();
        java.util.Properties properties46 = hikariConfig23.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties46);
        javax.sql.DataSource dataSource48 = null;
        hikariConfig1.setDataSource(dataSource48);
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        boolean boolean52 = hikariConfig51.isInitializationFailFast();
        hikariConfig51.setInitializationFailFast(true);
        hikariConfig51.setAcquireRetryDelay(1L);
        boolean boolean57 = hikariConfig51.isAutoCommit();
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        java.util.Properties properties60 = hikariConfig59.getDataSourceProperties();
        hikariConfig51.setDataSourceProperties(properties60);
        java.lang.String str62 = hikariConfig51.getDataSourceClassName();
        hikariConfig51.setIdleTimeout((long) '4');
        hikariConfig51.setPoolName("HikariPool-6418");
        java.util.Properties properties67 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        boolean boolean69 = hikariConfig68.isInitializationFailFast();
        hikariConfig68.setInitializationFailFast(true);
        javax.sql.DataSource dataSource72 = null;
        hikariConfig68.setDataSource(dataSource72);
        hikariConfig68.setAcquireRetryDelay((long) 'a');
        java.lang.String str76 = hikariConfig68.getConnectionCustomizerClassName();
        hikariConfig68.setConnectionCustomizerClassName("hi!");
        long long79 = hikariConfig68.getConnectionTimeout();
        long long80 = hikariConfig68.getAcquireRetryDelay();
        long long81 = hikariConfig68.getConnectionTimeout();
        hikariConfig68.setDataSourceClassName("HikariPool-594");
        java.util.Properties properties84 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties84);
        boolean boolean86 = hikariConfig85.isInitializationFailFast();
        hikariConfig85.setInitializationFailFast(true);
        int int89 = hikariConfig85.getAcquireRetries();
        hikariConfig85.setCatalog("HikariPool-143");
        int int92 = hikariConfig85.getMinimumPoolSize();
        java.util.Properties properties93 = hikariConfig85.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig94 = new com.zaxxer.hikari.HikariConfig(properties93);
        com.zaxxer.hikari.HikariConfig hikariConfig95 = new com.zaxxer.hikari.HikariConfig(properties93);
        hikariConfig68.setDataSourceProperties(properties93);
        hikariConfig51.setDataSourceProperties(properties93);
        hikariConfig1.setDataSourceProperties(properties93);
        javax.sql.DataSource dataSource99 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 600000L + "'", long44 == 600000L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 5000L + "'", long79 == 5000L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 5000L + "'", long81 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 3 + "'", int89 == 3);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertNotNull(properties93);
        org.junit.Assert.assertNull(dataSource99);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11634");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11634 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
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
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.validate();
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
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
        long long49 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 97);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        hikariConfig1.setMaxLifetime(60L);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        long long13 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
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
        hikariConfig1.setTransactionIsolation("HikariPool-859");
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.setTransactionIsolation("HikariPool-20280");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28629" + "'", str14, "HikariPool-28629");
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
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
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setInitializationFailFast(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig19.setDataSource(dataSource23);
        hikariConfig19.setAcquireRetryDelay((long) 'a');
        java.lang.String str27 = hikariConfig19.getConnectionCustomizerClassName();
        java.util.Properties properties28 = hikariConfig19.getDataSourceProperties();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig30.setDataSource(dataSource34);
        hikariConfig30.setAcquireRetryDelay((long) 'a');
        java.lang.String str38 = hikariConfig30.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig30.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig41.setConnectionTimeout((long) (short) 0);
        long long44 = hikariConfig41.getIdleTimeout();
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        boolean boolean47 = hikariConfig46.isInitializationFailFast();
        hikariConfig46.setInitializationFailFast(true);
        hikariConfig46.setAcquireRetryDelay(1L);
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean54 = hikariConfig53.isInitializationFailFast();
        hikariConfig53.setTransactionIsolation("hi!");
        java.util.Properties properties57 = hikariConfig53.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        hikariConfig46.setDataSourceProperties(properties57);
        hikariConfig41.setDataSourceProperties(properties57);
        hikariConfig1.setDataSourceProperties(properties57);
        hikariConfig1.setMaximumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 600000L + "'", long44 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(properties57);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
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
        java.lang.String str36 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-888");
        hikariConfig1.setAcquireRetries((int) (byte) 10);
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
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        long long9 = hikariConfig1.getIdleTimeout();
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetryDelay((long) (short) -1);
        hikariConfig1.setAcquireIncrement(10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-11964");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setConnectionInitSql("HikariPool-8073");
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        long long14 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-8073" + "'", str13, "HikariPool-8073");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTestQuery("HikariPool-16938");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetryDelay(600000L);
        int int12 = hikariConfig1.getAcquireIncrement();
        boolean boolean13 = hikariConfig1.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
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
        hikariConfig1.setMinimumPoolSize((int) '#');
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold((-1L));
        hikariConfig1.setTransactionIsolation("HikariPool-2114");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
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
        int int24 = hikariConfig23.getTransactionIsolation();
        boolean boolean25 = hikariConfig23.isAutoCommit();
        int int26 = hikariConfig23.getMinimumPoolSize();
        boolean boolean27 = hikariConfig23.isRegisterMbeans();
        long long28 = hikariConfig23.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
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
        hikariConfig1.setCatalog("HikariPool-2267");
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.setDataSourceClassName("HikariPool-4554");
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str13 = hikariConfig1.getPoolName();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-28693" + "'", str13, "HikariPool-28693");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.setLeakDetectionThreshold((long) 10);
        javax.sql.DataSource dataSource6 = hikariConfig3.getDataSource();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        long long11 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setAutoCommit(false);
        int int25 = hikariConfig13.getMaximumPoolSize();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setInitializationFailFast(true);
        int int31 = hikariConfig27.getAcquireRetries();
        long long32 = hikariConfig27.getMaxLifetime();
        hikariConfig27.setMaxLifetime((long) (short) 0);
        long long35 = hikariConfig27.getIdleTimeout();
        boolean boolean36 = hikariConfig27.isRegisterMbeans();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        boolean boolean39 = hikariConfig38.isInitializationFailFast();
        hikariConfig38.setLeakDetectionThreshold((long) '4');
        java.lang.String str42 = hikariConfig38.getConnectionCustomizerClassName();
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        boolean boolean45 = hikariConfig44.isInitializationFailFast();
        hikariConfig44.setInitializationFailFast(true);
        javax.sql.DataSource dataSource48 = null;
        hikariConfig44.setDataSource(dataSource48);
        hikariConfig44.setAcquireRetryDelay((long) 'a');
        java.lang.String str52 = hikariConfig44.getConnectionCustomizerClassName();
        java.util.Properties properties53 = hikariConfig44.getDataSourceProperties();
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        java.util.Properties properties56 = hikariConfig55.getDataSourceProperties();
        hikariConfig44.setDataSourceProperties(properties56);
        hikariConfig38.setDataSourceProperties(properties56);
        hikariConfig27.setDataSourceProperties(properties56);
        hikariConfig13.setDataSourceProperties(properties56);
        hikariConfig1.setDataSourceProperties(properties56);
        hikariConfig1.setPoolName("HikariPool-7207");
        java.util.Properties properties64 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        int int66 = hikariConfig65.getAcquireIncrement();
        int int67 = hikariConfig65.getMinimumPoolSize();
        boolean boolean68 = hikariConfig65.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 600000L + "'", long35 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getLeakDetectionThreshold();
        hikariConfig12.setLeakDetectionThreshold((long) (byte) -1);
        long long16 = hikariConfig12.getLeakDetectionThreshold();
        java.util.Properties properties17 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties17);
        int int19 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
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
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-481" + "'", str18, "HikariPool-481");
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
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
        hikariConfig1.setTransactionIsolation("HikariPool-3576");
        javax.sql.DataSource dataSource43 = hikariConfig1.getDataSource();
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(dataSource43);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-391");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setPoolName("HikariPool-14726");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
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
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setConnectionTimeout(600000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        long long5 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
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
        java.util.Properties properties34 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setMaxLifetime(10L);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-17573");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-17573 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
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
        hikariConfig1.setMaximumPoolSize((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setAcquireRetries(3);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionTimeout((long) 100);
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetries((int) '#');
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        long long21 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long21 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.setDataSourceClassName("HikariPool-1900");
        hikariConfig20.setMaxLifetime((long) (short) 0);
        int int26 = hikariConfig20.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setInitializationFailFast(false);
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize(1);
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28807" + "'", str14, "HikariPool-28807");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
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
        long long25 = hikariConfig1.getMaxLifetime();
        java.lang.Class<?> wildcardClass26 = hikariConfig1.getClass();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
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
        hikariConfig11.setAcquireRetryDelay(1800000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-16088");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-16088 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        java.lang.String str13 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-28826" + "'", str13, "HikariPool-28826");
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(true);
        boolean boolean22 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.getPoolName();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-28839" + "'", str10, "HikariPool-28839");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21325");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21325 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-12163");
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
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
        hikariConfig7.setUseInstrumentation(false);
        long long27 = hikariConfig7.getConnectionTimeout();
        java.lang.String str28 = hikariConfig7.getCatalog();
        java.lang.Class<?> wildcardClass29 = hikariConfig7.getClass();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
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
        hikariConfig1.setDataSourceClassName("HikariPool-8628");
        java.lang.Class<?> wildcardClass21 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        int int11 = hikariConfig1.getMaximumPoolSize();
        int int12 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
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
        int int34 = hikariConfig26.getMinimumPoolSize();
        hikariConfig26.setPoolName("HikariPool-8737");
        java.lang.String str37 = hikariConfig26.getDataSourceClassName();
        boolean boolean38 = hikariConfig26.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        int int17 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig21.setDataSource(dataSource25);
        hikariConfig21.setAcquireRetryDelay((long) 'a');
        java.lang.String str29 = hikariConfig21.getConnectionCustomizerClassName();
        java.lang.String str30 = hikariConfig21.getConnectionInitSql();
        long long31 = hikariConfig21.getLeakDetectionThreshold();
        hikariConfig21.setConnectionTestQuery("HikariPool-393");
        hikariConfig21.setDataSourceClassName("HikariPool-481");
        hikariConfig21.setPoolName("hi!");
        hikariConfig21.setConnectionInitSql("HikariPool-907");
        boolean boolean40 = hikariConfig21.isJdbc4ConnectionTest();
        long long41 = hikariConfig21.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-9679", (java.lang.Object) hikariConfig21);
        hikariConfig1.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) ' ');
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-9118");
        hikariConfig1.validate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        java.lang.String str17 = hikariConfig11.getCatalog();
        int int18 = hikariConfig11.getTransactionIsolation();
        long long19 = hikariConfig11.getMaxLifetime();
        java.lang.String str20 = hikariConfig11.getPoolName();
        int int21 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setRegisterMbeans(true);
        hikariConfig1.addDataSourceProperty("HikariPool-2636", (java.lang.Object) hikariConfig11);
        long long25 = hikariConfig1.getIdleTimeout();
        int int26 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-28892" + "'", str20, "HikariPool-28892");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
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
        hikariConfig1.setPoolName("HikariPool-663");
        hikariConfig1.setMaximumPoolSize(1);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        boolean boolean22 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setTransactionIsolation("HikariPool-1009");
        hikariConfig1.setDataSourceClassName("HikariPool-1964");
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
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
        long long26 = hikariConfig23.getIdleTimeout();
        long long27 = hikariConfig23.getIdleTimeout();
        hikariConfig23.setLeakDetectionThreshold(600000L);
        boolean boolean30 = hikariConfig23.isJdbc4ConnectionTest();
        hikariConfig23.setAcquireRetryDelay((long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        int int16 = hikariConfig12.getAcquireRetries();
        long long17 = hikariConfig12.getMaxLifetime();
        hikariConfig12.setMaxLifetime((long) (short) 0);
        long long20 = hikariConfig12.getIdleTimeout();
        boolean boolean21 = hikariConfig12.isRegisterMbeans();
        long long22 = hikariConfig12.getMaxLifetime();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        int int28 = hikariConfig24.getAcquireRetries();
        hikariConfig24.setCatalog("HikariPool-143");
        int int31 = hikariConfig24.getMinimumPoolSize();
        java.util.Properties properties32 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig12.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        hikariConfig1.setConnectionInitSql("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
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
        int int16 = hikariConfig1.getAcquireRetries();
        int int17 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setLeakDetectionThreshold((long) '4');
        java.lang.String str14 = hikariConfig10.getConnectionCustomizerClassName();
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
        hikariConfig10.setDataSourceProperties(properties28);
        java.lang.String str31 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setPoolName("hi!");
        hikariConfig10.setConnectionInitSql("HikariPool-184");
        long long36 = hikariConfig10.getIdleTimeout();
        java.util.Properties properties37 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        java.util.Properties properties39 = hikariConfig38.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-15722", (java.lang.Object) hikariConfig38);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 600000L + "'", long36 == 600000L);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
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
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties33 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        java.lang.String str36 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
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
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
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
        hikariConfig1.setIdleTimeout(0L);
        boolean boolean24 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(true);
        javax.sql.DataSource dataSource30 = null;
        hikariConfig26.setDataSource(dataSource30);
        hikariConfig26.setAcquireRetryDelay((long) 'a');
        java.lang.String str34 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig26.getDataSourceProperties();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        java.util.Properties properties38 = hikariConfig37.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties38);
        int int40 = hikariConfig26.getMinimumPoolSize();
        int int41 = hikariConfig26.getMinimumPoolSize();
        hikariConfig26.setIdleTimeout(0L);
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        boolean boolean46 = hikariConfig45.isInitializationFailFast();
        hikariConfig45.setInitializationFailFast(true);
        javax.sql.DataSource dataSource49 = null;
        hikariConfig45.setDataSource(dataSource49);
        hikariConfig45.setAcquireRetryDelay((long) 'a');
        java.lang.String str53 = hikariConfig45.getConnectionCustomizerClassName();
        java.lang.String str54 = hikariConfig45.getConnectionInitSql();
        boolean boolean55 = hikariConfig45.isRegisterMbeans();
        java.lang.String str56 = hikariConfig45.getCatalog();
        java.util.Properties properties57 = hikariConfig45.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        hikariConfig26.setDataSourceProperties(properties57);
        hikariConfig1.setDataSourceProperties(properties57);
        int int61 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
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
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        boolean boolean19 = hikariConfig14.isRegisterMbeans();
        hikariConfig14.setDataSourceClassName("hi!");
        hikariConfig14.setConnectionInitSql("");
        java.lang.String str24 = hikariConfig14.getCatalog();
        boolean boolean25 = hikariConfig14.isInitializationFailFast();
        java.lang.String str26 = hikariConfig14.getDataSourceClassName();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setInitializationFailFast(true);
        javax.sql.DataSource dataSource32 = null;
        hikariConfig28.setDataSource(dataSource32);
        hikariConfig28.setAcquireRetryDelay((long) 'a');
        java.lang.String str36 = hikariConfig28.getConnectionCustomizerClassName();
        java.util.Properties properties37 = hikariConfig28.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig14.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        boolean boolean41 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-7145");
        boolean boolean44 = hikariConfig1.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isAutoCommit();
        long long5 = hikariConfig1.getIdleTimeout();
        int int6 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
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
        long long32 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-6454");
        hikariConfig1.setDataSourceClassName("HikariPool-14027");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28949" + "'", str15, "HikariPool-28949");
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
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
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        long long17 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.setCatalog("HikariPool-23366");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
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
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-674");
        long long21 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
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
        boolean boolean43 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        hikariConfig1.setConnectionTestQuery("HikariPool-3424");
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        java.lang.Class<?> wildcardClass50 = hikariConfig1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
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
        javax.sql.DataSource dataSource48 = null;
        hikariConfig1.setDataSource(dataSource48);
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
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
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
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
        hikariConfig1.setDataSourceClassName("HikariPool-23964");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
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
        hikariConfig9.setLeakDetectionThreshold(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaximumPoolSize(1);
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionInitSql("HikariPool-27229");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setAcquireRetryDelay((-1L));
        hikariConfig1.setConnectionTimeout((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
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
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28996" + "'", str14, "HikariPool-28996");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
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
        hikariConfig1.setTransactionIsolation("HikariPool-859");
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMinimumPoolSize(0);
        boolean boolean20 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-29007" + "'", str14, "HikariPool-29007");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long16 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        int int21 = hikariConfig19.getAcquireIncrement();
        java.lang.String str22 = hikariConfig19.getConnectionCustomizerClassName();
        hikariConfig19.setIdleTimeout((long) (byte) 0);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig19.setDataSource(dataSource25);
        hikariConfig19.setMaximumPoolSize(0);
        hikariConfig1.addDataSourceProperty("HikariPool-2136", (java.lang.Object) hikariConfig19);
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        java.lang.Class<?> wildcardClass34 = hikariConfig32.getClass();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) wildcardClass34);
        javax.sql.DataSource dataSource36 = hikariConfig1.getDataSource();
        int int37 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("HikariPool-9945");
        boolean boolean40 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetryDelay(1800000L);
        java.lang.Class<?> wildcardClass43 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetryDelay(3L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
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
        hikariConfig1.setConnectionInitSql("HikariPool-4368");
        int int19 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("HikariPool-16585");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13849");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13849 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
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
        hikariConfig1.setConnectionInitSql("HikariPool-2609");
        java.lang.String str52 = hikariConfig1.getConnectionInitSql();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "HikariPool-2609" + "'", str52, "HikariPool-2609");
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) '4');
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1867");
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        int int15 = hikariConfig1.getTransactionIsolation();
        long long16 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAutoCommit(true);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setIdleTimeout((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
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
        long long49 = hikariConfig1.getAcquireRetryDelay();
        int int50 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-9282");
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        boolean boolean56 = hikariConfig55.isInitializationFailFast();
        hikariConfig55.setInitializationFailFast(true);
        javax.sql.DataSource dataSource59 = null;
        hikariConfig55.setDataSource(dataSource59);
        hikariConfig55.setAcquireIncrement(1);
        hikariConfig1.addDataSourceProperty("HikariPool-19710", (java.lang.Object) hikariConfig55);
        long long64 = hikariConfig55.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig55.setConnectionTimeout((long) 35);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 60 + "'", int50 == 60);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 600000L + "'", long64 == 600000L);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
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
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig7.setCatalog("HikariPool-481");
        hikariConfig7.setUseInstrumentation(false);
        hikariConfig7.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
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
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize((int) 'a');
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
        boolean boolean26 = hikariConfig16.isRegisterMbeans();
        long long27 = hikariConfig16.getMaxLifetime();
        java.lang.String str28 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setAcquireIncrement(0);
        boolean boolean31 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-6938", (java.lang.Object) boolean31);
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
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
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setUseInstrumentation(false);
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        hikariConfig1.validate();
        hikariConfig1.setDataSourceClassName("HikariPool-20526");
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11389");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11389 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4034");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4034 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        long long3 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long13 = hikariConfig1.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str35 = hikariConfig1.getDataSourceClassName();
        int int36 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        boolean boolean40 = hikariConfig39.isInitializationFailFast();
        hikariConfig39.setInitializationFailFast(true);
        boolean boolean43 = hikariConfig39.isJdbc4ConnectionTest();
        long long44 = hikariConfig39.getConnectionTimeout();
        hikariConfig39.setAcquireIncrement(100);
        hikariConfig39.setPoolName("");
        long long49 = hikariConfig39.getLeakDetectionThreshold();
        hikariConfig39.setLeakDetectionThreshold((long) 1);
        hikariConfig1.addDataSourceProperty("HikariPool-6786", (java.lang.Object) 1);
        javax.sql.DataSource dataSource53 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 5000L + "'", long44 == 5000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNull(dataSource53);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionInitSql("HikariPool-1150");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        hikariConfig17.setAcquireRetryDelay(1L);
        boolean boolean23 = hikariConfig17.isAutoCommit();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties26);
        hikariConfig17.setAcquireRetries((int) '4');
        hikariConfig17.setAcquireIncrement((int) '#');
        hikariConfig17.setDataSourceClassName("HikariPool-700");
        int int34 = hikariConfig17.getMaximumPoolSize();
        long long35 = hikariConfig17.getMaxLifetime();
        javax.sql.DataSource dataSource36 = null;
        hikariConfig17.setDataSource(dataSource36);
        java.lang.String str38 = hikariConfig17.getPoolName();
        java.util.Properties properties39 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-1625", (java.lang.Object) properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig41.setMaximumPoolSize(32);
        int int44 = hikariConfig41.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-29109" + "'", str38, "HikariPool-29109");
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
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
        hikariConfig1.setConnectionTimeout(600000L);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-29115" + "'", str12, "HikariPool-29115");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-12434");
        hikariConfig1.setMaximumPoolSize(1);
        boolean boolean13 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-18597");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
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
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig1.setDataSourceClassName("HikariPool-2681");
        long long38 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 600000L + "'", long38 == 600000L);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1843");
        hikariConfig1.setConnectionTestQuery("HikariPool-3811");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
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
        hikariConfig1.setCatalog("HikariPool-7023");
        hikariConfig1.setDataSourceClassName("HikariPool-14299");
        hikariConfig1.setIdleTimeout((long) (short) 0);
        hikariConfig1.setPoolName("HikariPool-6770");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-29131" + "'", str33, "HikariPool-29131");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
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
        hikariConfig1.setPoolName("HikariPool-6917");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
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
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
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
        long long27 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMinimumPoolSize((int) '#');
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig31.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
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
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        int int17 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
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
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13348");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13348 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setMinimumPoolSize((int) '#');
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireIncrement((int) ' ');
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-7395");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        hikariConfig11.setAutoCommit(false);
        hikariConfig11.setInitializationFailFast(false);
        java.lang.String str25 = hikariConfig11.getConnectionInitSql();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setLeakDetectionThreshold((long) '4');
        int int31 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.setUseInstrumentation(true);
        boolean boolean34 = hikariConfig27.isRegisterMbeans();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setInitializationFailFast(true);
        javax.sql.DataSource dataSource40 = null;
        hikariConfig36.setDataSource(dataSource40);
        hikariConfig36.setAcquireRetryDelay((long) 'a');
        java.lang.String str44 = hikariConfig36.getConnectionCustomizerClassName();
        java.util.Properties properties45 = hikariConfig36.getDataSourceProperties();
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        boolean boolean48 = hikariConfig47.isInitializationFailFast();
        hikariConfig47.setInitializationFailFast(true);
        javax.sql.DataSource dataSource51 = null;
        hikariConfig47.setDataSource(dataSource51);
        hikariConfig47.setAcquireRetryDelay((long) 'a');
        java.lang.String str55 = hikariConfig47.getConnectionCustomizerClassName();
        java.util.Properties properties56 = hikariConfig47.getDataSourceProperties();
        hikariConfig36.setDataSourceProperties(properties56);
        boolean boolean58 = hikariConfig36.isJdbc4ConnectionTest();
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        boolean boolean61 = hikariConfig60.isInitializationFailFast();
        hikariConfig60.setInitializationFailFast(true);
        javax.sql.DataSource dataSource64 = null;
        hikariConfig60.setDataSource(dataSource64);
        hikariConfig60.setAcquireRetryDelay((long) 'a');
        java.lang.String str68 = hikariConfig60.getConnectionCustomizerClassName();
        java.util.Properties properties69 = hikariConfig60.getDataSourceProperties();
        hikariConfig36.setDataSourceProperties(properties69);
        hikariConfig27.setDataSourceProperties(properties69);
        hikariConfig11.setDataSourceProperties(properties69);
        hikariConfig1.setDataSourceProperties(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties69);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-29156" + "'", str5, "HikariPool-29156");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(properties69);
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setMaximumPoolSize(60);
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
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
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) 3);
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setTransactionIsolation("HikariPool-14909");
        hikariConfig1.setConnectionTimeout(0L);
        java.lang.String str19 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-29174" + "'", str19, "HikariPool-29174");
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        int int6 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-9895");
        int int12 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionTestQuery("HikariPool-4119");
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setDataSourceClassName("hi!");
        hikariConfig15.setInitializationFailFast(true);
        hikariConfig15.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource27 = hikariConfig15.getDataSource();
        hikariConfig15.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig15.setAcquireIncrement(35);
        hikariConfig15.validate();
        java.lang.String str33 = hikariConfig15.getPoolName();
        hikariConfig1.addDataSourceProperty("HikariPool-3811", (java.lang.Object) hikariConfig15);
        hikariConfig15.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig15.setLeakDetectionThreshold((long) 35);
        boolean boolean39 = hikariConfig15.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-29201" + "'", str33, "HikariPool-29201");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime(100L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.getPoolName();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-29209" + "'", str10, "HikariPool-29209");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3936");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3936 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireIncrement(1);
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
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
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-17895");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
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
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setLeakDetectionThreshold((long) '4');
        java.lang.String str26 = hikariConfig22.getConnectionTestQuery();
        hikariConfig22.setAcquireIncrement((int) '4');
        hikariConfig22.setIdleTimeout((long) (short) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-1902", (java.lang.Object) hikariConfig22);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-11673");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetries((int) '#');
        hikariConfig1.setCatalog("HikariPool-4195");
        hikariConfig1.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
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
        int int42 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        boolean boolean46 = hikariConfig45.isInitializationFailFast();
        hikariConfig45.setInitializationFailFast(true);
        javax.sql.DataSource dataSource49 = null;
        hikariConfig45.setDataSource(dataSource49);
        hikariConfig45.setAcquireRetryDelay((long) 'a');
        java.lang.String str53 = hikariConfig45.getConnectionCustomizerClassName();
        java.util.Properties properties54 = hikariConfig45.getDataSourceProperties();
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        boolean boolean57 = hikariConfig56.isInitializationFailFast();
        hikariConfig56.setInitializationFailFast(true);
        javax.sql.DataSource dataSource60 = null;
        hikariConfig56.setDataSource(dataSource60);
        hikariConfig56.setAcquireRetryDelay((long) 'a');
        java.lang.String str64 = hikariConfig56.getConnectionCustomizerClassName();
        java.util.Properties properties65 = hikariConfig56.getDataSourceProperties();
        hikariConfig45.setDataSourceProperties(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig67.setConnectionTimeout((long) (short) 0);
        long long70 = hikariConfig67.getIdleTimeout();
        long long71 = hikariConfig67.getIdleTimeout();
        java.util.Properties properties72 = hikariConfig67.getDataSourceProperties();
        javax.sql.DataSource dataSource73 = null;
        hikariConfig67.setDataSource(dataSource73);
        java.lang.String str75 = hikariConfig67.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-11553", (java.lang.Object) str75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-29250" + "'", str34, "HikariPool-29250");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 600000L + "'", long70 == 600000L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 600000L + "'", long71 == 600000L);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setMaxLifetime((long) (short) -1);
        int int9 = hikariConfig1.getTransactionIsolation();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-5908");
        hikariConfig1.setAcquireRetries((int) (short) 0);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
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
        long long14 = hikariConfig1.getIdleTimeout();
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setIdleTimeout((long) (-1));
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        int int9 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries((int) '#');
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setConnectionCustomizerClassName("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
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
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setInitializationFailFast(true);
        int int18 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        java.lang.String str21 = hikariConfig1.getCatalog();
        int int22 = hikariConfig1.getMaximumPoolSize();
        int int23 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
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
        int int13 = hikariConfig1.getTransactionIsolation();
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int18 = hikariConfig1.getMinimumPoolSize();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        java.lang.String str20 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
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
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        int int18 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean5 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
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
        hikariConfig1.setLeakDetectionThreshold((-1L));
        long long25 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.setDataSource(dataSource26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setLeakDetectionThreshold((-1L));
        long long7 = hikariConfig1.getAcquireRetryDelay();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMinimumPoolSize(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
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
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setDataSourceClassName("HikariPool-12354");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
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
        hikariConfig12.setPoolName("HikariPool-3391");
        hikariConfig12.setAcquireIncrement(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
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
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.util.Properties properties15 = hikariConfig14.getDataSourceProperties();
        long long16 = hikariConfig14.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig14.getCatalog();
        java.lang.String str18 = hikariConfig14.getPoolName();
        hikariConfig14.setAcquireIncrement((int) (short) 100);
        hikariConfig14.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-19368", (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-29380" + "'", str18, "HikariPool-29380");
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
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
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        long long24 = hikariConfig22.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig22.validate();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
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
        hikariConfig7.setTransactionIsolation("HikariPool-7302");
        hikariConfig7.setJdbc4ConnectionTest(false);
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
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
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
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        boolean boolean25 = hikariConfig1.isInitializationFailFast();
        java.lang.String str26 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        int int13 = hikariConfig1.getTransactionIsolation();
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
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
        hikariConfig1.setUseInstrumentation(true);
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
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig8.getConnectionInitSql();
        boolean boolean18 = hikariConfig8.isRegisterMbeans();
        java.lang.String str19 = hikariConfig8.getCatalog();
        java.util.Properties properties20 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        hikariConfig1.setDataSourceClassName("HikariPool-27559");
        boolean boolean26 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
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
        boolean boolean24 = hikariConfig20.isJdbc4ConnectionTest();
        long long25 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setPoolName("hi!");
        hikariConfig20.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties30 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-888", (java.lang.Object) hikariConfig31);
        int int34 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionInitSql("HikariPool-3059");
        int int37 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource38 = hikariConfig1.getDataSource();
        java.lang.String str39 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11083");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11083 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
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
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
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
        hikariConfig1.setConnectionInitSql("HikariPool-28379");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
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
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        java.lang.String str16 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-29467" + "'", str12, "HikariPool-29467");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
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
        long long31 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5315");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5315 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-6499");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMinimumPoolSize(0);
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
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        boolean boolean18 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
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
        boolean boolean28 = hikariConfig13.isAutoCommit();
        java.lang.String str29 = hikariConfig13.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-29494" + "'", str10, "HikariPool-29494");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
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
        long long21 = hikariConfig1.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
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
        boolean boolean25 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTimeout(600000L);
        long long28 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-27878");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
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
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str11 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-29507" + "'", str11, "HikariPool-29507");
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
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
        hikariConfig1.setInitializationFailFast(true);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(true);
        long long21 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireIncrement((int) ' ');
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setMaxLifetime((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        int int6 = hikariConfig1.getMaximumPoolSize();
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig28.setConnectionCustomizerClassName("HikariPool-19945");
        int int31 = hikariConfig28.getTransactionIsolation();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
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
        hikariConfig34.setMaximumPoolSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        long long7 = hikariConfig1.getMaxLifetime();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 10);
        int int11 = hikariConfig1.getTransactionIsolation();
        java.lang.String str12 = hikariConfig1.getPoolName();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-29532" + "'", str12, "HikariPool-29532");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2035");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2035 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setTransactionIsolation("hi!");
        java.util.Properties properties13 = hikariConfig9.getDataSourceProperties();
        long long14 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig9.isAutoCommit();
        javax.sql.DataSource dataSource18 = hikariConfig9.getDataSource();
        java.util.Properties properties19 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties19);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        hikariConfig1.setConnectionTestQuery("HikariPool-5475");
        int int25 = hikariConfig1.getAcquireIncrement();
        java.lang.String str26 = hikariConfig1.getCatalog();
        long long27 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
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
        long long28 = hikariConfig23.getIdleTimeout();
        long long29 = hikariConfig23.getAcquireRetryDelay();
        boolean boolean30 = hikariConfig23.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig13.setDataSource(dataSource14);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        boolean boolean22 = hikariConfig18.isJdbc4ConnectionTest();
        long long23 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setAcquireIncrement(100);
        hikariConfig18.setDataSourceClassName("HikariPool-143");
        hikariConfig18.setRegisterMbeans(false);
        int int30 = hikariConfig18.getAcquireIncrement();
        hikariConfig18.setConnectionInitSql("HikariPool-2722");
        hikariConfig18.setMaxLifetime((long) 'a');
        boolean boolean35 = hikariConfig18.isRegisterMbeans();
        java.lang.String str36 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.validate();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        boolean boolean40 = hikariConfig39.isInitializationFailFast();
        hikariConfig39.setInitializationFailFast(true);
        int int43 = hikariConfig39.getAcquireRetries();
        hikariConfig39.setCatalog("HikariPool-143");
        int int46 = hikariConfig39.getMinimumPoolSize();
        java.util.Properties properties47 = hikariConfig39.getDataSourceProperties();
        hikariConfig18.setDataSourceProperties(properties47);
        hikariConfig13.addDataSourceProperty("HikariPool-18218", (java.lang.Object) hikariConfig18);
        long long50 = hikariConfig18.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-393" + "'", str10, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
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
        hikariConfig1.setAutoCommit(true);
        long long25 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetries(100);
        long long28 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-2267");
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.setAcquireRetries(35);
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
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
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getLeakDetectionThreshold();
        hikariConfig12.setLeakDetectionThreshold((long) (byte) -1);
        long long16 = hikariConfig12.getLeakDetectionThreshold();
        java.util.Properties properties17 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-23238");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
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
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12119");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12119 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
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
        int int27 = hikariConfig26.getAcquireRetries();
        hikariConfig26.setInitializationFailFast(true);
        hikariConfig26.setTransactionIsolation("HikariPool-7967");
        long long32 = hikariConfig26.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireIncrement((int) ' ');
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int21 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setPoolName("HikariPool-17429");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
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
        long long21 = hikariConfig1.getConnectionTimeout();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
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
        javax.sql.DataSource dataSource35 = null;
        hikariConfig1.setDataSource(dataSource35);
        hikariConfig1.setConnectionTestQuery("HikariPool-2473");
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
        hikariConfig41.setInitializationFailFast(false);
        hikariConfig41.setConnectionInitSql("HikariPool-3749");
        hikariConfig1.addDataSourceProperty("HikariPool-9817", (java.lang.Object) hikariConfig41);
        java.lang.String str67 = hikariConfig1.getConnectionTestQuery();
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "HikariPool-2473" + "'", str67, "HikariPool-2473");
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
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
        hikariConfig1.setTransactionIsolation("HikariPool-3156");
        javax.sql.DataSource dataSource28 = null;
        hikariConfig1.setDataSource(dataSource28);
        hikariConfig1.setInitializationFailFast(false);
        int int32 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setAcquireRetryDelay((-1L));
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getAcquireRetries();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
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
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        int int17 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        int int7 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaximumPoolSize(10);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-888");
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-9229");
        long long17 = hikariConfig1.getIdleTimeout();
        boolean boolean18 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
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
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        hikariConfig1.setConnectionTestQuery("HikariPool-1867");
        java.lang.String str32 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource34 = null;
        hikariConfig1.setDataSource(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-29656" + "'", str10, "HikariPool-29656");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-1867" + "'", str33, "HikariPool-1867");
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
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
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-25903");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
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
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setCatalog("HikariPool-19424");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-17895");
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
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
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setConnectionInitSql("HikariPool-663");
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18516");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18516 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
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
        java.lang.String str20 = hikariConfig1.getCatalog();
        long long21 = hikariConfig1.getConnectionTimeout();
        boolean boolean22 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.setIdleTimeout((long) 1);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.setDataSource(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
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
        boolean boolean29 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setCatalog("HikariPool-3576");
        hikariConfig1.setPoolName("HikariPool-15015");
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
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
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
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.setInitializationFailFast(true);
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
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize(1);
        boolean boolean12 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
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
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        java.lang.String str17 = hikariConfig1.getCatalog();
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setAcquireRetryDelay((long) 60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-27792");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
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
        long long26 = hikariConfig23.getIdleTimeout();
        long long27 = hikariConfig23.getIdleTimeout();
        java.util.Properties properties28 = hikariConfig23.getDataSourceProperties();
        hikariConfig23.setDataSourceClassName("hi!");
        hikariConfig23.setUseInstrumentation(true);
        java.lang.String str33 = hikariConfig23.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
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
        hikariConfig1.setConnectionInitSql("HikariPool-143");
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        long long17 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setMinimumPoolSize(100);
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
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
        hikariConfig1.setAcquireRetries(1);
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-391");
        hikariConfig1.setCatalog("HikariPool-3351");
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
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
        int int49 = hikariConfig1.getMaximumPoolSize();
        int int50 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        long long55 = hikariConfig1.getLeakDetectionThreshold();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
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
        int int16 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("HikariPool-10135");
        java.lang.String str19 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
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
        hikariConfig1.setPoolName("HikariPool-1644");
        hikariConfig1.setIdleTimeout((long) 60);
        hikariConfig1.setIdleTimeout((long) (-1));
        java.lang.String str25 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-1644" + "'", str25, "HikariPool-1644");
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getAcquireRetries();
        int int10 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
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
        long long21 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties22 = hikariConfig1.getDataSourceProperties();
        long long23 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
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
        java.lang.String str19 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-29507");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
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
        hikariConfig1.setPoolName("HikariPool-674");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2424");
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2862");
        java.lang.String str22 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-674" + "'", str22, "HikariPool-674");
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
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
        hikariConfig1.setIdleTimeout((long) 1);
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) 100);
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
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
        long long14 = hikariConfig1.getIdleTimeout();
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setIdleTimeout((long) (-1));
        hikariConfig1.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-22299");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-22299 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        java.lang.String str43 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTestQuery("");
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
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
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
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireIncrement(35);
        long long22 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
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
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("HikariPool-4034");
        hikariConfig1.setTransactionIsolation("HikariPool-9801");
        hikariConfig1.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-29857" + "'", str14, "HikariPool-29857");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
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
        hikariConfig1.setPoolName("HikariPool-3407");
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        java.lang.String str35 = hikariConfig1.getDataSourceClassName();
        long long36 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
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
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setCatalog("HikariPool-7208");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getAcquireRetries();
        long long17 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setPoolName("HikariPool-6469");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
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
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig1.setPoolName("HikariPool-1195");
        hikariConfig1.setCatalog("HikariPool-20086");
        hikariConfig1.validate();
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
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
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
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
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
        hikariConfig1.setConnectionTimeout(5000L);
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
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
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
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
        hikariConfig1.setPoolName("HikariPool-1867");
        java.util.Properties properties22 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        javax.sql.DataSource dataSource25 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
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
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setInitializationFailFast(true);
        int int18 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        java.lang.String str21 = hikariConfig1.getCatalog();
        long long22 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3624");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3624 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str13 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getPoolName();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-29930" + "'", str9, "HikariPool-29930");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
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
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionTestQuery("HikariPool-27739");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
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
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-29948" + "'", str7, "HikariPool-29948");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.getPoolName();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setDataSourceClassName("HikariPool-7319");
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-29951" + "'", str10, "HikariPool-29951");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
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
        java.lang.String str55 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        boolean boolean61 = hikariConfig60.isInitializationFailFast();
        hikariConfig60.setInitializationFailFast(true);
        javax.sql.DataSource dataSource64 = null;
        hikariConfig60.setDataSource(dataSource64);
        hikariConfig60.setAcquireRetryDelay((long) 'a');
        long long68 = hikariConfig60.getLeakDetectionThreshold();
        int int69 = hikariConfig60.getTransactionIsolation();
        hikariConfig60.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-10511", (java.lang.Object) (short) 100);
        hikariConfig1.setInitializationFailFast(true);
        long long75 = hikariConfig1.getLeakDetectionThreshold();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-934" + "'", str55, "HikariPool-934");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
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
        int int21 = hikariConfig9.getMaximumPoolSize();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        int int27 = hikariConfig23.getAcquireRetries();
        long long28 = hikariConfig23.getMaxLifetime();
        hikariConfig23.setMaxLifetime((long) (short) 0);
        long long31 = hikariConfig23.getIdleTimeout();
        boolean boolean32 = hikariConfig23.isRegisterMbeans();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setLeakDetectionThreshold((long) '4');
        java.lang.String str38 = hikariConfig34.getConnectionCustomizerClassName();
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        boolean boolean41 = hikariConfig40.isInitializationFailFast();
        hikariConfig40.setInitializationFailFast(true);
        javax.sql.DataSource dataSource44 = null;
        hikariConfig40.setDataSource(dataSource44);
        hikariConfig40.setAcquireRetryDelay((long) 'a');
        java.lang.String str48 = hikariConfig40.getConnectionCustomizerClassName();
        java.util.Properties properties49 = hikariConfig40.getDataSourceProperties();
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        java.util.Properties properties52 = hikariConfig51.getDataSourceProperties();
        hikariConfig40.setDataSourceProperties(properties52);
        hikariConfig34.setDataSourceProperties(properties52);
        hikariConfig23.setDataSourceProperties(properties52);
        hikariConfig9.setDataSourceProperties(properties52);
        hikariConfig1.setDataSourceProperties(properties52);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 600000L + "'", long31 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNotNull(properties52);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout(60L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
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
        java.lang.String str44 = hikariConfig41.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-14215");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13223");
        hikariConfig1.setPoolName("HikariPool-8327");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25952");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25952 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
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
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setAcquireIncrement((int) '4');
        long long16 = hikariConfig1.getConnectionTimeout();
        boolean boolean17 = hikariConfig1.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
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
        hikariConfig1.setInitializationFailFast(true);
        long long41 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionTimeout(5000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
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
        long long26 = hikariConfig23.getIdleTimeout();
        long long27 = hikariConfig23.getIdleTimeout();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig30.setDataSource(dataSource34);
        java.lang.String str36 = hikariConfig30.getCatalog();
        int int37 = hikariConfig30.getMinimumPoolSize();
        hikariConfig30.setTransactionIsolation("");
        java.lang.String str40 = hikariConfig30.getCatalog();
        hikariConfig23.addDataSourceProperty("HikariPool-3973", (java.lang.Object) hikariConfig30);
        java.lang.String str42 = hikariConfig30.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-29994" + "'", str42, "HikariPool-29994");
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setPoolName("HikariPool-477");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2238");
        hikariConfig1.setTransactionIsolation("HikariPool-5308");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12476");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12476 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        java.lang.Class<?> wildcardClass6 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
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
        java.lang.String str36 = hikariConfig1.getConnectionTestQuery();
        int int37 = hikariConfig1.getMaximumPoolSize();
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
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
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
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-30005" + "'", str12, "HikariPool-30005");
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
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
        long long13 = hikariConfig1.getAcquireRetryDelay();
        long long14 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        hikariConfig1.setConnectionTestQuery("HikariPool-10604");
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
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
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
        int int19 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setConnectionInitSql("HikariPool-25363");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
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
        hikariConfig1.setAcquireIncrement((int) (short) -1);
        long long25 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
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
        hikariConfig1.setConnectionInitSql("HikariPool-477");
        hikariConfig1.setPoolName("HikariPool-888");
        hikariConfig1.setTransactionIsolation("HikariPool-1009");
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig55.setTransactionIsolation("");
        int int58 = hikariConfig55.getAcquireIncrement();
        javax.sql.DataSource dataSource59 = hikariConfig55.getDataSource();
        int int60 = hikariConfig55.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-907", (java.lang.Object) hikariConfig55);
        boolean boolean62 = hikariConfig1.isJdbc4ConnectionTest();
        int int63 = hikariConfig1.getMaximumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(dataSource59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 60 + "'", int63 == 60);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
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
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        hikariConfig1.setMaxLifetime(60L);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        int int13 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
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
        boolean boolean28 = hikariConfig23.isAutoCommit();
        java.lang.String str29 = hikariConfig23.getDataSourceClassName();
        long long30 = hikariConfig23.getAcquireRetryDelay();
        java.lang.String str31 = hikariConfig23.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
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
        int int21 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
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
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
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
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
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
        hikariConfig9.setDataSourceClassName("HikariPool-3424");
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
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-30069" + "'", str35, "HikariPool-30069");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setDataSourceClassName("HikariPool-15468");
        long long12 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
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
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig1.setMinimumPoolSize(10);
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
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
        hikariConfig30.setAutoCommit(true);
        hikariConfig30.setUseInstrumentation(true);
        java.util.Properties properties35 = hikariConfig30.getDataSourceProperties();
        hikariConfig30.setConnectionCustomizerClassName("HikariPool-10523");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
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
        hikariConfig5.setLeakDetectionThreshold((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig5.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
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
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setInitializationFailFast(false);
        hikariConfig11.setIdleTimeout((long) 10);
        boolean boolean18 = hikariConfig11.isAutoCommit();
        javax.sql.DataSource dataSource19 = hikariConfig11.getDataSource();
        int int20 = hikariConfig11.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        long long14 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
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
        long long20 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setPoolName("HikariPool-2528");
        hikariConfig1.setConnectionInitSql("HikariPool-2424");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.setDataSource(dataSource14);
        hikariConfig10.setAcquireRetryDelay((long) 'a');
        java.lang.String str18 = hikariConfig10.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig10.getDataSourceProperties();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig21.setDataSource(dataSource25);
        hikariConfig21.setAcquireRetryDelay((long) 'a');
        java.lang.String str29 = hikariConfig21.getConnectionCustomizerClassName();
        java.util.Properties properties30 = hikariConfig21.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties30);
        boolean boolean32 = hikariConfig10.isJdbc4ConnectionTest();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        hikariConfig34.setAcquireRetryDelay((long) 'a');
        java.lang.String str42 = hikariConfig34.getConnectionCustomizerClassName();
        java.util.Properties properties43 = hikariConfig34.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2932");
        hikariConfig1.setCatalog("HikariPool-5960");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setLeakDetectionThreshold((long) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-627");
        hikariConfig1.setConnectionTestQuery("HikariPool-29756");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setTransactionIsolation("hi!");
        java.util.Properties properties13 = hikariConfig9.getDataSourceProperties();
        long long14 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig9.isAutoCommit();
        javax.sql.DataSource dataSource18 = hikariConfig9.getDataSource();
        java.util.Properties properties19 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int22 = hikariConfig21.getAcquireRetries();
        hikariConfig21.setAcquireRetryDelay((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-7887");
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
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
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
        javax.sql.DataSource dataSource37 = hikariConfig9.getDataSource();
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
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig9.setDataSourceProperties(properties54);
        hikariConfig9.setConnectionInitSql("HikariPool-3100");
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
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-30131" + "'", str35, "HikariPool-30131");
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 5000L + "'", long49 == 5000L);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setCatalog("HikariPool-7396");
        java.lang.String str7 = hikariConfig1.getPoolName();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-30135" + "'", str7, "HikariPool-30135");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
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
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
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
        int int18 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-2388");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(true);
        java.lang.String str30 = hikariConfig26.getConnectionTestQuery();
        boolean boolean31 = hikariConfig26.isRegisterMbeans();
        hikariConfig26.setDataSourceClassName("hi!");
        hikariConfig26.setAcquireRetries(1);
        javax.sql.DataSource dataSource36 = hikariConfig26.getDataSource();
        boolean boolean37 = hikariConfig26.isJdbc4ConnectionTest();
        int int38 = hikariConfig26.getMaximumPoolSize();
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        long long41 = hikariConfig40.getLeakDetectionThreshold();
        hikariConfig40.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig40.setAcquireRetryDelay((-1L));
        java.util.Properties properties46 = hikariConfig40.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig1.setDataSourceProperties(properties46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        java.lang.String str5 = hikariConfig1.getPoolName();
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-30152" + "'", str5, "HikariPool-30152");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
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
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.setAcquireIncrement((int) (short) 10);
        hikariConfig1.setDataSourceClassName("HikariPool-3953");
        hikariConfig1.setConnectionTestQuery("HikariPool-7312");
        int int32 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMinimumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
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
        hikariConfig1.setMaxLifetime(100L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
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
        java.lang.String str36 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-888");
        hikariConfig1.setIdleTimeout((long) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-2722");
        hikariConfig1.setDataSourceClassName("HikariPool-10933");
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
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
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
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4119");
        hikariConfig1.setInitializationFailFast(true);
        int int13 = hikariConfig1.getAcquireRetries();
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
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
        java.util.Properties properties26 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource27 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(dataSource27);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold(97L);
        java.lang.String str27 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties28 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-30185" + "'", str20, "HikariPool-30185");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) (-1.0d));
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setDataSourceClassName("HikariPool-2120");
        int int18 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
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
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        boolean boolean24 = hikariConfig20.isJdbc4ConnectionTest();
        hikariConfig20.setConnectionTestQuery("HikariPool-143");
        int int27 = hikariConfig20.getAcquireIncrement();
        hikariConfig20.setInitializationFailFast(false);
        hikariConfig1.addDataSourceProperty("HikariPool-12798", (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAcquireRetryDelay((long) '#');
        boolean boolean12 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime((long) (-1));
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.setLeakDetectionThreshold((long) 10);
        hikariConfig3.setInitializationFailFast(false);
        org.junit.Assert.assertNotNull(properties2);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
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
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireIncrement(0);
        hikariConfig1.setDataSourceClassName("HikariPool-3606");
        hikariConfig1.setAcquireIncrement(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
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
        hikariConfig1.setDataSourceClassName("HikariPool-594");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        hikariConfig18.setCatalog("HikariPool-143");
        int int25 = hikariConfig18.getMinimumPoolSize();
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig30.setTransactionIsolation("HikariPool-13078");
        hikariConfig30.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1843");
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
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
        long long19 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setAcquireRetryDelay((long) 35);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-30250" + "'", str5, "HikariPool-30250");
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) -1);
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.setDataSource(dataSource14);
        hikariConfig10.setAcquireRetryDelay((long) 'a');
        java.lang.String str18 = hikariConfig10.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig10.getDataSourceProperties();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig21.setDataSource(dataSource25);
        hikariConfig21.setAcquireRetryDelay((long) 'a');
        java.lang.String str29 = hikariConfig21.getConnectionCustomizerClassName();
        java.util.Properties properties30 = hikariConfig21.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties30);
        boolean boolean32 = hikariConfig10.isJdbc4ConnectionTest();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        hikariConfig34.setAcquireRetryDelay((long) 'a');
        java.lang.String str42 = hikariConfig34.getConnectionCustomizerClassName();
        java.util.Properties properties43 = hikariConfig34.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        hikariConfig1.setCatalog("HikariPool-2120");
        java.lang.String str48 = hikariConfig1.getCatalog();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-2120" + "'", str48, "HikariPool-2120");
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        int int14 = hikariConfig1.getMinimumPoolSize();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionInitSql("HikariPool-4383");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-28023");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-28023 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig5.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
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
        hikariConfig1.setAcquireRetryDelay((long) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
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
        int int49 = hikariConfig1.getMaximumPoolSize();
        boolean boolean50 = hikariConfig1.isInitializationFailFast();
        java.lang.String str51 = hikariConfig1.getCatalog();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
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
        hikariConfig1.setPoolName("HikariPool-663");
        hikariConfig1.setMaxLifetime((-1L));
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionInitSql("HikariPool-414");
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTestQuery("");
        long long17 = hikariConfig1.getAcquireRetryDelay();
        int int18 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
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
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setPoolName("");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3156");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        boolean boolean21 = hikariConfig19.isJdbc4ConnectionTest();
        hikariConfig19.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str25 = hikariConfig19.getConnectionTestQuery();
        hikariConfig19.setAcquireRetryDelay((long) 100);
        hikariConfig19.addDataSourceProperty("HikariPool-393", (java.lang.Object) (-1.0d));
        java.util.Properties properties31 = hikariConfig19.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties31);
        hikariConfig1.setMaxLifetime(32L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
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
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setInitializationFailFast(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig19.setDataSource(dataSource23);
        hikariConfig19.setAcquireRetryDelay((long) 'a');
        java.lang.String str27 = hikariConfig19.getConnectionCustomizerClassName();
        java.util.Properties properties28 = hikariConfig19.getDataSourceProperties();
        hikariConfig19.setAutoCommit(false);
        hikariConfig19.setInitializationFailFast(false);
        int int33 = hikariConfig19.getMinimumPoolSize();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties36 = hikariConfig35.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.setDataSourceProperties(properties36);
        java.util.Properties properties40 = hikariConfig1.getDataSourceProperties();
        java.lang.String str41 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.setAcquireRetries(60);
        int int46 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
    }
}
