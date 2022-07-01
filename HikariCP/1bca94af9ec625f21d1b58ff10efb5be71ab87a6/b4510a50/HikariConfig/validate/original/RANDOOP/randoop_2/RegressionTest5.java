import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
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
        hikariConfig1.setIdleTimeout((-1L));
        hikariConfig1.setMaxLifetime(600000L);
        int int20 = hikariConfig1.getMaximumPoolSize();
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        boolean boolean22 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        int int11 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-12119");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
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
        hikariConfig1.setCatalog("HikariPool-15061");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
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
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
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
        hikariConfig1.setCatalog("HikariPool-1758");
        long long30 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setInitializationFailFast(false);
        long long35 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1800000L + "'", long30 == 1800000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        int int13 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setIdleTimeout(0L);
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
        long long45 = hikariConfig17.getLeakDetectionThreshold();
        java.util.Properties properties46 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig11.setDataSourceProperties(properties46);
        hikariConfig1.setDataSourceProperties(properties46);
        hikariConfig1.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireIncrement((int) (byte) -1);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-17116");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
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
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        long long12 = hikariConfig1.getMaxLifetime();
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireIncrement(0);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-24356");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
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
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig49.setAutoCommit(true);
        hikariConfig49.setMinimumPoolSize(1);
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
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11999");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11999 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
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
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
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
        long long28 = hikariConfig1.getConnectionTimeout();
        java.lang.String str29 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6208");
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
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
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
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
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-24844" + "'", str14, "HikariPool-24844");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
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
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-934");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-934 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        int int4 = hikariConfig1.getMinimumPoolSize();
        int int5 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-23316");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-23316 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionInitSql("HikariPool-1758");
        hikariConfig1.setCatalog("HikariPool-4383");
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
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
        hikariConfig1.setInitializationFailFast(false);
        int int40 = hikariConfig1.getAcquireIncrement();
        long long41 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaxLifetime(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 600000L + "'", long41 == 600000L);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
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
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireIncrement(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-477");
        long long7 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMaximumPoolSize(10);
        hikariConfig1.setIdleTimeout((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2722");
        java.lang.String str42 = hikariConfig1.getDataSourceClassName();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-1450");
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-143" + "'", str12, "HikariPool-143");
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig12.setDataSource(dataSource14);
        java.util.Properties properties16 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-24915" + "'", str5, "HikariPool-24915");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setTransactionIsolation("HikariPool-3158");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) -1);
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        int int14 = hikariConfig1.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
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
        java.lang.String str47 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean48 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource49 = hikariConfig1.getDataSource();
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
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(dataSource49);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
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
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setCatalog("HikariPool-12931");
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-24940" + "'", str14, "HikariPool-24940");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionInitSql("HikariPool-442");
        java.lang.Class<?> wildcardClass24 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
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
        hikariConfig11.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
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
        hikariConfig5.setConnectionTestQuery("HikariPool-2136");
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
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
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
        hikariConfig1.setCatalog("HikariPool-9423");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
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
        int int11 = hikariConfig1.getAcquireRetries();
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-24961" + "'", str10, "HikariPool-24961");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
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
        hikariConfig1.setDataSourceClassName("HikariPool-5045");
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        long long21 = hikariConfig1.getMaxLifetime();
        java.lang.Class<?> wildcardClass22 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
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
        long long25 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setPoolName("HikariPool-9856");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-24982" + "'", str20, "HikariPool-24982");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
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
        hikariConfig1.setIdleTimeout((long) (-1));
        hikariConfig1.setRegisterMbeans(false);
        long long28 = hikariConfig1.getMaxLifetime();
        java.lang.String str29 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-24989" + "'", str29, "HikariPool-24989");
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setPoolName("HikariPool-184");
        hikariConfig1.setDataSourceClassName("HikariPool-1341");
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        long long15 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-1341" + "'", str14, "HikariPool-1341");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
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
        java.lang.String str18 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
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
        hikariConfig1.setCatalog("HikariPool-2681");
        int int30 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        long long13 = hikariConfig1.getConnectionTimeout();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.setIdleTimeout(1L);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
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
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-25029" + "'", str15, "HikariPool-25029");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7984");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7984 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
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
        int int18 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
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
        long long31 = hikariConfig1.getMaxLifetime();
        int int32 = hikariConfig1.getAcquireRetries();
        int int33 = hikariConfig1.getAcquireIncrement();
        long long34 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24143 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        hikariConfig1.setConnectionInitSql("HikariPool-2485");
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize(0);
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setTransactionIsolation("HikariPool-1465");
        java.lang.String str13 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
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
        long long50 = hikariConfig1.getMaxLifetime();
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1800000L + "'", long50 == 1800000L);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
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
        long long20 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setLeakDetectionThreshold(60L);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str25 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
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
        hikariConfig23.setConnectionCustomizerClassName("HikariPool-2932");
        java.lang.String str28 = hikariConfig23.getConnectionInitSql();
        java.lang.String str29 = hikariConfig23.getDataSourceClassName();
        int int30 = hikariConfig23.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize(0);
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
        int int23 = hikariConfig9.getMinimumPoolSize();
        java.lang.String str24 = hikariConfig9.getDataSourceClassName();
        hikariConfig9.setConnectionCustomizerClassName("");
        int int27 = hikariConfig9.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-888", (java.lang.Object) int27);
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        java.lang.String str31 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
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
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setCatalog("HikariPool-12931");
        long long18 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-25086" + "'", str14, "HikariPool-25086");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setRegisterMbeans(true);
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(false);
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-888");
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
        hikariConfig13.setDataSourceClassName("");
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
        hikariConfig13.setDataSourceProperties(properties38);
        long long41 = hikariConfig13.getLeakDetectionThreshold();
        java.util.Properties properties42 = hikariConfig13.getDataSourceProperties();
        java.lang.String str43 = hikariConfig13.getConnectionCustomizerClassName();
        long long44 = hikariConfig13.getIdleTimeout();
        hikariConfig13.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource47 = null;
        hikariConfig13.setDataSource(dataSource47);
        java.util.Properties properties49 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties49);
        hikariConfig1.setPoolName("HikariPool-15528");
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str55 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 600000L + "'", long44 == 600000L);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
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
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionTestQuery("HikariPool-7258");
        long long22 = hikariConfig1.getIdleTimeout();
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        int int24 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
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
        java.lang.String str20 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-25105" + "'", str20, "HikariPool-25105");
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) (-1.0d));
        int int13 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setCatalog("");
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) hikariConfig16);
        long long27 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        long long30 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5000L + "'", long30 == 5000L);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
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
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        java.util.Properties properties64 = hikariConfig63.getDataSourceProperties();
        java.util.Properties properties66 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties66);
        boolean boolean68 = hikariConfig67.isInitializationFailFast();
        hikariConfig67.setInitializationFailFast(true);
        javax.sql.DataSource dataSource71 = null;
        hikariConfig67.setDataSource(dataSource71);
        hikariConfig67.setAcquireRetryDelay((long) 'a');
        java.lang.String str75 = hikariConfig67.getConnectionCustomizerClassName();
        hikariConfig67.setConnectionCustomizerClassName("hi!");
        java.lang.String str78 = hikariConfig67.getConnectionInitSql();
        hikariConfig63.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig67);
        java.lang.String str80 = hikariConfig63.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource81 = hikariConfig63.getDataSource();
        hikariConfig63.setCatalog("HikariPool-3407");
        hikariConfig63.setAcquireIncrement((int) '#');
        java.lang.String str86 = hikariConfig63.getConnectionInitSql();
        long long87 = hikariConfig63.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-4013", (java.lang.Object) long87);
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
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(dataSource81);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(false);
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-888");
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
        hikariConfig13.setDataSourceClassName("");
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
        hikariConfig13.setDataSourceProperties(properties38);
        long long41 = hikariConfig13.getLeakDetectionThreshold();
        java.util.Properties properties42 = hikariConfig13.getDataSourceProperties();
        java.lang.String str43 = hikariConfig13.getConnectionCustomizerClassName();
        long long44 = hikariConfig13.getIdleTimeout();
        hikariConfig13.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource47 = null;
        hikariConfig13.setDataSource(dataSource47);
        java.util.Properties properties49 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties49);
        long long51 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 600000L + "'", long44 == 600000L);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
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
        hikariConfig1.setConnectionInitSql("HikariPool-4013");
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        int int39 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionInitSql("HikariPool-19530");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
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
        boolean boolean39 = hikariConfig1.isRegisterMbeans();
        long long40 = hikariConfig1.getMaxLifetime();
        int int41 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-11152");
        hikariConfig1.setIdleTimeout(32L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1800000L + "'", long40 == 1800000L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
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
        java.lang.String str27 = hikariConfig1.getCatalog();
        int int28 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setIdleTimeout((long) ' ');
        java.lang.String str31 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetryDelay(3L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-25158" + "'", str31, "HikariPool-25158");
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        hikariConfig1.setLeakDetectionThreshold(60L);
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
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
        int int14 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setRegisterMbeans(false);
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
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
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        int int22 = hikariConfig1.getAcquireRetries();
        boolean boolean23 = hikariConfig1.isInitializationFailFast();
        int int24 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        java.lang.String str7 = hikariConfig1.getPoolName();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-25169" + "'", str7, "HikariPool-25169");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setDataSourceClassName("HikariPool-5267");
        hikariConfig1.setAutoCommit(true);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionInitSql("HikariPool-6131");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-5204");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
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
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2147483647L + "'", long19 == 2147483647L);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
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
        boolean boolean23 = hikariConfig1.isAutoCommit();
        java.lang.String str24 = hikariConfig1.getPoolName();
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
        java.util.Properties properties61 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties61);
        boolean boolean63 = hikariConfig62.isInitializationFailFast();
        hikariConfig62.setInitializationFailFast(true);
        javax.sql.DataSource dataSource66 = null;
        hikariConfig62.setDataSource(dataSource66);
        hikariConfig62.setAcquireRetryDelay((long) 'a');
        java.lang.String str70 = hikariConfig62.getConnectionCustomizerClassName();
        java.lang.String str71 = hikariConfig62.getConnectionInitSql();
        long long72 = hikariConfig62.getConnectionTimeout();
        hikariConfig27.addDataSourceProperty("HikariPool-184", (java.lang.Object) long72);
        long long74 = hikariConfig27.getAcquireRetryDelay();
        hikariConfig27.setAcquireRetries((int) '4');
        java.lang.String str77 = hikariConfig27.getCatalog();
        long long78 = hikariConfig27.getLeakDetectionThreshold();
        hikariConfig27.setJdbc4ConnectionTest(false);
        java.lang.String str81 = hikariConfig27.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-10567", (java.lang.Object) str81);
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
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-25200" + "'", str24, "HikariPool-25200");
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 5000L + "'", long72 == 5000L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getTransactionIsolation();
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setLeakDetectionThreshold(100L);
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionInitSql("HikariPool-663");
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
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
        int int17 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
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
        hikariConfig1.setAcquireIncrement(0);
        hikariConfig1.setTransactionIsolation("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
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
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1843");
        hikariConfig0.setDataSourceClassName("HikariPool-5826");
        int int5 = hikariConfig0.getTransactionIsolation();
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.Class<?> wildcardClass7 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
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
        hikariConfig1.setDataSourceClassName("HikariPool-4466");
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-13898");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
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
        hikariConfig1.setRegisterMbeans(true);
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-393" + "'", str10, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
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
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setInitializationFailFast(true);
        hikariConfig28.setAcquireRetryDelay(1L);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        hikariConfig35.setTransactionIsolation("hi!");
        java.util.Properties properties39 = hikariConfig35.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig28.setDataSourceProperties(properties39);
        hikariConfig23.setDataSourceProperties(properties39);
        boolean boolean43 = hikariConfig23.isRegisterMbeans();
        java.lang.Class<?> wildcardClass44 = hikariConfig23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        int int6 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
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
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
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
        hikariConfig1.setAutoCommit(true);
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
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
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
        hikariConfig0.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setRegisterMbeans(false);
        int int10 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
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
        hikariConfig1.setCatalog("HikariPool-8073");
        javax.sql.DataSource dataSource36 = null;
        hikariConfig1.setDataSource(dataSource36);
        java.lang.String str38 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource39 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-25268" + "'", str38, "HikariPool-25268");
        org.junit.Assert.assertNull(dataSource39);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
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
        boolean boolean38 = hikariConfig1.isRegisterMbeans();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
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
        hikariConfig1.setConnectionInitSql("HikariPool-594");
        long long27 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-1195", obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        long long9 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMaxLifetime((long) 10);
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-7309");
        hikariConfig1.setMaxLifetime(600000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
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
        hikariConfig1.setCatalog("HikariPool-4931");
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setPoolName("HikariPool-4367");
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5769");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5769 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean5 = hikariConfig1.isRegisterMbeans();
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setLeakDetectionThreshold(10L);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
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
        int int17 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        hikariConfig1.setPoolName("HikariPool-1465");
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        long long20 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
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
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-25326" + "'", str12, "HikariPool-25326");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
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
        java.lang.String str16 = hikariConfig1.getPoolName();
        int int17 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-3529" + "'", str16, "HikariPool-3529");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-19261");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-19261 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21441");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21441 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setLeakDetectionThreshold((long) 0);
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
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
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setInitializationFailFast(true);
        int int32 = hikariConfig28.getAcquireRetries();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        hikariConfig35.setInitializationFailFast(true);
        boolean boolean39 = hikariConfig35.isJdbc4ConnectionTest();
        long long40 = hikariConfig35.getConnectionTimeout();
        hikariConfig35.setPoolName("hi!");
        hikariConfig35.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties45 = hikariConfig35.getDataSourceProperties();
        hikariConfig28.addDataSourceProperty("HikariPool-1465", (java.lang.Object) properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig23.setDataSourceProperties(properties45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5000L + "'", long40 == 5000L);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isAutoCommit();
        int int5 = hikariConfig1.getMaximumPoolSize();
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-20483");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
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
        int int41 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1743");
        hikariConfig1.setTransactionIsolation("HikariPool-627");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-2063");
        hikariConfig1.setDataSourceClassName("HikariPool-16179");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
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
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) 3);
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setMaxLifetime(600000L);
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        long long19 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionTestQuery("HikariPool-3533");
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1951");
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
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
        hikariConfig1.setInitializationFailFast(true);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean18 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
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
        long long34 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str35 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-16814");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
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
        java.lang.String str33 = hikariConfig1.getPoolName();
        java.lang.String str34 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-25456" + "'", str33, "HikariPool-25456");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
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
        hikariConfig1.setMaxLifetime(60L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-11784");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-25459" + "'", str10, "HikariPool-25459");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
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
        hikariConfig34.setConnectionTimeout((long) (byte) 100);
        javax.sql.DataSource dataSource43 = hikariConfig34.getDataSource();
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
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig31.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        int int8 = hikariConfig1.getMaximumPoolSize();
        int int9 = hikariConfig1.getAcquireRetries();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
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
        javax.sql.DataSource dataSource27 = hikariConfig1.getDataSource();
        hikariConfig1.setTransactionIsolation("HikariPool-4998");
        hikariConfig1.addDataSourceProperty("HikariPool-22009", (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(dataSource27);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
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
        int int36 = hikariConfig1.getAcquireRetries();
        boolean boolean37 = hikariConfig1.isAutoCommit();
        java.lang.String str38 = hikariConfig1.getPoolName();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-25508" + "'", str38, "HikariPool-25508");
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
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
        java.util.Properties properties31 = hikariConfig23.getDataSourceProperties();
        java.lang.Class<?> wildcardClass32 = properties31.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-391");
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setCatalog("");
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int10 = hikariConfig1.getAcquireIncrement();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
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
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
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
        boolean boolean34 = hikariConfig1.isAutoCommit();
        int int35 = hikariConfig1.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-11349");
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
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
        hikariConfig33.setPoolName("HikariPool-24175");
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
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
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
        int int17 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
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
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAcquireIncrement(60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
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
        hikariConfig1.setUseInstrumentation(true);
        int int28 = hikariConfig1.getAcquireIncrement();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
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
        hikariConfig1.setTransactionIsolation("HikariPool-7986");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setConnectionTestQuery("HikariPool-20453");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        long long3 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        int int5 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-7289");
        hikariConfig1.setCatalog("HikariPool-7978");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
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
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-25607" + "'", str12, "HikariPool-25607");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
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
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        long long13 = hikariConfig1.getMaxLifetime();
        int int14 = hikariConfig1.getAcquireRetries();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-25620" + "'", str7, "HikariPool-25620");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean29 = hikariConfig28.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
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
        long long28 = hikariConfig1.getConnectionTimeout();
        java.lang.String str29 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setMaxLifetime((long) 3);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
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
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.setDataSource(dataSource26);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
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
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((-1L));
        long long23 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties24 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionTimeout(0L);
        int int27 = hikariConfig1.getAcquireRetries();
        java.lang.String str28 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
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
        hikariConfig1.setLeakDetectionThreshold(10L);
        long long15 = hikariConfig1.getConnectionTimeout();
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
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
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-4550");
        hikariConfig1.setConnectionTestQuery("HikariPool-13681");
        int int23 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(false);
        java.lang.Class<?> wildcardClass26 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-11259");
        long long12 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
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
        hikariConfig23.setAcquireIncrement((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTestQuery("HikariPool-3100");
        hikariConfig1.setAutoCommit(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setDataSourceClassName("HikariPool-10604");
        hikariConfig1.setCatalog("HikariPool-17358");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setRegisterMbeans(true);
        int int14 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
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
        java.lang.String str26 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) '#');
        javax.sql.DataSource dataSource29 = null;
        hikariConfig1.setDataSource(dataSource29);
        java.lang.String str31 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3351");
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setPoolName("HikariPool-12163");
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
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
        long long49 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireIncrement(100);
        java.lang.String str52 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str53 = hikariConfig1.getDataSourceClassName();
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1800000L + "'", long49 == 1800000L);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setAcquireRetries(0);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.lang.String str12 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-25726" + "'", str12, "HikariPool-25726");
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int20 = hikariConfig19.getTransactionIsolation();
        java.lang.String str21 = hikariConfig19.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-25730" + "'", str21, "HikariPool-25730");
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
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
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setTransactionIsolation("HikariPool-14329");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
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
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isInitializationFailFast();
        hikariConfig33.setInitializationFailFast(true);
        boolean boolean37 = hikariConfig33.isJdbc4ConnectionTest();
        long long38 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setPoolName("hi!");
        hikariConfig33.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties43 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        javax.sql.DataSource dataSource46 = null;
        hikariConfig1.setDataSource(dataSource46);
        long long48 = hikariConfig1.getLeakDetectionThreshold();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
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
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        int int14 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        long long11 = hikariConfig1.getMaxLifetime();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
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
        hikariConfig1.setAcquireIncrement((int) '#');
        java.lang.String str43 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-4668" + "'", str43, "HikariPool-4668");
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-19774");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
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
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setCatalog("HikariPool-1538");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
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
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        long long17 = hikariConfig1.getMaxLifetime();
        int int18 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setCatalog("HikariPool-14511");
        java.util.Properties properties23 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay(1800000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
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
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        hikariConfig25.setCatalog("");
        hikariConfig25.setDataSourceClassName("HikariPool-391");
        hikariConfig1.addDataSourceProperty("HikariPool-3203", (java.lang.Object) "HikariPool-391");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        java.lang.String str40 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setInitializationFailFast(true);
        int int47 = hikariConfig43.getAcquireRetries();
        long long48 = hikariConfig43.getMaxLifetime();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        boolean boolean51 = hikariConfig50.isInitializationFailFast();
        javax.sql.DataSource dataSource52 = null;
        hikariConfig50.setDataSource(dataSource52);
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        boolean boolean56 = hikariConfig55.isInitializationFailFast();
        hikariConfig55.setInitializationFailFast(true);
        boolean boolean59 = hikariConfig55.isJdbc4ConnectionTest();
        long long60 = hikariConfig55.getConnectionTimeout();
        hikariConfig55.setPoolName("hi!");
        hikariConfig55.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties65 = hikariConfig55.getDataSourceProperties();
        hikariConfig50.setDataSourceProperties(properties65);
        hikariConfig43.setDataSourceProperties(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties65);
        int int69 = hikariConfig68.getAcquireRetries();
        java.lang.String str70 = hikariConfig68.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-24591", (java.lang.Object) str70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1800000L + "'", long48 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 5000L + "'", long60 == 5000L);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
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
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str16 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-25803" + "'", str16, "HikariPool-25803");
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
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
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
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
        hikariConfig1.setConnectionInitSql("HikariPool-1900");
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        long long18 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
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
        hikariConfig1.setDataSourceClassName("HikariPool-2831");
        hikariConfig1.setPoolName("HikariPool-14093");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
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
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        long long22 = hikariConfig16.getLeakDetectionThreshold();
        hikariConfig16.setAcquireRetryDelay((long) ' ');
        java.lang.String str25 = hikariConfig16.getCatalog();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig16.setDataSource(dataSource26);
        int int28 = hikariConfig16.getMaximumPoolSize();
        hikariConfig16.setUseInstrumentation(false);
        java.util.Properties properties31 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties31);
        int int33 = hikariConfig1.getAcquireIncrement();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("");
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
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
        int int14 = hikariConfig1.getMaximumPoolSize();
        long long15 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
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
        hikariConfig1.setPoolName("HikariPool-16960");
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
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(3L);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-25862" + "'", str20, "HikariPool-25862");
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-16763");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-16763 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
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
        java.lang.Class<?> wildcardClass29 = hikariConfig14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
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
        hikariConfig1.setMaxLifetime((long) (short) -1);
        int int18 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMaxLifetime(52L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-25868" + "'", str15, "HikariPool-25868");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
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
        long long18 = hikariConfig1.getConnectionTimeout();
        java.lang.String str19 = hikariConfig1.getCatalog();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setDataSourceClassName("HikariPool-143");
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-19774");
        hikariConfig1.setIdleTimeout((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setPoolName("HikariPool-17083");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
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
        hikariConfig1.setInitializationFailFast(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
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
        boolean boolean27 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAcquireIncrement((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(52L);
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long10 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-19233");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-24274");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getMaxLifetime();
        java.lang.String str10 = hikariConfig1.getPoolName();
        int int11 = hikariConfig1.getAcquireRetries();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-25903" + "'", str10, "HikariPool-25903");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement((int) (byte) -1);
        long long7 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
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
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1964");
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
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
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.addDataSourceProperty("HikariPool-3156", (java.lang.Object) (-1));
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        int int8 = hikariConfig1.getMaximumPoolSize();
        long long9 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-13381");
        hikariConfig1.setIdleTimeout(1800000L);
        hikariConfig1.setTransactionIsolation("HikariPool-3936");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
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
        hikariConfig1.setUseInstrumentation(true);
        long long30 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-25955" + "'", str10, "HikariPool-25955");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
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
        hikariConfig1.setIdleTimeout((long) 0);
        hikariConfig1.setPoolName("HikariPool-11038");
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        long long29 = hikariConfig23.getLeakDetectionThreshold();
        hikariConfig23.setAcquireRetryDelay((long) ' ');
        java.lang.String str32 = hikariConfig23.getCatalog();
        javax.sql.DataSource dataSource33 = null;
        hikariConfig23.setDataSource(dataSource33);
        int int35 = hikariConfig23.getMaximumPoolSize();
        hikariConfig23.setUseInstrumentation(false);
        java.util.Properties properties38 = hikariConfig23.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties38);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
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
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig1.getPoolName();
        long long23 = hikariConfig1.getAcquireRetryDelay();
        java.lang.Class<?> wildcardClass24 = hikariConfig1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-25976" + "'", str22, "HikariPool-25976");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
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
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
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
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setTransactionIsolation("HikariPool-1843");
        hikariConfig1.setPoolName("");
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
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
        int int14 = hikariConfig1.getTransactionIsolation();
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig1.isAutoCommit();
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setConnectionInitSql("HikariPool-14897");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
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
        boolean boolean34 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionTimeout((long) (short) 100);
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
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
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
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str18 = hikariConfig1.getPoolName();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig21.setDataSource(dataSource25);
        hikariConfig21.setAcquireRetryDelay((long) 'a');
        java.lang.String str29 = hikariConfig21.getConnectionCustomizerClassName();
        int int30 = hikariConfig21.getAcquireRetries();
        hikariConfig21.setConnectionCustomizerClassName("");
        hikariConfig21.setAcquireRetries((int) (short) 100);
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setInitializationFailFast(true);
        javax.sql.DataSource dataSource41 = null;
        hikariConfig37.setDataSource(dataSource41);
        hikariConfig37.setAcquireRetryDelay((long) 'a');
        java.lang.String str45 = hikariConfig37.getConnectionCustomizerClassName();
        java.lang.String str46 = hikariConfig37.getConnectionInitSql();
        boolean boolean47 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setMaxLifetime((long) (short) 1);
        hikariConfig21.addDataSourceProperty("HikariPool-393", (java.lang.Object) (short) 1);
        hikariConfig21.setMaximumPoolSize(10);
        java.lang.String str53 = hikariConfig21.getPoolName();
        java.lang.String str54 = hikariConfig21.getConnectionTestQuery();
        hikariConfig21.setConnectionTestQuery("HikariPool-5052");
        int int57 = hikariConfig21.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-2136", (java.lang.Object) int57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-26004" + "'", str18, "HikariPool-26004");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "HikariPool-26005" + "'", str53, "HikariPool-26005");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
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
        hikariConfig1.setCatalog("HikariPool-674");
        long long26 = hikariConfig1.getIdleTimeout();
        long long27 = hikariConfig1.getConnectionTimeout();
        long long28 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
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
        long long23 = hikariConfig5.getAcquireRetryDelay();
        hikariConfig5.setCatalog("HikariPool-7910");
        hikariConfig5.setTransactionIsolation("HikariPool-11027");
        java.lang.String str28 = hikariConfig5.getDataSourceClassName();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
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
        hikariConfig1.setIdleTimeout(5000L);
        boolean boolean42 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-4554");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
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
        long long18 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-26024" + "'", str14, "HikariPool-26024");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setPoolName("");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setPoolName("HikariPool-12112");
        hikariConfig1.setCatalog("HikariPool-21849");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig12.getConnectionInitSql();
        boolean boolean22 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource25 = hikariConfig12.getDataSource();
        boolean boolean26 = hikariConfig12.isInitializationFailFast();
        long long27 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.setPoolName("HikariPool-5778");
        java.util.Properties properties30 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-13656", (java.lang.Object) properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        hikariConfig1.setMaximumPoolSize(10);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMinimumPoolSize(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1639");
        int int24 = hikariConfig1.getTransactionIsolation();
        int int25 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
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
        hikariConfig1.setPoolName("HikariPool-2528");
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
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
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-1150");
        hikariConfig1.setMinimumPoolSize((int) '#');
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6786");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-26061" + "'", str9, "HikariPool-26061");
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12931");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12931 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
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
        java.lang.String str33 = hikariConfig1.getPoolName();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str36 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-26069" + "'", str33, "HikariPool-26069");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-26069" + "'", str36, "HikariPool-26069");
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
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
        hikariConfig1.setMaximumPoolSize(3);
        hikariConfig1.setConnectionTestQuery("HikariPool-6879");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-19877");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-19877 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        int int8 = hikariConfig1.getAcquireIncrement();
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
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
        boolean boolean39 = hikariConfig1.isRegisterMbeans();
        long long40 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str41 = hikariConfig1.getDataSourceClassName();
        boolean boolean42 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean43 = hikariConfig1.isInitializationFailFast();
        java.lang.Object obj45 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-25788", obj45);
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
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
        hikariConfig1.setIdleTimeout((long) 60);
        int int14 = hikariConfig1.getAcquireIncrement();
        int int15 = hikariConfig1.getAcquireIncrement();
        int int16 = hikariConfig1.getMinimumPoolSize();
        long long17 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
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
        java.lang.String str33 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-3953");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-26084" + "'", str33, "HikariPool-26084");
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-963");
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
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
        hikariConfig5.setAutoCommit(false);
        java.lang.String str23 = hikariConfig5.getConnectionTestQuery();
        java.lang.String str24 = hikariConfig5.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        long long9 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-17247");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-17247 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
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
        hikariConfig31.setDataSourceClassName("HikariPool-1639");
        hikariConfig31.setLeakDetectionThreshold((long) (byte) 100);
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
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMinimumPoolSize(3);
        int int12 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int16 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
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
        int int18 = hikariConfig1.getMaximumPoolSize();
        long long19 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig1.getPoolName();
        java.lang.String str23 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-26111" + "'", str22, "HikariPool-26111");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-26111" + "'", str23, "HikariPool-26111");
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3039");
        hikariConfig1.setConnectionInitSql("HikariPool-17534");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        int int10 = hikariConfig1.getAcquireRetries();
        long long11 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setAcquireIncrement(3);
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        int int5 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-3821");
        long long8 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setLeakDetectionThreshold((long) '4');
        int int21 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setUseInstrumentation(true);
        boolean boolean24 = hikariConfig17.isRegisterMbeans();
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
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setInitializationFailFast(true);
        javax.sql.DataSource dataSource41 = null;
        hikariConfig37.setDataSource(dataSource41);
        hikariConfig37.setAcquireRetryDelay((long) 'a');
        java.lang.String str45 = hikariConfig37.getConnectionCustomizerClassName();
        java.util.Properties properties46 = hikariConfig37.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties46);
        boolean boolean48 = hikariConfig26.isJdbc4ConnectionTest();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        boolean boolean51 = hikariConfig50.isInitializationFailFast();
        hikariConfig50.setInitializationFailFast(true);
        javax.sql.DataSource dataSource54 = null;
        hikariConfig50.setDataSource(dataSource54);
        hikariConfig50.setAcquireRetryDelay((long) 'a');
        java.lang.String str58 = hikariConfig50.getConnectionCustomizerClassName();
        java.util.Properties properties59 = hikariConfig50.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties59);
        hikariConfig17.setDataSourceProperties(properties59);
        hikariConfig1.setDataSourceProperties(properties59);
        hikariConfig1.setAcquireIncrement(10);
        boolean boolean65 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        long long11 = hikariConfig1.getMaxLifetime();
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
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
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig61.setRegisterMbeans(true);
        hikariConfig61.setAutoCommit(true);
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
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime((long) 60);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
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
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        boolean boolean21 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
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
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
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
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIdleTimeout((long) '#');
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
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
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionTestQuery("HikariPool-7258");
        long long22 = hikariConfig1.getIdleTimeout();
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
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
        boolean boolean24 = hikariConfig7.isJdbc4ConnectionTest();
        java.lang.String str25 = hikariConfig7.getCatalog();
        java.util.Properties properties26 = hikariConfig7.getDataSourceProperties();
        hikariConfig7.setUseInstrumentation(true);
        boolean boolean29 = hikariConfig7.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
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
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig1.setIdleTimeout((long) (short) -1);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime((long) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("HikariPool-594");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setMaximumPoolSize(60);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        int int18 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24356");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24356 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
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
        java.lang.String str50 = hikariConfig1.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
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
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        int int6 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
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
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str37 = hikariConfig1.getPoolName();
        java.lang.Class<?> wildcardClass38 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-26212" + "'", str37, "HikariPool-26212");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
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
        hikariConfig1.setMinimumPoolSize(100);
        boolean boolean22 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireIncrement(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.Class<?> wildcardClass8 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
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
        long long37 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetries(0);
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
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
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-26239" + "'", str12, "HikariPool-26239");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
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
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-2407");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-859");
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setMaxLifetime((long) 'a');
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setPoolName("HikariPool-7968");
        int int13 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
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
        hikariConfig1.setDataSourceClassName("HikariPool-16656");
        int int18 = hikariConfig1.getMaximumPoolSize();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
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
        boolean boolean29 = hikariConfig1.isAutoCommit();
        java.lang.String str30 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setInitializationFailFast(false);
        int int33 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
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
        boolean boolean23 = hikariConfig10.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionInitSql("HikariPool-1758");
        hikariConfig1.setCatalog("HikariPool-4383");
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        java.lang.String str19 = hikariConfig13.getCatalog();
        int int20 = hikariConfig13.getMinimumPoolSize();
        boolean boolean21 = hikariConfig13.isJdbc4ConnectionTest();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        java.lang.String str30 = hikariConfig24.getCatalog();
        int int31 = hikariConfig24.getMinimumPoolSize();
        hikariConfig24.setTransactionIsolation("");
        hikariConfig13.addDataSourceProperty("HikariPool-1566", (java.lang.Object) hikariConfig24);
        hikariConfig13.setInitializationFailFast(false);
        hikariConfig13.setAcquireIncrement(0);
        hikariConfig1.addDataSourceProperty("HikariPool-2390", (java.lang.Object) 0);
        hikariConfig1.setCatalog("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
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
        long long27 = hikariConfig5.getLeakDetectionThreshold();
        int int28 = hikariConfig5.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-26290" + "'", str13, "HikariPool-26290");
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7114");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7114 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        boolean boolean10 = hikariConfig1.isAutoCommit();
        java.lang.String str11 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-26296" + "'", str11, "HikariPool-26296");
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
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
        hikariConfig1.setLeakDetectionThreshold((-1L));
        int int19 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
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
        hikariConfig1.setUseInstrumentation(true);
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
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
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
        hikariConfig1.setConnectionInitSql("HikariPool-6917");
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        boolean boolean8 = hikariConfig1.isAutoCommit();
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionTimeout(1800000L);
        long long12 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.setAcquireRetryDelay((long) 0);
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("HikariPool-11219");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        int int20 = hikariConfig16.getAcquireRetries();
        long long21 = hikariConfig16.getMaxLifetime();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        javax.sql.DataSource dataSource25 = null;
        hikariConfig23.setDataSource(dataSource25);
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setInitializationFailFast(true);
        boolean boolean32 = hikariConfig28.isJdbc4ConnectionTest();
        long long33 = hikariConfig28.getConnectionTimeout();
        hikariConfig28.setPoolName("hi!");
        hikariConfig28.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties38 = hikariConfig28.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties38);
        hikariConfig16.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig41.setIdleTimeout((long) (byte) 1);
        boolean boolean44 = hikariConfig41.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-9404", (java.lang.Object) boolean44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 5000L + "'", long33 == 5000L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6384");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6620");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.validate();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.validate();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        int int13 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
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
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        java.lang.String str23 = hikariConfig17.getCatalog();
        int int24 = hikariConfig17.getMinimumPoolSize();
        java.lang.String str25 = hikariConfig17.getCatalog();
        long long26 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig17.setJdbc4ConnectionTest(false);
        boolean boolean29 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        boolean boolean32 = hikariConfig17.isAutoCommit();
        boolean boolean33 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setAcquireRetries(100);
        hikariConfig17.addDataSourceProperty("HikariPool-1009", (java.lang.Object) "HikariPool-963");
        hikariConfig1.addDataSourceProperty("HikariPool-888", (java.lang.Object) "HikariPool-1009");
        java.lang.Class<?> wildcardClass40 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
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
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-26366" + "'", str48, "HikariPool-26366");
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
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
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setLeakDetectionThreshold((long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
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
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
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
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2784");
        hikariConfig1.setTransactionIsolation("HikariPool-21251");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
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
        hikariConfig1.setTransactionIsolation("HikariPool-10135");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
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
        hikariConfig34.setConnectionInitSql("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig34.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60 + "'", int49 == 60);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
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
        boolean boolean37 = hikariConfig26.isAutoCommit();
        hikariConfig26.setCatalog("");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.setConnectionTestQuery("");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        hikariConfig30.setAcquireRetryDelay(1L);
        boolean boolean36 = hikariConfig30.isAutoCommit();
        java.lang.String str37 = hikariConfig30.getDataSourceClassName();
        boolean boolean38 = hikariConfig30.isJdbc4ConnectionTest();
        long long39 = hikariConfig30.getIdleTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-9229", (java.lang.Object) long39);
        java.lang.Class<?> wildcardClass41 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 600000L + "'", long39 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
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
        hikariConfig7.setMaximumPoolSize(10);
        java.lang.String str31 = hikariConfig7.getConnectionTestQuery();
        hikariConfig7.setMaximumPoolSize(35);
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
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
        hikariConfig1.setAcquireIncrement((int) ' ');
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
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) 'a');
        int int14 = hikariConfig1.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setRegisterMbeans(false);
        int int10 = hikariConfig1.getTransactionIsolation();
        long long11 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
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
        long long30 = hikariConfig1.getIdleTimeout();
        int int31 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2147483647L + "'", long30 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setDataSourceClassName("hi!");
        hikariConfig15.setConnectionInitSql("");
        java.lang.String str25 = hikariConfig15.getCatalog();
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
        boolean boolean39 = hikariConfig38.isInitializationFailFast();
        hikariConfig38.setInitializationFailFast(true);
        javax.sql.DataSource dataSource42 = null;
        hikariConfig38.setDataSource(dataSource42);
        hikariConfig38.setAcquireRetryDelay((long) 'a');
        java.lang.String str46 = hikariConfig38.getConnectionCustomizerClassName();
        java.util.Properties properties47 = hikariConfig38.getDataSourceProperties();
        hikariConfig27.setDataSourceProperties(properties47);
        hikariConfig15.setDataSourceProperties(properties47);
        hikariConfig1.setDataSourceProperties(properties47);
        java.lang.Class<?> wildcardClass51 = properties47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-7044");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-22595");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
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
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
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
        hikariConfig1.setRegisterMbeans(true);
        long long19 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-888");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        boolean boolean28 = hikariConfig24.isJdbc4ConnectionTest();
        long long29 = hikariConfig24.getConnectionTimeout();
        hikariConfig24.setPoolName("hi!");
        hikariConfig24.setAutoCommit(false);
        int int34 = hikariConfig24.getAcquireRetries();
        hikariConfig24.setConnectionInitSql("");
        java.lang.String str37 = hikariConfig24.getConnectionInitSql();
        java.lang.String str38 = hikariConfig24.getPoolName();
        java.lang.String str39 = hikariConfig24.getDataSourceClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-6595", (java.lang.Object) hikariConfig24);
        boolean boolean41 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setConnectionInitSql("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
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
        long long18 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        int int24 = hikariConfig20.getAcquireRetries();
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        java.util.Properties properties26 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig28.setDataSource(dataSource29);
        hikariConfig28.setMaxLifetime((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
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
        hikariConfig1.setUseInstrumentation(true);
        long long30 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTimeout(1800000L);
        boolean boolean33 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-26505" + "'", str10, "HikariPool-26505");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
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
        hikariConfig1.setLeakDetectionThreshold(10L);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
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
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        long long31 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 600000L + "'", long31 == 600000L);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setLeakDetectionThreshold((long) '4');
        java.lang.String str12 = hikariConfig8.getConnectionCustomizerClassName();
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
        hikariConfig8.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig30.setPoolName("HikariPool-7312");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-5475");
        hikariConfig1.setDataSourceClassName("HikariPool-15136");
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
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
        boolean boolean37 = hikariConfig36.isJdbc4ConnectionTest();
        java.lang.String str38 = hikariConfig36.getConnectionTestQuery();
        boolean boolean39 = hikariConfig36.isRegisterMbeans();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
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
        java.lang.String str28 = hikariConfig23.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setMaxLifetime(52L);
        long long9 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetryDelay((long) (short) -1);
        int int12 = hikariConfig1.getAcquireIncrement();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13656");
        int int16 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.lang.String str10 = hikariConfig1.getPoolName();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-26561" + "'", str10, "HikariPool-26561");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
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
        java.lang.String str26 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) '#');
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setAcquireRetryDelay(1L);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setPoolName("HikariPool-8579");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setMinimumPoolSize(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-26588" + "'", str7, "HikariPool-26588");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
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
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setCatalog("HikariPool-22230");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
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
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        long long20 = hikariConfig1.getConnectionTimeout();
        int int21 = hikariConfig1.getTransactionIsolation();
        boolean boolean22 = hikariConfig1.isAutoCommit();
        java.lang.String str23 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        int int8 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setPoolName("HikariPool-442");
        int int13 = hikariConfig1.getAcquireIncrement();
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1195");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4550");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4550 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-414");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionTimeout(5000L);
        hikariConfig1.setIdleTimeout(600000L);
        long long15 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
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
        int int12 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetryDelay(0L);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        long long17 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
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
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-15169", obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-26619" + "'", str14, "HikariPool-26619");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
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
        hikariConfig1.setInitializationFailFast(false);
        int int22 = hikariConfig1.getTransactionIsolation();
        int int23 = hikariConfig1.getTransactionIsolation();
        java.lang.String str24 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
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
        hikariConfig1.setAcquireIncrement((int) (short) 100);
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
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
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
        hikariConfig1.setPoolName("HikariPool-12606");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
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
        java.lang.String str36 = hikariConfig1.getCatalog();
        boolean boolean37 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setPoolName("HikariPool-8855");
        long long40 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-14726");
        hikariConfig1.validate();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1800000L + "'", long40 == 1800000L);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
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
        boolean boolean23 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        long long28 = hikariConfig27.getLeakDetectionThreshold();
        long long29 = hikariConfig27.getMaxLifetime();
        java.util.Properties properties30 = hikariConfig27.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1800000L + "'", long29 == 1800000L);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
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
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        long long16 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
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
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setIdleTimeout((-1L));
        java.lang.String str30 = hikariConfig1.getDataSourceClassName();
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3868");
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
        java.lang.String str27 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        int int30 = hikariConfig16.getAcquireIncrement();
        hikariConfig1.addDataSourceProperty("HikariPool-7720", (java.lang.Object) hikariConfig16);
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1843");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
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
        hikariConfig1.setPoolName("HikariPool-7170");
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
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
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
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        int int22 = hikariConfig1.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
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
        java.lang.String str20 = hikariConfig1.getPoolName();
        java.lang.String str21 = hikariConfig1.getCatalog();
        int int22 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMinimumPoolSize(52);
        int int26 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-26686" + "'", str20, "HikariPool-26686");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
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
        java.lang.String str38 = hikariConfig26.getDataSourceClassName();
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
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-1465");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
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
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        int int14 = hikariConfig1.getAcquireRetries();
        int int15 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAutoCommit(false);
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-26696" + "'", str12, "HikariPool-26696");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setPoolName("HikariPool-11889");
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        java.lang.String str24 = hikariConfig15.getConnectionInitSql();
        hikariConfig15.setDataSourceClassName("");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setInitializationFailFast(true);
        javax.sql.DataSource dataSource32 = null;
        hikariConfig28.setDataSource(dataSource32);
        hikariConfig28.setAcquireRetryDelay((long) 'a');
        java.lang.String str36 = hikariConfig28.getConnectionCustomizerClassName();
        java.util.Properties properties37 = hikariConfig28.getDataSourceProperties();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        java.util.Properties properties40 = hikariConfig39.getDataSourceProperties();
        hikariConfig28.setDataSourceProperties(properties40);
        hikariConfig15.setDataSourceProperties(properties40);
        long long43 = hikariConfig15.getConnectionTimeout();
        hikariConfig15.setInitializationFailFast(true);
        hikariConfig15.setUseInstrumentation(true);
        hikariConfig1.addDataSourceProperty("HikariPool-24982", (java.lang.Object) hikariConfig15);
        java.lang.String str49 = hikariConfig15.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "HikariPool-26716" + "'", str49, "HikariPool-26716");
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-6601");
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.lang.String str16 = hikariConfig7.getConnectionInitSql();
        hikariConfig7.setDataSourceClassName("");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        hikariConfig20.setAcquireRetryDelay((long) 'a');
        java.lang.String str28 = hikariConfig20.getConnectionCustomizerClassName();
        java.util.Properties properties29 = hikariConfig20.getDataSourceProperties();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.util.Properties properties32 = hikariConfig31.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties32);
        hikariConfig7.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean36 = hikariConfig35.isJdbc4ConnectionTest();
        java.util.Properties properties37 = hikariConfig35.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        java.lang.String str40 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12760");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12760 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionCustomizerClassName("");
        long long9 = hikariConfig1.getConnectionTimeout();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
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
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int30 = hikariConfig29.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-20302");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-20302 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setAcquireRetries(3);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
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
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionInitSql("HikariPool-143");
        int int6 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionInitSql("HikariPool-1199");
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionInitSql("HikariPool-10958");
        boolean boolean15 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
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
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-26786" + "'", str8, "HikariPool-26786");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
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
        long long20 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str21 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-26803" + "'", str11, "HikariPool-26803");
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMaxLifetime((long) 60);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
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
        long long16 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setLeakDetectionThreshold((long) '4');
        java.lang.String str27 = hikariConfig23.getConnectionCustomizerClassName();
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
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig23.setConnectionInitSql("hi!");
        java.lang.String str46 = hikariConfig23.getConnectionInitSql();
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        java.util.Properties properties50 = hikariConfig49.getDataSourceProperties();
        int int51 = hikariConfig49.getTransactionIsolation();
        long long52 = hikariConfig49.getIdleTimeout();
        java.lang.String str53 = hikariConfig49.getConnectionInitSql();
        int int54 = hikariConfig49.getMaximumPoolSize();
        hikariConfig49.setConnectionTestQuery("HikariPool-391");
        hikariConfig23.addDataSourceProperty("HikariPool-2188", (java.lang.Object) hikariConfig49);
        hikariConfig23.setAcquireRetries((int) (byte) 1);
        hikariConfig1.addDataSourceProperty("HikariPool-1566", (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 600000L + "'", long52 == 600000L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 60 + "'", int54 == 60);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
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
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
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
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-20248");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) 1);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-1341");
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getMaxLifetime();
        long long10 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(true);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
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
        hikariConfig1.setPoolName("HikariPool-5778");
        int int19 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
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
        javax.sql.DataSource dataSource37 = hikariConfig1.getDataSource();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
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
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-26861" + "'", str33, "HikariPool-26861");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertNull(dataSource37);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
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
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime(60L);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
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
        long long22 = hikariConfig5.getMaxLifetime();
        long long23 = hikariConfig5.getMaxLifetime();
        java.util.Properties properties24 = hikariConfig5.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setConnectionTimeout((long) (byte) 0);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
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
        hikariConfig1.setDataSourceClassName("HikariPool-7066");
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
        hikariConfig16.setUseInstrumentation(true);
        hikariConfig16.setConnectionTestQuery("HikariPool-393");
        hikariConfig16.setUseInstrumentation(true);
        java.lang.String str50 = hikariConfig16.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-25459", (java.lang.Object) str50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12071");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12071 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2862");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2862 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
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
        hikariConfig1.setLeakDetectionThreshold((-1L));
        hikariConfig1.setUseInstrumentation(false);
        long long20 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
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
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
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
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-8342");
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
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
        hikariConfig1.setMaximumPoolSize((int) ' ');
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setCatalog("HikariPool-3039");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str10 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        int int13 = hikariConfig1.getMaximumPoolSize();
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
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
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setCatalog("HikariPool-21882");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
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
        javax.sql.DataSource dataSource51 = hikariConfig34.getDataSource();
        hikariConfig34.setJdbc4ConnectionTest(true);
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
        org.junit.Assert.assertNull(dataSource51);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
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
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        boolean boolean30 = hikariConfig28.isJdbc4ConnectionTest();
        long long31 = hikariConfig28.getIdleTimeout();
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
        java.util.Properties properties46 = hikariConfig45.getDataSourceProperties();
        hikariConfig34.setDataSourceProperties(properties46);
        int int48 = hikariConfig34.getMinimumPoolSize();
        int int49 = hikariConfig34.getMinimumPoolSize();
        hikariConfig28.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig34);
        boolean boolean51 = hikariConfig34.isJdbc4ConnectionTest();
        java.lang.String str52 = hikariConfig34.getCatalog();
        java.util.Properties properties53 = hikariConfig34.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties53);
        boolean boolean55 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties56 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 600000L + "'", long31 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
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
        long long27 = hikariConfig1.getMaxLifetime();
        int int28 = hikariConfig1.getAcquireIncrement();
        int int29 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-1639");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
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
        int int26 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-2534");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3857");
        int int52 = hikariConfig1.getTransactionIsolation();
        java.lang.String str53 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(false);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-5908");
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
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setLeakDetectionThreshold((-1L));
        hikariConfig1.setTransactionIsolation("HikariPool-7208");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        int int11 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str12 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-26983" + "'", str12, "HikariPool-26983");
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
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
        hikariConfig1.setIdleTimeout((long) 35);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        long long15 = hikariConfig1.getIdleTimeout();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
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
        hikariConfig1.setMaxLifetime(100L);
        hikariConfig1.setConnectionTestQuery("");
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
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
        hikariConfig1.setPoolName("HikariPool-4049");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
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
        int int12 = hikariConfig1.getAcquireRetries();
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
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
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setDataSourceClassName("HikariPool-11421");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-27003" + "'", str10, "HikariPool-27003");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
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
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setRegisterMbeans(false);
        int int31 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
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
        long long30 = hikariConfig23.getIdleTimeout();
        int int31 = hikariConfig23.getAcquireRetries();
        int int32 = hikariConfig23.getAcquireIncrement();
        java.lang.Class<?> wildcardClass33 = hikariConfig23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
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
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setPoolName("HikariPool-17522");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
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
        java.lang.String str27 = hikariConfig1.getCatalog();
        long long28 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig11.setDataSource(dataSource14);
        int int16 = hikariConfig11.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-27043" + "'", str10, "HikariPool-27043");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
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
        java.lang.String str26 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) '#');
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str30 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-27045" + "'", str30, "HikariPool-27045");
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        hikariConfig11.setAcquireRetryDelay(1L);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setTransactionIsolation("hi!");
        java.util.Properties properties22 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig11.setDataSourceProperties(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        hikariConfig1.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
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
        hikariConfig1.setLeakDetectionThreshold(10L);
        long long15 = hikariConfig1.getConnectionTimeout();
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setCatalog("HikariPool-21975");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
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
        long long18 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-27056" + "'", str14, "HikariPool-27056");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setAcquireIncrement((int) (short) -1);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
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
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str31 = hikariConfig1.getCatalog();
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-391");
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaximumPoolSize(1);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
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
        java.util.Properties properties16 = hikariConfig15.getDataSourceProperties();
        long long17 = hikariConfig15.getConnectionTimeout();
        boolean boolean18 = hikariConfig15.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
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
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.getIdleTimeout();
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        int int15 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13684");
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1644");
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        long long3 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.setPoolName("HikariPool-3203");
        java.lang.String str9 = hikariConfig1.getPoolName();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-3203" + "'", str9, "HikariPool-3203");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        long long24 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-7483");
        int int27 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int12 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7711");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7711 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
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
        javax.sql.DataSource dataSource29 = null;
        hikariConfig23.setDataSource(dataSource29);
        hikariConfig23.setPoolName("HikariPool-13354");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
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
        java.lang.String str20 = hikariConfig1.getPoolName();
        java.lang.String str21 = hikariConfig1.getCatalog();
        java.lang.String str22 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties23 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-27175" + "'", str20, "HikariPool-27175");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        hikariConfig1.setLeakDetectionThreshold(1L);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
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
        boolean boolean37 = hikariConfig36.isJdbc4ConnectionTest();
        hikariConfig36.setRegisterMbeans(false);
        boolean boolean40 = hikariConfig36.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig36.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
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
        hikariConfig18.setCatalog("hi!");
        boolean boolean34 = hikariConfig18.isJdbc4ConnectionTest();
        hikariConfig18.setAutoCommit(true);
        hikariConfig18.setConnectionCustomizerClassName("HikariPool-477");
        long long39 = hikariConfig18.getIdleTimeout();
        hikariConfig18.setAutoCommit(true);
        long long42 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setAcquireRetries(100);
        long long45 = hikariConfig18.getConnectionTimeout();
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        boolean boolean48 = hikariConfig47.isInitializationFailFast();
        hikariConfig47.setInitializationFailFast(true);
        javax.sql.DataSource dataSource51 = null;
        hikariConfig47.setDataSource(dataSource51);
        java.lang.String str53 = hikariConfig47.getCatalog();
        int int54 = hikariConfig47.getMinimumPoolSize();
        java.lang.String str55 = hikariConfig47.getCatalog();
        hikariConfig47.setMaximumPoolSize(1);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean59 = hikariConfig58.isRegisterMbeans();
        java.util.Properties properties60 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        boolean boolean62 = hikariConfig61.isInitializationFailFast();
        hikariConfig61.setInitializationFailFast(true);
        hikariConfig61.setAcquireRetryDelay(1L);
        boolean boolean67 = hikariConfig61.isAutoCommit();
        java.util.Properties properties68 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties68);
        java.util.Properties properties70 = hikariConfig69.getDataSourceProperties();
        hikariConfig61.setDataSourceProperties(properties70);
        hikariConfig58.setDataSourceProperties(properties70);
        boolean boolean73 = hikariConfig58.isRegisterMbeans();
        java.util.Properties properties74 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties74);
        boolean boolean76 = hikariConfig75.isInitializationFailFast();
        hikariConfig75.setInitializationFailFast(true);
        javax.sql.DataSource dataSource79 = null;
        hikariConfig75.setDataSource(dataSource79);
        java.lang.String str81 = hikariConfig75.getCatalog();
        hikariConfig75.setConnectionCustomizerClassName("");
        hikariConfig75.setAcquireRetries((int) (byte) 100);
        java.util.Properties properties86 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig87 = new com.zaxxer.hikari.HikariConfig(properties86);
        boolean boolean88 = hikariConfig87.isInitializationFailFast();
        boolean boolean89 = hikariConfig87.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource90 = null;
        hikariConfig87.setDataSource(dataSource90);
        long long92 = hikariConfig87.getIdleTimeout();
        java.util.Properties properties93 = hikariConfig87.getDataSourceProperties();
        hikariConfig75.setDataSourceProperties(properties93);
        hikariConfig58.setDataSourceProperties(properties93);
        hikariConfig47.setDataSourceProperties(properties93);
        hikariConfig18.setDataSourceProperties(properties93);
        hikariConfig1.addDataSourceProperty("HikariPool-11509", (java.lang.Object) properties93);
        javax.sql.DataSource dataSource99 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 600000L + "'", long39 == 600000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 5000L + "'", long45 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 600000L + "'", long92 == 600000L);
        org.junit.Assert.assertNotNull(properties93);
        org.junit.Assert.assertNull(dataSource99);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5149");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5149 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
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
        boolean boolean30 = hikariConfig1.isAutoCommit();
        boolean boolean31 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
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
        long long41 = hikariConfig34.getAcquireRetryDelay();
        java.lang.String str42 = hikariConfig34.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) 3);
        int int13 = hikariConfig1.getAcquireRetries();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig17.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig17.setMinimumPoolSize((int) '#');
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) '#');
        boolean boolean24 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireIncrement(10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
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
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.validate();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-27213" + "'", str12, "HikariPool-27213");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24109");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24109 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
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
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        java.lang.String str24 = hikariConfig20.getConnectionTestQuery();
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        hikariConfig20.setDataSourceClassName("hi!");
        hikariConfig20.setConnectionInitSql("");
        java.lang.String str30 = hikariConfig20.getCatalog();
        boolean boolean31 = hikariConfig20.isInitializationFailFast();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        java.lang.String str38 = hikariConfig34.getConnectionTestQuery();
        boolean boolean39 = hikariConfig34.isRegisterMbeans();
        hikariConfig34.setDataSourceClassName("hi!");
        hikariConfig34.setConnectionInitSql("");
        java.lang.String str44 = hikariConfig34.getCatalog();
        boolean boolean45 = hikariConfig34.isInitializationFailFast();
        hikariConfig20.addDataSourceProperty("HikariPool-184", (java.lang.Object) boolean45);
        long long47 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.setCatalog("HikariPool-143");
        hikariConfig1.addDataSourceProperty("HikariPool-609", (java.lang.Object) "HikariPool-143");
        hikariConfig1.setAcquireRetryDelay(100L);
        javax.sql.DataSource dataSource53 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNull(dataSource53);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
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
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str4 = hikariConfig1.getPoolName();
        long long5 = hikariConfig1.getMaxLifetime();
        long long6 = hikariConfig1.getConnectionTimeout();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) 32);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-27277" + "'", str4, "HikariPool-27277");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
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
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean23 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
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
        hikariConfig1.setUseInstrumentation(true);
        int int30 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAcquireRetries(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-27280" + "'", str10, "HikariPool-27280");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetryDelay((long) 0);
        java.lang.String str19 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionTimeout((long) 100);
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-20739");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-20739 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig12.getCatalog();
        int int19 = hikariConfig12.getMinimumPoolSize();
        java.lang.String str20 = hikariConfig12.getCatalog();
        hikariConfig12.setIdleTimeout((long) (short) 10);
        java.lang.String str23 = hikariConfig12.getConnectionTestQuery();
        long long24 = hikariConfig12.getIdleTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-4931", (java.lang.Object) long24);
        java.lang.Class<?> wildcardClass26 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
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
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireIncrement(1);
        hikariConfig1.setIdleTimeout((long) (short) 0);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
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
        long long35 = hikariConfig15.getAcquireRetryDelay();
        int int36 = hikariConfig15.getMinimumPoolSize();
        javax.sql.DataSource dataSource37 = hikariConfig15.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-27339" + "'", str33, "HikariPool-27339");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNull(dataSource37);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        int int8 = hikariConfig1.getAcquireIncrement();
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig15.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
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
        hikariConfig1.setConnectionInitSql("HikariPool-594");
        boolean boolean27 = hikariConfig1.isAutoCommit();
        long long28 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties29 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.lang.String str19 = hikariConfig18.getConnectionTestQuery();
        int int20 = hikariConfig18.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setPoolName("");
        long long15 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTimeout(0L);
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetries(35);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
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
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
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
        hikariConfig1.setAcquireRetries((int) 'a');
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setPoolName("");
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.setAcquireRetries((int) (short) 0);
        hikariConfig1.setMaxLifetime((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        int int3 = hikariConfig0.getAcquireRetries();
        java.lang.String str4 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
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
        hikariConfig1.setConnectionInitSql("HikariPool-6838");
        int int32 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
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
        java.lang.String str27 = hikariConfig1.getCatalog();
        int int28 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireIncrement(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("");
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        long long10 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-143");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setTransactionIsolation("hi!");
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        long long19 = hikariConfig14.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig14.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        int int22 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
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
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
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
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        long long19 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
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
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-1150");
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.setMaxLifetime(60L);
        hikariConfig1.setMinimumPoolSize(60);
        hikariConfig1.setPoolName("HikariPool-10777");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13684");
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        java.lang.String str10 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.setMaxLifetime(35L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
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
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-7044");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-2643");
        hikariConfig1.setCatalog("HikariPool-3904");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
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
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-14296", (java.lang.Object) "HikariPool-2175");
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
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
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
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
        hikariConfig1.setDataSourceClassName("HikariPool-907");
        hikariConfig1.setMaximumPoolSize(100);
        boolean boolean26 = hikariConfig1.isJdbc4ConnectionTest();
        long long27 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setTransactionIsolation("HikariPool-7023");
        boolean boolean20 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMaxLifetime((long) 10);
        long long16 = hikariConfig1.getMaxLifetime();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-3861");
        long long6 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
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
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-627");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-627 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
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
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
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
        hikariConfig1.setIdleTimeout((long) 60);
        hikariConfig1.setMaximumPoolSize(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-2390");
        hikariConfig1.setMaxLifetime((long) (short) -1);
        int int17 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
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
        long long22 = hikariConfig5.getMaxLifetime();
        long long23 = hikariConfig5.getMaxLifetime();
        java.util.Properties properties24 = hikariConfig5.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
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
        hikariConfig1.setDataSourceProperties(properties39);
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-27474");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) 3);
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setMaxLifetime(600000L);
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        int int19 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime((long) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
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
        int int38 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str39 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-27542" + "'", str33, "HikariPool-27542");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
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
        hikariConfig1.setMaximumPoolSize(3);
        int int23 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        hikariConfig1.setPoolName("HikariPool-907");
        boolean boolean13 = hikariConfig1.isAutoCommit();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig15.getDataSourceProperties();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(true);
        javax.sql.DataSource dataSource30 = null;
        hikariConfig26.setDataSource(dataSource30);
        hikariConfig26.setAcquireRetryDelay((long) 'a');
        java.lang.String str34 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig26.getDataSourceProperties();
        hikariConfig15.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig37.setConnectionTestQuery("HikariPool-594");
        java.util.Properties properties40 = hikariConfig37.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
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
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
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
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        int int17 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        hikariConfig20.setAcquireRetryDelay((long) 'a');
        java.lang.String str28 = hikariConfig20.getConnectionCustomizerClassName();
        java.lang.String str29 = hikariConfig20.getConnectionInitSql();
        hikariConfig20.setDataSourceClassName("");
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
        java.util.Properties properties45 = hikariConfig44.getDataSourceProperties();
        hikariConfig33.setDataSourceProperties(properties45);
        hikariConfig20.setDataSourceProperties(properties45);
        long long48 = hikariConfig20.getLeakDetectionThreshold();
        java.util.Properties properties49 = hikariConfig20.getDataSourceProperties();
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        boolean boolean53 = hikariConfig52.isInitializationFailFast();
        hikariConfig52.setInitializationFailFast(true);
        hikariConfig52.setAcquireRetryDelay(1L);
        hikariConfig52.setAcquireIncrement((int) (byte) 100);
        int int60 = hikariConfig52.getTransactionIsolation();
        int int61 = hikariConfig52.getTransactionIsolation();
        hikariConfig52.setIdleTimeout((long) (byte) 100);
        hikariConfig20.addDataSourceProperty("HikariPool-963", (java.lang.Object) hikariConfig52);
        hikariConfig1.addDataSourceProperty("HikariPool-12112", (java.lang.Object) hikariConfig52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
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
        hikariConfig1.setCatalog("HikariPool-1701");
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-20646");
        boolean boolean40 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
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
        java.lang.String str16 = hikariConfig1.getPoolName();
        long long17 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-27584" + "'", str16, "HikariPool-27584");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
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
        long long51 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean54 = hikariConfig53.isInitializationFailFast();
        boolean boolean55 = hikariConfig53.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource56 = null;
        hikariConfig53.setDataSource(dataSource56);
        long long58 = hikariConfig53.getIdleTimeout();
        hikariConfig53.setConnectionCustomizerClassName("HikariPool-184");
        long long61 = hikariConfig53.getIdleTimeout();
        hikariConfig53.setRegisterMbeans(true);
        int int64 = hikariConfig53.getAcquireRetries();
        int int65 = hikariConfig53.getAcquireIncrement();
        java.util.Properties properties67 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        boolean boolean69 = hikariConfig68.isInitializationFailFast();
        hikariConfig68.setInitializationFailFast(true);
        java.lang.String str72 = hikariConfig68.getConnectionTestQuery();
        hikariConfig68.setDataSourceClassName("");
        java.util.Properties properties76 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties76);
        boolean boolean78 = hikariConfig77.isInitializationFailFast();
        hikariConfig77.setInitializationFailFast(true);
        int int81 = hikariConfig77.getAcquireRetries();
        long long82 = hikariConfig77.getMaxLifetime();
        hikariConfig77.setMaxLifetime((long) (short) 0);
        long long85 = hikariConfig77.getIdleTimeout();
        boolean boolean86 = hikariConfig77.isRegisterMbeans();
        long long87 = hikariConfig77.getAcquireRetryDelay();
        hikariConfig68.addDataSourceProperty("HikariPool-184", (java.lang.Object) long87);
        javax.sql.DataSource dataSource89 = null;
        hikariConfig68.setDataSource(dataSource89);
        hikariConfig68.setConnectionTestQuery("HikariPool-393");
        hikariConfig68.setInitializationFailFast(false);
        hikariConfig53.addDataSourceProperty("HikariPool-4652", (java.lang.Object) false);
        java.util.Properties properties96 = hikariConfig53.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties96);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 600000L + "'", long58 == 600000L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 600000L + "'", long61 == 600000L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1800000L + "'", long82 == 1800000L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 600000L + "'", long85 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(properties96);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
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
        hikariConfig1.setIdleTimeout((long) 60);
        boolean boolean25 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        long long28 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60L + "'", long28 == 60L);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        int int11 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-2636");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getAcquireRetries();
        java.lang.String str9 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-27597" + "'", str9, "HikariPool-27597");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
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
        hikariConfig1.setConnectionInitSql("HikariPool-5315");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setRegisterMbeans(false);
        int int10 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
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
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.validate();
        hikariConfig1.validate();
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-27610" + "'", str12, "HikariPool-27610");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
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
        hikariConfig1.setPoolName("HikariPool-1465");
        int int51 = hikariConfig1.getAcquireRetries();
        long long52 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIdleTimeout(600000L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(35L);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }
}
