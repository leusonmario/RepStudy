import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

    public static boolean debug = false;

    @Test
    public void test21501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21501");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setCatalog("HikariPool-27981");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test21502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21502");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str6 = hikariConfig1.getPoolName();
        int int7 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime(5000L);
        hikariConfig1.setRegisterMbeans(false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-92833" + "'", str6, "HikariPool-92833");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test21503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21503");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMaximumPoolSize();
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test21504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21504");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("");
        javax.sql.DataSource dataSource15 = hikariConfig12.getDataSource();
        long long16 = hikariConfig12.getConnectionTimeout();
        int int17 = hikariConfig12.getMinimumPoolSize();
        java.util.Properties properties18 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties18);
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test21505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21505");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setCatalog("HikariPool-1164");
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig9.getConnectionInitSql();
        int int15 = hikariConfig9.getMaximumPoolSize();
        long long16 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.setInitializationFailFast(true);
        hikariConfig9.setPoolName("HikariPool-923");
        hikariConfig9.setInitializationFailFast(true);
        long long23 = hikariConfig9.getMaxLifetime();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig9.setDataSource(dataSource24);
        hikariConfig0.addDataSourceProperty("HikariPool-5045", (java.lang.Object) hikariConfig9);
        java.lang.String str27 = hikariConfig9.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test21506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21506");
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
        hikariConfig0.setUseInstrumentation(false);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setTransactionIsolation("");
        hikariConfig23.setCatalog("");
        java.lang.String str28 = hikariConfig23.getConnectionTestQuery();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isReadOnly();
        java.lang.String str32 = hikariConfig30.getDataSourceClassName();
        hikariConfig30.setIsolateInternalQueries(false);
        java.util.Properties properties35 = hikariConfig30.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig23.setDataSourceProperties(properties35);
        boolean boolean38 = hikariConfig23.isRegisterMbeans();
        hikariConfig23.setPoolName("HikariPool-6029");
        java.util.Properties properties41 = hikariConfig23.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig0.setDataSourceProperties(properties41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test21507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setUseInstrumentation(false);
        int int14 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test21508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21508");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean18 = hikariConfig17.isIsolateInternalQueries();
        java.lang.String str19 = hikariConfig17.getConnectionInitSql();
        long long20 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setTransactionIsolation("HikariPool-39017");
        hikariConfig17.setAutoCommit(true);
        hikariConfig17.setCatalog("HikariPool-43493");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
    }

    @Test
    public void test21509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21509");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test21510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21510");
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
        hikariConfig13.setAcquireRetries((int) 'a');
        hikariConfig13.setReadOnly(false);
        hikariConfig13.setConnectionInitSql("HikariPool-9389");
        hikariConfig13.setAcquireRetries((int) (short) 100);
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-82117");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21511");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean7 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21512");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test21513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21513");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        java.lang.String str10 = hikariConfig0.getCatalog();
        hikariConfig0.setDataSourceClassName("HikariPool-1177");
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setAutoCommit(true);
        long long17 = hikariConfig0.getIdleTimeout();
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test21514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21514");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        int int13 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test21515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21515");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-24590");
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("HikariPool-16564");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test21516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21516");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        long long8 = hikariConfig0.getIdleTimeout();
        long long9 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test21517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21517");
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
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setMaxLifetime((long) (short) 10);
        long long29 = hikariConfig25.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
    }

    @Test
    public void test21518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21518");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-960");
        hikariConfig1.setAutoCommit(false);
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionInitSql("HikariPool-9739");
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setCatalog("HikariPool-88389");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test21519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setAcquireIncrement((int) '4');
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setJdbcUrl("HikariPool-9268");
        long long19 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
    }

    @Test
    public void test21520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21520");
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
        java.util.Properties properties62 = hikariConfig61.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties62);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties62);
        long long66 = hikariConfig65.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 600000L + "'", long66 == 600000L);
    }

    @Test
    public void test21521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21521");
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
        hikariConfig1.setMaximumPoolSize(97);
        hikariConfig1.setConnectionTestQuery("HikariPool-8010");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test21522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.util.Properties properties11 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test21523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21523");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setTransactionIsolation("");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig7.setDataSource(dataSource10);
        hikariConfig7.setAutoCommit(false);
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setDataSourceClassName("");
        hikariConfig1.addDataSourceProperty("HikariPool-3292", (java.lang.Object) hikariConfig7);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test21524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21524");
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
        long long19 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test21525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21525");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-62760");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-62760 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21526");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setIdleTimeout(35L);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setJdbcUrl("HikariPool-79764");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test21527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21527");
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
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test21528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21528");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.getAcquireRetries();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21529");
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
        hikariConfig1.setIdleTimeout((long) 35);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test21530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getAcquireIncrement();
        int int12 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test21531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21531");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setPoolName("HikariPool-72459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test21532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21532");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig8.setConnectionInitSql("");
        boolean boolean11 = hikariConfig8.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig8.getCatalog();
        hikariConfig8.setReadOnly(false);
        java.lang.String str15 = hikariConfig8.getConnectionInitSql();
        hikariConfig8.setIsolateInternalQueries(false);
        hikariConfig8.setAcquireIncrement((int) (byte) 10);
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
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig8.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig6.addDataSourceProperty("HikariPool-90396", (java.lang.Object) hikariConfig38);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test21533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21533");
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
        hikariConfig13.setJdbcUrl("HikariPool-823");
        hikariConfig13.setMaximumPoolSize((int) (byte) 100);
        java.lang.String str29 = hikariConfig13.getCatalog();
        boolean boolean30 = hikariConfig13.isRegisterMbeans();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setConnectionInitSql("");
        hikariConfig33.setDataSourceClassName("");
        hikariConfig33.setConnectionCustomizerClassName("");
        hikariConfig33.validate();
        boolean boolean41 = hikariConfig33.isAutoCommit();
        hikariConfig33.setReadOnly(true);
        hikariConfig33.setMinimumPoolSize((int) (short) 10);
        hikariConfig33.setAutoCommit(false);
        hikariConfig33.setIsolateInternalQueries(true);
        boolean boolean50 = hikariConfig33.isJdbc4ConnectionTest();
        hikariConfig33.setConnectionCustomizerClassName("HikariPool-13457");
        int int53 = hikariConfig33.getTransactionIsolation();
        hikariConfig13.addDataSourceProperty("HikariPool-26279", (java.lang.Object) hikariConfig33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test21534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21534");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        hikariConfig0.setRegisterMbeans(false);
        long long9 = hikariConfig0.getConnectionTimeout();
        boolean boolean10 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21535");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setCatalog("");
        long long12 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
    }

    @Test
    public void test21536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21536");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str6 = hikariConfig1.getCatalog();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21537");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-89868");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-89868 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21538");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMinimumPoolSize(10);
        java.lang.String str11 = hikariConfig1.getPoolName();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-92942" + "'", str11, "HikariPool-92942");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test21539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21539");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setConnectionTestQuery("HikariPool-932");
        hikariConfig0.setAutoCommit(false);
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setReadOnly(true);
        boolean boolean17 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-932" + "'", str14, "HikariPool-932");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21540");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        int int16 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test21541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21541");
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig27.setConnectionInitSql("");
        boolean boolean30 = hikariConfig27.isJdbc4ConnectionTest();
        java.lang.String str31 = hikariConfig27.getCatalog();
        java.lang.String str32 = hikariConfig27.getCatalog();
        hikariConfig27.setPoolName("");
        java.lang.String str35 = hikariConfig27.getConnectionInitSql();
        java.util.Properties properties36 = hikariConfig27.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties36);
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
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-92945" + "'", str26, "HikariPool-92945");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test21542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21542");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        hikariConfig0.setAcquireRetryDelay(0L);
        boolean boolean9 = hikariConfig0.isAutoCommit();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21543");
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
        int int44 = hikariConfig43.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test21544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21544");
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
        long long25 = hikariConfig7.getConnectionTimeout();
        hikariConfig7.setMaxLifetime((long) 3);
        hikariConfig7.setDataSourceClassName("HikariPool-51824");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.setDriverClassName("HikariPool-35843");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-35843' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
    }

    @Test
    public void test21545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21545");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setIsolateInternalQueries(true);
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test21546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21546");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay(10L);
        boolean boolean11 = hikariConfig0.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        int int14 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setJdbcUrl("hi!");
        hikariConfig13.setMaximumPoolSize((int) ' ');
        java.lang.String str19 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.setRegisterMbeans(true);
        boolean boolean22 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setDataSourceClassName("HikariPool-674");
        java.util.Properties properties25 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-10669", (java.lang.Object) hikariConfig13);
        java.lang.String str27 = hikariConfig0.getConnectionCustomizerClassName();
        long long28 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
    }

    @Test
    public void test21547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21547");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setMaxLifetime((long) 97);
        java.lang.String str21 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test21548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21548");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-19827");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test21549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21549");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAcquireRetryDelay(750L);
        hikariConfig1.setAcquireRetries(32);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test21550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21550");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test21551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21551");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-4919");
        long long11 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig12.getCatalog();
        java.lang.String str17 = hikariConfig12.getCatalog();
        hikariConfig12.setPoolName("");
        java.lang.String str20 = hikariConfig12.getConnectionInitSql();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        long long23 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 750L + "'", long23 == 750L);
    }

    @Test
    public void test21552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21552");
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
        int int14 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setAcquireRetries((int) (byte) 1);
        long long17 = hikariConfig13.getMaxLifetime();
        hikariConfig13.setReadOnly(false);
        java.lang.String str20 = hikariConfig13.getConnectionInitSql();
        java.lang.String str21 = hikariConfig13.getDataSourceClassName();
        int int22 = hikariConfig13.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test21553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test21554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21554");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout(750L);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        hikariConfig1.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test21555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21555");
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
        boolean boolean36 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test21556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21556");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12235");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12235 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21557");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test21558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21558");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("");
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        long long8 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test21559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21559");
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
        boolean boolean33 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-6923");
        java.lang.String str36 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource37 = null;
        hikariConfig1.setDataSource(dataSource37);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test21560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21560");
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
        boolean boolean27 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-2296");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test21561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21561");
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
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        hikariConfig17.setReadOnly(false);
        hikariConfig17.setCatalog("");
        hikariConfig17.setJdbc4ConnectionTest(false);
        hikariConfig1.addDataSourceProperty("HikariPool-16704", (java.lang.Object) false);
        boolean boolean29 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test21562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21562");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test21563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21563");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-998");
        long long16 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionTestQuery("HikariPool-2907");
        hikariConfig0.setDataSourceClassName("HikariPool-6271");
        hikariConfig0.setInitializationFailFast(false);
        int int23 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test21564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21564");
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
        long long15 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test21565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21565");
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
        java.lang.String str18 = hikariConfig13.getJdbcUrl();
        long long19 = hikariConfig13.getIdleTimeout();
        hikariConfig13.setAcquireRetries((int) (short) 1);
        hikariConfig13.setIsolateInternalQueries(true);
        long long24 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.setMaxLifetime((long) (short) 0);
        hikariConfig13.setIdleTimeout(60L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 750L + "'", long24 == 750L);
    }

    @Test
    public void test21566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21566");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setMinimumPoolSize(35);
        hikariConfig5.setRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig5.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test21567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21567");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        hikariConfig0.setDataSourceClassName("HikariPool-130");
        hikariConfig0.setCatalog("HikariPool-658");
        hikariConfig0.setMaxLifetime(1800000L);
        hikariConfig0.setIdleTimeout((long) 52);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setDataSourceClassName("HikariPool-77657");
    }

    @Test
    public void test21568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21568");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-151");
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test21569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21569");
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
        hikariConfig1.setMaximumPoolSize(0);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test21570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21570");
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
        int int35 = hikariConfig7.getTransactionIsolation();
        hikariConfig7.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test21571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        long long6 = hikariConfig1.getAcquireRetryDelay();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaximumPoolSize(1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test21572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21572");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        int int9 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setDataSourceClassName("");
        hikariConfig12.setConnectionCustomizerClassName("");
        long long19 = hikariConfig12.getLeakDetectionThreshold();
        int int20 = hikariConfig12.getAcquireIncrement();
        long long21 = hikariConfig12.getAcquireRetryDelay();
        java.util.Properties properties22 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig0.addDataSourceProperty("HikariPool-20533", (java.lang.Object) properties22);
        java.lang.String str25 = hikariConfig0.getPoolName();
        boolean boolean26 = hikariConfig0.isRegisterMbeans();
        long long27 = hikariConfig0.getMaxLifetime();
        int int28 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-93003" + "'", str25, "HikariPool-93003");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test21573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21573");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25428");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25428 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21574");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-65017");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-65017 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21575");
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
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test21576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21576");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-11416");
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIsolateInternalQueries(true);
        int int17 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test21577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21577");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setPoolName("HikariPool-45023");
    }

    @Test
    public void test21578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21578");
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
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-130" + "'", str18, "HikariPool-130");
    }

    @Test
    public void test21579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21579");
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
        hikariConfig34.setIdleTimeout(2147483647L);
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
    public void test21580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21580");
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
        hikariConfig1.setConnectionInitSql("HikariPool-993");
        hikariConfig1.setRegisterMbeans(true);
        int int18 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test21581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21581");
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
        java.lang.String str52 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test21582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21582");
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
        hikariConfig42.setAutoCommit(true);
        hikariConfig42.setTransactionIsolation("HikariPool-19185");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test21583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21583");
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
        boolean boolean21 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setAcquireRetries((int) 'a');
        long long24 = hikariConfig14.getIdleTimeout();
        hikariConfig14.setCatalog("HikariPool-82965");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
    }

    @Test
    public void test21584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21584");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test21585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21585");
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
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21586");
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
        hikariConfig19.setIdleTimeout((long) 0);
        hikariConfig19.setTransactionIsolation("HikariPool-805");
        boolean boolean36 = hikariConfig19.isReadOnly();
        hikariConfig19.setJdbc4ConnectionTest(true);
        hikariConfig19.setMaximumPoolSize(0);
        int int41 = hikariConfig19.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-93044" + "'", str30, "HikariPool-93044");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test21587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21587");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isReadOnly();
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-36895");
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21588");
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
        java.util.Properties properties25 = hikariConfig7.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test21589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21589");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setJdbcUrl("hi!");
        int int16 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.setJdbcUrl("HikariPool-969");
        hikariConfig12.setMinimumPoolSize((int) '#');
        hikariConfig12.setAcquireRetries(1);
        java.lang.String str23 = hikariConfig12.getJdbcUrl();
        java.lang.String str24 = hikariConfig12.getDataSourceClassName();
        hikariConfig0.addDataSourceProperty("HikariPool-6260", (java.lang.Object) hikariConfig12);
        hikariConfig12.setConnectionCustomizerClassName("");
        hikariConfig12.setConnectionTestQuery("HikariPool-68685");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-969" + "'", str23, "HikariPool-969");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test21590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
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
        hikariConfig20.setMaxLifetime(0L);
        java.lang.String str23 = hikariConfig20.getJdbcUrl();
        boolean boolean24 = hikariConfig20.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource25 = hikariConfig20.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        int int27 = hikariConfig26.getAcquireRetries();
        hikariConfig26.setJdbcUrl("hi!");
        hikariConfig26.setMaximumPoolSize((int) ' ');
        java.lang.String str32 = hikariConfig26.getConnectionTestQuery();
        hikariConfig26.setRegisterMbeans(true);
        boolean boolean35 = hikariConfig26.isJdbc4ConnectionTest();
        hikariConfig26.setReadOnly(false);
        java.util.Properties properties38 = hikariConfig26.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties38);
        hikariConfig1.setDataSourceProperties(properties38);
        boolean boolean41 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean42 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test21591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setConnectionTimeout(750L);
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-93057" + "'", str8, "HikariPool-93057");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21592");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
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
        hikariConfig17.setJdbc4ConnectionTest(false);
        long long33 = hikariConfig17.getAcquireRetryDelay();
        long long34 = hikariConfig17.getConnectionTimeout();
        long long35 = hikariConfig17.getMaxLifetime();
        hikariConfig17.setConnectionInitSql("HikariPool-34103");
        hikariConfig0.addDataSourceProperty("HikariPool-92208", (java.lang.Object) "HikariPool-34103");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 750L + "'", long33 == 750L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
    }

    @Test
    public void test21593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21593");
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
        int int20 = hikariConfig0.getAcquireRetries();
        boolean boolean21 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test21594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21594");
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
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-62272");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test21595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaximumPoolSize(0);
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIdleTimeout((long) 10);
        hikariConfig1.setJdbcUrl("HikariPool-91574");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test21596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21596");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test21597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21597");
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
        java.lang.String str63 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-36542");
        java.lang.String str66 = hikariConfig1.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test21598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21598");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-658");
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        int int11 = hikariConfig0.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21599");
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
        javax.sql.DataSource dataSource49 = null;
        hikariConfig42.setDataSource(dataSource49);
        hikariConfig42.setRegisterMbeans(true);
        java.lang.Class<?> wildcardClass53 = hikariConfig42.getClass();
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-1636" + "'", str48, "HikariPool-1636");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test21600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21600");
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
        java.lang.String str53 = hikariConfig0.getPoolName();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setReadOnly(true);
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
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "HikariPool-93081" + "'", str53, "HikariPool-93081");
    }

    @Test
    public void test21601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21601");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setJdbcUrl("HikariPool-26397");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test21602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21602");
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
        int int29 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        boolean boolean32 = hikariConfig0.isRegisterMbeans();
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
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-93090" + "'", str26, "HikariPool-93090");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test21603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21603");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setCatalog("");
        hikariConfig0.setIdleTimeout((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test21604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21604");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-75672");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-75672 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21605");
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
        int int22 = hikariConfig1.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-74340");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-74340' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test21606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21606");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setConnectionInitSql("");
        boolean boolean22 = hikariConfig19.isJdbc4ConnectionTest();
        hikariConfig19.setJdbcUrl("hi!");
        boolean boolean25 = hikariConfig19.isJdbc4ConnectionTest();
        hikariConfig19.setTransactionIsolation("HikariPool-102");
        hikariConfig19.setCatalog("");
        java.lang.String str30 = hikariConfig19.getConnectionTestQuery();
        long long31 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.setTransactionIsolation("HikariPool-1636");
        hikariConfig19.setAcquireIncrement((int) (short) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str38 = hikariConfig37.getConnectionInitSql();
        boolean boolean39 = hikariConfig37.isInitializationFailFast();
        boolean boolean40 = hikariConfig37.isJdbc4ConnectionTest();
        int int41 = hikariConfig37.getTransactionIsolation();
        hikariConfig19.addDataSourceProperty("HikariPool-4919", (java.lang.Object) hikariConfig37);
        java.lang.String str43 = hikariConfig37.getPoolName();
        hikariConfig37.setAcquireRetries(35);
        boolean boolean46 = hikariConfig37.isJdbc4ConnectionTest();
        java.util.Properties properties47 = hikariConfig37.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties47);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 750L + "'", long31 == 750L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-93102" + "'", str43, "HikariPool-93102");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test21607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21607");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setConnectionTimeout(750L);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        long long9 = hikariConfig1.getMaxLifetime();
        boolean boolean10 = hikariConfig1.isReadOnly();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaximumPoolSize((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test21608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21608");
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
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int13 = hikariConfig12.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test21609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21609");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        hikariConfig0.setMaxLifetime((long) (short) 100);
        long long9 = hikariConfig0.getAcquireRetryDelay();
        int int10 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaximumPoolSize(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test21610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21610");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        hikariConfig1.setAcquireIncrement((int) ' ');
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean12 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21611");
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
        hikariConfig13.setReadOnly(true);
        java.lang.String str23 = hikariConfig13.getConnectionTestQuery();
        long long24 = hikariConfig13.getConnectionTimeout();
        long long25 = hikariConfig13.getLeakDetectionThreshold();
        long long26 = hikariConfig13.getMaxLifetime();
        boolean boolean27 = hikariConfig13.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test21612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21612");
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
        hikariConfig0.setIdleTimeout(0L);
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        int int21 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-102" + "'", str20, "HikariPool-102");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test21613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21613");
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
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-1745");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties25 = hikariConfig1.getDataSourceProperties();
        java.lang.String str26 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test21614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21614");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIsolateInternalQueries(false);
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        long long12 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test21615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) 100);
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setCatalog("HikariPool-14965");
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test21616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIdleTimeout((long) 35);
        hikariConfig1.setIdleTimeout((long) '#');
        hikariConfig1.setConnectionInitSql("HikariPool-86305");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test21617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21617");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25114");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25114 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21618");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21619");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-59438");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test21620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21620");
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
        int int28 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        boolean boolean32 = hikariConfig31.isReadOnly();
        java.lang.String str33 = hikariConfig31.getDataSourceClassName();
        hikariConfig31.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean36 = hikariConfig31.isAutoCommit();
        hikariConfig31.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean39 = hikariConfig31.isReadOnly();
        hikariConfig31.setMaximumPoolSize((int) ' ');
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-8586");
        hikariConfig0.addDataSourceProperty("HikariPool-14661", (java.lang.Object) hikariConfig31);
        hikariConfig31.setJdbcUrl("HikariPool-44483");
        hikariConfig31.setAcquireRetries(52);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test21621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21621");
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
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isReadOnly();
        hikariConfig1.setLeakDetectionThreshold((long) 52);
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test21622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21622");
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
        java.lang.String str19 = hikariConfig0.getPoolName();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setTransactionIsolation("HikariPool-46050");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-93134" + "'", str19, "HikariPool-93134");
    }

    @Test
    public void test21623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21623");
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
        long long31 = hikariConfig7.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
    }

    @Test
    public void test21624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21624");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        int int14 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setJdbcUrl("hi!");
        hikariConfig13.setAutoCommit(true);
        hikariConfig13.setIdleTimeout(1L);
        hikariConfig13.setConnectionTestQuery("hi!");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isReadOnly();
        java.lang.String str26 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setJdbcUrl("hi!");
        boolean boolean29 = hikariConfig24.isReadOnly();
        hikariConfig24.setTransactionIsolation("HikariPool-158");
        hikariConfig24.setUseInstrumentation(false);
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties34);
        hikariConfig0.setDataSourceProperties(properties34);
        hikariConfig0.setTransactionIsolation("HikariPool-6213");
        boolean boolean39 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTestQuery("HikariPool-8833");
        hikariConfig0.setInitializationFailFast(true);
        int int44 = hikariConfig0.getAcquireRetries();
        long long45 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1800000L + "'", long45 == 1800000L);
    }

    @Test
    public void test21625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        int int9 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setMinimumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test21626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21626");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setConnectionInitSql("");
        boolean boolean22 = hikariConfig19.isJdbc4ConnectionTest();
        java.lang.String str23 = hikariConfig19.getCatalog();
        java.lang.String str24 = hikariConfig19.getConnectionTestQuery();
        hikariConfig19.setLeakDetectionThreshold((long) '4');
        hikariConfig19.setMaxLifetime(5000L);
        long long29 = hikariConfig19.getMaxLifetime();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig32.setTransactionIsolation("");
        javax.sql.DataSource dataSource35 = hikariConfig32.getDataSource();
        long long36 = hikariConfig32.getConnectionTimeout();
        java.lang.String str37 = hikariConfig32.getCatalog();
        hikariConfig32.setInitializationFailFast(false);
        java.util.Properties properties40 = hikariConfig32.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig19.addDataSourceProperty("HikariPool-1276", (java.lang.Object) properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test21627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21627");
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
        int int17 = hikariConfig13.getMaximumPoolSize();
        hikariConfig13.setMaximumPoolSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.setConnectionTimeout((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test21628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-3083");
        java.lang.String str6 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-93152" + "'", str6, "HikariPool-93152");
    }

    @Test
    public void test21629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21629");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-33691");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test21630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21630");
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long28 = hikariConfig27.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
    }

    @Test
    public void test21631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21631");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-2705");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-14506");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-14506' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
    }

    @Test
    public void test21632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21632");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries((int) ' ');
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21633");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        int int6 = hikariConfig0.getAcquireRetries();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIdleTimeout(1800000L);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test21634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21634");
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
        hikariConfig0.setPoolName("HikariPool-18254");
        java.lang.String str25 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test21635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21635");
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
        int int18 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.setMaxLifetime((long) (short) -1);
        long long23 = hikariConfig13.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test21636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21636");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        long long7 = hikariConfig0.getIdleTimeout();
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test21637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21637");
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
        boolean boolean17 = hikariConfig14.isInitializationFailFast();
        boolean boolean18 = hikariConfig14.isJdbc4ConnectionTest();
        java.lang.String str19 = hikariConfig14.getJdbcUrl();
        boolean boolean20 = hikariConfig14.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21638");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-90359");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test21639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21639");
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
        int int21 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str22 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-93180" + "'", str22, "HikariPool-93180");
    }

    @Test
    public void test21640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21640");
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
        boolean boolean33 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-6923");
        java.lang.String str36 = hikariConfig1.getConnectionInitSql();
        boolean boolean37 = hikariConfig1.isInitializationFailFast();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test21641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21641");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMaxLifetime(0L);
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test21642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21642");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-92827");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-92827 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21643");
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
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str20 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-93186" + "'", str14, "HikariPool-93186");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test21644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21644");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setTransactionIsolation("");
        javax.sql.DataSource dataSource11 = hikariConfig8.getDataSource();
        long long12 = hikariConfig8.getConnectionTimeout();
        java.lang.String str13 = hikariConfig8.getCatalog();
        hikariConfig8.setInitializationFailFast(false);
        java.util.Properties properties16 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig1.setDataSourceProperties(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.util.Properties properties22 = hikariConfig21.getDataSourceProperties();
        hikariConfig21.setIsolateInternalQueries(true);
        boolean boolean25 = hikariConfig21.isInitializationFailFast();
        boolean boolean26 = hikariConfig21.isIsolateInternalQueries();
        int int27 = hikariConfig21.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test21645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21645");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setPoolName("HikariPool-1636");
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test21646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21646");
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
        hikariConfig1.setTransactionIsolation("HikariPool-7993");
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
        hikariConfig57.setAcquireRetries((int) (short) 1);
        boolean boolean60 = hikariConfig57.isReadOnly();
        int int61 = hikariConfig57.getAcquireRetries();
        boolean boolean62 = hikariConfig57.isInitializationFailFast();
        hikariConfig57.setTransactionIsolation("HikariPool-2635");
        javax.sql.DataSource dataSource65 = hikariConfig57.getDataSource();
        long long66 = hikariConfig57.getIdleTimeout();
        int int67 = hikariConfig57.getMinimumPoolSize();
        hikariConfig57.setIsolateInternalQueries(false);
        hikariConfig1.addDataSourceProperty("HikariPool-33049", (java.lang.Object) false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 600000L + "'", long66 == 600000L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test21647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21647");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setJdbcUrl("hi!");
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test21648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21648");
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
        boolean boolean17 = hikariConfig1.isReadOnly();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setLeakDetectionThreshold(52L);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.setDataSource(dataSource22);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21649");
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
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setTransactionIsolation("HikariPool-12708");
        java.lang.String str19 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test21650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21650");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21651");
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
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test21652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21652");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-71600");
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test21653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setTransactionIsolation("");
        javax.sql.DataSource dataSource11 = hikariConfig8.getDataSource();
        long long12 = hikariConfig8.getConnectionTimeout();
        java.lang.String str13 = hikariConfig8.getCatalog();
        hikariConfig8.setInitializationFailFast(false);
        java.util.Properties properties16 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig1.setDataSourceProperties(properties16);
        java.lang.String str21 = hikariConfig1.getCatalog();
        long long22 = hikariConfig1.getAcquireRetryDelay();
        int int23 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties24 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionTimeout((long) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-48764");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test21654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21654");
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
        long long27 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-93216" + "'", str24, "HikariPool-93216");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
    }

    @Test
    public void test21655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21655");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        hikariConfig1.setMinimumPoolSize((int) ' ');
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        boolean boolean11 = hikariConfig1.isReadOnly();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-54173");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test21656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21656");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setMaxLifetime(600000L);
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21657");
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
        hikariConfig0.setTransactionIsolation("HikariPool-13106");
        long long41 = hikariConfig0.getAcquireRetryDelay();
        int int42 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 750L + "'", long41 == 750L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test21658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test21659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21659");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-47888");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-47888' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test21660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21660");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-86410");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-86410 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21661");
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
        int int24 = hikariConfig23.getAcquireIncrement();
        java.lang.String str25 = hikariConfig23.getDataSourceClassName();
        long long26 = hikariConfig23.getMaxLifetime();
        hikariConfig23.setDataSourceClassName("HikariPool-13120");
        java.lang.String str29 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setIdleTimeout((long) (short) 1);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-13120" + "'", str29, "HikariPool-13120");
    }

    @Test
    public void test21662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21662");
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
        java.lang.String str47 = hikariConfig42.getCatalog();
        boolean boolean48 = hikariConfig42.isReadOnly();
        hikariConfig42.setReadOnly(false);
        boolean boolean51 = hikariConfig42.isRegisterMbeans();
        int int52 = hikariConfig42.getAcquireIncrement();
        hikariConfig42.setIdleTimeout((long) (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test21663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21663");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-2705");
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        hikariConfig11.setJdbcUrl("hi!");
        boolean boolean17 = hikariConfig11.isJdbc4ConnectionTest();
        long long18 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.setAcquireIncrement(100);
        boolean boolean21 = hikariConfig11.isReadOnly();
        boolean boolean22 = hikariConfig11.isIsolateInternalQueries();
        int int23 = hikariConfig11.getAcquireRetries();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isReadOnly();
        java.lang.String str27 = hikariConfig25.getDataSourceClassName();
        hikariConfig25.setJdbcUrl("hi!");
        boolean boolean30 = hikariConfig25.isReadOnly();
        hikariConfig25.setTransactionIsolation("HikariPool-158");
        hikariConfig25.setUseInstrumentation(false);
        java.util.Properties properties35 = hikariConfig25.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties35);
        java.lang.String str37 = hikariConfig11.getPoolName();
        java.lang.String str38 = hikariConfig11.getPoolName();
        long long39 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig0.addDataSourceProperty("HikariPool-130", (java.lang.Object) hikariConfig11);
        java.lang.String str41 = hikariConfig11.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(properties35);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-93243" + "'", str37, "HikariPool-93243");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-93243" + "'", str38, "HikariPool-93243");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 750L + "'", long39 == 750L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test21664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21664");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-86912");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-86912 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21665");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-761");
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test21666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21666");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setIsolateInternalQueries(false);
        int int16 = hikariConfig1.getMinimumPoolSize();
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test21667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21667");
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
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test21668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21668");
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
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        hikariConfig0.setMaximumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
    }

    @Test
    public void test21669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21669");
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
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setCatalog("HikariPool-12613");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21670");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        int int8 = hikariConfig1.getAcquireRetries();
        boolean boolean9 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test21671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21671");
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
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-2544");
        hikariConfig1.setMaxLifetime((long) ' ');
        hikariConfig1.setPoolName("HikariPool-658");
        hikariConfig1.setConnectionInitSql("HikariPool-8143");
        int int27 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties28 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test21672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21672");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAcquireRetryDelay((long) 3);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig11.setAcquireIncrement(100);
        hikariConfig11.setReadOnly(true);
        long long21 = hikariConfig11.getIdleTimeout();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setTransactionIsolation("");
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.setTransactionIsolation("");
        javax.sql.DataSource dataSource30 = hikariConfig27.getDataSource();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setConnectionInitSql("");
        hikariConfig33.setJdbcUrl("");
        hikariConfig33.setConnectionTestQuery("hi!");
        hikariConfig27.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig33);
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig42.setConnectionInitSql("");
        hikariConfig42.setJdbcUrl("");
        hikariConfig42.setConnectionTestQuery("hi!");
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig50.setTransactionIsolation("");
        javax.sql.DataSource dataSource53 = hikariConfig50.getDataSource();
        long long54 = hikariConfig50.getConnectionTimeout();
        java.lang.String str55 = hikariConfig50.getCatalog();
        hikariConfig50.setInitializationFailFast(false);
        java.util.Properties properties58 = hikariConfig50.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig42.setDataSourceProperties(properties58);
        hikariConfig27.setDataSourceProperties(properties58);
        hikariConfig23.setDataSourceProperties(properties58);
        hikariConfig11.setDataSourceProperties(properties58);
        hikariConfig0.setDataSourceProperties(properties58);
        javax.sql.DataSource dataSource66 = null;
        hikariConfig0.setDataSource(dataSource66);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertNull(dataSource53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 5000L + "'", long54 == 5000L);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test21673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21673");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIdleTimeout((long) 52);
        hikariConfig0.setMaximumPoolSize((int) (byte) 10);
        hikariConfig0.setConnectionTestQuery("HikariPool-23757");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test21674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21674");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-6202");
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21675");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3343");
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("HikariPool-6793");
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test21676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        int int10 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbcUrl("HikariPool-3292");
        hikariConfig1.setPoolName("HikariPool-3107");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-3292");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test21677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21677");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig8.setPoolName("HikariPool-13086");
        hikariConfig8.setReadOnly(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test21678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21678");
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
        hikariConfig28.setMaxLifetime((long) 60);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test21679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21679");
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
        java.lang.String str25 = hikariConfig1.getJdbcUrl();
        hikariConfig1.addDataSourceProperty("HikariPool-74851", (java.lang.Object) "HikariPool-25286");
        java.lang.String str29 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-158" + "'", str25, "HikariPool-158");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-158" + "'", str29, "HikariPool-158");
    }

    @Test
    public void test21680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21680");
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
        boolean boolean18 = hikariConfig13.isRegisterMbeans();
        hikariConfig13.setUseInstrumentation(false);
        boolean boolean21 = hikariConfig13.isRegisterMbeans();
        java.lang.String str22 = hikariConfig13.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test21681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21681");
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
        hikariConfig1.setMinimumPoolSize(0);
        int int19 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test21682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setCatalog("HikariPool-90363");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21683");
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
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str19 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireIncrement(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-93282" + "'", str19, "HikariPool-93282");
    }

    @Test
    public void test21684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21684");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime(600000L);
        boolean boolean7 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str8 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-93283" + "'", str8, "HikariPool-93283");
    }

    @Test
    public void test21685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21685");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setConnectionInitSql("HikariPool-130");
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-41853");
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        int int18 = hikariConfig0.getMaximumPoolSize();
        int int19 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-130" + "'", str17, "HikariPool-130");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test21686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21686");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        int int9 = hikariConfig1.getTransactionIsolation();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21687");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setTransactionIsolation("HikariPool-932");
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        java.lang.String str14 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setLeakDetectionThreshold((long) '4');
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.setAutoCommit(false);
        java.util.Properties properties21 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setConnectionInitSql("HikariPool-760");
        hikariConfig22.setLeakDetectionThreshold((long) 100);
        int int27 = hikariConfig22.getMaximumPoolSize();
        hikariConfig22.setAcquireRetries((int) '#');
        hikariConfig1.addDataSourceProperty("HikariPool-23015", (java.lang.Object) hikariConfig22);
        javax.sql.DataSource dataSource31 = hikariConfig22.getDataSource();
        int int32 = hikariConfig22.getTransactionIsolation();
        long long33 = hikariConfig22.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
    }

    @Test
    public void test21688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21688");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setPoolName("HikariPool-2635");
        java.lang.String str10 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-15322");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-2635" + "'", str10, "HikariPool-2635");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test21689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21689");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime((long) (short) 100);
        int int9 = hikariConfig1.getAcquireIncrement();
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIdleTimeout((long) 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21690");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        long long19 = hikariConfig15.getConnectionTimeout();
        java.lang.String str20 = hikariConfig15.getCatalog();
        int int21 = hikariConfig15.getTransactionIsolation();
        boolean boolean22 = hikariConfig15.isJdbc4ConnectionTest();
        java.util.Properties properties23 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties23);
        hikariConfig1.setLeakDetectionThreshold((long) 52);
        int int27 = hikariConfig1.getAcquireRetries();
        java.lang.String str28 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.Class<?> wildcardClass29 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test21691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21691");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean19 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-11112");
        java.lang.String str22 = hikariConfig0.getCatalog();
        java.lang.String str23 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test21692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21692");
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
        javax.sql.DataSource dataSource37 = hikariConfig1.getDataSource();
        boolean boolean38 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test21693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21693");
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
        java.lang.String str19 = hikariConfig9.getDataSourceClassName();
        java.lang.String str20 = hikariConfig9.getConnectionCustomizerClassName();
        int int21 = hikariConfig9.getMaximumPoolSize();
        hikariConfig9.setConnectionInitSql("");
        java.lang.Class<?> wildcardClass24 = hikariConfig9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test21694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21694");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        int int11 = hikariConfig10.getAcquireRetries();
        hikariConfig10.setAcquireRetryDelay((long) 0);
        java.lang.String str14 = hikariConfig10.getConnectionCustomizerClassName();
        hikariConfig10.setMaximumPoolSize(0);
        java.lang.String str17 = hikariConfig10.getDataSourceClassName();
        long long18 = hikariConfig10.getMaxLifetime();
        java.util.Properties properties19 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties19);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaximumPoolSize(3);
        hikariConfig0.setIsolateInternalQueries(true);
        int int27 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test21695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-382");
        hikariConfig1.setDataSourceClassName("");
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("");
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        long long14 = hikariConfig1.getMaxLifetime();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-1467");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test21696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21696");
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
        java.lang.String str33 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig34.setConnectionInitSql("");
        boolean boolean37 = hikariConfig34.isJdbc4ConnectionTest();
        java.lang.String str38 = hikariConfig34.getCatalog();
        hikariConfig34.setReadOnly(false);
        java.lang.String str41 = hikariConfig34.getConnectionInitSql();
        hikariConfig34.setIsolateInternalQueries(false);
        hikariConfig34.setAcquireIncrement((int) (byte) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig46.setConnectionInitSql("");
        boolean boolean49 = hikariConfig46.isJdbc4ConnectionTest();
        java.lang.String str50 = hikariConfig46.getCatalog();
        java.lang.String str51 = hikariConfig46.getConnectionTestQuery();
        hikariConfig46.setLeakDetectionThreshold((long) '4');
        hikariConfig46.setRegisterMbeans(false);
        hikariConfig46.setAutoCommit(false);
        java.util.Properties properties58 = hikariConfig46.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig34.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig0.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig66.setMaximumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test21697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21697");
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
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setTransactionIsolation("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21698");
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
        hikariConfig1.setJdbcUrl("HikariPool-44839");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test21699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21699");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setIdleTimeout((long) (short) 10);
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-6131");
        hikariConfig1.setAcquireRetryDelay((long) '#');
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test21700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21700");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setTransactionIsolation("HikariPool-41469");
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test21701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21701");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-151");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3114");
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test21702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21702");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7217");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7217 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21703");
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
        int int11 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isReadOnly();
        java.lang.String str15 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean18 = hikariConfig13.isAutoCommit();
        long long19 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.setDataSourceClassName("HikariPool-158");
        hikariConfig13.setConnectionTimeout((long) (short) 100);
        hikariConfig13.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties26 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties26);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test21704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21704");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        hikariConfig0.setRegisterMbeans(false);
        long long9 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test21705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21705");
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
        int int15 = hikariConfig1.getAcquireRetries();
        boolean boolean16 = hikariConfig1.isReadOnly();
        int int17 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setAcquireRetryDelay((long) (short) 100);
        hikariConfig19.setMinimumPoolSize((int) (byte) 100);
        hikariConfig19.setJdbcUrl("hi!");
        int int26 = hikariConfig19.getAcquireIncrement();
        java.util.Properties properties27 = hikariConfig19.getDataSourceProperties();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setTransactionIsolation("");
        javax.sql.DataSource dataSource32 = null;
        hikariConfig29.setDataSource(dataSource32);
        hikariConfig29.setAutoCommit(false);
        hikariConfig29.setUseInstrumentation(true);
        hikariConfig29.setConnectionCustomizerClassName("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig40.setConnectionInitSql("");
        boolean boolean43 = hikariConfig40.isJdbc4ConnectionTest();
        hikariConfig40.setJdbcUrl("hi!");
        boolean boolean46 = hikariConfig40.isJdbc4ConnectionTest();
        java.lang.String str47 = hikariConfig40.getDataSourceClassName();
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig49.setConnectionInitSql("");
        hikariConfig49.setJdbcUrl("");
        hikariConfig49.setConnectionTestQuery("hi!");
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig57.setTransactionIsolation("");
        javax.sql.DataSource dataSource60 = hikariConfig57.getDataSource();
        long long61 = hikariConfig57.getConnectionTimeout();
        java.lang.String str62 = hikariConfig57.getCatalog();
        hikariConfig57.setInitializationFailFast(false);
        java.util.Properties properties65 = hikariConfig57.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig49.setDataSourceProperties(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig40.setDataSourceProperties(properties65);
        hikariConfig29.setDataSourceProperties(properties65);
        hikariConfig19.setDataSourceProperties(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig1.setDataSourceProperties(properties65);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(dataSource60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 5000L + "'", long61 == 5000L);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(properties65);
    }

    @Test
    public void test21706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21706");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
    }

    @Test
    public void test21707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21707");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test21708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21708");
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
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setTransactionIsolation("");
        javax.sql.DataSource dataSource26 = hikariConfig23.getDataSource();
        long long27 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setPoolName("HikariPool-382");
        hikariConfig23.setDataSourceClassName("");
        hikariConfig23.setConnectionTestQuery("HikariPool-3431");
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig34.setConnectionInitSql("");
        boolean boolean37 = hikariConfig34.isJdbc4ConnectionTest();
        java.lang.String str38 = hikariConfig34.getCatalog();
        hikariConfig34.setReadOnly(false);
        hikariConfig34.setCatalog("");
        java.util.Properties properties43 = hikariConfig34.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        javax.sql.DataSource dataSource46 = null;
        hikariConfig1.setDataSource(dataSource46);
        java.util.Properties properties48 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig50.setConnectionInitSql("");
        boolean boolean53 = hikariConfig50.isJdbc4ConnectionTest();
        hikariConfig50.setJdbcUrl("hi!");
        boolean boolean56 = hikariConfig50.isJdbc4ConnectionTest();
        hikariConfig50.setTransactionIsolation("HikariPool-102");
        hikariConfig50.setCatalog("");
        long long61 = hikariConfig50.getLeakDetectionThreshold();
        hikariConfig50.setRegisterMbeans(true);
        hikariConfig50.setIdleTimeout((long) (short) 10);
        hikariConfig50.setAcquireRetries((int) ' ');
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig69.setConnectionInitSql("");
        java.util.Properties properties72 = hikariConfig69.getDataSourceProperties();
        hikariConfig69.setAcquireRetries((int) 'a');
        hikariConfig50.addDataSourceProperty("HikariPool-14535", (java.lang.Object) hikariConfig69);
        hikariConfig1.addDataSourceProperty("HikariPool-5753", (java.lang.Object) hikariConfig50);
        java.lang.String str77 = hikariConfig50.getConnectionInitSql();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test21709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21709");
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
        int int21 = hikariConfig0.getMinimumPoolSize();
        long long22 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-24172");
        hikariConfig0.setMaxLifetime(32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
    }

    @Test
    public void test21710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21710");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        java.lang.String str2 = hikariConfig0.getPoolName();
        int int3 = hikariConfig0.getMaximumPoolSize();
        int int4 = hikariConfig0.getAcquireRetries();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-93362" + "'", str2, "HikariPool-93362");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
    }

    @Test
    public void test21711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21711");
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
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireIncrement(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test21712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21712");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-960");
        hikariConfig1.setMinimumPoolSize(0);
    }

    @Test
    public void test21713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21713");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-998");
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setDataSourceClassName("HikariPool-58015");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-998" + "'", str14, "HikariPool-998");
    }

    @Test
    public void test21714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21714");
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
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test21716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21716");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        int int10 = hikariConfig0.getMaximumPoolSize();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMaxLifetime((long) ' ');
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test21717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21717");
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
        int int15 = hikariConfig1.getAcquireIncrement();
        long long16 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test21718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21718");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str17 = hikariConfig1.getPoolName();
        int int18 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-93381" + "'", str17, "HikariPool-93381");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test21719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21719");
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
        hikariConfig0.setPoolName("HikariPool-12602");
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setPoolName("HikariPool-81105");
        hikariConfig0.setPoolName("HikariPool-13864");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test21720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21720");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setConnectionTimeout(750L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21721");
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
        boolean boolean32 = hikariConfig0.isRegisterMbeans();
        java.lang.Class<?> wildcardClass33 = hikariConfig0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test21722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21722");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-382");
        hikariConfig1.setConnectionTestQuery("HikariPool-2544");
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test21723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21723");
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
        long long18 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        long long21 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setJdbcUrl("HikariPool-37756");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
    }

    @Test
    public void test21724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21724");
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
        hikariConfig1.setConnectionInitSql("HikariPool-81446");
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
    }

    @Test
    public void test21725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21725");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setPoolName("HikariPool-2635");
        hikariConfig1.setTransactionIsolation("HikariPool-1165");
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime((long) (short) 100);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test21726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21726");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str9 = hikariConfig0.getPoolName();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout(10L);
        hikariConfig0.setTransactionIsolation("HikariPool-54884");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-93392" + "'", str9, "HikariPool-93392");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test21727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbcUrl("HikariPool-151");
        long long12 = hikariConfig1.getMaxLifetime();
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        long long19 = hikariConfig15.getConnectionTimeout();
        java.lang.String str20 = hikariConfig15.getCatalog();
        hikariConfig15.setInitializationFailFast(false);
        java.util.Properties properties23 = hikariConfig15.getDataSourceProperties();
        hikariConfig15.setUseInstrumentation(true);
        java.util.Properties properties26 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig28.setMaximumPoolSize(3);
        int int31 = hikariConfig28.getTransactionIsolation();
        long long32 = hikariConfig28.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
    }

    @Test
    public void test21728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21728");
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
        hikariConfig13.setCatalog("HikariPool-3097");
        int int25 = hikariConfig13.getAcquireIncrement();
        java.lang.String str26 = hikariConfig13.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.setAcquireRetryDelay((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test21729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21729");
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
        hikariConfig0.setAcquireRetries((int) '#');
        hikariConfig0.setConnectionTestQuery("HikariPool-11783");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-35615");
        long long23 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
    }

    @Test
    public void test21730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setInitializationFailFast(true);
        long long13 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test21731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21731");
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
        boolean boolean35 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test21732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21732");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-78545");
        int int14 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test21733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21733");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-26963");
        hikariConfig1.setConnectionInitSql("HikariPool-23106");
        hikariConfig1.setDataSourceClassName("HikariPool-63529");
    }

    @Test
    public void test21734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21734");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setMaxLifetime(5000L);
        long long21 = hikariConfig11.getMaxLifetime();
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
        hikariConfig11.addDataSourceProperty("HikariPool-1276", (java.lang.Object) properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.lang.String str38 = hikariConfig37.getConnectionInitSql();
        hikariConfig0.addDataSourceProperty("HikariPool-6810", (java.lang.Object) hikariConfig37);
        hikariConfig37.setAcquireIncrement(35);
        hikariConfig37.setTransactionIsolation("HikariPool-21153");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test21735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21735");
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
        hikariConfig1.setRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-151");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-93413" + "'", str13, "HikariPool-93413");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test21736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21736");
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
        int int28 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-33663");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-33663' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test21737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21737");
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
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.setTransactionIsolation("");
        javax.sql.DataSource dataSource46 = null;
        hikariConfig43.setDataSource(dataSource46);
        hikariConfig43.setAutoCommit(false);
        int int50 = hikariConfig43.getTransactionIsolation();
        boolean boolean51 = hikariConfig43.isIsolateInternalQueries();
        java.lang.String str52 = hikariConfig43.getPoolName();
        hikariConfig43.setConnectionInitSql("HikariPool-6478");
        int int55 = hikariConfig43.getMaximumPoolSize();
        java.lang.String str56 = hikariConfig43.getJdbcUrl();
        hikariConfig27.addDataSourceProperty("HikariPool-66722", (java.lang.Object) hikariConfig43);
        hikariConfig27.setUseInstrumentation(false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "HikariPool-93421" + "'", str52, "HikariPool-93421");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test21738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21738");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        int int7 = hikariConfig5.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test21739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21739");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setDataSourceClassName("HikariPool-151");
        hikariConfig1.setAcquireRetries(1);
        hikariConfig1.setMaxLifetime((long) (short) 100);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test21740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21740");
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
        int int56 = hikariConfig0.getMinimumPoolSize();
        boolean boolean57 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test21741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21741");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2374");
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21742");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.setTransactionIsolation("HikariPool-47907");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21743");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(true);
        long long21 = hikariConfig0.getMaxLifetime();
        boolean boolean22 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test21744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21744");
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
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setCatalog("HikariPool-27651");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test21745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21745");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setCatalog("HikariPool-25349");
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test21746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21746");
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
        hikariConfig1.setAcquireRetries(97);
        hikariConfig1.setMaxLifetime(3L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
    }

    @Test
    public void test21747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21747");
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
        int int22 = hikariConfig14.getAcquireIncrement();
        boolean boolean23 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setConnectionCustomizerClassName("");
        hikariConfig14.setInitializationFailFast(false);
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-56366");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test21748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setDataSourceClassName("");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test21749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21749");
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
        hikariConfig1.setAcquireIncrement(60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test21750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21750");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-45638");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-45638 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21751");
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
        hikariConfig12.setUseInstrumentation(false);
        hikariConfig12.setMinimumPoolSize(100);
        hikariConfig12.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-93476" + "'", str14, "HikariPool-93476");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test21752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21752");
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
        boolean boolean48 = hikariConfig42.isReadOnly();
        long long49 = hikariConfig42.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1800000L + "'", long49 == 1800000L);
    }

    @Test
    public void test21753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21753");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        boolean boolean6 = hikariConfig1.isReadOnly();
        boolean boolean7 = hikariConfig1.isReadOnly();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIsolateInternalQueries(false);
        int int11 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test21754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21754");
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
        long long32 = hikariConfig7.getConnectionTimeout();
        java.lang.String str33 = hikariConfig7.getCatalog();
        hikariConfig7.setJdbcUrl("HikariPool-6810");
        java.util.Properties properties36 = hikariConfig7.getDataSourceProperties();
        boolean boolean37 = hikariConfig7.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-674" + "'", str31, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-674" + "'", str33, "HikariPool-674");
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test21755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21755");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTimeout(0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test21756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21756");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        long long2 = hikariConfig0.getIdleTimeout();
        boolean boolean3 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize(60);
        int int6 = hikariConfig0.getMaximumPoolSize();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold(1800000L);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setMaxLifetime((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
    }

    @Test
    public void test21757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21757");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test21758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21758");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-658");
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21759");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean9 = hikariConfig1.isReadOnly();
        int int10 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize(35);
        long long13 = hikariConfig1.getMaxLifetime();
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test21760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21760");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test21761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21761");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries(1);
        java.lang.String str12 = hikariConfig0.getPoolName();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        long long14 = hikariConfig0.getConnectionTimeout();
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-93494" + "'", str12, "HikariPool-93494");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test21762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21762");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionInitSql("");
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setJdbcUrl("HikariPool-11342");
        int int21 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test21763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21763");
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
        javax.sql.DataSource dataSource15 = hikariConfig10.getDataSource();
        hikariConfig10.setIsolateInternalQueries(false);
        int int18 = hikariConfig10.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test21764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21764");
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
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test21765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21765");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetryDelay((long) 60);
        long long11 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetryDelay(600000L);
        hikariConfig1.setDataSourceClassName("HikariPool-73576");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test21766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21766");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.setUseInstrumentation(true);
        int int11 = hikariConfig1.getAcquireRetries();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-93500" + "'", str8, "HikariPool-93500");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test21767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21767");
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
        long long41 = hikariConfig40.getConnectionTimeout();
        hikariConfig40.setConnectionTestQuery("HikariPool-5969");
        java.lang.String str44 = hikariConfig40.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test21768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2979");
        boolean boolean13 = hikariConfig1.isAutoCommit();
        int int14 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test21769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21769");
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
        java.util.Properties properties62 = hikariConfig61.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        boolean boolean64 = hikariConfig63.isReadOnly();
        boolean boolean65 = hikariConfig63.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test21770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21770");
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
        hikariConfig1.setMinimumPoolSize(97);
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setAcquireRetryDelay((long) 32);
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test21772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21772");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig15.getConnectionInitSql();
        hikariConfig15.setJdbcUrl("");
        hikariConfig15.setReadOnly(false);
        int int25 = hikariConfig15.getMinimumPoolSize();
        hikariConfig15.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str29 = hikariConfig28.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig30.setConnectionInitSql("");
        boolean boolean33 = hikariConfig30.isJdbc4ConnectionTest();
        java.lang.String str34 = hikariConfig30.getCatalog();
        java.lang.String str35 = hikariConfig30.getConnectionTestQuery();
        hikariConfig30.setLeakDetectionThreshold((long) '4');
        long long38 = hikariConfig30.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig39.setConnectionInitSql("");
        boolean boolean42 = hikariConfig39.isJdbc4ConnectionTest();
        java.lang.String str43 = hikariConfig39.getCatalog();
        java.lang.String str44 = hikariConfig39.getConnectionTestQuery();
        hikariConfig39.setLeakDetectionThreshold((long) '4');
        hikariConfig39.setRegisterMbeans(false);
        hikariConfig39.setAutoCommit(false);
        java.util.Properties properties51 = hikariConfig39.getDataSourceProperties();
        hikariConfig30.setDataSourceProperties(properties51);
        hikariConfig28.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig15.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig0.setDataSourceProperties(properties51);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 750L + "'", long38 == 750L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test21773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21773");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setTransactionIsolation("HikariPool-993");
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test21774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21774");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
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
        hikariConfig30.setMinimumPoolSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test21775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21775");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAcquireIncrement((int) 'a');
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        int int10 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test21776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21776");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setReadOnly(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionInitSql("HikariPool-2302");
        hikariConfig0.setIdleTimeout((long) 35);
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test21777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setLeakDetectionThreshold((long) ' ');
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setAcquireRetryDelay((long) 0);
        hikariConfig12.setReadOnly(true);
        hikariConfig12.setInitializationFailFast(true);
        hikariConfig12.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig12.setCatalog("hi!");
        javax.sql.DataSource dataSource24 = hikariConfig12.getDataSource();
        java.lang.String str25 = hikariConfig12.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig27.setConnectionInitSql("");
        boolean boolean30 = hikariConfig27.isJdbc4ConnectionTest();
        java.lang.String str31 = hikariConfig27.getCatalog();
        long long32 = hikariConfig27.getIdleTimeout();
        hikariConfig27.setJdbcUrl("HikariPool-130");
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig35.setConnectionInitSql("");
        boolean boolean38 = hikariConfig35.isJdbc4ConnectionTest();
        hikariConfig35.setJdbcUrl("hi!");
        boolean boolean41 = hikariConfig35.isJdbc4ConnectionTest();
        java.lang.String str42 = hikariConfig35.getDataSourceClassName();
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
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig35.setDataSourceProperties(properties60);
        hikariConfig27.setDataSourceProperties(properties60);
        hikariConfig12.addDataSourceProperty("HikariPool-5886", (java.lang.Object) properties60);
        hikariConfig1.setDataSourceProperties(properties60);
        long long69 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 5000L + "'", long56 == 5000L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 750L + "'", long69 == 750L);
    }

    @Test
    public void test21778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21778");
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
        long long21 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test21779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21779");
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
        hikariConfig1.setIdleTimeout((long) 97);
        hikariConfig1.setIdleTimeout(10L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test21780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21780");
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
        long long19 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties20 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test21781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21781");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-32253");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-32253 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21782");
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
        hikariConfig15.setJdbcUrl("HikariPool-9134");
        boolean boolean20 = hikariConfig15.isIsolateInternalQueries();
        boolean boolean21 = hikariConfig15.isJdbc4ConnectionTest();
        long long22 = hikariConfig15.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test21783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21783");
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
        java.lang.String str19 = hikariConfig14.getCatalog();
        long long20 = hikariConfig14.getMaxLifetime();
        hikariConfig14.setMinimumPoolSize((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = hikariConfig14.getClass();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-919" + "'", str19, "HikariPool-919");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test21784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21784");
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
        int int22 = hikariConfig21.getMinimumPoolSize();
        hikariConfig21.setConnectionCustomizerClassName("HikariPool-9268");
        hikariConfig21.setJdbcUrl("");
        java.lang.String str27 = hikariConfig21.getDataSourceClassName();
        long long28 = hikariConfig21.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 750L + "'", long28 == 750L);
    }

    @Test
    public void test21785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21785");
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
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setMinimumPoolSize(1);
        java.lang.Class<?> wildcardClass25 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test21786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setReadOnly(true);
        java.lang.String str9 = hikariConfig1.getPoolName();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setCatalog("HikariPool-14948");
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-93564" + "'", str9, "HikariPool-93564");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test21787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21787");
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
        hikariConfig0.setCatalog("HikariPool-83362");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-93565" + "'", str14, "HikariPool-93565");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21788");
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
        long long15 = hikariConfig0.getIdleTimeout();
        long long16 = hikariConfig0.getIdleTimeout();
        int int17 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test21789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21789");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig16.setConnectionInitSql("");
        boolean boolean19 = hikariConfig16.isJdbc4ConnectionTest();
        java.lang.String str20 = hikariConfig16.getCatalog();
        java.lang.String str21 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setLeakDetectionThreshold((long) '4');
        hikariConfig16.setMaxLifetime(5000L);
        hikariConfig16.setAcquireRetries((int) (short) 1);
        java.util.Properties properties28 = hikariConfig16.getDataSourceProperties();
        java.lang.String str29 = hikariConfig16.getConnectionCustomizerClassName();
        hikariConfig16.setConnectionInitSql("HikariPool-102");
        hikariConfig16.setAcquireIncrement(10);
        int int34 = hikariConfig16.getMaximumPoolSize();
        long long35 = hikariConfig16.getMaxLifetime();
        java.util.Properties properties36 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties36);
        hikariConfig1.setMaxLifetime(52L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test21790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21790");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime(5000L);
        int int9 = hikariConfig1.getAcquireRetries();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setPoolName("HikariPool-12100");
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setMaxLifetime(100L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21791");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        java.lang.String str7 = hikariConfig0.getPoolName();
        int int8 = hikariConfig0.getAcquireIncrement();
        int int9 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAcquireRetries((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-17728");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-17728' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-93570" + "'", str7, "HikariPool-93570");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test21792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21792");
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
        hikariConfig1.setDataSourceClassName("HikariPool-27193");
        hikariConfig1.setDataSourceClassName("HikariPool-68978");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21793");
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
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
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
    public void test21794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21794");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        int int7 = hikariConfig0.getMaximumPoolSize();
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setTransactionIsolation("HikariPool-45765");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test21795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21795");
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
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaximumPoolSize(0);
        long long19 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
    }

    @Test
    public void test21796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21796");
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
        hikariConfig0.setAcquireRetries(32);
        java.lang.String str17 = hikariConfig0.getCatalog();
        hikariConfig0.setCatalog("HikariPool-3110");
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-566" + "'", str14, "HikariPool-566");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-566" + "'", str17, "HikariPool-566");
    }

    @Test
    public void test21797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21797");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIdleTimeout((long) 10);
        long long8 = hikariConfig1.getMaxLifetime();
        int int9 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test21798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21798");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test21799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21799");
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
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        int int16 = hikariConfig1.getMaximumPoolSize();
        int int17 = hikariConfig1.getMaximumPoolSize();
        int int18 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test21800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setConnectionTimeout(750L);
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str11 = hikariConfig1.getPoolName();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-93590" + "'", str8, "HikariPool-93590");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-93590" + "'", str11, "HikariPool-93590");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test21801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21801");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(true);
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test21802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21802");
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
        hikariConfig38.setPoolName("HikariPool-6471");
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig44.setTransactionIsolation("");
        javax.sql.DataSource dataSource47 = hikariConfig44.getDataSource();
        long long48 = hikariConfig44.getConnectionTimeout();
        java.lang.String str49 = hikariConfig44.getCatalog();
        hikariConfig44.setInitializationFailFast(false);
        java.util.Properties properties52 = hikariConfig44.getDataSourceProperties();
        hikariConfig44.setUseInstrumentation(true);
        java.util.Properties properties55 = hikariConfig44.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig56.setConnectionInitSql("HikariPool-932");
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig60.setTransactionIsolation("");
        javax.sql.DataSource dataSource63 = hikariConfig60.getDataSource();
        long long64 = hikariConfig60.getConnectionTimeout();
        java.lang.String str65 = hikariConfig60.getCatalog();
        hikariConfig60.setInitializationFailFast(false);
        java.util.Properties properties68 = hikariConfig60.getDataSourceProperties();
        hikariConfig56.setDataSourceProperties(properties68);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties68);
        boolean boolean71 = hikariConfig70.isInitializationFailFast();
        java.lang.String str72 = hikariConfig70.getPoolName();
        java.util.Properties properties73 = hikariConfig70.getDataSourceProperties();
        hikariConfig38.setDataSourceProperties(properties73);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 5000L + "'", long48 == 5000L);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 5000L + "'", long64 == 5000L);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "HikariPool-93604" + "'", str72, "HikariPool-93604");
        org.junit.Assert.assertNotNull(properties73);
    }

    @Test
    public void test21803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21803");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        long long10 = hikariConfig0.getMaxLifetime();
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
        hikariConfig0.addDataSourceProperty("HikariPool-1276", (java.lang.Object) properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str27 = hikariConfig26.getConnectionInitSql();
        hikariConfig26.setMaxLifetime((long) 'a');
        hikariConfig26.setLeakDetectionThreshold((long) 52);
        int int32 = hikariConfig26.getMaximumPoolSize();
        boolean boolean33 = hikariConfig26.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test21804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig1.getAcquireIncrement();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setAcquireRetries(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test21805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21805");
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
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-58168", obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test21806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21806");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str14 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-93614" + "'", str14, "HikariPool-93614");
    }

    @Test
    public void test21807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21807");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setTransactionIsolation("HikariPool-993");
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setTransactionIsolation("");
        long long21 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig18.setAcquireIncrement(100);
        hikariConfig18.setReadOnly(true);
        hikariConfig18.setJdbcUrl("HikariPool-151");
        hikariConfig18.setDataSourceClassName("HikariPool-674");
        java.lang.String str32 = hikariConfig18.getDataSourceClassName();
        hikariConfig18.setMaxLifetime((long) (short) -1);
        boolean boolean35 = hikariConfig18.isJdbc4ConnectionTest();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setTransactionIsolation("");
        javax.sql.DataSource dataSource40 = hikariConfig37.getDataSource();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.setConnectionInitSql("");
        hikariConfig43.setJdbcUrl("");
        hikariConfig43.setConnectionTestQuery("hi!");
        hikariConfig37.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig43);
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setConnectionInitSql("");
        hikariConfig52.setJdbcUrl("");
        hikariConfig52.setConnectionTestQuery("hi!");
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig60.setTransactionIsolation("");
        javax.sql.DataSource dataSource63 = hikariConfig60.getDataSource();
        long long64 = hikariConfig60.getConnectionTimeout();
        java.lang.String str65 = hikariConfig60.getCatalog();
        hikariConfig60.setInitializationFailFast(false);
        java.util.Properties properties68 = hikariConfig60.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties68);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties68);
        hikariConfig52.setDataSourceProperties(properties68);
        hikariConfig37.setDataSourceProperties(properties68);
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties68);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties68);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties68);
        hikariConfig18.setDataSourceProperties(properties68);
        java.util.Properties properties77 = hikariConfig18.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties77);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-93615" + "'", str13, "HikariPool-93615");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-674" + "'", str32, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 5000L + "'", long64 == 5000L);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNotNull(properties77);
    }

    @Test
    public void test21808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21808");
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
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDataSourceProperties(properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21809");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean9 = hikariConfig1.isReadOnly();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test21810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21810");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-9739");
        hikariConfig1.setAcquireRetryDelay(100L);
        hikariConfig1.setDataSourceClassName("HikariPool-13535");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-59760");
    }

    @Test
    public void test21811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21811");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-67824");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-67824 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21812");
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
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test21813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21813");
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
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-90826");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21814");
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
        hikariConfig1.setInitializationFailFast(false);
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test21815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21815");
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
        hikariConfig11.setTransactionIsolation("");
        hikariConfig11.setPoolName("HikariPool-14820");
        hikariConfig11.setIsolateInternalQueries(false);
        java.util.Properties properties24 = hikariConfig11.getDataSourceProperties();
        long long25 = hikariConfig11.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
    }

    @Test
    public void test21816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21816");
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
        java.lang.String str36 = hikariConfig1.getConnectionInitSql();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-20980" + "'", str36, "HikariPool-20980");
    }

    @Test
    public void test21817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getConnectionTimeout();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test21818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21818");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-960");
        long long10 = hikariConfig1.getConnectionTimeout();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        int int12 = hikariConfig1.getAcquireRetries();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaximumPoolSize(52);
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test21819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize(3);
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setReadOnly(true);
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setDataSourceClassName("HikariPool-87150");
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-93642" + "'", str5, "HikariPool-93642");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test21820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21820");
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
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
    }

    @Test
    public void test21821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21821");
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
        long long15 = hikariConfig0.getAcquireRetryDelay();
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test21822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21822");
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
        boolean boolean18 = hikariConfig13.isReadOnly();
        hikariConfig13.setConnectionTestQuery("HikariPool-8389");
        int int21 = hikariConfig13.getMaximumPoolSize();
        hikariConfig13.setPoolName("HikariPool-12547");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test21823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21823");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getMinimumPoolSize();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21824");
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
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties27);
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
    }

    @Test
    public void test21825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21825");
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
        boolean boolean24 = hikariConfig23.isJdbc4ConnectionTest();
        java.lang.String str25 = hikariConfig23.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test21826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test21827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21827");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-87878");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-87878 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21828");
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
        int int17 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str18 = hikariConfig1.getJdbcUrl();
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test21829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21829");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setPoolName("HikariPool-382");
        hikariConfig0.setJdbcUrl("HikariPool-151");
        hikariConfig0.setConnectionInitSql("HikariPool-627");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test21830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21830");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-998");
        long long16 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setDataSourceClassName("HikariPool-7312");
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetries((int) ' ');
        boolean boolean23 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test21831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21831");
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
        int int13 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-22243");
        long long18 = hikariConfig1.getMaxLifetime();
        int int19 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test21832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21832");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        java.lang.String str2 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("HikariPool-21020");
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test21833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21833");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setReadOnly(true);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.addDataSourceProperty("HikariPool-823", (java.lang.Object) "HikariPool-5848");
        long long13 = hikariConfig0.getConnectionTimeout();
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        long long15 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test21834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21834");
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
        hikariConfig1.setAcquireRetryDelay((long) 100);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test21835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21835");
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
        java.lang.String str27 = hikariConfig1.getConnectionCustomizerClassName();
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-93666" + "'", str18, "HikariPool-93666");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-4454" + "'", str23, "HikariPool-4454");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-4454" + "'", str27, "HikariPool-4454");
    }

    @Test
    public void test21836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21836");
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
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setMaxLifetime(52L);
        hikariConfig1.setMaxLifetime((long) 60);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test21837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21837");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean12 = hikariConfig0.isAutoCommit();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setIdleTimeout((long) (short) 10);
        int int17 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-29291");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test21838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21838");
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
        int int14 = hikariConfig1.getAcquireIncrement();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-15743");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-20361");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test21839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21839");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        long long7 = hikariConfig0.getIdleTimeout();
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test21840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21840");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) '4');
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionTestQuery("HikariPool-23629");
        java.lang.String str14 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21841");
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
        boolean boolean60 = hikariConfig1.isReadOnly();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setIdleTimeout((long) ' ');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test21842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) 100);
    }

    @Test
    public void test21843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21843");
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
        long long23 = hikariConfig22.getMaxLifetime();
        java.lang.String str24 = hikariConfig22.getConnectionCustomizerClassName();
        hikariConfig22.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test21844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21844");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize(3);
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setReadOnly(true);
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireIncrement((int) '#');
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-93690" + "'", str5, "HikariPool-93690");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test21845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21845");
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
        java.lang.String str12 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test21846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21846");
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
        java.lang.String str17 = hikariConfig0.getCatalog();
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.setIdleTimeout((long) ' ');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test21847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21847");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setCatalog("");
        hikariConfig1.setCatalog("HikariPool-674");
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int13 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setAcquireRetryDelay((long) (short) 100);
        hikariConfig17.setAcquireRetryDelay(100L);
        hikariConfig17.setMaxLifetime(0L);
        javax.sql.DataSource dataSource24 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionInitSql("HikariPool-36002");
        hikariConfig1.addDataSourceProperty("HikariPool-86081", (java.lang.Object) hikariConfig17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test21848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21848");
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
        hikariConfig13.setAcquireRetryDelay((long) 1);
        java.lang.String str26 = hikariConfig13.getPoolName();
        hikariConfig13.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-93699" + "'", str26, "HikariPool-93699");
    }

    @Test
    public void test21849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21849");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test21850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21850");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        int int14 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setJdbcUrl("hi!");
        hikariConfig13.setAutoCommit(true);
        hikariConfig13.setIdleTimeout(1L);
        hikariConfig13.setConnectionTestQuery("hi!");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isReadOnly();
        java.lang.String str26 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setJdbcUrl("hi!");
        boolean boolean29 = hikariConfig24.isReadOnly();
        hikariConfig24.setTransactionIsolation("HikariPool-158");
        hikariConfig24.setUseInstrumentation(false);
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties34);
        hikariConfig0.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig38.setTransactionIsolation("HikariPool-1428");
        hikariConfig38.setAcquireRetries((int) (short) 0);
        hikariConfig38.setJdbcUrl("HikariPool-61492");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test21851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21851");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        int int10 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setInitializationFailFast(false);
        long long16 = hikariConfig1.getMaxLifetime();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test21852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21852");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test21853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21853");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbcUrl("HikariPool-761");
        java.lang.String str12 = hikariConfig0.getPoolName();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        int int15 = hikariConfig14.getAcquireRetries();
        hikariConfig14.setAcquireRetryDelay((long) 0);
        java.lang.String str18 = hikariConfig14.getJdbcUrl();
        hikariConfig14.setJdbc4ConnectionTest(false);
        hikariConfig14.setJdbc4ConnectionTest(true);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setConnectionInitSql("");
        hikariConfig24.setJdbcUrl("");
        javax.sql.DataSource dataSource29 = null;
        hikariConfig24.setDataSource(dataSource29);
        hikariConfig24.setInitializationFailFast(false);
        hikariConfig24.setAcquireRetries((int) (short) 10);
        java.lang.String str35 = hikariConfig24.getCatalog();
        int int36 = hikariConfig24.getMaximumPoolSize();
        boolean boolean37 = hikariConfig24.isIsolateInternalQueries();
        boolean boolean38 = hikariConfig24.isAutoCommit();
        java.lang.String str39 = hikariConfig24.getConnectionTestQuery();
        hikariConfig24.setConnectionTestQuery("HikariPool-5753");
        boolean boolean42 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setIsolateInternalQueries(true);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig46.setTransactionIsolation("");
        javax.sql.DataSource dataSource49 = hikariConfig46.getDataSource();
        long long50 = hikariConfig46.getConnectionTimeout();
        hikariConfig46.setPoolName("HikariPool-382");
        hikariConfig46.setDataSourceClassName("");
        hikariConfig46.setConnectionTestQuery("HikariPool-3431");
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig57.setConnectionInitSql("");
        boolean boolean60 = hikariConfig57.isJdbc4ConnectionTest();
        java.lang.String str61 = hikariConfig57.getCatalog();
        hikariConfig57.setReadOnly(false);
        hikariConfig57.setCatalog("");
        java.util.Properties properties66 = hikariConfig57.getDataSourceProperties();
        hikariConfig46.setDataSourceProperties(properties66);
        hikariConfig24.setDataSourceProperties(properties66);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig14.setDataSourceProperties(properties66);
        hikariConfig0.setDataSourceProperties(properties66);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-93708" + "'", str12, "HikariPool-93708");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 5000L + "'", long50 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(properties66);
    }

    @Test
    public void test21854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21854");
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
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test21855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21855");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-674");
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        hikariConfig0.setPoolName("HikariPool-36955");
        int int19 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test21856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21856");
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
        boolean boolean79 = hikariConfig1.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test21857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21857");
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
        int int22 = hikariConfig0.getMinimumPoolSize();
        int int23 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test21858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21858");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test21859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21859");
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
        hikariConfig1.setConnectionInitSql("HikariPool-54186");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test21860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21860");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setTransactionIsolation("HikariPool-151");
        java.lang.String str13 = hikariConfig0.getCatalog();
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test21861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test21862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21862");
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
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-76076");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test21863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21863");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-102");
        hikariConfig0.setMaximumPoolSize((int) (byte) 0);
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        java.lang.String str18 = hikariConfig0.getPoolName();
        long long19 = hikariConfig0.getIdleTimeout();
        int int20 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setCatalog("HikariPool-45357");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-93740" + "'", str18, "HikariPool-93740");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test21864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21864");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaximumPoolSize(0);
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test21865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21865");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        int int6 = hikariConfig1.getAcquireIncrement();
        int int7 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("HikariPool-9813");
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test21866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21866");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-93743" + "'", str5, "HikariPool-93743");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test21867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21867");
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
        hikariConfig0.setIdleTimeout(750L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test21868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21868");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-72318");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-72318 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21869");
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
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAutoCommit(false);
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test21870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21870");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-6202");
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-84907");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21871");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        long long7 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test21872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21872");
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
        hikariConfig0.setAcquireRetries(0);
        java.lang.String str25 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test21873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21873");
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
        hikariConfig16.setAcquireRetryDelay((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test21874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21874");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setDataSourceClassName("HikariPool-566");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold(1800000L);
        hikariConfig1.setCatalog("HikariPool-17105");
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setConnectionInitSql("HikariPool-5360");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test21875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21875");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-63412");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-93760" + "'", str10, "HikariPool-93760");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test21876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21876");
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
        hikariConfig62.setAcquireIncrement((int) 'a');
        int int67 = hikariConfig62.getAcquireRetries();
        java.util.Properties properties68 = hikariConfig62.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(properties68);
    }

    @Test
    public void test21877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21877");
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
        boolean boolean24 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource25 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbcUrl("HikariPool-82975");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test21878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21878");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-923");
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-18242");
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test21879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21879");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setJdbcUrl("HikariPool-29247");
        hikariConfig1.setMaxLifetime(750L);
        hikariConfig1.setPoolName("HikariPool-4273");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-566");
        long long9 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isReadOnly();
        java.lang.String str14 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean17 = hikariConfig12.isAutoCommit();
        long long18 = hikariConfig12.getLeakDetectionThreshold();
        hikariConfig12.setDataSourceClassName("HikariPool-158");
        hikariConfig12.setConnectionTimeout((long) (short) 100);
        hikariConfig12.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties25 = hikariConfig12.getDataSourceProperties();
        java.lang.Class<?> wildcardClass26 = properties25.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-6029", (java.lang.Object) wildcardClass26);
        hikariConfig1.setAcquireRetryDelay(32L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test21881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21881");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        hikariConfig1.setConnectionTestQuery("HikariPool-805");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-159");
        hikariConfig1.setAcquireRetryDelay(0L);
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
        hikariConfig1.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties30);
        boolean boolean38 = hikariConfig37.isReadOnly();
        java.lang.String str39 = hikariConfig37.getConnectionTestQuery();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test21882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21882");
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
        long long62 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetryDelay(52L);
        hikariConfig1.setMinimumPoolSize(97);
        int int67 = hikariConfig1.getAcquireRetries();
        int int68 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 5000L + "'", long62 == 5000L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test21883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21883");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        hikariConfig0.setIsolateInternalQueries(false);
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setJdbcUrl("HikariPool-81191");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test21884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21884");
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
        hikariConfig26.setLeakDetectionThreshold((long) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test21885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21885");
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
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        long long15 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        long long21 = hikariConfig17.getConnectionTimeout();
        java.lang.String str22 = hikariConfig17.getCatalog();
        int int23 = hikariConfig17.getTransactionIsolation();
        int int24 = hikariConfig17.getMaximumPoolSize();
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        int int26 = hikariConfig17.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        int int28 = hikariConfig27.getAcquireRetries();
        hikariConfig27.setJdbcUrl("hi!");
        hikariConfig27.setMaximumPoolSize((int) ' ');
        java.lang.String str33 = hikariConfig27.getConnectionTestQuery();
        hikariConfig27.setRegisterMbeans(true);
        boolean boolean36 = hikariConfig27.isJdbc4ConnectionTest();
        hikariConfig27.setReadOnly(false);
        java.util.Properties properties39 = hikariConfig27.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig17.setDataSourceProperties(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        boolean boolean43 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test21886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21886");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean18 = hikariConfig17.isIsolateInternalQueries();
        hikariConfig17.setPoolName("HikariPool-41053");
        hikariConfig17.setJdbcUrl("HikariPool-81888");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21887");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setMaxLifetime((long) 60);
        boolean boolean13 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMinimumPoolSize(10);
        boolean boolean16 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("HikariPool-28856");
        hikariConfig0.setPoolName("HikariPool-81888");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test21888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test21889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21889");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIdleTimeout((-1L));
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) 1);
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        hikariConfig0.setMaxLifetime(100L);
        hikariConfig0.setConnectionTimeout(0L);
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test21890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21890");
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
        boolean boolean30 = hikariConfig29.isIsolateInternalQueries();
        long long31 = hikariConfig29.getMaxLifetime();
        hikariConfig29.setAutoCommit(false);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
    }

    @Test
    public void test21891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21891");
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
        hikariConfig0.setPoolName("HikariPool-12300");
        hikariConfig0.setAcquireRetryDelay((long) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test21892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21892");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        int int12 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setJdbcUrl("hi!");
        hikariConfig11.setMaximumPoolSize((int) ' ');
        java.lang.String str17 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setRegisterMbeans(true);
        boolean boolean20 = hikariConfig11.isJdbc4ConnectionTest();
        hikariConfig11.setReadOnly(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        java.lang.String str26 = hikariConfig1.getJdbcUrl();
        long long27 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setTransactionIsolation("");
        javax.sql.DataSource dataSource32 = hikariConfig29.getDataSource();
        long long33 = hikariConfig29.getConnectionTimeout();
        java.lang.String str34 = hikariConfig29.getCatalog();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setAcquireRetryDelay((long) (short) 100);
        hikariConfig36.setMinimumPoolSize((int) (byte) 100);
        hikariConfig36.setJdbcUrl("hi!");
        int int43 = hikariConfig36.getAcquireIncrement();
        java.util.Properties properties44 = hikariConfig36.getDataSourceProperties();
        hikariConfig29.setDataSourceProperties(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 5000L + "'", long33 == 5000L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test21893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21893");
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
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21894");
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
        hikariConfig1.setConnectionInitSql("HikariPool-31475");
        int int28 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test21895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21895");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-919");
        hikariConfig0.setInitializationFailFast(false);
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-40488");
        hikariConfig0.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test21896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21896");
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
        hikariConfig1.setJdbcUrl("HikariPool-26626");
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        boolean boolean25 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setCatalog("HikariPool-51477");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test21897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21897");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setTransactionIsolation("");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setConnectionInitSql("");
        hikariConfig17.setJdbcUrl("");
        hikariConfig17.setConnectionTestQuery("hi!");
        hikariConfig11.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig17);
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
        hikariConfig11.setDataSourceProperties(properties42);
        hikariConfig7.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig1.setDataSourceProperties(properties42);
        boolean boolean50 = hikariConfig1.isJdbc4ConnectionTest();
        int int51 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireIncrement(32);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
    }

    @Test
    public void test21898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21898");
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
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setJdbcUrl("hi!");
        hikariConfig12.setMaximumPoolSize((int) ' ');
        java.lang.String str18 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setRegisterMbeans(true);
        boolean boolean21 = hikariConfig12.isJdbc4ConnectionTest();
        hikariConfig12.setDataSourceClassName("HikariPool-674");
        java.util.Properties properties24 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long27 = hikariConfig26.getLeakDetectionThreshold();
        java.util.Properties properties28 = hikariConfig26.getDataSourceProperties();
        hikariConfig26.setJdbcUrl("HikariPool-42325");
        java.lang.String str31 = hikariConfig26.getCatalog();
        hikariConfig26.setJdbcUrl("HikariPool-29855");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test21899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21899");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test21900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test21901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21901");
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
        javax.sql.DataSource dataSource19 = hikariConfig13.getDataSource();
        hikariConfig13.setMaximumPoolSize((int) ' ');
        boolean boolean22 = hikariConfig13.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test21902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21902");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
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
    public void test21903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21903");
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
        hikariConfig14.setMinimumPoolSize((int) (short) 10);
        int int21 = hikariConfig14.getMinimumPoolSize();
        hikariConfig14.setIdleTimeout((long) 0);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test21904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21904");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setConnectionTestQuery("HikariPool-442");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-674");
        hikariConfig0.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test21905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21905");
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
        hikariConfig0.setAcquireIncrement(97);
        hikariConfig0.setAcquireRetryDelay(32L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test21906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21906");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setAcquireIncrement((int) '4');
        long long14 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setCatalog("HikariPool-46735");
        int int18 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test21907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21907");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setDataSourceClassName("HikariPool-14188");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test21908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21908");
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
        java.lang.String str24 = hikariConfig0.getPoolName();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setCatalog("HikariPool-60386");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-93884" + "'", str24, "HikariPool-93884");
    }

    @Test
    public void test21909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21909");
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
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        java.lang.String str22 = hikariConfig0.getPoolName();
        hikariConfig0.setPoolName("HikariPool-13252");
        int int25 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-93885" + "'", str22, "HikariPool-93885");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test21910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21910");
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
        hikariConfig12.setIdleTimeout((long) 10);
        javax.sql.DataSource dataSource29 = hikariConfig12.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig12.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource29);
    }

    @Test
    public void test21911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21911");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setCatalog("HikariPool-566");
        java.lang.String str14 = hikariConfig1.getCatalog();
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMinimumPoolSize(60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-566" + "'", str14, "HikariPool-566");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21912");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig14.setConnectionInitSql("");
        java.util.Properties properties17 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.setDataSourceProperties(properties17);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig0.setJdbcUrl("HikariPool-53881");
        boolean boolean24 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test21913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21913");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(true);
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMaximumPoolSize((int) (short) 0);
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test21914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21914");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        boolean boolean10 = hikariConfig0.isReadOnly();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setPoolName("HikariPool-5591");
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 35);
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test21915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21915");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("HikariPool-12075");
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-23910");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-75602");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test21916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21916");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test21917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21917");
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
        hikariConfig38.setMinimumPoolSize((int) (byte) 100);
        hikariConfig38.setIdleTimeout(52L);
        java.lang.String str43 = hikariConfig38.getJdbcUrl();
        boolean boolean44 = hikariConfig38.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test21918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21918");
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
        javax.sql.DataSource dataSource22 = hikariConfig13.getDataSource();
        long long23 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.setIsolateInternalQueries(true);
        java.lang.String str26 = hikariConfig13.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 750L + "'", long23 == 750L);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test21919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21919");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25478");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25478 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21920");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-73846");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-73846 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21921");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21922");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("HikariPool-993");
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-1177");
        hikariConfig1.setDataSourceClassName("HikariPool-7308");
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-7779");
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        long long20 = hikariConfig1.getIdleTimeout();
        int int21 = hikariConfig1.getAcquireIncrement();
        long long22 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
    }

    @Test
    public void test21923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21923");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setMaxLifetime((long) 60);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isReadOnly();
        java.lang.String str16 = hikariConfig14.getDataSourceClassName();
        hikariConfig14.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean19 = hikariConfig14.isAutoCommit();
        long long20 = hikariConfig14.getLeakDetectionThreshold();
        hikariConfig14.setDataSourceClassName("HikariPool-158");
        hikariConfig14.setConnectionTimeout((long) (short) 100);
        hikariConfig14.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties27 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig29.setIsolateInternalQueries(true);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig32.setConnectionInitSql("");
        boolean boolean35 = hikariConfig32.isJdbc4ConnectionTest();
        java.lang.String str36 = hikariConfig32.getCatalog();
        java.lang.String str37 = hikariConfig32.getCatalog();
        hikariConfig32.setIsolateInternalQueries(true);
        hikariConfig32.setPoolName("HikariPool-130");
        java.util.Properties properties42 = hikariConfig32.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig29.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig46.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test21924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21924");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setIdleTimeout((long) 3);
        hikariConfig1.setIdleTimeout((long) '#');
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test21925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21925");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setTransactionIsolation("HikariPool-1881");
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test21926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21926");
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
        hikariConfig1.setTransactionIsolation("HikariPool-1165");
        int int19 = hikariConfig1.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-32000");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-32000' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-93919" + "'", str12, "HikariPool-93919");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test21927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21927");
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
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test21928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21928");
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
        boolean boolean20 = hikariConfig0.isAutoCommit();
        java.lang.String str21 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test21929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21929");
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
        hikariConfig1.setLeakDetectionThreshold(35L);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setTransactionIsolation("HikariPool-13106");
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test21930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21930");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) (short) 100);
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        int int11 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test21931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21931");
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
        hikariConfig7.setIdleTimeout((long) 'a');
        int int23 = hikariConfig7.getMinimumPoolSize();
        long long24 = hikariConfig7.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test21932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21932");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-93928" + "'", str30, "HikariPool-93928");
    }

    @Test
    public void test21933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21933");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setDataSourceClassName("HikariPool-2899");
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21934");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getIdleTimeout();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-93930" + "'", str9, "HikariPool-93930");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test21935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21935");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-54830");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-54830 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21936");
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
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test21937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21937");
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
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-29141");
        hikariConfig1.setConnectionTestQuery("HikariPool-58912");
        hikariConfig1.setRegisterMbeans(true);
    }

    @Test
    public void test21938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21938");
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
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbcUrl("HikariPool-32158");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test21939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean12 = hikariConfig1.isReadOnly();
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test21940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21940");
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
        hikariConfig1.setConnectionInitSql("HikariPool-151");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        int int16 = hikariConfig1.getMinimumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        javax.sql.DataSource dataSource21 = hikariConfig18.getDataSource();
        hikariConfig18.setLeakDetectionThreshold(600000L);
        boolean boolean24 = hikariConfig18.isAutoCommit();
        long long25 = hikariConfig18.getIdleTimeout();
        int int26 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean29 = hikariConfig18.isInitializationFailFast();
        hikariConfig1.addDataSourceProperty("HikariPool-43457", (java.lang.Object) hikariConfig18);
        hikariConfig18.setConnectionInitSql("HikariPool-33931");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test21941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21941");
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
        hikariConfig10.setConnectionCustomizerClassName("HikariPool-1604");
        long long34 = hikariConfig10.getMaxLifetime();
        javax.sql.DataSource dataSource35 = null;
        hikariConfig10.setDataSource(dataSource35);
        hikariConfig10.setJdbcUrl("HikariPool-12412");
        int int39 = hikariConfig10.getMaximumPoolSize();
        hikariConfig10.setTransactionIsolation("HikariPool-70034");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-93941" + "'", str30, "HikariPool-93941");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1800000L + "'", long34 == 1800000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test21942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21942");
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
        boolean boolean20 = hikariConfig1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-93942" + "'", str12, "HikariPool-93942");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21943");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay(35L);
        hikariConfig1.setIsolateInternalQueries(true);
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test21944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21944");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        int int7 = hikariConfig1.getAcquireIncrement();
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test21945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21945");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-71551");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21946");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setAcquireIncrement((int) (short) 10);
        long long8 = hikariConfig5.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test21947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setDataSourceClassName("HikariPool-151");
        hikariConfig1.setAcquireRetries(1);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test21948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setJdbcUrl("HikariPool-32273");
        hikariConfig0.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test21949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setLeakDetectionThreshold(0L);
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) ' ');
        int int17 = hikariConfig1.getAcquireIncrement();
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.setDataSourceClassName("HikariPool-19276");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-93950" + "'", str18, "HikariPool-93950");
    }

    @Test
    public void test21950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21950");
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
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21951");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-45760");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-45760 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21952");
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
        long long16 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMaximumPoolSize(0);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setConnectionInitSql("");
        boolean boolean22 = hikariConfig19.isJdbc4ConnectionTest();
        java.lang.String str23 = hikariConfig19.getCatalog();
        java.lang.String str24 = hikariConfig19.getCatalog();
        int int25 = hikariConfig19.getAcquireRetries();
        int int26 = hikariConfig19.getMinimumPoolSize();
        javax.sql.DataSource dataSource27 = hikariConfig19.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str29 = hikariConfig28.getConnectionInitSql();
        boolean boolean30 = hikariConfig28.isInitializationFailFast();
        long long31 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.setIsolateInternalQueries(true);
        hikariConfig28.setJdbc4ConnectionTest(true);
        hikariConfig28.setConnectionTestQuery("HikariPool-2705");
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig39.setConnectionInitSql("");
        boolean boolean42 = hikariConfig39.isJdbc4ConnectionTest();
        hikariConfig39.setJdbcUrl("hi!");
        boolean boolean45 = hikariConfig39.isJdbc4ConnectionTest();
        long long46 = hikariConfig39.getLeakDetectionThreshold();
        hikariConfig39.setAcquireIncrement(100);
        boolean boolean49 = hikariConfig39.isReadOnly();
        boolean boolean50 = hikariConfig39.isIsolateInternalQueries();
        int int51 = hikariConfig39.getAcquireRetries();
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean54 = hikariConfig53.isReadOnly();
        java.lang.String str55 = hikariConfig53.getDataSourceClassName();
        hikariConfig53.setJdbcUrl("hi!");
        boolean boolean58 = hikariConfig53.isReadOnly();
        hikariConfig53.setTransactionIsolation("HikariPool-158");
        hikariConfig53.setUseInstrumentation(false);
        java.util.Properties properties63 = hikariConfig53.getDataSourceProperties();
        hikariConfig39.setDataSourceProperties(properties63);
        java.lang.String str65 = hikariConfig39.getPoolName();
        java.lang.String str66 = hikariConfig39.getPoolName();
        long long67 = hikariConfig39.getAcquireRetryDelay();
        hikariConfig28.addDataSourceProperty("HikariPool-130", (java.lang.Object) hikariConfig39);
        hikariConfig28.setMaximumPoolSize((int) (short) 1);
        java.util.Properties properties71 = hikariConfig28.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties71);
        hikariConfig0.setDataSourceProperties(properties71);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 750L + "'", long31 == 750L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(properties63);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "HikariPool-93956" + "'", str65, "HikariPool-93956");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "HikariPool-93956" + "'", str66, "HikariPool-93956");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 750L + "'", long67 == 750L);
        org.junit.Assert.assertNotNull(properties71);
    }

    @Test
    public void test21953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21953");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig14.setConnectionInitSql("");
        boolean boolean17 = hikariConfig14.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig14.getCatalog();
        java.lang.String str19 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setLeakDetectionThreshold((long) '4');
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.setAutoCommit(false);
        java.util.Properties properties26 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        long long30 = hikariConfig29.getAcquireRetryDelay();
        int int31 = hikariConfig29.getMaximumPoolSize();
        hikariConfig29.setAcquireRetryDelay((long) 35);
        hikariConfig29.setJdbcUrl("HikariPool-42003");
        hikariConfig29.setInitializationFailFast(false);
        int int38 = hikariConfig29.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 750L + "'", long30 == 750L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test21954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21954");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionInitSql("HikariPool-11038");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test21955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        int int12 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test21956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21956");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setAutoCommit(false);
        boolean boolean23 = hikariConfig20.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test21957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("");
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-658");
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        hikariConfig1.setTransactionIsolation("HikariPool-57205");
        boolean boolean17 = hikariConfig1.isReadOnly();
        hikariConfig1.setMaxLifetime(1800000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21958");
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
        int int16 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setInitializationFailFast(false);
        int int19 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test21959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test21960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21960");
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
        long long12 = hikariConfig1.getAcquireRetryDelay();
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries((int) ' ');
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        java.lang.String str22 = hikariConfig17.getConnectionTestQuery();
        hikariConfig17.setLeakDetectionThreshold((long) '4');
        long long25 = hikariConfig17.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig26.setConnectionInitSql("");
        boolean boolean29 = hikariConfig26.isJdbc4ConnectionTest();
        java.lang.String str30 = hikariConfig26.getCatalog();
        java.lang.String str31 = hikariConfig26.getConnectionTestQuery();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.setAutoCommit(false);
        java.util.Properties properties38 = hikariConfig26.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig40.setConnectionInitSql("");
        boolean boolean43 = hikariConfig40.isJdbc4ConnectionTest();
        java.lang.String str44 = hikariConfig40.getCatalog();
        java.lang.String str45 = hikariConfig40.getCatalog();
        java.lang.String str46 = hikariConfig40.getCatalog();
        long long47 = hikariConfig40.getAcquireRetryDelay();
        java.lang.String str48 = hikariConfig40.getDataSourceClassName();
        java.lang.String str49 = hikariConfig40.getConnectionTestQuery();
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        boolean boolean52 = hikariConfig51.isReadOnly();
        java.lang.String str53 = hikariConfig51.getDataSourceClassName();
        hikariConfig51.setJdbcUrl("hi!");
        boolean boolean56 = hikariConfig51.isReadOnly();
        hikariConfig51.setTransactionIsolation("HikariPool-158");
        hikariConfig51.setUseInstrumentation(false);
        java.util.Properties properties61 = hikariConfig51.getDataSourceProperties();
        hikariConfig40.setDataSourceProperties(properties61);
        hikariConfig17.setDataSourceProperties(properties61);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties61);
        hikariConfig1.setDataSourceProperties(properties61);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 750L + "'", long47 == 750L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(properties61);
    }

    @Test
    public void test21961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21961");
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
        boolean boolean26 = hikariConfig11.isJdbc4ConnectionTest();
        hikariConfig11.setPoolName("HikariPool-45280");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test21962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21963");
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
        long long15 = hikariConfig1.getConnectionTimeout();
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
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig1.setDataSourceProperties(properties25);
        boolean boolean34 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test21964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21964");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionTestQuery("HikariPool-442");
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (short) -1);
        java.lang.String str13 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test21965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21965");
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
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean19 = hikariConfig18.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21966");
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
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setDataSourceClassName("HikariPool-15346");
        hikariConfig0.setMaxLifetime((long) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test21967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21967");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1604");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setIdleTimeout(52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test21968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21968");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIdleTimeout((-1L));
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) 1);
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig14.setDataSource(dataSource17);
        boolean boolean19 = hikariConfig14.isJdbc4ConnectionTest();
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
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig14.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig0.setDataSourceProperties(properties29);
        boolean boolean36 = hikariConfig0.isRegisterMbeans();
        javax.sql.DataSource dataSource37 = null;
        hikariConfig0.setDataSource(dataSource37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test21969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21969");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(false);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setPoolName("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test21970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21970");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3343");
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6648");
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        int int20 = hikariConfig1.getMaximumPoolSize();
        long long21 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test21971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21971");
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
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTimeout(600000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test21972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21972");
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
        java.lang.String str27 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str28 = hikariConfig12.getConnectionTestQuery();
        long long29 = hikariConfig12.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1800000L + "'", long29 == 1800000L);
    }

    @Test
    public void test21973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21973");
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
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setInitializationFailFast(false);
        long long19 = hikariConfig0.getIdleTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        boolean boolean24 = hikariConfig21.isJdbc4ConnectionTest();
        java.lang.String str25 = hikariConfig21.getCatalog();
        java.lang.String str26 = hikariConfig21.getConnectionTestQuery();
        hikariConfig21.setLeakDetectionThreshold((long) '4');
        hikariConfig21.setMaxLifetime(5000L);
        hikariConfig21.setAcquireRetries((int) (short) 1);
        java.util.Properties properties33 = hikariConfig21.getDataSourceProperties();
        boolean boolean34 = hikariConfig21.isJdbc4ConnectionTest();
        hikariConfig21.setConnectionTestQuery("HikariPool-998");
        long long37 = hikariConfig21.getMaxLifetime();
        boolean boolean38 = hikariConfig21.isRegisterMbeans();
        int int39 = hikariConfig21.getMinimumPoolSize();
        java.lang.String str40 = hikariConfig21.getJdbcUrl();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-41439", (java.lang.Object) str40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-130" + "'", str13, "HikariPool-130");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test21974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setAcquireRetryDelay(10L);
        long long12 = hikariConfig0.getIdleTimeout();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test21975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21975");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test21976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21976");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionTestQuery("HikariPool-93885");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test21977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21977");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setIdleTimeout((long) (short) -1);
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setLeakDetectionThreshold((long) 35);
        hikariConfig1.setAcquireRetries(0);
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireIncrement((int) 'a');
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test21978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21978");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21979");
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
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int37 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test21980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21980");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-94029" + "'", str9, "HikariPool-94029");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test21981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21981");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setUseInstrumentation(true);
        int int15 = hikariConfig0.getAcquireRetries();
        int int16 = hikariConfig0.getAcquireRetries();
        long long17 = hikariConfig0.getConnectionTimeout();
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test21982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21982");
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
        int int28 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
    }

    @Test
    public void test21983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21983");
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
        hikariConfig1.setPoolName("HikariPool-61413");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setTransactionIsolation("");
        javax.sql.DataSource dataSource22 = hikariConfig19.getDataSource();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setConnectionInitSql("");
        hikariConfig25.setJdbcUrl("");
        hikariConfig25.setConnectionTestQuery("hi!");
        hikariConfig19.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig25);
        hikariConfig25.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig25.setConnectionTestQuery("HikariPool-159");
        boolean boolean37 = hikariConfig25.isRegisterMbeans();
        long long38 = hikariConfig25.getIdleTimeout();
        hikariConfig25.setIdleTimeout(10L);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig41.setConnectionInitSql("");
        boolean boolean44 = hikariConfig41.isJdbc4ConnectionTest();
        java.lang.String str45 = hikariConfig41.getCatalog();
        java.lang.String str46 = hikariConfig41.getConnectionTestQuery();
        hikariConfig41.setLeakDetectionThreshold((long) '4');
        hikariConfig41.setRegisterMbeans(false);
        hikariConfig41.setAutoCommit(false);
        hikariConfig41.setTransactionIsolation("HikariPool-158");
        int int55 = hikariConfig41.getTransactionIsolation();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig57.setConnectionInitSql("");
        hikariConfig57.setDataSourceClassName("");
        hikariConfig57.setConnectionCustomizerClassName("");
        long long64 = hikariConfig57.getLeakDetectionThreshold();
        int int65 = hikariConfig57.getAcquireIncrement();
        long long66 = hikariConfig57.getAcquireRetryDelay();
        java.util.Properties properties67 = hikariConfig57.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig41.setDataSourceProperties(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig25.setDataSourceProperties(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig1.setDataSourceProperties(properties67);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 600000L + "'", long38 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 750L + "'", long66 == 750L);
        org.junit.Assert.assertNotNull(properties67);
    }

    @Test
    public void test21984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21984");
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
        hikariConfig1.setPoolName("HikariPool-9581");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test21985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21985");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        hikariConfig0.setRegisterMbeans(false);
        long long9 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetries((int) (short) 10);
        hikariConfig0.setTransactionIsolation("HikariPool-627");
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime(10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test21986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21986");
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
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test21987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21987");
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
        int int29 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties30 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime(5000L);
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
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-94058" + "'", str26, "HikariPool-94058");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test21988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21988");
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
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.setAutoCommit(true);
        long long37 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setLeakDetectionThreshold(750L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1800000L + "'", long37 == 1800000L);
    }

    @Test
    public void test21989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21989");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-56072");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-56072 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig11.setDataSource(dataSource12);
        java.lang.String str14 = hikariConfig11.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setConnectionInitSql("");
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        hikariConfig15.setLeakDetectionThreshold(600000L);
        boolean boolean21 = hikariConfig15.isAutoCommit();
        long long22 = hikariConfig15.getIdleTimeout();
        java.util.Properties properties23 = hikariConfig15.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig1.setDataSource(dataSource28);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test21991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21991");
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
        long long23 = hikariConfig0.getConnectionTimeout();
        long long24 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test21992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21992");
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
        boolean boolean23 = hikariConfig13.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test21993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21993");
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
        java.lang.String str69 = hikariConfig65.getDataSourceClassName();
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
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test21994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21994");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test21995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21995");
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
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setJdbcUrl("HikariPool-6348");
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        boolean boolean17 = hikariConfig1.isAutoCommit();
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        int int19 = hikariConfig1.getAcquireIncrement();
        java.lang.String str20 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-6348" + "'", str20, "HikariPool-6348");
    }

    @Test
    public void test21996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21996");
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
        boolean boolean27 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test21997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21997");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setPoolName("HikariPool-1561");
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test21998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21998");
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
        hikariConfig13.setAutoCommit(true);
        int int20 = hikariConfig13.getTransactionIsolation();
        int int21 = hikariConfig13.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test21999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21999");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setMaxLifetime(5000L);
        long long21 = hikariConfig11.getMaxLifetime();
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
        hikariConfig11.addDataSourceProperty("HikariPool-1276", (java.lang.Object) properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.lang.String str38 = hikariConfig37.getConnectionInitSql();
        hikariConfig0.addDataSourceProperty("HikariPool-6810", (java.lang.Object) hikariConfig37);
        hikariConfig37.setJdbcUrl("HikariPool-54362");
        hikariConfig37.setAcquireIncrement(97);
        hikariConfig37.setAcquireRetries((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test22000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test22000");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireRetryDelay((long) '4');
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        hikariConfig11.setJdbcUrl("hi!");
        boolean boolean17 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig11.getDataSourceClassName();
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
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig11.setDataSourceProperties(properties36);
        boolean boolean42 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str43 = hikariConfig11.getConnectionInitSql();
        long long44 = hikariConfig11.getMaxLifetime();
        hikariConfig1.addDataSourceProperty("HikariPool-11199", (java.lang.Object) long44);
        javax.sql.DataSource dataSource46 = null;
        hikariConfig1.setDataSource(dataSource46);
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        boolean boolean50 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-42275");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1800000L + "'", long44 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }
}
