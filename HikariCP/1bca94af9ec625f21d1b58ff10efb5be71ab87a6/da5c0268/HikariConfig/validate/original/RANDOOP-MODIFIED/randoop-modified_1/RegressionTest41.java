import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-658");
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.getAcquireIncrement();
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setMinimumPoolSize((int) '#');
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        int int14 = hikariConfig1.getTransactionIsolation();
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        hikariConfig17.setReadOnly(false);
        hikariConfig17.setCatalog("");
        javax.sql.DataSource dataSource26 = null;
        hikariConfig17.setDataSource(dataSource26);
        int int28 = hikariConfig17.getMaximumPoolSize();
        java.lang.String str29 = hikariConfig17.getDataSourceClassName();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.setTransactionIsolation("");
        boolean boolean34 = hikariConfig31.isInitializationFailFast();
        hikariConfig31.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig37.setConnectionInitSql("");
        boolean boolean40 = hikariConfig37.isJdbc4ConnectionTest();
        java.lang.String str41 = hikariConfig37.getCatalog();
        hikariConfig37.setReadOnly(false);
        java.lang.String str44 = hikariConfig37.getConnectionInitSql();
        hikariConfig37.setIsolateInternalQueries(false);
        java.util.Properties properties47 = hikariConfig37.getDataSourceProperties();
        hikariConfig31.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig49.setConnectionInitSql("");
        boolean boolean52 = hikariConfig49.isJdbc4ConnectionTest();
        java.lang.String str53 = hikariConfig49.getCatalog();
        java.lang.String str54 = hikariConfig49.getCatalog();
        hikariConfig49.setPoolName("");
        java.lang.String str57 = hikariConfig49.getConnectionInitSql();
        java.util.Properties properties58 = hikariConfig49.getDataSourceProperties();
        hikariConfig31.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig17.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig1.addDataSourceProperty("HikariPool-7822", (java.lang.Object) properties58);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.getMinimumPoolSize();
        boolean boolean14 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getMaxLifetime();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isReadOnly();
        java.util.Properties properties14 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties14);
        int int16 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        boolean boolean9 = hikariConfig1.isAutoCommit();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(true);
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setAcquireRetryDelay((long) (short) 100);
        hikariConfig12.setMinimumPoolSize((int) (byte) 100);
        hikariConfig12.setCatalog("");
        hikariConfig12.setCatalog("HikariPool-674");
        hikariConfig12.setIdleTimeout((long) 1);
        java.lang.Class<?> wildcardClass23 = hikariConfig12.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-7606", (java.lang.Object) wildcardClass23);
        hikariConfig0.setReadOnly(false);
        int int27 = hikariConfig0.getMaximumPoolSize();
        boolean boolean28 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
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
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionInitSql("");
        int int14 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setJdbcUrl("HikariPool-23548");
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        int int20 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
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
        hikariConfig15.setMaximumPoolSize(1);
        hikariConfig15.setCatalog("HikariPool-50287");
        java.lang.String str35 = hikariConfig15.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        javax.sql.DataSource dataSource2 = null;
        hikariConfig1.setDataSource(dataSource2);
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig5.setConnectionInitSql("");
        javax.sql.DataSource dataSource8 = hikariConfig5.getDataSource();
        hikariConfig5.setLeakDetectionThreshold(600000L);
        boolean boolean11 = hikariConfig5.isAutoCommit();
        long long12 = hikariConfig5.getIdleTimeout();
        java.util.Properties properties13 = hikariConfig5.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        int int16 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
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
        hikariConfig1.setConnectionInitSql("HikariPool-41522");
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setDataSourceClassName("HikariPool-674");
        hikariConfig0.validate();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        boolean boolean16 = hikariConfig13.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig13.getCatalog();
        hikariConfig13.setReadOnly(false);
        java.lang.String str20 = hikariConfig13.getConnectionInitSql();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setAcquireRetryDelay((long) (short) 100);
        hikariConfig22.setMinimumPoolSize((int) (byte) 100);
        hikariConfig22.setJdbcUrl("hi!");
        java.lang.String str29 = hikariConfig22.getJdbcUrl();
        java.lang.String str30 = hikariConfig22.getDataSourceClassName();
        boolean boolean31 = hikariConfig22.isRegisterMbeans();
        hikariConfig22.setPoolName("HikariPool-998");
        java.util.Properties properties34 = hikariConfig22.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties38 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig0.setDataSourceProperties(properties38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setCatalog("");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-17839");
        java.lang.String str13 = hikariConfig1.getPoolName();
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-90142" + "'", str13, "HikariPool-90142");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
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
        boolean boolean40 = hikariConfig0.isAutoCommit();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.lang.String str44 = hikariConfig43.getConnectionCustomizerClassName();
        int int45 = hikariConfig43.getAcquireIncrement();
        javax.sql.DataSource dataSource46 = null;
        hikariConfig43.setDataSource(dataSource46);
        hikariConfig43.setTransactionIsolation("HikariPool-932");
        hikariConfig43.setMaximumPoolSize(0);
        hikariConfig0.addDataSourceProperty("HikariPool-805", (java.lang.Object) hikariConfig43);
        java.lang.String str53 = hikariConfig0.getDataSourceClassName();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
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
        hikariConfig0.setAutoCommit(true);
        java.lang.String str16 = hikariConfig0.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-90151" + "'", str16, "HikariPool-90151");
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
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
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str41 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig17.setConnectionCustomizerClassName("HikariPool-27384");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-4907");
        hikariConfig0.setAcquireRetries((int) (short) 1);
        hikariConfig0.setIdleTimeout(600000L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-130");
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout(100L);
        java.lang.String str13 = hikariConfig0.getCatalog();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIdleTimeout((long) 60);
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
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
        hikariConfig0.setDataSourceClassName("HikariPool-56238");
        java.lang.String str30 = hikariConfig0.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        long long18 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-90171" + "'", str9, "HikariPool-90171");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setTransactionIsolation("");
        long long23 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig20.setAcquireIncrement(100);
        hikariConfig20.setReadOnly(true);
        int int30 = hikariConfig20.getMinimumPoolSize();
        hikariConfig20.setJdbc4ConnectionTest(false);
        long long33 = hikariConfig20.getIdleTimeout();
        java.util.Properties properties34 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.addDataSourceProperty("HikariPool-8974", (java.lang.Object) hikariConfig35);
        java.lang.String str37 = hikariConfig35.getPoolName();
        hikariConfig35.setMaximumPoolSize((int) (short) 1);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 600000L + "'", long33 == 600000L);
        org.junit.Assert.assertNotNull(properties34);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-90175" + "'", str37, "HikariPool-90175");
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("HikariPool-4199");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setLeakDetectionThreshold(97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries(32);
        long long10 = hikariConfig0.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setMinimumPoolSize((int) '#');
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-22934");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-74564");
        hikariConfig1.setIdleTimeout((long) 52);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
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
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setTransactionIsolation("HikariPool-35821");
        int int17 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        int int10 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
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
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        int int18 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setUseInstrumentation(false);
        long long14 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        hikariConfig1.setPoolName("HikariPool-60911");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        long long12 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
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
        hikariConfig1.setLeakDetectionThreshold(750L);
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        int int18 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        long long25 = hikariConfig21.getConnectionTimeout();
        int int26 = hikariConfig21.getTransactionIsolation();
        boolean boolean27 = hikariConfig21.isInitializationFailFast();
        java.lang.String str28 = hikariConfig21.getPoolName();
        java.lang.String str29 = hikariConfig21.getConnectionTestQuery();
        hikariConfig1.addDataSourceProperty("HikariPool-64204", (java.lang.Object) hikariConfig21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-90190" + "'", str28, "HikariPool-90190");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
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
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-52275");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-17891");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-17891 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
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
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-55445");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-566" + "'", str14, "HikariPool-566");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
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
        java.lang.String str18 = hikariConfig13.getConnectionInitSql();
        boolean boolean19 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig13.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbcUrl("HikariPool-151");
        java.lang.String str13 = hikariConfig1.getPoolName();
        int int14 = hikariConfig1.getMaximumPoolSize();
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig17.getConnectionInitSql();
        int int23 = hikariConfig17.getMaximumPoolSize();
        long long24 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setRegisterMbeans(false);
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig28.setTransactionIsolation("");
        javax.sql.DataSource dataSource31 = null;
        hikariConfig28.setDataSource(dataSource31);
        boolean boolean33 = hikariConfig28.isJdbc4ConnectionTest();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setTransactionIsolation("");
        javax.sql.DataSource dataSource38 = hikariConfig35.getDataSource();
        long long39 = hikariConfig35.getConnectionTimeout();
        java.lang.String str40 = hikariConfig35.getCatalog();
        hikariConfig35.setInitializationFailFast(false);
        java.util.Properties properties43 = hikariConfig35.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig28.setDataSourceProperties(properties43);
        hikariConfig17.setDataSourceProperties(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties43);
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setTransactionIsolation("");
        javax.sql.DataSource dataSource55 = hikariConfig52.getDataSource();
        long long56 = hikariConfig52.getConnectionTimeout();
        java.lang.String str57 = hikariConfig52.getCatalog();
        hikariConfig52.setInitializationFailFast(false);
        java.util.Properties properties60 = hikariConfig52.getDataSourceProperties();
        hikariConfig52.setJdbcUrl("HikariPool-151");
        java.util.Properties properties63 = hikariConfig52.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getAcquireRetries();
        java.util.Properties properties66 = hikariConfig64.getDataSourceProperties();
        hikariConfig50.setDataSourceProperties(properties66);
        java.lang.String str68 = hikariConfig50.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-90196" + "'", str13, "HikariPool-90196");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 750L + "'", long24 == 750L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5000L + "'", long39 == 5000L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 5000L + "'", long56 == 5000L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-761");
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("");
        hikariConfig1.setDataSourceClassName("HikariPool-382");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-8568");
        int int14 = hikariConfig1.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionTestQuery("HikariPool-5648");
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setPoolName("HikariPool-38717");
        hikariConfig1.setDataSourceClassName("HikariPool-50366");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig1.getPoolName();
        java.lang.String str8 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        hikariConfig9.setReadOnly(false);
        java.lang.String str16 = hikariConfig9.getConnectionInitSql();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setAcquireRetryDelay((long) (short) 100);
        hikariConfig18.setMinimumPoolSize((int) (byte) 100);
        hikariConfig18.setJdbcUrl("hi!");
        java.lang.String str25 = hikariConfig18.getJdbcUrl();
        java.lang.String str26 = hikariConfig18.getDataSourceClassName();
        boolean boolean27 = hikariConfig18.isRegisterMbeans();
        hikariConfig18.setPoolName("HikariPool-998");
        java.util.Properties properties30 = hikariConfig18.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.util.Properties properties34 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-42873");
        boolean boolean40 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-90209" + "'", str7, "HikariPool-90209");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
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
        int int14 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-1339" + "'", str11, "HikariPool-1339");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime(5000L);
        hikariConfig1.setRegisterMbeans(false);
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2024");
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
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
        boolean boolean15 = hikariConfig7.isIsolateInternalQueries();
        hikariConfig7.setTransactionIsolation("HikariPool-12198");
        boolean boolean18 = hikariConfig7.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(true);
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireRetries((int) (byte) 100);
        boolean boolean11 = hikariConfig0.isAutoCommit();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setAutoCommit(false);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int13 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setCatalog("HikariPool-4453");
        hikariConfig1.setAcquireRetries(97);
        hikariConfig1.setRegisterMbeans(false);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
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
        java.lang.String str12 = hikariConfig11.getCatalog();
        long long13 = hikariConfig11.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setMaximumPoolSize(100);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-66939");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-66939 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
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
        java.lang.String str54 = hikariConfig53.getCatalog();
        java.util.Properties properties55 = hikariConfig53.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        java.lang.String str57 = hikariConfig56.getConnectionTestQuery();
        long long58 = hikariConfig56.getLeakDetectionThreshold();
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
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setPoolName("HikariPool-10669");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig28.setTransactionIsolation("");
        javax.sql.DataSource dataSource31 = hikariConfig28.getDataSource();
        long long32 = hikariConfig28.getConnectionTimeout();
        java.lang.String str33 = hikariConfig28.getCatalog();
        hikariConfig28.setInitializationFailFast(false);
        java.util.Properties properties36 = hikariConfig28.getDataSourceProperties();
        boolean boolean37 = hikariConfig28.isInitializationFailFast();
        boolean boolean38 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setCatalog("HikariPool-1164");
        java.util.Properties properties41 = hikariConfig28.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties41);
        int int43 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
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
        hikariConfig7.setConnectionTestQuery("HikariPool-12975");
        hikariConfig7.setReadOnly(true);
        boolean boolean34 = hikariConfig7.isInitializationFailFast();
        int int35 = hikariConfig7.getAcquireIncrement();
        boolean boolean36 = hikariConfig7.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(true);
        int int13 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        long long19 = hikariConfig15.getConnectionTimeout();
        java.lang.String str20 = hikariConfig15.getCatalog();
        int int21 = hikariConfig15.getTransactionIsolation();
        java.util.Properties properties22 = hikariConfig15.getDataSourceProperties();
        hikariConfig15.setPoolName("HikariPool-4919");
        int int25 = hikariConfig15.getTransactionIsolation();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.setTransactionIsolation("");
        hikariConfig27.setCatalog("");
        hikariConfig27.setMinimumPoolSize(100);
        java.lang.String str34 = hikariConfig27.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig35.setConnectionInitSql("");
        boolean boolean38 = hikariConfig35.isJdbc4ConnectionTest();
        java.lang.String str39 = hikariConfig35.getCatalog();
        java.lang.String str40 = hikariConfig35.getConnectionTestQuery();
        hikariConfig35.setLeakDetectionThreshold((long) '4');
        hikariConfig35.setMaxLifetime(5000L);
        hikariConfig35.setAcquireRetries((int) (short) 1);
        java.util.Properties properties47 = hikariConfig35.getDataSourceProperties();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig50.setTransactionIsolation("");
        javax.sql.DataSource dataSource53 = hikariConfig50.getDataSource();
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig56.setConnectionInitSql("");
        hikariConfig56.setJdbcUrl("");
        hikariConfig56.setConnectionTestQuery("hi!");
        hikariConfig50.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig56);
        java.util.Properties properties64 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig65.setConnectionInitSql("");
        hikariConfig65.setJdbcUrl("");
        hikariConfig65.setConnectionTestQuery("hi!");
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig73.setTransactionIsolation("");
        javax.sql.DataSource dataSource76 = hikariConfig73.getDataSource();
        long long77 = hikariConfig73.getConnectionTimeout();
        java.lang.String str78 = hikariConfig73.getCatalog();
        hikariConfig73.setInitializationFailFast(false);
        java.util.Properties properties81 = hikariConfig73.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties81);
        hikariConfig65.setDataSourceProperties(properties81);
        hikariConfig50.setDataSourceProperties(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig86 = new com.zaxxer.hikari.HikariConfig(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig87 = new com.zaxxer.hikari.HikariConfig(properties81);
        hikariConfig35.addDataSourceProperty("HikariPool-102", (java.lang.Object) properties81);
        hikariConfig27.setDataSourceProperties(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig90 = new com.zaxxer.hikari.HikariConfig(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig91 = new com.zaxxer.hikari.HikariConfig(properties81);
        hikariConfig15.setDataSourceProperties(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig93 = new com.zaxxer.hikari.HikariConfig(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig94 = new com.zaxxer.hikari.HikariConfig(properties81);
        hikariConfig1.setDataSourceProperties(properties81);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(dataSource53);
        org.junit.Assert.assertNull(dataSource76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 5000L + "'", long77 == 5000L);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(properties81);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
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
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setCatalog("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
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
        hikariConfig7.setReadOnly(false);
        hikariConfig7.setInitializationFailFast(true);
        hikariConfig7.setDataSourceClassName("HikariPool-1881");
        boolean boolean36 = hikariConfig7.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        boolean boolean10 = hikariConfig8.isIsolateInternalQueries();
        boolean boolean11 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setReadOnly(false);
        boolean boolean14 = hikariConfig8.isRegisterMbeans();
        java.util.Properties properties15 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig0.setDataSourceProperties(properties15);
        hikariConfig0.setAcquireRetryDelay(52L);
        hikariConfig0.setAcquireRetries(52);
        int int22 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig30.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getMaxLifetime();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        hikariConfig1.setJdbcUrl("HikariPool-2827");
        hikariConfig1.setAcquireIncrement(100);
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean18 = hikariConfig0.isReadOnly();
        long long19 = hikariConfig0.getMaxLifetime();
        int int20 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("HikariPool-102");
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        int int17 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setJdbcUrl("HikariPool-761");
        hikariConfig1.setPoolName("HikariPool-159");
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        hikariConfig1.setAcquireRetryDelay(3L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-14325");
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-33114");
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionInitSql("HikariPool-42833");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setTransactionIsolation("HikariPool-151");
        hikariConfig0.setInitializationFailFast(true);
        long long15 = hikariConfig0.getMaxLifetime();
        long long16 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-46050");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
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
        boolean boolean14 = hikariConfig1.isAutoCommit();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetries(10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.setRegisterMbeans(true);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str16 = hikariConfig15.getConnectionCustomizerClassName();
        int int17 = hikariConfig15.getAcquireIncrement();
        hikariConfig0.addDataSourceProperty("HikariPool-2491", (java.lang.Object) hikariConfig15);
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isReadOnly();
        java.lang.String str10 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str13 = hikariConfig8.getCatalog();
        hikariConfig8.setDataSourceClassName("HikariPool-158");
        hikariConfig1.addDataSourceProperty("HikariPool-969", (java.lang.Object) hikariConfig8);
        hikariConfig8.validate();
        boolean boolean18 = hikariConfig8.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setTransactionIsolation("HikariPool-919");
        hikariConfig0.setLeakDetectionThreshold(750L);
        hikariConfig0.setAcquireRetryDelay(100L);
        int int14 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIdleTimeout((long) 3);
        boolean boolean9 = hikariConfig0.isReadOnly();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        long long11 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
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
        java.lang.String str25 = hikariConfig24.getConnectionInitSql();
        java.lang.String str26 = hikariConfig24.getPoolName();
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        int int28 = hikariConfig24.getMaximumPoolSize();
        hikariConfig24.setIsolateInternalQueries(true);
        hikariConfig24.setAutoCommit(true);
        long long33 = hikariConfig24.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-90304" + "'", str26, "HikariPool-90304");
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 750L + "'", long33 == 750L);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
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
        hikariConfig13.setLeakDetectionThreshold((long) 3);
        hikariConfig13.setAcquireRetries(1);
        java.util.Properties properties24 = hikariConfig13.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
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
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.setDataSource(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireRetries(32);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setTransactionIsolation("HikariPool-23603");
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        int int13 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbcUrl("HikariPool-1276");
        boolean boolean10 = hikariConfig1.isAutoCommit();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
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
        hikariConfig0.setJdbcUrl("HikariPool-8679");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("HikariPool-7561");
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
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
        hikariConfig1.setConnectionTimeout(600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
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
        boolean boolean15 = hikariConfig7.isIsolateInternalQueries();
        hikariConfig7.setConnectionInitSql("HikariPool-8833");
        java.lang.String str18 = hikariConfig7.getCatalog();
        hikariConfig7.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24052 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.addDataSourceProperty("HikariPool-130", (java.lang.Object) hikariConfig20);
        long long22 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean23 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionInitSql("HikariPool-15881");
        java.lang.String str19 = hikariConfig1.getPoolName();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-919" + "'", str19, "HikariPool-919");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-6249");
        hikariConfig0.setMaxLifetime((long) (short) 0);
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.setTransactionIsolation("");
        javax.sql.DataSource dataSource30 = hikariConfig27.getDataSource();
        long long31 = hikariConfig27.getConnectionTimeout();
        int int32 = hikariConfig27.getTransactionIsolation();
        boolean boolean33 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setAutoCommit(true);
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig38.setConnectionInitSql("");
        hikariConfig38.setJdbcUrl("");
        javax.sql.DataSource dataSource43 = null;
        hikariConfig38.setDataSource(dataSource43);
        long long45 = hikariConfig38.getMaxLifetime();
        boolean boolean46 = hikariConfig38.isJdbc4ConnectionTest();
        hikariConfig38.setMaximumPoolSize((int) '#');
        java.lang.String str49 = hikariConfig38.getPoolName();
        hikariConfig38.setMinimumPoolSize((int) (short) 1);
        javax.sql.DataSource dataSource52 = null;
        hikariConfig38.setDataSource(dataSource52);
        int int54 = hikariConfig38.getAcquireRetries();
        hikariConfig27.addDataSourceProperty("", (java.lang.Object) hikariConfig38);
        java.util.Properties properties56 = hikariConfig38.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties56);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1800000L + "'", long45 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "HikariPool-90325" + "'", str49, "HikariPool-90325");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setAcquireRetryDelay(100L);
        hikariConfig1.setMaxLifetime(0L);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        hikariConfig1.setDataSourceClassName("HikariPool-1165");
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        boolean boolean18 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setAcquireIncrement((int) (byte) 100);
        boolean boolean21 = hikariConfig15.isJdbc4ConnectionTest();
        java.util.Properties properties22 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-90328" + "'", str9, "HikariPool-90328");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setTransactionIsolation("HikariPool-7428");
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
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
        java.util.Properties properties38 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 750L + "'", long31 == 750L);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAcquireRetryDelay((long) 32);
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
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
        hikariConfig0.setMaxLifetime((long) 97);
        java.lang.String str18 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setIdleTimeout((long) 3);
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-11311");
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setJdbcUrl("HikariPool-14948");
        hikariConfig14.setMaxLifetime((long) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getCatalog();
        java.lang.String str9 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig8.setConnectionInitSql("");
        boolean boolean11 = hikariConfig8.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig8.getCatalog();
        java.lang.String str13 = hikariConfig8.getConnectionTestQuery();
        hikariConfig8.setLeakDetectionThreshold((long) '4');
        hikariConfig8.setRegisterMbeans(false);
        hikariConfig8.setAutoCommit(false);
        java.util.Properties properties20 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setMaxLifetime(0L);
        hikariConfig0.addDataSourceProperty("HikariPool-1428", (java.lang.Object) 0L);
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
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
        int int14 = hikariConfig1.getAcquireRetries();
        java.lang.String str15 = hikariConfig1.getPoolName();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-90358" + "'", str15, "HikariPool-90358");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setReadOnly(false);
        java.lang.String str6 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-90359" + "'", str6, "HikariPool-90359");
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-84612");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-84612 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setReadOnly(true);
        java.lang.String str11 = hikariConfig1.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig12.getCatalog();
        java.lang.String str17 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setLeakDetectionThreshold((long) '4');
        hikariConfig12.setMaxLifetime(5000L);
        hikariConfig12.setAcquireRetries((int) (short) 1);
        java.util.Properties properties24 = hikariConfig12.getDataSourceProperties();
        java.lang.String str25 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setConnectionTimeout(1800000L);
        hikariConfig12.setInitializationFailFast(false);
        int int30 = hikariConfig12.getAcquireIncrement();
        java.util.Properties properties31 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties31);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-90363" + "'", str11, "HikariPool-90363");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
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
        hikariConfig0.setMinimumPoolSize((int) '#');
        long long19 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setConnectionInitSql("");
        boolean boolean23 = hikariConfig20.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig20.getCatalog();
        java.lang.String str25 = hikariConfig20.getConnectionTestQuery();
        hikariConfig20.setLeakDetectionThreshold((long) '4');
        hikariConfig20.setRegisterMbeans(false);
        hikariConfig20.setAutoCommit(false);
        java.util.Properties properties32 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setMaxLifetime(0L);
        java.lang.String str36 = hikariConfig33.getJdbcUrl();
        boolean boolean37 = hikariConfig33.isJdbc4ConnectionTest();
        java.lang.String str38 = hikariConfig33.getJdbcUrl();
        java.util.Properties properties39 = hikariConfig33.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties39);
        java.lang.String str41 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
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
        long long14 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
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
        hikariConfig7.setCatalog("HikariPool-905");
        int int22 = hikariConfig7.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setDataSourceClassName("HikariPool-13016");
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-68340");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setAcquireRetryDelay((long) (short) 100);
        boolean boolean23 = hikariConfig20.isAutoCommit();
        hikariConfig20.setPoolName("HikariPool-159");
        long long26 = hikariConfig20.getMaxLifetime();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig13.setDataSourceProperties(properties27);
        java.lang.String str30 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setMaximumPoolSize(0);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig33.setConnectionInitSql("");
        javax.sql.DataSource dataSource36 = null;
        hikariConfig33.setDataSource(dataSource36);
        hikariConfig33.setConnectionTestQuery("");
        hikariConfig33.setConnectionInitSql("HikariPool-382");
        int int42 = hikariConfig33.getAcquireIncrement();
        java.util.Properties properties43 = hikariConfig33.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties43);
        java.util.Properties properties45 = hikariConfig13.getDataSourceProperties();
        boolean boolean46 = hikariConfig13.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
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
        int int15 = hikariConfig14.getAcquireRetries();
        java.lang.String str16 = hikariConfig14.getDataSourceClassName();
        boolean boolean17 = hikariConfig14.isAutoCommit();
        hikariConfig14.setAutoCommit(false);
        java.lang.String str20 = hikariConfig14.getPoolName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-90383" + "'", str20, "HikariPool-90383");
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setJdbcUrl("HikariPool-13503");
        hikariConfig1.setDataSourceClassName("HikariPool-88236");
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
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
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
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
        hikariConfig1.setRegisterMbeans(true);
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
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
        hikariConfig1.setPoolName("HikariPool-21415");
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        int int20 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-38856");
        hikariConfig1.setJdbcUrl("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
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
        boolean boolean29 = hikariConfig0.isInitializationFailFast();
        long long30 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig32.setTransactionIsolation("");
        javax.sql.DataSource dataSource35 = hikariConfig32.getDataSource();
        long long36 = hikariConfig32.getConnectionTimeout();
        int int37 = hikariConfig32.getTransactionIsolation();
        boolean boolean38 = hikariConfig32.isInitializationFailFast();
        int int39 = hikariConfig32.getAcquireRetries();
        java.util.Properties properties40 = hikariConfig32.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties40);
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource44 = null;
        hikariConfig0.setDataSource(dataSource44);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 750L + "'", long30 == 750L);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
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
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-90392" + "'", str13, "HikariPool-90392");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        hikariConfig17.setInitializationFailFast(true);
        hikariConfig17.setIdleTimeout((long) (byte) 1);
        hikariConfig17.setMaxLifetime(600000L);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.lang.String str30 = hikariConfig29.getConnectionCustomizerClassName();
        java.lang.String str31 = hikariConfig29.getCatalog();
        hikariConfig29.setAcquireRetryDelay((long) '4');
        hikariConfig29.setConnectionCustomizerClassName("HikariPool-1068");
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        long long37 = hikariConfig36.getMaxLifetime();
        int int38 = hikariConfig36.getAcquireIncrement();
        long long39 = hikariConfig36.getIdleTimeout();
        hikariConfig36.setRegisterMbeans(false);
        java.util.Properties properties42 = hikariConfig36.getDataSourceProperties();
        hikariConfig29.setDataSourceProperties(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        hikariConfig16.setDataSourceProperties(properties42);
        hikariConfig16.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1800000L + "'", long37 == 1800000L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 600000L + "'", long39 == 600000L);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
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
        boolean boolean23 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-3097");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
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
        java.lang.String str16 = hikariConfig13.getJdbcUrl();
        java.lang.String str17 = hikariConfig13.getJdbcUrl();
        java.lang.String str18 = hikariConfig13.getDataSourceClassName();
        java.lang.String str19 = hikariConfig13.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-761");
        int int5 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setTransactionIsolation("HikariPool-4273");
        hikariConfig1.setTransactionIsolation("HikariPool-9799");
        long long13 = hikariConfig1.getAcquireRetryDelay();
        int int14 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        boolean boolean7 = hikariConfig1.isReadOnly();
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
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
        hikariConfig1.setRegisterMbeans(false);
        long long16 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        javax.sql.DataSource dataSource2 = null;
        hikariConfig1.setDataSource(dataSource2);
        hikariConfig1.setCatalog("HikariPool-13620");
        hikariConfig1.setInitializationFailFast(false);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setCatalog("HikariPool-18894");
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        long long17 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isReadOnly();
        java.lang.String str10 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str13 = hikariConfig8.getCatalog();
        hikariConfig8.setDataSourceClassName("HikariPool-158");
        hikariConfig1.addDataSourceProperty("HikariPool-969", (java.lang.Object) hikariConfig8);
        hikariConfig8.setConnectionTimeout(600000L);
        java.lang.String str19 = hikariConfig8.getConnectionInitSql();
        hikariConfig8.setTransactionIsolation("HikariPool-57904");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        hikariConfig1.setUseInstrumentation(false);
        int int11 = hikariConfig1.getAcquireRetries();
        boolean boolean12 = hikariConfig1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL hi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-4548");
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
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
        hikariConfig1.setConnectionInitSql("HikariPool-7714");
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        int int19 = hikariConfig18.getAcquireRetries();
        hikariConfig18.setAcquireRetryDelay((long) 0);
        hikariConfig18.setReadOnly(true);
        hikariConfig18.setInitializationFailFast(true);
        java.lang.String str26 = hikariConfig18.getJdbcUrl();
        java.lang.String str27 = hikariConfig18.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setConnectionInitSql("");
        boolean boolean32 = hikariConfig29.isJdbc4ConnectionTest();
        java.lang.String str33 = hikariConfig29.getCatalog();
        java.lang.String str34 = hikariConfig29.getConnectionTestQuery();
        hikariConfig29.setLeakDetectionThreshold((long) '4');
        hikariConfig29.setRegisterMbeans(false);
        hikariConfig29.setAutoCommit(false);
        java.util.Properties properties41 = hikariConfig29.getDataSourceProperties();
        hikariConfig18.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig29);
        boolean boolean43 = hikariConfig18.isRegisterMbeans();
        hikariConfig18.setJdbcUrl("HikariPool-1177");
        hikariConfig18.setPoolName("HikariPool-2296");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        java.lang.String str50 = hikariConfig49.getConnectionCustomizerClassName();
        int int51 = hikariConfig49.getAcquireIncrement();
        hikariConfig49.setConnectionCustomizerClassName("HikariPool-151");
        long long54 = hikariConfig49.getAcquireRetryDelay();
        hikariConfig49.setMaxLifetime((long) 10);
        java.util.Properties properties57 = hikariConfig49.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        hikariConfig18.setDataSourceProperties(properties57);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties57);
        java.util.Properties properties61 = hikariConfig60.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties61);
        java.lang.String str63 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 750L + "'", long54 == 750L);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties61);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setIdleTimeout(0L);
        long long8 = hikariConfig1.getMaxLifetime();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        int int10 = hikariConfig1.getAcquireIncrement();
        int int11 = hikariConfig1.getAcquireIncrement();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        int int9 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-74205");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-74205' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setPoolName("HikariPool-1561");
        int int11 = hikariConfig0.getMinimumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        int int14 = hikariConfig13.getAcquireRetries();
        java.lang.String str15 = hikariConfig13.getPoolName();
        java.lang.String str16 = hikariConfig13.getCatalog();
        hikariConfig13.setIdleTimeout(600000L);
        hikariConfig13.setConnectionTimeout(0L);
        hikariConfig0.addDataSourceProperty("HikariPool-29653", (java.lang.Object) hikariConfig13);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        boolean boolean24 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-90431" + "'", str15, "HikariPool-90431");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        boolean boolean10 = hikariConfig7.isJdbc4ConnectionTest();
        hikariConfig7.setJdbcUrl("hi!");
        java.util.Properties properties13 = hikariConfig7.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig16.setJdbcUrl("HikariPool-14967");
        boolean boolean19 = hikariConfig16.isIsolateInternalQueries();
        hikariConfig16.setReadOnly(false);
        boolean boolean22 = hikariConfig16.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig9.setLeakDetectionThreshold(600000L);
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
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
        long long24 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties25 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-14506");
        java.util.Properties properties28 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        java.lang.String str5 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize(35);
        java.lang.String str8 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-90446" + "'", str8, "HikariPool-90446");
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-62299", obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
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
        hikariConfig1.setIdleTimeout((long) (short) 1);
        java.lang.String str16 = hikariConfig1.getCatalog();
        long long17 = hikariConfig1.getAcquireRetryDelay();
        int int18 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.setConnectionInitSql("HikariPool-2554");
        boolean boolean64 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str65 = hikariConfig1.getCatalog();
        int int66 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
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
        java.lang.String str36 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-158" + "'", str36, "HikariPool-158");
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.validate();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(true);
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str15 = hikariConfig1.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-90463" + "'", str15, "HikariPool-90463");
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
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
        int int17 = hikariConfig13.getMinimumPoolSize();
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-14448");
        hikariConfig13.setCatalog("HikariPool-40959");
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setJdbcUrl("HikariPool-81572");
        hikariConfig13.setPoolName("HikariPool-69024");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getAcquireIncrement();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(false);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        int int7 = hikariConfig0.getAcquireRetries();
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setTransactionIsolation("");
        boolean boolean23 = hikariConfig20.isInitializationFailFast();
        long long24 = hikariConfig20.getIdleTimeout();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isReadOnly();
        java.lang.String str29 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str32 = hikariConfig27.getCatalog();
        hikariConfig27.setDataSourceClassName("HikariPool-158");
        hikariConfig20.addDataSourceProperty("HikariPool-969", (java.lang.Object) hikariConfig27);
        long long36 = hikariConfig20.getAcquireRetryDelay();
        java.lang.String str37 = hikariConfig20.getConnectionTestQuery();
        long long38 = hikariConfig20.getMaxLifetime();
        boolean boolean39 = hikariConfig20.isReadOnly();
        hikariConfig0.addDataSourceProperty("HikariPool-4991", (java.lang.Object) hikariConfig20);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig20.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 750L + "'", long36 == 750L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1800000L + "'", long38 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
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
        boolean boolean19 = hikariConfig0.isAutoCommit();
        int int20 = hikariConfig0.getAcquireRetries();
        int int21 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireRetryDelay(100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-84195");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-84195 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-2544");
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setInitializationFailFast(false);
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
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
        hikariConfig42.setJdbcUrl("HikariPool-969");
        boolean boolean47 = hikariConfig42.isRegisterMbeans();
        java.lang.String str48 = hikariConfig42.getDataSourceClassName();
        hikariConfig42.setAcquireRetries((int) (byte) 10);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        int int15 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        int int5 = hikariConfig1.getMinimumPoolSize();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties5);
        boolean boolean10 = hikariConfig9.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setDataSourceClassName("HikariPool-1561");
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
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
        hikariConfig0.setCatalog("HikariPool-11666");
        hikariConfig0.setMaxLifetime((long) 32);
        long long25 = hikariConfig0.getConnectionTimeout();
        boolean boolean26 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
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
        hikariConfig1.setConnectionTimeout(1800000L);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig24.setConnectionInitSql("");
        boolean boolean27 = hikariConfig24.isJdbc4ConnectionTest();
        java.lang.String str28 = hikariConfig24.getCatalog();
        java.lang.String str29 = hikariConfig24.getCatalog();
        hikariConfig24.setIsolateInternalQueries(true);
        hikariConfig24.setPoolName("HikariPool-130");
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        hikariConfig1.setPoolName("HikariPool-3083");
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-28007");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-28007' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireIncrement((int) 'a');
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int11 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isReadOnly();
        java.lang.String str10 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str13 = hikariConfig8.getCatalog();
        hikariConfig8.setDataSourceClassName("HikariPool-158");
        hikariConfig1.addDataSourceProperty("HikariPool-969", (java.lang.Object) hikariConfig8);
        boolean boolean17 = hikariConfig8.isJdbc4ConnectionTest();
        hikariConfig8.setDataSourceClassName("HikariPool-26214");
        hikariConfig8.setAcquireRetryDelay((long) (short) 0);
        hikariConfig8.setConnectionInitSql("HikariPool-55754");
        int int24 = hikariConfig8.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-52763");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-52763 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-33935");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-33935 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
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
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        long long14 = hikariConfig0.getMaxLifetime();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        int int16 = hikariConfig0.getAcquireIncrement();
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMinimumPoolSize(0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.lang.String str10 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-90506" + "'", str10, "HikariPool-90506");
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-7018");
        long long17 = hikariConfig14.getLeakDetectionThreshold();
        long long18 = hikariConfig14.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        int int16 = hikariConfig15.getAcquireRetries();
        hikariConfig15.setAcquireRetryDelay((long) 0);
        java.lang.String str19 = hikariConfig15.getConnectionCustomizerClassName();
        hikariConfig15.setConnectionTestQuery("HikariPool-2937");
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setTransactionIsolation("");
        javax.sql.DataSource dataSource26 = null;
        hikariConfig23.setDataSource(dataSource26);
        boolean boolean28 = hikariConfig23.isJdbc4ConnectionTest();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.setTransactionIsolation("");
        javax.sql.DataSource dataSource33 = hikariConfig30.getDataSource();
        long long34 = hikariConfig30.getConnectionTimeout();
        java.lang.String str35 = hikariConfig30.getCatalog();
        hikariConfig30.setInitializationFailFast(false);
        java.util.Properties properties38 = hikariConfig30.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig23.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig15.setDataSourceProperties(properties38);
        hikariConfig1.setDataSourceProperties(properties38);
        int int46 = hikariConfig1.getAcquireIncrement();
        long long47 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-82965");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-82965' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 600000L + "'", long47 == 600000L);
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setCatalog("HikariPool-2979");
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbcUrl("HikariPool-54501");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig11.setDataSource(dataSource14);
        boolean boolean16 = hikariConfig11.isJdbc4ConnectionTest();
        long long17 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setAcquireRetries((int) '#');
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig0.setDataSourceProperties(properties20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay(35L);
        hikariConfig1.setPoolName("HikariPool-3292");
        hikariConfig1.setMaximumPoolSize(3);
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setConnectionTestQuery("");
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        int int13 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setCatalog("");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-4907");
        hikariConfig1.setTransactionIsolation("HikariPool-24222");
        hikariConfig1.setTransactionIsolation("HikariPool-82261");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-151");
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setCatalog("HikariPool-9555");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig12.getCatalog();
        java.lang.String str17 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setLeakDetectionThreshold((long) '4');
        long long20 = hikariConfig12.getAcquireRetryDelay();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig0.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
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
        java.lang.String str14 = hikariConfig13.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig13.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.validate();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries(1);
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        int int12 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-3343");
        hikariConfig1.setConnectionInitSql("HikariPool-4356");
        long long17 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
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
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-44781");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-44781 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-1636");
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime((long) 1);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setTransactionIsolation("");
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        long long28 = hikariConfig24.getConnectionTimeout();
        java.lang.String str29 = hikariConfig24.getCatalog();
        hikariConfig24.setIdleTimeout(750L);
        javax.sql.DataSource dataSource32 = null;
        hikariConfig24.setDataSource(dataSource32);
        java.lang.String str34 = hikariConfig24.getJdbcUrl();
        long long35 = hikariConfig24.getMaxLifetime();
        java.util.Properties properties36 = hikariConfig24.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties36);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
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
        hikariConfig0.setAcquireRetryDelay((long) 1);
        boolean boolean26 = hikariConfig0.isRegisterMbeans();
        boolean boolean27 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetries(100);
        int int11 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setTransactionIsolation("");
        javax.sql.DataSource dataSource16 = hikariConfig13.getDataSource();
        long long17 = hikariConfig13.getConnectionTimeout();
        java.lang.String str18 = hikariConfig13.getCatalog();
        hikariConfig13.setInitializationFailFast(false);
        java.util.Properties properties21 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setJdbcUrl("HikariPool-151");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig24.setConnectionInitSql("");
        boolean boolean27 = hikariConfig24.isJdbc4ConnectionTest();
        java.lang.String str28 = hikariConfig24.getCatalog();
        java.lang.String str29 = hikariConfig24.getConnectionTestQuery();
        java.util.Properties properties30 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.lang.Class<?> wildcardClass35 = properties30.getClass();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-151");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3114");
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
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
        int int20 = hikariConfig12.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        long long2 = hikariConfig0.getIdleTimeout();
        boolean boolean3 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize(60);
        int int6 = hikariConfig0.getMaximumPoolSize();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold(1800000L);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setAcquireRetryDelay((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        hikariConfig1.setRegisterMbeans(true);
        long long5 = hikariConfig1.getIdleTimeout();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-11876");
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-20691");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-11876" + "'", str9, "HikariPool-11876");
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
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
        hikariConfig14.setTransactionIsolation("HikariPool-1745");
        java.lang.String str19 = hikariConfig14.getPoolName();
        java.lang.String str20 = hikariConfig14.getPoolName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-90568" + "'", str19, "HikariPool-90568");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-90568" + "'", str20, "HikariPool-90568");
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
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
        javax.sql.DataSource dataSource32 = hikariConfig0.getDataSource();
        int int33 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAcquireIncrement((int) '#');
        hikariConfig0.setConnectionTimeout(750L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isReadOnly();
        java.lang.String str17 = hikariConfig15.getDataSourceClassName();
        hikariConfig15.setAcquireRetries(100);
        long long20 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setAcquireRetries(10);
        hikariConfig15.setPoolName("hi!");
        hikariConfig15.setMinimumPoolSize((int) (short) 10);
        java.util.Properties properties27 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        int int30 = hikariConfig1.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass31 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setJdbcUrl("HikariPool-130");
        hikariConfig1.setIdleTimeout((long) (short) 1);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries(0);
        long long22 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
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
        long long20 = hikariConfig14.getAcquireRetryDelay();
        boolean boolean21 = hikariConfig14.isReadOnly();
        long long22 = hikariConfig14.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setDataSourceClassName("HikariPool-2639");
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        long long11 = hikariConfig1.getMaxLifetime();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
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
        hikariConfig0.setJdbcUrl("HikariPool-1467");
        int int20 = hikariConfig0.getMaximumPoolSize();
        boolean boolean21 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAcquireRetries((int) '#');
        java.lang.String str24 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
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
        hikariConfig0.setJdbcUrl("HikariPool-1177");
        hikariConfig0.setPoolName("HikariPool-2296");
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.lang.String str32 = hikariConfig31.getConnectionCustomizerClassName();
        int int33 = hikariConfig31.getAcquireIncrement();
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-151");
        long long36 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.setMaxLifetime((long) 10);
        java.util.Properties properties39 = hikariConfig31.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties39);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 750L + "'", long36 == 750L);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
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
        long long26 = hikariConfig0.getLeakDetectionThreshold();
        long long27 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setPoolName("HikariPool-75294");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        long long7 = hikariConfig0.getIdleTimeout();
        boolean boolean8 = hikariConfig0.isAutoCommit();
        boolean boolean9 = hikariConfig0.isReadOnly();
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAcquireRetryDelay((long) 100);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig14.setConnectionInitSql("");
        boolean boolean17 = hikariConfig14.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig14.getCatalog();
        java.lang.String str19 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setLeakDetectionThreshold((long) '4');
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.setAutoCommit(false);
        java.util.Properties properties26 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.setMaxLifetime(0L);
        java.lang.String str30 = hikariConfig27.getJdbcUrl();
        boolean boolean31 = hikariConfig27.isJdbc4ConnectionTest();
        java.util.Properties properties32 = hikariConfig27.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig35.setConnectionInitSql("HikariPool-27528");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
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
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionInitSql("HikariPool-1881");
        hikariConfig0.setTransactionIsolation("HikariPool-4454");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setReadOnly(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean14 = hikariConfig13.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        hikariConfig1.setPoolName("HikariPool-4356");
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setRegisterMbeans(false);
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.getAcquireRetries();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setLeakDetectionThreshold(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
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
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
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
        hikariConfig25.setIsolateInternalQueries(false);
        int int28 = hikariConfig25.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
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
        java.lang.String str15 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-63543");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-63543 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
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
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str18 = hikariConfig17.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
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
        long long12 = hikariConfig1.getMaxLifetime();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isReadOnly();
        java.lang.String str18 = hikariConfig16.getDataSourceClassName();
        hikariConfig16.setUseInstrumentation(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig16.setDataSource(dataSource21);
        boolean boolean23 = hikariConfig16.isRegisterMbeans();
        hikariConfig16.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-24867", (java.lang.Object) hikariConfig16);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.setDriverClassName("HikariPool-32019");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-32019' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
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
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setAcquireRetryDelay((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        int int10 = hikariConfig1.getTransactionIsolation();
        int int11 = hikariConfig1.getTransactionIsolation();
        int int12 = hikariConfig1.getAcquireRetries();
        long long13 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
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
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean56 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
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
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig54.setCatalog("HikariPool-1165");
        hikariConfig54.setMaxLifetime((long) ' ');
        javax.sql.DataSource dataSource59 = null;
        hikariConfig54.setDataSource(dataSource59);
        hikariConfig54.setAutoCommit(false);
        hikariConfig54.setIsolateInternalQueries(false);
        hikariConfig54.setConnectionTestQuery("HikariPool-22715");
        boolean boolean67 = hikariConfig54.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
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
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setTransactionIsolation("HikariPool-1745");
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setTransactionIsolation("");
        hikariConfig22.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig22.getConnectionInitSql();
        int int28 = hikariConfig22.getMaximumPoolSize();
        long long29 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.setIsolateInternalQueries(true);
        hikariConfig22.setPoolName("HikariPool-159");
        hikariConfig22.setMaximumPoolSize(3);
        hikariConfig22.setMinimumPoolSize(0);
        hikariConfig22.setDataSourceClassName("HikariPool-1636");
        int int42 = hikariConfig22.getAcquireRetries();
        hikariConfig22.setIsolateInternalQueries(false);
        hikariConfig1.addDataSourceProperty("HikariPool-25805", (java.lang.Object) false);
        java.util.Properties properties46 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 750L + "'", long29 == 750L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        boolean boolean10 = hikariConfig7.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig7.getCatalog();
        java.lang.String str12 = hikariConfig7.getConnectionTestQuery();
        hikariConfig7.setLeakDetectionThreshold((long) '4');
        hikariConfig7.setMaxLifetime(5000L);
        hikariConfig7.setAcquireRetries((int) (short) 1);
        java.util.Properties properties19 = hikariConfig7.getDataSourceProperties();
        boolean boolean20 = hikariConfig7.isJdbc4ConnectionTest();
        hikariConfig7.setJdbc4ConnectionTest(false);
        long long23 = hikariConfig7.getAcquireRetryDelay();
        long long24 = hikariConfig7.getConnectionTimeout();
        long long25 = hikariConfig7.getMaxLifetime();
        boolean boolean26 = hikariConfig7.isRegisterMbeans();
        hikariConfig7.setAcquireRetryDelay((long) ' ');
        java.util.Properties properties29 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties29);
        hikariConfig1.setTransactionIsolation("HikariPool-1958");
        hikariConfig1.setConnectionInitSql("HikariPool-20980");
        java.lang.String str35 = hikariConfig1.getConnectionInitSql();
        java.lang.String str36 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 750L + "'", long23 == 750L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-20980" + "'", str35, "HikariPool-20980");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
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
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        long long24 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (short) -1);
        hikariConfig0.setConnectionInitSql("HikariPool-919");
        int int12 = hikariConfig0.getMaximumPoolSize();
        int int13 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
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
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        java.lang.String str17 = hikariConfig1.getCatalog();
        hikariConfig1.setCatalog("HikariPool-55670");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
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
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setInitializationFailFast(true);
        hikariConfig23.setMaximumPoolSize(0);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setConnectionInitSql("");
        boolean boolean32 = hikariConfig29.isJdbc4ConnectionTest();
        hikariConfig29.setJdbcUrl("hi!");
        boolean boolean35 = hikariConfig29.isJdbc4ConnectionTest();
        long long36 = hikariConfig29.getLeakDetectionThreshold();
        hikariConfig29.setAcquireIncrement(100);
        boolean boolean39 = hikariConfig29.isReadOnly();
        hikariConfig29.setAcquireRetryDelay((long) ' ');
        java.lang.String str42 = hikariConfig29.getJdbcUrl();
        hikariConfig29.setIdleTimeout((-1L));
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig45.setConnectionInitSql("");
        boolean boolean48 = hikariConfig45.isJdbc4ConnectionTest();
        java.lang.String str49 = hikariConfig45.getCatalog();
        hikariConfig45.setReadOnly(false);
        java.lang.String str52 = hikariConfig45.getConnectionInitSql();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig54.setAcquireRetryDelay((long) (short) 100);
        hikariConfig54.setMinimumPoolSize((int) (byte) 100);
        hikariConfig54.setJdbcUrl("hi!");
        java.lang.String str61 = hikariConfig54.getJdbcUrl();
        java.lang.String str62 = hikariConfig54.getDataSourceClassName();
        boolean boolean63 = hikariConfig54.isRegisterMbeans();
        hikariConfig54.setPoolName("HikariPool-998");
        java.util.Properties properties66 = hikariConfig54.getDataSourceProperties();
        hikariConfig45.setDataSourceProperties(properties66);
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties66);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig29.setDataSourceProperties(properties66);
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties66);
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig23.addDataSourceProperty("HikariPool-48296", (java.lang.Object) properties66);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(properties66);
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
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
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setCatalog("HikariPool-7481");
        java.lang.String str17 = hikariConfig1.getCatalog();
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-7481" + "'", str17, "HikariPool-7481");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setPoolName("HikariPool-71905");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setPoolName("HikariPool-923");
        hikariConfig1.setInitializationFailFast(true);
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isReadOnly();
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setDataSourceClassName("HikariPool-8059");
        hikariConfig1.setIdleTimeout(600000L);
        hikariConfig1.setCatalog("HikariPool-85247");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
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
        hikariConfig37.setDataSourceClassName("HikariPool-805");
        hikariConfig37.setJdbc4ConnectionTest(false);
        int int42 = hikariConfig37.getMaximumPoolSize();
        java.lang.String str43 = hikariConfig37.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-90718" + "'", str43, "HikariPool-90718");
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        int int11 = hikariConfig1.getAcquireIncrement();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.validate();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long15 = hikariConfig14.getIdleTimeout();
        boolean boolean16 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-29697");
        javax.sql.DataSource dataSource19 = hikariConfig14.getDataSource();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str10 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionInitSql("HikariPool-6478");
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        int int16 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-90724" + "'", str10, "HikariPool-90724");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
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
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-10327");
        java.lang.String str16 = hikariConfig1.getCatalog();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setConnectionInitSql("");
        hikariConfig19.setDataSourceClassName("");
        hikariConfig19.setConnectionCustomizerClassName("");
        hikariConfig19.setPoolName("hi!");
        javax.sql.DataSource dataSource28 = null;
        hikariConfig19.setDataSource(dataSource28);
        int int30 = hikariConfig19.getMaximumPoolSize();
        hikariConfig19.setConnectionInitSql("HikariPool-3343");
        hikariConfig1.addDataSourceProperty("HikariPool-18792", (java.lang.Object) "HikariPool-3343");
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        long long21 = hikariConfig17.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-2024", (java.lang.Object) hikariConfig17);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setReadOnly(true);
        long long27 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str28 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        java.lang.String str5 = hikariConfig1.getPoolName();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getConnectionTimeout();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        long long9 = hikariConfig1.getConnectionTimeout();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-90729" + "'", str5, "HikariPool-90729");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
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
        long long20 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-7822");
        hikariConfig0.setConnectionTestQuery("HikariPool-49662");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
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
        hikariConfig14.setAutoCommit(true);
        hikariConfig14.setIdleTimeout((long) (byte) 1);
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-8019");
        java.lang.String str21 = hikariConfig14.getCatalog();
        hikariConfig14.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-1636");
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        hikariConfig1.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.setDataSource(dataSource24);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20728");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-3808");
        hikariConfig1.setConnectionTestQuery("HikariPool-919");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionInitSql("HikariPool-56819");
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20729");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-34504");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-34504 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20730");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        long long8 = hikariConfig0.getIdleTimeout();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAcquireRetryDelay(1800000L);
        hikariConfig0.setJdbcUrl("HikariPool-32431");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test20731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20731");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout(5000L);
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setTransactionIsolation("");
        javax.sql.DataSource dataSource16 = hikariConfig13.getDataSource();
        long long17 = hikariConfig13.getConnectionTimeout();
        java.lang.String str18 = hikariConfig13.getCatalog();
        long long19 = hikariConfig13.getConnectionTimeout();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig13.setDataSource(dataSource20);
        hikariConfig13.setReadOnly(true);
        hikariConfig13.setUseInstrumentation(false);
        java.lang.String str26 = hikariConfig13.getPoolName();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig28.setTransactionIsolation("");
        javax.sql.DataSource dataSource31 = null;
        hikariConfig28.setDataSource(dataSource31);
        boolean boolean33 = hikariConfig28.isJdbc4ConnectionTest();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setTransactionIsolation("");
        javax.sql.DataSource dataSource38 = hikariConfig35.getDataSource();
        long long39 = hikariConfig35.getConnectionTimeout();
        java.lang.String str40 = hikariConfig35.getCatalog();
        hikariConfig35.setInitializationFailFast(false);
        java.util.Properties properties43 = hikariConfig35.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig28.setDataSourceProperties(properties43);
        hikariConfig13.setDataSourceProperties(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        int int52 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-90745" + "'", str26, "HikariPool-90745");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5000L + "'", long39 == 5000L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 60 + "'", int52 == 60);
    }

    @Test
    public void test20732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20732");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionInitSql("HikariPool-993");
        long long9 = hikariConfig0.getConnectionTimeout();
        int int10 = hikariConfig0.getAcquireIncrement();
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("HikariPool-23839");
        hikariConfig0.setIdleTimeout(600000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20733");
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
        hikariConfig1.setMinimumPoolSize(32);
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20734");
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
        hikariConfig1.setMaximumPoolSize(60);
        hikariConfig1.setTransactionIsolation("HikariPool-21511");
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-28203");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime((long) 10);
        long long9 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test20736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setJdbcUrl("HikariPool-1676");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setDataSourceClassName("HikariPool-37690");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test20737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20737");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        int int10 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test20738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20738");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-1786");
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        boolean boolean22 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20739");
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
        boolean boolean31 = hikariConfig30.isAutoCommit();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test20740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        int int5 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str6 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test20741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20741");
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
        hikariConfig45.setConnectionInitSql("HikariPool-41922");
        hikariConfig45.setJdbcUrl("HikariPool-26178");
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
    }

    @Test
    public void test20742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20742");
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
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1165");
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        boolean boolean27 = hikariConfig1.isReadOnly();
        long long28 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
    }

    @Test
    public void test20743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20743");
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
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setCatalog("HikariPool-75973");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test20744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20744");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIdleTimeout(1800000L);
        boolean boolean5 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAutoCommit(false);
        java.lang.Class<?> wildcardClass8 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20745");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime(5000L);
        hikariConfig1.setConnectionInitSql("HikariPool-159");
        hikariConfig1.setTransactionIsolation("HikariPool-15764");
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbcUrl("HikariPool-71597");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test20746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20746");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-130");
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout(100L);
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTestQuery("HikariPool-43588");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test20747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20747");
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
        int int41 = hikariConfig40.getAcquireIncrement();
        java.util.Properties properties42 = hikariConfig40.getDataSourceProperties();
        long long43 = hikariConfig40.getMaxLifetime();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
    }

    @Test
    public void test20748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20748");
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
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20749");
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
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-19078");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-19078' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test20750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20750");
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
        hikariConfig0.setTransactionIsolation("HikariPool-1636");
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig0.setDataSource(dataSource20);
        long long22 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test20751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20751");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        hikariConfig0.setDataSourceClassName("HikariPool-87307");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test20752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20752");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test20753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20753");
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
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionInitSql("HikariPool-823");
        hikariConfig0.setConnectionTestQuery("HikariPool-159");
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str34 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-159" + "'", str34, "HikariPool-159");
    }

    @Test
    public void test20754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20754");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test20755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20755");
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
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig31.setConnectionTimeout(100L);
        hikariConfig31.setMaxLifetime((long) (byte) -1);
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
    public void test20756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20756");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        boolean boolean9 = hikariConfig1.isReadOnly();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setPoolName("HikariPool-57094");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20757");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setReadOnly(false);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMaxLifetime(52L);
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20758");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig12.getCatalog();
        java.lang.String str17 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setLeakDetectionThreshold((long) '4');
        long long20 = hikariConfig12.getAcquireRetryDelay();
        long long21 = hikariConfig12.getAcquireRetryDelay();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setTransactionIsolation("");
        hikariConfig23.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig23.getConnectionInitSql();
        hikariConfig23.setJdbcUrl("");
        hikariConfig23.setReadOnly(false);
        int int33 = hikariConfig23.getMinimumPoolSize();
        hikariConfig23.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str37 = hikariConfig36.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig38.setConnectionInitSql("");
        boolean boolean41 = hikariConfig38.isJdbc4ConnectionTest();
        java.lang.String str42 = hikariConfig38.getCatalog();
        java.lang.String str43 = hikariConfig38.getConnectionTestQuery();
        hikariConfig38.setLeakDetectionThreshold((long) '4');
        long long46 = hikariConfig38.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig47.setConnectionInitSql("");
        boolean boolean50 = hikariConfig47.isJdbc4ConnectionTest();
        java.lang.String str51 = hikariConfig47.getCatalog();
        java.lang.String str52 = hikariConfig47.getConnectionTestQuery();
        hikariConfig47.setLeakDetectionThreshold((long) '4');
        hikariConfig47.setRegisterMbeans(false);
        hikariConfig47.setAutoCommit(false);
        java.util.Properties properties59 = hikariConfig47.getDataSourceProperties();
        hikariConfig38.setDataSourceProperties(properties59);
        hikariConfig36.setDataSourceProperties(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig23.setDataSourceProperties(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig12.setDataSourceProperties(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig1.setDataSourceProperties(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 750L + "'", long46 == 750L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test20759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20759");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties8 = hikariConfig7.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig10.setMinimumPoolSize(3);
        javax.sql.DataSource dataSource13 = hikariConfig10.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test20760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20760");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-7022");
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setJdbcUrl("HikariPool-60911");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test20761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20761");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        java.lang.String str12 = hikariConfig0.getCatalog();
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20762");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-3083");
        boolean boolean6 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20763");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-2070");
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(true);
        boolean boolean22 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionInitSql("HikariPool-70611");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test20764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20764");
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
        java.lang.String str24 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-24911");
        long long27 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str30 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-90826" + "'", str24, "HikariPool-90826");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test20765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20765");
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
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        hikariConfig15.setConnectionTimeout((long) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setConnectionInitSql("");
        javax.sql.DataSource dataSource23 = hikariConfig20.getDataSource();
        java.lang.String str24 = hikariConfig20.getDataSourceClassName();
        long long25 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("HikariPool-5245");
        int int28 = hikariConfig20.getAcquireRetries();
        hikariConfig15.addDataSourceProperty("HikariPool-14094", (java.lang.Object) hikariConfig20);
        hikariConfig15.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test20766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20766");
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
        hikariConfig23.setAcquireRetries(32);
        java.lang.String str26 = hikariConfig23.getDataSourceClassName();
        java.util.Properties properties27 = hikariConfig23.getDataSourceProperties();
        java.lang.String str28 = hikariConfig23.getJdbcUrl();
        java.lang.String str29 = hikariConfig23.getConnectionTestQuery();
        java.util.Properties properties30 = hikariConfig23.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test20767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20767");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        int int6 = hikariConfig0.getAcquireRetries();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str9 = hikariConfig0.getCatalog();
        long long10 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("HikariPool-15693");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
    }

    @Test
    public void test20768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20768");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold(60L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-158" + "'", str10, "HikariPool-158");
    }

    @Test
    public void test20769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20769");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        long long14 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(true);
        boolean boolean17 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20770");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-1745");
        java.lang.String str9 = hikariConfig0.getPoolName();
        int int10 = hikariConfig0.getAcquireRetries();
        int int11 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setTransactionIsolation("HikariPool-28081");
        hikariConfig0.setCatalog("HikariPool-15504");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-90842" + "'", str9, "HikariPool-90842");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test20771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20771");
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
        boolean boolean12 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20772");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-38811");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-38811 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20773");
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
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setInitializationFailFast(true);
        long long15 = hikariConfig1.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        boolean boolean22 = hikariConfig17.isIsolateInternalQueries();
        hikariConfig17.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig17.setIdleTimeout((long) 3);
        java.lang.String str27 = hikariConfig17.getDataSourceClassName();
        java.util.Properties properties28 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig1.addDataSourceProperty("HikariPool-21945", (java.lang.Object) hikariConfig29);
        hikariConfig29.setRegisterMbeans(false);
        hikariConfig29.setMaxLifetime((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test20774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20774");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        long long10 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        boolean boolean12 = hikariConfig0.isReadOnly();
        int int13 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-37514");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test20775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20775");
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
        javax.sql.DataSource dataSource26 = null;
        hikariConfig7.setDataSource(dataSource26);
        long long28 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig7.setAcquireRetries(0);
        hikariConfig7.setPoolName("HikariPool-22570");
        long long33 = hikariConfig7.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test20776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20776");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        long long4 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = hikariConfig10.getDataSource();
        long long14 = hikariConfig10.getConnectionTimeout();
        java.lang.String str15 = hikariConfig10.getCatalog();
        hikariConfig10.setInitializationFailFast(false);
        boolean boolean18 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(false);
        long long21 = hikariConfig10.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setConnectionInitSql("");
        boolean boolean25 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str26 = hikariConfig22.getCatalog();
        java.lang.String str27 = hikariConfig22.getConnectionTestQuery();
        hikariConfig22.setLeakDetectionThreshold((long) '4');
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.setAutoCommit(false);
        java.util.Properties properties34 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setMaxLifetime(0L);
        java.lang.String str38 = hikariConfig35.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str40 = hikariConfig39.getConnectionInitSql();
        hikariConfig39.setMaxLifetime((long) (short) 10);
        java.util.Properties properties43 = hikariConfig39.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig35.setDataSourceProperties(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig10.setDataSourceProperties(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        java.lang.String str50 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test20777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20778");
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
        java.util.Properties properties16 = hikariConfig13.getDataSourceProperties();
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20779");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        boolean boolean10 = hikariConfig0.isReadOnly();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setCatalog("HikariPool-823");
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setTransactionIsolation("HikariPool-5403");
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        int int21 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test20780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20780");
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
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties55);
        long long66 = hikariConfig65.getConnectionTimeout();
        java.lang.String str67 = hikariConfig65.getConnectionInitSql();
        boolean boolean68 = hikariConfig65.isIsolateInternalQueries();
        java.util.Properties properties69 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties69);
        hikariConfig70.setTransactionIsolation("");
        javax.sql.DataSource dataSource73 = hikariConfig70.getDataSource();
        long long74 = hikariConfig70.getConnectionTimeout();
        java.lang.String str75 = hikariConfig70.getCatalog();
        hikariConfig70.setInitializationFailFast(false);
        java.util.Properties properties78 = hikariConfig70.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties78);
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties78);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties78);
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties78);
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties78);
        com.zaxxer.hikari.HikariConfig hikariConfig84 = new com.zaxxer.hikari.HikariConfig(properties78);
        hikariConfig65.setDataSourceProperties(properties78);
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
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 5000L + "'", long66 == 5000L);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(dataSource73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 5000L + "'", long74 == 5000L);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(properties78);
    }

    @Test
    public void test20781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20781");
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
        hikariConfig1.setPoolName("HikariPool-11038");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test20782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20782");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        long long5 = hikariConfig0.getIdleTimeout();
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-7993");
        hikariConfig0.setMaxLifetime(35L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test20783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20783");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test20784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20784");
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
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionTestQuery("HikariPool-18254");
        hikariConfig0.setAutoCommit(true);
        long long20 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
    }

    @Test
    public void test20785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20785");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.setIdleTimeout((long) 0);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20786");
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
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setConnectionInitSql("");
        boolean boolean18 = hikariConfig15.isJdbc4ConnectionTest();
        java.lang.String str19 = hikariConfig15.getCatalog();
        java.lang.String str20 = hikariConfig15.getConnectionTestQuery();
        boolean boolean21 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setConnectionTestQuery("HikariPool-442");
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties27 = hikariConfig15.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test20787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20787");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetryDelay(5000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test20788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20788");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        int int8 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = hikariConfig10.getDataSource();
        long long14 = hikariConfig10.getConnectionTimeout();
        java.lang.String str15 = hikariConfig10.getCatalog();
        hikariConfig10.setInitializationFailFast(false);
        java.util.Properties properties18 = hikariConfig10.getDataSourceProperties();
        hikariConfig10.setJdbcUrl("HikariPool-151");
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        boolean boolean24 = hikariConfig21.isJdbc4ConnectionTest();
        java.lang.String str25 = hikariConfig21.getCatalog();
        java.lang.String str26 = hikariConfig21.getConnectionTestQuery();
        java.util.Properties properties27 = hikariConfig21.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig31.setConnectionInitSql("");
        boolean boolean34 = hikariConfig31.isJdbc4ConnectionTest();
        java.lang.String str35 = hikariConfig31.getCatalog();
        java.lang.String str36 = hikariConfig31.getConnectionTestQuery();
        hikariConfig31.setLeakDetectionThreshold((long) '4');
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.setAutoCommit(false);
        java.util.Properties properties43 = hikariConfig31.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig44.setMaxLifetime(0L);
        java.lang.String str47 = hikariConfig44.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str49 = hikariConfig48.getConnectionInitSql();
        hikariConfig48.setMaxLifetime((long) (short) 10);
        java.util.Properties properties52 = hikariConfig48.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig44.setDataSourceProperties(properties52);
        hikariConfig30.setDataSourceProperties(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean58 = hikariConfig57.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test20789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20789");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setCatalog("HikariPool-27276");
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test20790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20790");
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
        hikariConfig0.setTransactionIsolation("HikariPool-130");
        boolean boolean23 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20791");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.getMinimumPoolSize();
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-3431");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        long long15 = hikariConfig11.getConnectionTimeout();
        java.lang.String str16 = hikariConfig11.getCatalog();
        hikariConfig11.setInitializationFailFast(false);
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        hikariConfig11.setUseInstrumentation(true);
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.util.Properties properties24 = hikariConfig23.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig26.setJdbc4ConnectionTest(false);
        hikariConfig26.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test20792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20792");
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
        hikariConfig1.setAutoCommit(true);
        int int18 = hikariConfig1.getAcquireIncrement();
        long long19 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-24172");
        hikariConfig1.setConnectionTestQuery("HikariPool-26178");
        boolean boolean24 = hikariConfig1.isInitializationFailFast();
        long long25 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str26 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-26178" + "'", str26, "HikariPool-26178");
    }

    @Test
    public void test20793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20793");
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
        hikariConfig22.setMinimumPoolSize((int) '4');
        hikariConfig22.setAcquireRetries((int) (short) 10);
        java.lang.String str27 = hikariConfig22.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20794");
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
        java.util.Properties properties36 = hikariConfig0.getDataSourceProperties();
        long long37 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-46307");
        boolean boolean40 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 750L + "'", long37 == 750L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test20795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20795");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-18141");
        hikariConfig0.setDataSourceClassName("HikariPool-21614");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        hikariConfig0.setTransactionIsolation("HikariPool-60098");
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-90937" + "'", str7, "HikariPool-90937");
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test20796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20796");
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
        hikariConfig13.setMaxLifetime(5000L);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setAcquireRetryDelay((long) (short) 100);
        hikariConfig18.setMinimumPoolSize((int) (byte) 100);
        hikariConfig18.setJdbcUrl("hi!");
        java.util.Properties properties25 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setIdleTimeout((long) '#');
        java.util.Properties properties28 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig13.setDataSourceProperties(properties28);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test20797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20797");
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
        boolean boolean15 = hikariConfig0.isAutoCommit();
        boolean boolean16 = hikariConfig0.isAutoCommit();
        hikariConfig0.setPoolName("HikariPool-66662");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20798");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTestQuery("HikariPool-1339");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-1339" + "'", str11, "HikariPool-1339");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test20799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20799");
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
        javax.sql.DataSource dataSource20 = hikariConfig13.getDataSource();
        java.lang.String str21 = hikariConfig13.getConnectionTestQuery();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig13.setDataSource(dataSource22);
        int int24 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setUseInstrumentation(false);
        boolean boolean27 = hikariConfig13.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test20800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getIdleTimeout();
        long long7 = hikariConfig1.getMaxLifetime();
        int int8 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test20801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20801");
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
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig25.setMinimumPoolSize((int) (byte) 1);
        hikariConfig25.setConnectionInitSql("HikariPool-32363");
        hikariConfig25.setInitializationFailFast(false);
        hikariConfig25.setMaximumPoolSize((int) (short) 10);
        hikariConfig25.setUseInstrumentation(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test20802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20802");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        int int8 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setIdleTimeout(100L);
        hikariConfig6.setLeakDetectionThreshold(0L);
        hikariConfig6.setInitializationFailFast(false);
        hikariConfig6.setLeakDetectionThreshold((long) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test20803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20803");
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
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        long long18 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-130" + "'", str13, "HikariPool-130");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test20804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20804");
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
        hikariConfig25.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test20805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20805");
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
        java.lang.String str48 = hikariConfig0.getCatalog();
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
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test20806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20806");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setAcquireRetries(35);
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        long long7 = hikariConfig1.getAcquireRetryDelay();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime((long) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test20807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20807");
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
        boolean boolean15 = hikariConfig1.isAutoCommit();
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionTestQuery("HikariPool-5753");
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean22 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20808");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        boolean boolean9 = hikariConfig1.isReadOnly();
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime((long) ' ');
        int int14 = hikariConfig1.getMaximumPoolSize();
        boolean boolean15 = hikariConfig1.isReadOnly();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20809");
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
        boolean boolean19 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("HikariPool-21323");
        int int22 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test20810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20810");
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
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        int int14 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-90982" + "'", str12, "HikariPool-90982");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test20811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20811");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setDataSourceClassName("HikariPool-11389");
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-35843");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20812");
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
        hikariConfig0.setConnectionTimeout(1800000L);
        hikariConfig0.setInitializationFailFast(false);
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20813");
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
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean17 = hikariConfig1.isAutoCommit();
        hikariConfig1.setCatalog("HikariPool-14200");
        hikariConfig1.setIdleTimeout(3L);
        hikariConfig1.setAutoCommit(true);
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test20814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20814");
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
        hikariConfig0.setAcquireRetryDelay(0L);
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = dataSource15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test20815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20815");
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
        int int17 = hikariConfig1.getMaximumPoolSize();
        boolean boolean18 = hikariConfig1.isAutoCommit();
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test20816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setAcquireIncrement(1);
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setJdbcUrl("HikariPool-19230");
        hikariConfig1.setAcquireIncrement(100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test20817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        boolean boolean17 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setMaxLifetime(0L);
        int int20 = hikariConfig15.getMinimumPoolSize();
        boolean boolean21 = hikariConfig15.isIsolateInternalQueries();
        hikariConfig15.setInitializationFailFast(true);
        long long24 = hikariConfig15.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-80734", (java.lang.Object) hikariConfig15);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
    }

    @Test
    public void test20818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20818");
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
        hikariConfig42.setIdleTimeout((long) (short) 100);
        hikariConfig42.setRegisterMbeans(false);
        hikariConfig42.setConnectionTestQuery("HikariPool-16244");
        java.lang.String str51 = hikariConfig42.getPoolName();
        hikariConfig42.setPoolName("HikariPool-48856");
        hikariConfig42.setCatalog("HikariPool-55575");
        long long56 = hikariConfig42.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "HikariPool-90999" + "'", str51, "HikariPool-90999");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L + "'", long56 == 100L);
    }

    @Test
    public void test20819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20819");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setDataSourceClassName("HikariPool-13674");
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        long long13 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test20820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20820");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbcUrl("HikariPool-8395");
        long long13 = hikariConfig1.getMaxLifetime();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test20821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20821");
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
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setMaxLifetime((long) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20822");
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
        boolean boolean36 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5096");
        int int39 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource25);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-91008" + "'", str35, "HikariPool-91008");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test20823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20823");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long16 = hikariConfig15.getLeakDetectionThreshold();
        hikariConfig15.setAcquireRetryDelay(1L);
        hikariConfig15.setUseInstrumentation(true);
        boolean boolean21 = hikariConfig15.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setTransactionIsolation("");
        javax.sql.DataSource dataSource11 = hikariConfig8.getDataSource();
        long long12 = hikariConfig8.getConnectionTimeout();
        int int13 = hikariConfig8.getTransactionIsolation();
        boolean boolean14 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setAutoCommit(true);
        hikariConfig8.setConnectionTimeout(600000L);
        long long19 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-13535", (java.lang.Object) long19);
        hikariConfig1.setTransactionIsolation("HikariPool-2503");
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test20825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20825");
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
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMinimumPoolSize(97);
        hikariConfig1.setJdbcUrl("HikariPool-8157");
        int int20 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test20826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setIdleTimeout((long) 3);
        hikariConfig1.setLeakDetectionThreshold(0L);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-16172");
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20827");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-761");
        boolean boolean5 = hikariConfig1.isInitializationFailFast();
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20828");
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
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig38.setConnectionInitSql("");
        boolean boolean41 = hikariConfig38.isJdbc4ConnectionTest();
        java.lang.String str42 = hikariConfig38.getCatalog();
        java.lang.String str43 = hikariConfig38.getConnectionTestQuery();
        hikariConfig38.setLeakDetectionThreshold((long) '4');
        hikariConfig38.setRegisterMbeans(false);
        hikariConfig38.setAutoCommit(false);
        java.util.Properties properties50 = hikariConfig38.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        hikariConfig51.setMaxLifetime(0L);
        java.lang.String str54 = hikariConfig51.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str56 = hikariConfig55.getConnectionInitSql();
        hikariConfig55.setMaxLifetime((long) (short) 10);
        java.util.Properties properties59 = hikariConfig55.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig51.setDataSourceProperties(properties59);
        hikariConfig1.setDataSourceProperties(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties59);
        boolean boolean66 = hikariConfig65.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test20829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20829");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setConnectionInitSql("HikariPool-51292");
        hikariConfig1.setMaxLifetime((long) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test20830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20830");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMaximumPoolSize();
        int int6 = hikariConfig0.getMaximumPoolSize();
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setLeakDetectionThreshold(3L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20831");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        int int6 = hikariConfig0.getAcquireRetries();
        int int7 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20832");
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
        boolean boolean15 = hikariConfig13.isReadOnly();
        long long16 = hikariConfig13.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig13.isRegisterMbeans();
        int int18 = hikariConfig13.getMaximumPoolSize();
        long long19 = hikariConfig13.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
    }

    @Test
    public void test20833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20833");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.util.Properties properties16 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-158", (java.lang.Object) hikariConfig11);
        hikariConfig11.setIsolateInternalQueries(false);
        java.lang.String str20 = hikariConfig11.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20834");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        hikariConfig9.setLeakDetectionThreshold(600000L);
        boolean boolean15 = hikariConfig9.isAutoCommit();
        hikariConfig9.setAcquireRetries(10);
        hikariConfig0.addDataSourceProperty("HikariPool-3800", (java.lang.Object) hikariConfig9);
        boolean boolean19 = hikariConfig9.isIsolateInternalQueries();
        hikariConfig9.setConnectionInitSql("HikariPool-36250");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20835");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-158");
        hikariConfig1.setPoolName("HikariPool-19624");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test20836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20836");
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
        hikariConfig1.setDataSourceClassName("HikariPool-30561");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13753");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20837");
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
        hikariConfig7.setJdbc4ConnectionTest(true);
        boolean boolean25 = hikariConfig7.isAutoCommit();
        hikariConfig7.setTransactionIsolation("HikariPool-23839");
        java.lang.String str28 = hikariConfig7.getPoolName();
        java.lang.String str29 = hikariConfig7.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-91046" + "'", str28, "HikariPool-91046");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test20838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20838");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20839");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig7.setDataSource(dataSource12);
        long long14 = hikariConfig7.getMaxLifetime();
        boolean boolean15 = hikariConfig7.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig7.getConnectionTestQuery();
        hikariConfig1.addDataSourceProperty("HikariPool-4373", (java.lang.Object) hikariConfig7);
        int int18 = hikariConfig7.getAcquireRetries();
        boolean boolean19 = hikariConfig7.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        int int7 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        long long13 = hikariConfig1.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-7719");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-7719' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test20841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20841");
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
        long long32 = hikariConfig1.getLeakDetectionThreshold();
        long long33 = hikariConfig1.getMaxLifetime();
        int int34 = hikariConfig1.getMaximumPoolSize();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1800000L + "'", long33 == 1800000L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
    }

    @Test
    public void test20842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setAcquireRetryDelay(100L);
        long long6 = hikariConfig1.getConnectionTimeout();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20843");
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
        long long25 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIdleTimeout((long) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
    }

    @Test
    public void test20844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20844");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-51548");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-51548 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20845");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-70531");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-70531 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20846");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-30987");
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test20847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20847");
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
        hikariConfig1.setPoolName("HikariPool-23989");
    }

    @Test
    public void test20848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20848");
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
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-66662");
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20849");
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
        hikariConfig0.setAcquireRetryDelay((long) 'a');
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAutoCommit(false);
        int int24 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test20850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20850");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        int int4 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-969");
        hikariConfig0.setMinimumPoolSize((int) '#');
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(35);
        long long13 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test20851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20851");
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
        int int14 = hikariConfig1.getMaximumPoolSize();
        long long15 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test20852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20852");
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
        hikariConfig0.setJdbcUrl("HikariPool-8679");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test20853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20853");
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
        hikariConfig1.setConnectionInitSql("HikariPool-31324");
        int int20 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test20854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20854");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setJdbcUrl("HikariPool-1676");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMinimumPoolSize(0);
        long long17 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test20855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20855");
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
        hikariConfig1.setJdbcUrl("HikariPool-1877");
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20856");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-1786");
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.util.Properties properties20 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test20857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20857");
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
        hikariConfig14.setAcquireIncrement((int) (short) 1);
        boolean boolean19 = hikariConfig14.isIsolateInternalQueries();
        hikariConfig14.setConnectionInitSql("");
        javax.sql.DataSource dataSource22 = null;
        hikariConfig14.setDataSource(dataSource22);
        long long24 = hikariConfig14.getConnectionTimeout();
        hikariConfig14.setPoolName("HikariPool-90718");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
    }

    @Test
    public void test20858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20858");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setReadOnly(true);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        long long10 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
    }

    @Test
    public void test20859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20859");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-4919");
        int int11 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setTransactionIsolation("");
        hikariConfig13.setCatalog("");
        hikariConfig13.setMinimumPoolSize(100);
        java.lang.String str20 = hikariConfig13.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        boolean boolean24 = hikariConfig21.isJdbc4ConnectionTest();
        java.lang.String str25 = hikariConfig21.getCatalog();
        java.lang.String str26 = hikariConfig21.getConnectionTestQuery();
        hikariConfig21.setLeakDetectionThreshold((long) '4');
        hikariConfig21.setMaxLifetime(5000L);
        hikariConfig21.setAcquireRetries((int) (short) 1);
        java.util.Properties properties33 = hikariConfig21.getDataSourceProperties();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setTransactionIsolation("");
        javax.sql.DataSource dataSource39 = hikariConfig36.getDataSource();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig42.setConnectionInitSql("");
        hikariConfig42.setJdbcUrl("");
        hikariConfig42.setConnectionTestQuery("hi!");
        hikariConfig36.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig42);
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        hikariConfig51.setConnectionInitSql("");
        hikariConfig51.setJdbcUrl("");
        hikariConfig51.setConnectionTestQuery("hi!");
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.setTransactionIsolation("");
        javax.sql.DataSource dataSource62 = hikariConfig59.getDataSource();
        long long63 = hikariConfig59.getConnectionTimeout();
        java.lang.String str64 = hikariConfig59.getCatalog();
        hikariConfig59.setInitializationFailFast(false);
        java.util.Properties properties67 = hikariConfig59.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig51.setDataSourceProperties(properties67);
        hikariConfig36.setDataSourceProperties(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig21.addDataSourceProperty("HikariPool-102", (java.lang.Object) properties67);
        hikariConfig13.setDataSourceProperties(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig1.setDataSourceProperties(properties67);
        boolean boolean79 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertNull(dataSource62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 5000L + "'", long63 == 5000L);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test20860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20860");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-83943");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-83943 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20861");
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
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-74851");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-74851' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20862");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        long long17 = hikariConfig1.getIdleTimeout();
        java.lang.String str18 = hikariConfig1.getPoolName();
        int int19 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-919" + "'", str18, "HikariPool-919");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test20863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20863");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay(10L);
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireRetries(3);
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig0.getPoolName();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-91091" + "'", str15, "HikariPool-91091");
    }

    @Test
    public void test20864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20864");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAcquireIncrement((int) '#');
        long long3 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-5360");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-10803");
        boolean boolean10 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbcUrl("HikariPool-21168");
        boolean boolean13 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20865");
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
        int int21 = hikariConfig1.getTransactionIsolation();
        java.lang.String str22 = hikariConfig1.getPoolName();
        int int23 = hikariConfig1.getAcquireRetries();
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-91093" + "'", str22, "HikariPool-91093");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20866");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        long long14 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-34504");
        int int17 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setTransactionIsolation("HikariPool-6131");
        hikariConfig0.setMaxLifetime(3L);
        boolean boolean22 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20867");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireIncrement(10);
        boolean boolean9 = hikariConfig0.isReadOnly();
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20868");
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
        boolean boolean16 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20869");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-102");
        boolean boolean5 = hikariConfig1.isRegisterMbeans();
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test20870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20870");
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
        long long22 = hikariConfig1.getMaxLifetime();
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        int int24 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setLeakDetectionThreshold((long) 52);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test20871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20871");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setJdbcUrl("HikariPool-159");
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setPoolName("HikariPool-1276");
        boolean boolean21 = hikariConfig1.isAutoCommit();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str24 = hikariConfig1.getPoolName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-1276" + "'", str24, "HikariPool-1276");
    }

    @Test
    public void test20872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20872");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setLeakDetectionThreshold(60L);
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20873");
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
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig38.setConnectionInitSql("");
        boolean boolean41 = hikariConfig38.isJdbc4ConnectionTest();
        java.lang.String str42 = hikariConfig38.getCatalog();
        java.lang.String str43 = hikariConfig38.getConnectionTestQuery();
        hikariConfig38.setLeakDetectionThreshold((long) '4');
        hikariConfig38.setRegisterMbeans(false);
        hikariConfig38.setAutoCommit(false);
        java.util.Properties properties50 = hikariConfig38.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        hikariConfig51.setMaxLifetime(0L);
        java.lang.String str54 = hikariConfig51.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str56 = hikariConfig55.getConnectionInitSql();
        hikariConfig55.setMaxLifetime((long) (short) 10);
        java.util.Properties properties59 = hikariConfig55.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig51.setDataSourceProperties(properties59);
        hikariConfig1.setDataSourceProperties(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties59);
        javax.sql.DataSource dataSource65 = null;
        hikariConfig64.setDataSource(dataSource65);
        boolean boolean67 = hikariConfig64.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test20874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20874");
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
        hikariConfig11.setConnectionTestQuery("HikariPool-10958");
        hikariConfig11.setMaximumPoolSize(0);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test20875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20875");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        int int8 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test20876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20876");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20877");
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
        boolean boolean49 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("");
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test20878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20878");
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
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionInitSql("HikariPool-823");
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setConnectionInitSql("");
        boolean boolean32 = hikariConfig29.isJdbc4ConnectionTest();
        java.lang.String str33 = hikariConfig29.getCatalog();
        java.lang.String str34 = hikariConfig29.getConnectionTestQuery();
        hikariConfig29.setLeakDetectionThreshold((long) '4');
        hikariConfig29.setRegisterMbeans(false);
        hikariConfig29.setAutoCommit(false);
        java.util.Properties properties41 = hikariConfig29.getDataSourceProperties();
        hikariConfig29.setJdbc4ConnectionTest(true);
        hikariConfig0.addDataSourceProperty("HikariPool-2491", (java.lang.Object) true);
        hikariConfig0.setConnectionTestQuery("HikariPool-8249");
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties49 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTestQuery("HikariPool-80519");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test20879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20879");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setReadOnly(false);
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbcUrl("HikariPool-64297");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test20881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20881");
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
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test20882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20882");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        boolean boolean9 = hikariConfig1.isReadOnly();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        long long12 = hikariConfig1.getIdleTimeout();
        java.lang.String str13 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-159" + "'", str13, "HikariPool-159");
    }

    @Test
    public void test20883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20883");
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
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(false);
        int int21 = hikariConfig1.getAcquireIncrement();
        int int22 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test20884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setCatalog("");
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-20020");
        int int15 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test20885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20885");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig16.setConnectionInitSql("");
        boolean boolean19 = hikariConfig16.isJdbc4ConnectionTest();
        java.lang.String str20 = hikariConfig16.getCatalog();
        java.lang.String str21 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setLeakDetectionThreshold((long) '4');
        hikariConfig16.setRegisterMbeans(false);
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.setTransactionIsolation("HikariPool-158");
        int int30 = hikariConfig16.getTransactionIsolation();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig32.setConnectionInitSql("");
        hikariConfig32.setDataSourceClassName("");
        hikariConfig32.setConnectionCustomizerClassName("");
        long long39 = hikariConfig32.getLeakDetectionThreshold();
        int int40 = hikariConfig32.getAcquireIncrement();
        long long41 = hikariConfig32.getAcquireRetryDelay();
        java.util.Properties properties42 = hikariConfig32.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig16.setDataSourceProperties(properties42);
        long long45 = hikariConfig16.getIdleTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-23396", (java.lang.Object) long45);
        boolean boolean47 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 750L + "'", long41 == 750L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 600000L + "'", long45 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test20886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20886");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test20887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20887");
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
        java.lang.String str34 = hikariConfig1.getConnectionInitSql();
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test20888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20888");
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
        hikariConfig1.setConnectionTimeout(1800000L);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig24.setConnectionInitSql("");
        boolean boolean27 = hikariConfig24.isJdbc4ConnectionTest();
        java.lang.String str28 = hikariConfig24.getCatalog();
        java.lang.String str29 = hikariConfig24.getCatalog();
        hikariConfig24.setIsolateInternalQueries(true);
        hikariConfig24.setPoolName("HikariPool-130");
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties38 = hikariConfig37.getDataSourceProperties();
        hikariConfig37.setLeakDetectionThreshold((long) ' ');
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test20889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setUseInstrumentation(false);
        hikariConfig7.setConnectionInitSql("HikariPool-5614");
        int int12 = hikariConfig7.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test20890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20890");
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
        hikariConfig0.setTransactionIsolation("HikariPool-12331");
        hikariConfig0.setUseInstrumentation(false);
        long long23 = hikariConfig0.getConnectionTimeout();
        java.lang.String str24 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20891");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.getMinimumPoolSize();
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-3431");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        long long15 = hikariConfig11.getConnectionTimeout();
        java.lang.String str16 = hikariConfig11.getCatalog();
        hikariConfig11.setInitializationFailFast(false);
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        hikariConfig11.setUseInstrumentation(true);
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.util.Properties properties24 = hikariConfig23.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties24);
        long long26 = hikariConfig1.getMaxLifetime();
        int int27 = hikariConfig1.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test20892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20892");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig20.setDataSourceClassName("HikariPool-25910");
        long long23 = hikariConfig20.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-566" + "'", str14, "HikariPool-566");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 750L + "'", long23 == 750L);
    }

    @Test
    public void test20893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20893");
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
        hikariConfig5.setReadOnly(false);
        boolean boolean18 = hikariConfig5.isRegisterMbeans();
        int int19 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setConnectionInitSql("HikariPool-82059");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test20894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20894");
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
        hikariConfig15.setConnectionInitSql("HikariPool-6471");
        hikariConfig15.setTransactionIsolation("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20895");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test20896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20896");
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
        hikariConfig1.setLeakDetectionThreshold(60L);
        hikariConfig1.setMaxLifetime((long) 97);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test20897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20897");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long17 = hikariConfig16.getIdleTimeout();
        long long18 = hikariConfig16.getConnectionTimeout();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test20898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20898");
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
        boolean boolean35 = hikariConfig10.isIsolateInternalQueries();
        int int36 = hikariConfig10.getMaximumPoolSize();
        hikariConfig10.setAcquireRetries((int) ' ');
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-91189" + "'", str30, "HikariPool-91189");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test20899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20899");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        int int17 = hikariConfig16.getAcquireRetries();
        java.lang.String str18 = hikariConfig16.getPoolName();
        java.lang.String str19 = hikariConfig16.getCatalog();
        hikariConfig16.setIsolateInternalQueries(true);
        hikariConfig0.addDataSourceProperty("HikariPool-5648", (java.lang.Object) hikariConfig16);
        hikariConfig0.setTransactionIsolation("HikariPool-24733");
        java.lang.String str25 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-91191" + "'", str18, "HikariPool-91191");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20900");
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
        javax.sql.DataSource dataSource32 = null;
        hikariConfig7.setDataSource(dataSource32);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test20901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20901");
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
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20902");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str7 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("HikariPool-6648");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-19160");
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        hikariConfig18.setJdbcUrl("hi!");
        boolean boolean24 = hikariConfig18.isJdbc4ConnectionTest();
        long long25 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.setAcquireIncrement(100);
        boolean boolean28 = hikariConfig18.isReadOnly();
        hikariConfig18.setAcquireRetryDelay((long) ' ');
        java.lang.String str31 = hikariConfig18.getJdbcUrl();
        hikariConfig18.setIdleTimeout((-1L));
        hikariConfig18.setConnectionTestQuery("");
        hikariConfig18.setIdleTimeout((long) (byte) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        int int40 = hikariConfig39.getAcquireRetries();
        hikariConfig39.setJdbcUrl("hi!");
        hikariConfig39.setAutoCommit(true);
        hikariConfig39.setIdleTimeout(1L);
        hikariConfig39.setConnectionTestQuery("hi!");
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        boolean boolean51 = hikariConfig50.isReadOnly();
        java.lang.String str52 = hikariConfig50.getDataSourceClassName();
        hikariConfig50.setJdbcUrl("hi!");
        boolean boolean55 = hikariConfig50.isReadOnly();
        hikariConfig50.setTransactionIsolation("HikariPool-158");
        hikariConfig50.setUseInstrumentation(false);
        java.util.Properties properties60 = hikariConfig50.getDataSourceProperties();
        hikariConfig39.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig18.addDataSourceProperty("HikariPool-12654", (java.lang.Object) properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig1.setDataSourceProperties(properties60);
        java.lang.String str67 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(properties60);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "HikariPool-91195" + "'", str67, "HikariPool-91195");
    }

    @Test
    public void test20903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20903");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setIsolateInternalQueries(false);
        long long16 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMinimumPoolSize(32);
        long long19 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetries(35);
        long long22 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
    }

    @Test
    public void test20904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20904");
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
        javax.sql.DataSource dataSource19 = hikariConfig7.getDataSource();
        boolean boolean20 = hikariConfig7.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str23 = hikariConfig22.getConnectionInitSql();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setConnectionInitSql("");
        hikariConfig25.setJdbcUrl("");
        hikariConfig25.setConnectionTestQuery("hi!");
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setTransactionIsolation("");
        javax.sql.DataSource dataSource36 = hikariConfig33.getDataSource();
        long long37 = hikariConfig33.getConnectionTimeout();
        java.lang.String str38 = hikariConfig33.getCatalog();
        hikariConfig33.setInitializationFailFast(false);
        java.util.Properties properties41 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig25.setDataSourceProperties(properties41);
        hikariConfig22.setDataSourceProperties(properties41);
        hikariConfig22.setTransactionIsolation("HikariPool-130");
        hikariConfig22.setMaximumPoolSize((int) '4');
        int int50 = hikariConfig22.getAcquireRetries();
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean54 = hikariConfig53.isReadOnly();
        java.lang.String str55 = hikariConfig53.getDataSourceClassName();
        hikariConfig53.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean58 = hikariConfig53.isAutoCommit();
        hikariConfig53.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean61 = hikariConfig53.isReadOnly();
        hikariConfig53.setMaximumPoolSize((int) ' ');
        hikariConfig53.setConnectionCustomizerClassName("HikariPool-8586");
        hikariConfig22.addDataSourceProperty("HikariPool-14661", (java.lang.Object) hikariConfig53);
        hikariConfig22.setAcquireRetryDelay((long) (byte) 10);
        java.lang.String str69 = hikariConfig22.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.addDataSourceProperty("HikariPool-69394", (java.lang.Object) str69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test20905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20905");
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
        hikariConfig11.setConnectionTestQuery("HikariPool-10958");
        hikariConfig11.setAcquireIncrement((int) '4');
        int int16 = hikariConfig11.getAcquireRetries();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test20906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20906");
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
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("");
        boolean boolean17 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setConnectionInitSql("");
        boolean boolean23 = hikariConfig20.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig20.getCatalog();
        hikariConfig20.setReadOnly(false);
        java.lang.String str27 = hikariConfig20.getConnectionInitSql();
        hikariConfig20.setIsolateInternalQueries(false);
        java.util.Properties properties30 = hikariConfig20.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig32.setConnectionInitSql("");
        boolean boolean35 = hikariConfig32.isJdbc4ConnectionTest();
        java.lang.String str36 = hikariConfig32.getCatalog();
        java.lang.String str37 = hikariConfig32.getCatalog();
        hikariConfig32.setPoolName("");
        java.lang.String str40 = hikariConfig32.getConnectionInitSql();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig0.setDataSourceProperties(properties41);
        java.lang.String str45 = hikariConfig0.getCatalog();
        java.lang.String str46 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setRegisterMbeans(true);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test20907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20907");
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
        boolean boolean21 = hikariConfig1.isReadOnly();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20908");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test20909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20909");
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
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20910");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        int int9 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test20911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20911");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20912");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("HikariPool-993");
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-1177");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20913");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay(35L);
        hikariConfig1.setIsolateInternalQueries(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test20914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20914");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6648");
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        long long13 = hikariConfig1.getMaxLifetime();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        boolean boolean15 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-6648" + "'", str10, "HikariPool-6648");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20915");
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
        hikariConfig28.setConnectionInitSql("HikariPool-4548");
        hikariConfig28.setMaxLifetime(100L);
        hikariConfig28.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test20916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20916");
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
        hikariConfig0.setConnectionInitSql("HikariPool-3431");
        hikariConfig0.setRegisterMbeans(true);
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.setTransactionIsolation("");
        javax.sql.DataSource dataSource62 = hikariConfig59.getDataSource();
        long long63 = hikariConfig59.getConnectionTimeout();
        java.lang.String str64 = hikariConfig59.getCatalog();
        hikariConfig59.setInitializationFailFast(false);
        java.util.Properties properties67 = hikariConfig59.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig72.setCatalog("HikariPool-919");
        hikariConfig72.setMinimumPoolSize(32);
        long long77 = hikariConfig72.getAcquireRetryDelay();
        int int78 = hikariConfig72.getAcquireIncrement();
        boolean boolean79 = hikariConfig72.isIsolateInternalQueries();
        int int80 = hikariConfig72.getAcquireIncrement();
        java.lang.String str81 = hikariConfig72.getConnectionInitSql();
        java.util.Properties properties82 = hikariConfig72.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties82);
        hikariConfig0.setDataSourceProperties(properties82);
        int int85 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetries(10);
        int int88 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(dataSource62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 5000L + "'", long63 == 5000L);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 750L + "'", long77 == 750L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(properties82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 60 + "'", int88 == 60);
    }

    @Test
    public void test20917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20917");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setTransactionIsolation("");
        javax.sql.DataSource dataSource11 = null;
        hikariConfig8.setDataSource(dataSource11);
        boolean boolean13 = hikariConfig8.isJdbc4ConnectionTest();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        long long19 = hikariConfig15.getConnectionTimeout();
        java.lang.String str20 = hikariConfig15.getCatalog();
        hikariConfig15.setInitializationFailFast(false);
        java.util.Properties properties23 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig8.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig30.setConnectionInitSql("HikariPool-24867");
        hikariConfig30.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test20918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20918");
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
        int int13 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.setJdbcUrl("HikariPool-50465");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test20919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20919");
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
        java.lang.String str23 = hikariConfig7.getConnectionInitSql();
        java.lang.String str24 = hikariConfig7.getPoolName();
        hikariConfig7.setMinimumPoolSize(52);
        int int27 = hikariConfig7.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-91270" + "'", str24, "HikariPool-91270");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test20920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20920");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test20921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20921");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1561");
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test20922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20922");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        java.lang.String str10 = hikariConfig0.getCatalog();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test20923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20923");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-442");
        java.lang.String str11 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20924");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setMinimumPoolSize((int) '#');
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-52660");
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test20925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20925");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAutoCommit(true);
        int int11 = hikariConfig0.getMinimumPoolSize();
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test20926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20926");
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
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        int int21 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setAcquireRetryDelay((long) 0);
        hikariConfig20.setReadOnly(true);
        long long26 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig20.setMaximumPoolSize((int) (short) 1);
        hikariConfig20.setMinimumPoolSize(0);
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setTransactionIsolation("");
        hikariConfig36.setUseInstrumentation(false);
        java.util.Properties properties41 = hikariConfig36.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig0.setDataSourceProperties(properties41);
        int int46 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test20927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20927");
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
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("HikariPool-6621");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-14789");
        int int22 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMaxLifetime(10L);
        javax.sql.DataSource dataSource25 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("HikariPool-59203");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test20928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20928");
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
        boolean boolean20 = hikariConfig0.isReadOnly();
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int27 = hikariConfig26.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test20929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20929");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-3343");
        hikariConfig0.setDataSourceClassName("HikariPool-45683");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20930");
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
        java.lang.String str12 = hikariConfig11.getCatalog();
        long long13 = hikariConfig11.getAcquireRetryDelay();
        long long14 = hikariConfig11.getMaxLifetime();
        hikariConfig11.setIdleTimeout((-1L));
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test20931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20931");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setTransactionIsolation("");
        javax.sql.DataSource dataSource23 = hikariConfig20.getDataSource();
        long long24 = hikariConfig20.getConnectionTimeout();
        java.lang.String str25 = hikariConfig20.getCatalog();
        int int26 = hikariConfig20.getTransactionIsolation();
        hikariConfig13.addDataSourceProperty("HikariPool-3107", (java.lang.Object) int26);
        long long28 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.setAcquireIncrement(52);
        hikariConfig13.setDataSourceClassName("HikariPool-90012");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test20932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20932");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-3886");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test20933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20933");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionInitSql("HikariPool-3114");
        boolean boolean27 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setDataSourceClassName("HikariPool-81292");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test20934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20934");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str9 = hikariConfig0.getCatalog();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout(35L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20935");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireIncrement(35);
        hikariConfig1.setMaxLifetime((long) 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
    }

    @Test
    public void test20936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setDataSourceClassName("HikariPool-760");
        int int12 = hikariConfig1.getMaximumPoolSize();
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout(750L);
        hikariConfig1.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        int int20 = hikariConfig19.getAcquireRetries();
        hikariConfig19.setAcquireRetryDelay((long) 0);
        hikariConfig19.setCatalog("");
        long long25 = hikariConfig19.getConnectionTimeout();
        hikariConfig19.setJdbc4ConnectionTest(false);
        hikariConfig19.setMaxLifetime((long) (short) 1);
        hikariConfig19.setConnectionCustomizerClassName("HikariPool-6202");
        boolean boolean32 = hikariConfig19.isRegisterMbeans();
        hikariConfig19.setCatalog("HikariPool-7993");
        hikariConfig19.setAutoCommit(true);
        hikariConfig1.addDataSourceProperty("HikariPool-25703", (java.lang.Object) true);
        hikariConfig1.setMaximumPoolSize(52);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test20937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20937");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-566");
        hikariConfig1.setTransactionIsolation("HikariPool-1177");
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test20938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20938");
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
        hikariConfig1.setAutoCommit(true);
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        java.lang.String str19 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-919" + "'", str19, "HikariPool-919");
    }

    @Test
    public void test20939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        long long8 = hikariConfig1.getConnectionTimeout();
        int int9 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test20940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20940");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setTransactionIsolation("HikariPool-4331");
        java.lang.String str15 = hikariConfig0.getPoolName();
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-91321" + "'", str15, "HikariPool-91321");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20941");
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
        hikariConfig1.setAcquireRetryDelay((long) '4');
        hikariConfig1.setDataSourceClassName("HikariPool-38752");
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20942");
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
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str18 = hikariConfig17.getCatalog();
        java.lang.String str19 = hikariConfig17.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20943");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setCatalog("HikariPool-151");
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setReadOnly(false);
        int int13 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test20944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20944");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setConnectionInitSql("");
        javax.sql.DataSource dataSource23 = null;
        hikariConfig20.setDataSource(dataSource23);
        hikariConfig20.setConnectionTestQuery("");
        int int27 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setJdbcUrl("HikariPool-151");
        javax.sql.DataSource dataSource30 = null;
        hikariConfig20.setDataSource(dataSource30);
        hikariConfig20.setLeakDetectionThreshold(100L);
        hikariConfig20.setIdleTimeout(60L);
        hikariConfig10.addDataSourceProperty("HikariPool-2907", (java.lang.Object) 60L);
        boolean boolean37 = hikariConfig10.isReadOnly();
        hikariConfig10.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test20945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20945");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-16124");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-16124 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20946");
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
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        boolean boolean16 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionInitSql("HikariPool-48429");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig12.setDataSource(dataSource15);
        boolean boolean17 = hikariConfig12.isJdbc4ConnectionTest();
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
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig12.setDataSourceProperties(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        java.util.Properties properties35 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        int int37 = hikariConfig36.getAcquireIncrement();
        hikariConfig36.setReadOnly(false);
        javax.sql.DataSource dataSource40 = null;
        hikariConfig36.setDataSource(dataSource40);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test20948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20948");
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
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("");
        hikariConfig20.setDataSourceClassName("");
        hikariConfig20.setConnectionCustomizerClassName("");
        java.lang.String str27 = hikariConfig20.getPoolName();
        java.lang.String str28 = hikariConfig20.getConnectionCustomizerClassName();
        hikariConfig20.setAutoCommit(false);
        hikariConfig16.addDataSourceProperty("HikariPool-29822", (java.lang.Object) false);
        hikariConfig16.setTransactionIsolation("HikariPool-5886");
        hikariConfig16.setAcquireRetries((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-91344" + "'", str27, "HikariPool-91344");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test20949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20949");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-43217");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-43217 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20950");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setDataSourceClassName("HikariPool-1993");
        hikariConfig0.setJdbcUrl("HikariPool-1076");
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig0.getCatalog();
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        long long17 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-1993" + "'", str18, "HikariPool-1993");
    }

    @Test
    public void test20951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20951");
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
        long long22 = hikariConfig1.getMaxLifetime();
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        int int24 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout((-1L));
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test20952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20952");
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
        hikariConfig13.setMinimumPoolSize(35);
        java.lang.String str16 = hikariConfig13.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setMaxLifetime((long) 60);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setAcquireRetries((int) (short) 1);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str18 = hikariConfig1.getPoolName();
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-91356" + "'", str18, "HikariPool-91356");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test20954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20954");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean18 = hikariConfig0.isReadOnly();
        long long19 = hikariConfig0.getMaxLifetime();
        java.lang.String str20 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaximumPoolSize(0);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20956");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig8.setPoolName("HikariPool-13086");
        java.lang.String str11 = hikariConfig8.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setJdbcUrl("HikariPool-130");
        hikariConfig1.setTransactionIsolation("HikariPool-674");
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setInitializationFailFast(false);
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.setCatalog("HikariPool-81869");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20958");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-90999");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-90999 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20959");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        hikariConfig0.setMaxLifetime(1L);
        java.lang.String str10 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-91367" + "'", str10, "HikariPool-91367");
    }

    @Test
    public void test20960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20960");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionInitSql("HikariPool-159");
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMaxLifetime(35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test20961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20961");
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
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties18);
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        long long27 = hikariConfig25.getLeakDetectionThreshold();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test20962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig7.setDataSource(dataSource12);
        long long14 = hikariConfig7.getMaxLifetime();
        boolean boolean15 = hikariConfig7.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig7.getConnectionTestQuery();
        hikariConfig1.addDataSourceProperty("HikariPool-4373", (java.lang.Object) hikariConfig7);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setUseInstrumentation(false);
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setTransactionIsolation("");
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        long long28 = hikariConfig24.getConnectionTimeout();
        java.lang.String str29 = hikariConfig24.getCatalog();
        hikariConfig24.setInitializationFailFast(false);
        java.util.Properties properties32 = hikariConfig24.getDataSourceProperties();
        hikariConfig24.setUseInstrumentation(true);
        java.util.Properties properties35 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.util.Properties properties37 = hikariConfig36.getDataSourceProperties();
        hikariConfig36.setConnectionTestQuery("HikariPool-3343");
        int int40 = hikariConfig36.getMinimumPoolSize();
        java.lang.String str41 = hikariConfig36.getConnectionCustomizerClassName();
        hikariConfig36.setConnectionCustomizerClassName("HikariPool-14448");
        hikariConfig36.setCatalog("HikariPool-40959");
        java.util.Properties properties46 = hikariConfig36.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties46);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test20963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20963");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int13 = hikariConfig0.getTransactionIsolation();
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-8201");
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test20964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20964");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-55081");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-55081 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20965");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-85024");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-85024 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20966");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("HikariPool-27723");
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20967");
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
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setLeakDetectionThreshold(600000L);
        hikariConfig1.setIdleTimeout((long) '#');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test20968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20968");
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
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        long long19 = hikariConfig0.getMaxLifetime();
        java.lang.String str20 = hikariConfig0.getPoolName();
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-91402" + "'", str20, "HikariPool-91402");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20969");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isReadOnly();
        java.lang.String str19 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setIsolateInternalQueries(false);
        java.util.Properties properties22 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        int int25 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test20970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20970");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        javax.sql.DataSource dataSource2 = null;
        hikariConfig1.setDataSource(dataSource2);
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig5.setConnectionInitSql("");
        javax.sql.DataSource dataSource8 = hikariConfig5.getDataSource();
        hikariConfig5.setLeakDetectionThreshold(600000L);
        boolean boolean11 = hikariConfig5.isAutoCommit();
        long long12 = hikariConfig5.getIdleTimeout();
        java.util.Properties properties13 = hikariConfig5.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean16 = hikariConfig15.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20971");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str12 = hikariConfig0.getCatalog();
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        int int16 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test20972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20972");
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
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        hikariConfig1.setConnectionInitSql("HikariPool-12172");
        boolean boolean23 = hikariConfig1.isInitializationFailFast();
        boolean boolean24 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-91410" + "'", str18, "HikariPool-91410");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20973");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setJdbcUrl("HikariPool-7695");
        hikariConfig1.setDataSourceClassName("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        int int10 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("HikariPool-37274");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test20975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20975");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (short) -1);
        hikariConfig0.setConnectionInitSql("HikariPool-919");
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setInitializationFailFast(false);
        int int15 = hikariConfig0.getAcquireRetries();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIdleTimeout((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test20976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20976");
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
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        javax.sql.DataSource dataSource16 = hikariConfig14.getDataSource();
        hikariConfig14.setLeakDetectionThreshold((long) (short) -1);
        hikariConfig14.setTransactionIsolation("HikariPool-12873");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test20977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20977");
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
        long long18 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIdleTimeout(0L);
        hikariConfig0.setLeakDetectionThreshold(32L);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test20978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20978");
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
        hikariConfig24.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test20979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20979");
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
        boolean boolean12 = hikariConfig1.isReadOnly();
        int int13 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20980");
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
        javax.sql.DataSource dataSource19 = hikariConfig7.getDataSource();
        int int20 = hikariConfig7.getAcquireIncrement();
        hikariConfig7.setMaxLifetime(52L);
        hikariConfig7.setJdbcUrl("HikariPool-52241");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test20981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20981");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setReadOnly(true);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-13838");
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        java.lang.String str15 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-91424" + "'", str15, "HikariPool-91424");
    }

    @Test
    public void test20982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20982");
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
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-43785");
        hikariConfig1.setConnectionInitSql("HikariPool-36232");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-91425" + "'", str12, "HikariPool-91425");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test20983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20983");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        int int5 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-86719");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test20984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20984");
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
        hikariConfig1.setIdleTimeout(0L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test20985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20985");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaxLifetime((long) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = hikariConfig10.getDataSource();
        long long14 = hikariConfig10.getConnectionTimeout();
        java.lang.String str15 = hikariConfig10.getCatalog();
        hikariConfig10.setInitializationFailFast(false);
        java.util.Properties properties18 = hikariConfig10.getDataSourceProperties();
        hikariConfig10.setUseInstrumentation(true);
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setConnectionInitSql("");
        boolean boolean25 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str26 = hikariConfig22.getCatalog();
        java.lang.String str27 = hikariConfig22.getCatalog();
        hikariConfig22.setPoolName("");
        java.lang.String str30 = hikariConfig22.getConnectionInitSql();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int34 = hikariConfig33.getTransactionIsolation();
        int int35 = hikariConfig33.getAcquireIncrement();
        javax.sql.DataSource dataSource36 = hikariConfig33.getDataSource();
        hikariConfig1.addDataSourceProperty("HikariPool-83957", (java.lang.Object) hikariConfig33);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(dataSource36);
    }

    @Test
    public void test20987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20987");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig16.setConnectionInitSql("");
        boolean boolean19 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig16.setJdbcUrl("hi!");
        boolean boolean22 = hikariConfig16.isJdbc4ConnectionTest();
        java.lang.String str23 = hikariConfig16.getDataSourceClassName();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setConnectionInitSql("");
        hikariConfig25.setJdbcUrl("");
        hikariConfig25.setConnectionTestQuery("hi!");
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setTransactionIsolation("");
        javax.sql.DataSource dataSource36 = hikariConfig33.getDataSource();
        long long37 = hikariConfig33.getConnectionTimeout();
        java.lang.String str38 = hikariConfig33.getCatalog();
        hikariConfig33.setInitializationFailFast(false);
        java.util.Properties properties41 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig25.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig16.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig48.setAutoCommit(true);
        hikariConfig1.addDataSourceProperty("HikariPool-25349", (java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test20988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20988");
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
        hikariConfig1.setMinimumPoolSize((int) '#');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-3808" + "'", str15, "HikariPool-3808");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20989");
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
        hikariConfig1.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        long long21 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        hikariConfig1.setAcquireRetries((int) 'a');
        java.lang.String str27 = hikariConfig1.getPoolName();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setConnectionInitSql("");
        hikariConfig29.setDataSourceClassName("");
        java.lang.String str34 = hikariConfig29.getDataSourceClassName();
        long long35 = hikariConfig29.getMaxLifetime();
        boolean boolean36 = hikariConfig29.isRegisterMbeans();
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
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig29.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig1.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig55.setConnectionInitSql("");
        boolean boolean58 = hikariConfig55.isJdbc4ConnectionTest();
        hikariConfig55.setJdbcUrl("hi!");
        java.util.Properties properties61 = hikariConfig55.getDataSourceProperties();
        hikariConfig54.setDataSourceProperties(properties61);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties61);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNull(dataSource22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-91444" + "'", str27, "HikariPool-91444");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(properties61);
    }

    @Test
    public void test20990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20990");
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
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setConnectionTestQuery("HikariPool-11940");
        hikariConfig16.setCatalog("HikariPool-17049");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test20991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20991");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-64149");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-64149 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20992");
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
        int int14 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-12468");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        boolean boolean19 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20993");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionCustomizerClassName("");
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        int int12 = hikariConfig0.getAcquireIncrement();
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionInitSql("HikariPool-10505");
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20994");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str12 = hikariConfig0.getCatalog();
        int int13 = hikariConfig0.getMinimumPoolSize();
        int int14 = hikariConfig0.getAcquireIncrement();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20995");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setJdbcUrl("HikariPool-32273");
        hikariConfig0.setConnectionTestQuery("HikariPool-11311");
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test20996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20996");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setUseInstrumentation(false);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-18186");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test20997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20997");
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
        hikariConfig10.setTransactionIsolation("HikariPool-8815");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-91471" + "'", str15, "HikariPool-91471");
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
    }

    @Test
    public void test20998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.util.Properties properties1 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetries((int) ' ');
        long long4 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionInitSql("HikariPool-14661");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test20999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20999");
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
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        boolean boolean23 = hikariConfig1.isReadOnly();
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        int int25 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test21000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test21000");
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
        long long86 = hikariConfig82.getLeakDetectionThreshold();
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
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }
}
