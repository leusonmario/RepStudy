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
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.catalog;
        int int17 = hikariConfig15.getMinimumPoolSize();
        java.util.Properties properties18 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-220", (java.lang.Object) properties18);
        hikariConfig1.poolName = "HikariPool-359";
        hikariConfig1.transactionIsolationName = "HikariPool-1800";
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig26.transactionIsolationName;
        int int31 = hikariConfig26.transactionIsolation;
        javax.sql.DataSource dataSource32 = null;
        hikariConfig26.dataSource = dataSource32;
        java.lang.String str34 = hikariConfig26.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = hikariConfig26.connectionCustomizer;
        boolean boolean36 = hikariConfig26.isJdbc4connectionTest;
        hikariConfig1.addDataSourceProperty("HikariPool-18954", (java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isAutoCommit;
        hikariConfig7.poolName = "hi!";
        hikariConfig7.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig7.dataSource = dataSource13;
        int int15 = hikariConfig7.minPoolSize;
        int int16 = hikariConfig7.minPoolSize;
        hikariConfig7.setCatalog("HikariPool-550");
        hikariConfig1.addDataSourceProperty("HikariPool-481", (java.lang.Object) hikariConfig7);
        boolean boolean20 = hikariConfig7.isInitializationFailFast;
        hikariConfig7.setPoolName("HikariPool-6834");
        java.lang.String str23 = hikariConfig7.transactionIsolationName;
        int int24 = hikariConfig7.acquireRetries;
        hikariConfig7.setIdleTimeout((long) (byte) -1);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-36801");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setLeakDetectionThreshold(52L);
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-33505";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        java.lang.String str10 = hikariConfig1.getCatalog();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setLeakDetectionThreshold((long) 97);
        hikariConfig1.catalog = "HikariPool-1985";
        boolean boolean18 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setMinimumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionTimeout = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.transactionIsolationName = "HikariPool-205";
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        java.lang.String str18 = hikariConfig1.catalog;
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        long long9 = hikariConfig1.getIdleTimeout();
        long long10 = hikariConfig1.getConnectionTimeout();
        long long11 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getMinimumPoolSize();
        hikariConfig13.setUseInstrumentation(false);
        long long17 = hikariConfig13.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60L + "'", long9 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionTestQuery = "HikariPool-5662";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        long long20 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        long long8 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer9;
        long long11 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.dataSourceClassName = "HikariPool-578";
        hikariConfig1.setConnectionInitSql("HikariPool-15950");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig11);
        hikariConfig11.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig11.connectionCustomizer;
        long long30 = hikariConfig11.getMaxLifetime();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.connectionTestQuery;
        long long37 = hikariConfig32.getIdleTimeout();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        java.lang.String str44 = hikariConfig39.connectionCustomizerClassName;
        hikariConfig39.setConnectionTestQuery("hi!");
        java.lang.String str47 = hikariConfig39.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer48 = hikariConfig39.connectionCustomizer;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig50.setConnectionInitSql("hi!");
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        int int55 = hikariConfig54.getTransactionIsolation();
        hikariConfig54.setRegisterMbeans(false);
        hikariConfig54.dataSourceClassName = "";
        hikariConfig54.setTransactionIsolation("");
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        int int64 = hikariConfig63.getTransactionIsolation();
        hikariConfig63.setRegisterMbeans(false);
        hikariConfig63.isInitializationFailFast = true;
        int int69 = hikariConfig63.acquireRetries;
        hikariConfig63.setMaxLifetime((long) (-1));
        int int72 = hikariConfig63.getTransactionIsolation();
        java.util.Properties properties73 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        int int75 = hikariConfig74.getTransactionIsolation();
        hikariConfig74.setRegisterMbeans(false);
        java.lang.String str78 = hikariConfig74.transactionIsolationName;
        int int79 = hikariConfig74.getMaximumPoolSize();
        int int80 = hikariConfig74.transactionIsolation;
        java.util.Properties properties81 = hikariConfig74.dataSourceProperties;
        hikariConfig63.setDataSourceProperties(properties81);
        hikariConfig54.dataSourceProperties = properties81;
        hikariConfig50.dataSourceProperties = properties81;
        hikariConfig39.setDataSourceProperties(properties81);
        hikariConfig32.dataSourceProperties = properties81;
        hikariConfig11.setDataSourceProperties(properties81);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer88 = hikariConfig11.connectionCustomizer;
        hikariConfig11.transactionIsolationName = "HikariPool-2526";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(iConnectionCustomizer48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 60 + "'", int79 == 60);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNull(iConnectionCustomizer88);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setAcquireRetries(1);
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        long long11 = hikariConfig1.getIdleTimeout();
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        hikariConfig1.leakDetectionThreshold = 5000L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-292";
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        boolean boolean18 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        hikariConfig1.poolName = "HikariPool-93";
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.isAutoCommit = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        int int14 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        hikariConfig1.catalog = "HikariPool-893";
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str24 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        int int11 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setConnectionTestQuery("HikariPool-279");
        hikariConfig1.setTransactionIsolation("HikariPool-275");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        long long14 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(true);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setIdleTimeout((long) (short) 10);
        int int11 = hikariConfig1.minPoolSize;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8892");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8892 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.maxPoolSize = 87;
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-823");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        long long12 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.setPoolName("HikariPool-646");
        int int18 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-38843" + "'", str15, "HikariPool-38843");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.catalog = "HikariPool-410";
        hikariConfig1.maxPoolSize = (short) -1;
        hikariConfig1.setTransactionIsolation("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        int int14 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        long long21 = hikariConfig16.getIdleTimeout();
        java.lang.String str22 = hikariConfig16.getCatalog();
        java.util.Properties properties23 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.setRegisterMbeans(true);
        hikariConfig16.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setRegisterMbeans(false);
        java.lang.String str33 = hikariConfig29.transactionIsolationName;
        int int34 = hikariConfig29.getMaximumPoolSize();
        int int35 = hikariConfig29.transactionIsolation;
        java.util.Properties properties36 = hikariConfig29.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        hikariConfig1.dataSourceClassName = "HikariPool-1485";
        hikariConfig1.idleTimeout = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getCatalog();
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.idleTimeout = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60L + "'", long9 == 60L);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        int int4 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-204");
        boolean boolean7 = hikariConfig1.isAutoCommit;
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-1595");
        java.lang.String str11 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-1595" + "'", str11, "HikariPool-1595");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.getPoolName();
        long long9 = hikariConfig1.connectionTimeout;
        hikariConfig1.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-38853" + "'", str8, "HikariPool-38853");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.catalog;
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout((long) 87);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2562");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2562 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.setIdleTimeout((long) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = 32L;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaximumPoolSize(0);
        boolean boolean20 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "HikariPool-614";
        int int8 = hikariConfig1.maxPoolSize;
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setRegisterMbeans(true);
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setDataSourceClassName("");
        hikariConfig13.validate();
        long long17 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.setIdleTimeout((long) '4');
        java.lang.String str20 = hikariConfig13.connectionCustomizerClassName;
        hikariConfig13.idleTimeout = (short) 0;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) (short) 0);
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        int int26 = hikariConfig1.transactionIsolation;
        java.lang.String str27 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = hikariConfig1.connectionCustomizer;
        boolean boolean31 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionInitSql("HikariPool-302");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(iConnectionCustomizer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-69");
        long long14 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setRegisterMbeans(true);
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        hikariConfig1.maxPoolSize = ' ';
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        int int14 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        int int12 = hikariConfig1.getAcquireIncrement();
        long long13 = hikariConfig1.connectionTimeout;
        java.lang.String str14 = hikariConfig1.poolName;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        int int16 = hikariConfig1.getMinimumPoolSize();
        int int17 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-38879" + "'", str14, "HikariPool-38879");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.leakDetectionThreshold = 0L;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        int int18 = hikariConfig16.getAcquireIncrement();
        java.util.Properties properties19 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties19;
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        boolean boolean22 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        int int27 = hikariConfig11.maxPoolSize;
        hikariConfig11.connectionInitSql = "HikariPool-222";
        hikariConfig11.dataSourceClassName = "HikariPool-15303";
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.addDataSourceProperty("HikariPool-413", (java.lang.Object) 32L);
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str14 = hikariConfig1.catalog;
        long long15 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        int int17 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 35L;
        long long20 = hikariConfig1.getAcquireRetryDelay();
        int int21 = hikariConfig1.getMaximumPoolSize();
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.dataSource = dataSource23;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.setMaxLifetime((long) 1);
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        hikariConfig1.catalog = "HikariPool-59";
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        long long10 = hikariConfig1.idleTimeout;
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        hikariConfig1.transactionIsolationName = "HikariPool-44";
        hikariConfig1.poolName = "HikariPool-14255";
        hikariConfig1.leakDetectionThreshold = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setTransactionIsolation("HikariPool-777");
        hikariConfig1.connectionInitSql = "HikariPool-432";
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        boolean boolean18 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        long long7 = hikariConfig1.getConnectionTimeout();
        long long8 = hikariConfig1.getMaxLifetime();
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = (short) 0;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setAcquireRetries(97);
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        boolean boolean19 = hikariConfig1.isRegisterMbeans;
        java.lang.String str20 = hikariConfig1.catalog;
        hikariConfig1.setCatalog("HikariPool-26532");
        java.lang.String str23 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-26532" + "'", str23, "HikariPool-26532");
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMaxLifetime(35L);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMinimumPoolSize(97);
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str13 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        int int15 = hikariConfig1.getAcquireIncrement();
        long long16 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.dataSourceClassName = "HikariPool-27574";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str31 = hikariConfig1.transactionIsolationName;
        java.lang.String str32 = hikariConfig1.getCatalog();
        long long33 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        long long12 = hikariConfig1.getConnectionTimeout();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.transactionIsolation = 3;
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = (byte) 100;
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-292");
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-126");
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.maxLifetime = 52L;
        java.lang.String str17 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-38911" + "'", str17, "HikariPool-38911");
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        long long13 = hikariConfig1.getMaxLifetime();
        int int14 = hikariConfig1.maxPoolSize;
        hikariConfig1.minPoolSize = (-1);
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
        long long18 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.setTransactionIsolation("HikariPool-1586");
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setCatalog("HikariPool-6");
        hikariConfig1.connectionInitSql = "HikariPool-470";
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTestQuery = "HikariPool-2519";
        int int18 = hikariConfig1.acquireRetries;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.leakDetectionThreshold = 100;
        hikariConfig20.setRegisterMbeans(false);
        hikariConfig20.setConnectionTestQuery("");
        hikariConfig20.maxPoolSize = 0;
        java.lang.String str29 = hikariConfig20.connectionTestQuery;
        java.lang.String str30 = hikariConfig20.poolName;
        java.util.Properties properties31 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties31;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-38925" + "'", str15, "HikariPool-38925");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-38926" + "'", str30, "HikariPool-38926");
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-624");
        long long11 = hikariConfig1.idleTimeout;
        hikariConfig1.catalog = "HikariPool-2847";
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        int int16 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        long long19 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        boolean boolean22 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "HikariPool-34667";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.acquireRetries = (short) 0;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.transactionIsolation = 100;
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.maxPoolSize = 3;
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        long long11 = hikariConfig1.maxLifetime;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties17 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties17);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        java.lang.String str21 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean22 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.poolName;
        hikariConfig10.setDataSourceClassName("");
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig10);
        hikariConfig10.setInitializationFailFast(true);
        hikariConfig10.isRegisterMbeans = true;
        long long19 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setConnectionTestQuery("HikariPool-19737");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-38936" + "'", str11, "HikariPool-38936");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.lang.String str45 = hikariConfig1.getPoolName();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str48 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource49 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-38937" + "'", str45, "HikariPool-38937");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-38937" + "'", str48, "HikariPool-38937");
        org.junit.Assert.assertNull(dataSource49);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        hikariConfig1.transactionIsolation = (short) 10;
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        hikariConfig1.maxLifetime = 1800000L;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isAutoCommit;
        hikariConfig1.maxLifetime = (short) -1;
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(1);
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isAutoCommit = false;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.dataSourceClassName = "";
        hikariConfig17.isRegisterMbeans = true;
        hikariConfig17.minPoolSize = (short) 1;
        hikariConfig17.isJdbc4connectionTest = false;
        long long29 = hikariConfig17.connectionTimeout;
        boolean boolean30 = hikariConfig17.isJdbc4ConnectionTest();
        int int31 = hikariConfig17.getAcquireIncrement();
        boolean boolean32 = hikariConfig17.isAutoCommit;
        long long33 = hikariConfig17.idleTimeout;
        javax.sql.DataSource dataSource34 = null;
        hikariConfig17.setDataSource(dataSource34);
        int int36 = hikariConfig17.getMinimumPoolSize();
        hikariConfig17.minPoolSize = ' ';
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.dataSourceClassName = "";
        hikariConfig40.setTransactionIsolation("");
        hikariConfig40.idleTimeout = '4';
        hikariConfig40.setTransactionIsolation("HikariPool-177");
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean54 = hikariConfig53.isAutoCommit;
        hikariConfig53.poolName = "hi!";
        java.lang.String str57 = hikariConfig53.dataSourceClassName;
        hikariConfig53.acquireRetries = (short) 10;
        int int60 = hikariConfig53.getAcquireIncrement();
        java.lang.String str61 = hikariConfig53.getPoolName();
        java.util.Properties properties62 = hikariConfig53.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        hikariConfig40.dataSourceProperties = properties62;
        hikariConfig17.dataSourceProperties = properties62;
        hikariConfig1.dataSourceProperties = properties62;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 60L + "'", long33 == 60L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(properties62);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxLifetime = 1800000L;
        hikariConfig1.dataSourceClassName = "HikariPool-489";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-320");
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setInitializationFailFast(true);
        long long21 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.transactionIsolationName = "HikariPool-16858";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        java.lang.String str13 = hikariConfig1.catalog;
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.dataSourceClassName = "HikariPool-27075";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        long long9 = hikariConfig1.getMaxLifetime();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        long long12 = hikariConfig1.maxLifetime;
        hikariConfig1.isAutoCommit = true;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str16 = hikariConfig1.catalog;
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-256";
        java.lang.String str17 = hikariConfig1.poolName;
        hikariConfig1.setCatalog("HikariPool-3038");
        hikariConfig1.setConnectionInitSql("HikariPool-447");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-38968" + "'", str17, "HikariPool-38968");
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        long long10 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setConnectionInitSql("hi!");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        hikariConfig16.dataSourceClassName = "";
        hikariConfig16.setTransactionIsolation("");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        hikariConfig25.isInitializationFailFast = true;
        int int31 = hikariConfig25.acquireRetries;
        hikariConfig25.setMaxLifetime((long) (-1));
        int int34 = hikariConfig25.getTransactionIsolation();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        int int37 = hikariConfig36.getTransactionIsolation();
        hikariConfig36.setRegisterMbeans(false);
        java.lang.String str40 = hikariConfig36.transactionIsolationName;
        int int41 = hikariConfig36.getMaximumPoolSize();
        int int42 = hikariConfig36.transactionIsolation;
        java.util.Properties properties43 = hikariConfig36.dataSourceProperties;
        hikariConfig25.setDataSourceProperties(properties43);
        hikariConfig16.dataSourceProperties = properties43;
        hikariConfig12.dataSourceProperties = properties43;
        hikariConfig1.dataSourceProperties = properties43;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties43);
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        int int52 = hikariConfig51.getTransactionIsolation();
        hikariConfig51.setRegisterMbeans(false);
        java.lang.String str55 = hikariConfig51.transactionIsolationName;
        int int56 = hikariConfig51.getMaximumPoolSize();
        int int57 = hikariConfig51.transactionIsolation;
        java.util.Properties properties58 = hikariConfig51.dataSourceProperties;
        hikariConfig51.isJdbc4connectionTest = false;
        boolean boolean61 = hikariConfig51.isInitializationFailFast;
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        boolean boolean64 = hikariConfig63.isAutoCommit;
        hikariConfig63.poolName = "hi!";
        java.lang.String str67 = hikariConfig63.dataSourceClassName;
        java.lang.String str68 = hikariConfig63.dataSourceClassName;
        hikariConfig63.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer71 = hikariConfig63.connectionCustomizer;
        hikariConfig63.setInitializationFailFast(true);
        int int74 = hikariConfig63.transactionIsolation;
        java.util.Properties properties75 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties75);
        hikariConfig76.dataSourceClassName = "";
        java.util.Properties properties79 = hikariConfig76.dataSourceProperties;
        hikariConfig63.setDataSourceProperties(properties79);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig51.dataSourceProperties = properties79;
        hikariConfig49.dataSourceProperties = properties79;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 60 + "'", int56 == 60);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(iConnectionCustomizer71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(properties79);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        hikariConfig1.isInitializationFailFast = false;
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.setCatalog("HikariPool-195");
        hikariConfig1.setMaxLifetime(32L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-320";
        hikariConfig1.setConnectionInitSql("HikariPool-535");
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.transactionIsolation = 100;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolationName = "HikariPool-431";
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.transactionIsolationName;
        int int17 = hikariConfig12.getMaximumPoolSize();
        int int18 = hikariConfig12.transactionIsolation;
        java.util.Properties properties19 = hikariConfig12.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties19);
        int int21 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 87L;
        boolean boolean24 = hikariConfig1.isInitializationFailFast;
        boolean boolean25 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        boolean boolean47 = hikariConfig46.isAutoCommit;
        hikariConfig46.poolName = "hi!";
        java.lang.String str50 = hikariConfig46.dataSourceClassName;
        java.lang.String str51 = hikariConfig46.dataSourceClassName;
        hikariConfig46.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer54 = hikariConfig46.connectionCustomizer;
        hikariConfig46.setInitializationFailFast(true);
        int int57 = hikariConfig46.transactionIsolation;
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.dataSourceClassName = "";
        java.util.Properties properties62 = hikariConfig59.dataSourceProperties;
        hikariConfig46.setDataSourceProperties(properties62);
        hikariConfig1.setDataSourceProperties(properties62);
        java.util.Properties properties65 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource66 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(iConnectionCustomizer54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNull(dataSource66);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionInitSql("HikariPool-780");
        java.lang.String str10 = hikariConfig1.getPoolName();
        int int11 = hikariConfig1.getMinimumPoolSize();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-38994" + "'", str10, "HikariPool-38994");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.dataSourceClassName = "HikariPool-197";
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        long long18 = hikariConfig1.idleTimeout;
        hikariConfig1.dataSourceClassName = "HikariPool-905";
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.catalog = "HikariPool-27768";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.maxPoolSize = (byte) 1;
        long long17 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionCustomizerClassName("");
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setConnectionTestQuery("HikariPool-1035");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setCatalog("HikariPool-639");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.idleTimeout = 1800000L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(1);
        hikariConfig1.maxLifetime = 1L;
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionInitSql = "HikariPool-43";
        boolean boolean20 = hikariConfig1.isAutoCommit;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2129");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig1.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.idleTimeout;
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.connectionInitSql = "HikariPool-306";
        hikariConfig1.setCatalog("");
        java.util.Properties properties25 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-308");
        hikariConfig1.minPoolSize = '#';
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-845";
        hikariConfig1.connectionInitSql = "HikariPool-1499";
        hikariConfig1.maxPoolSize = 60;
        hikariConfig1.leakDetectionThreshold = 10;
        java.lang.String str40 = hikariConfig1.getCatalog();
        boolean boolean41 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        long long10 = hikariConfig1.maxLifetime;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        long long12 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig1.leakDetectionThreshold = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        int int16 = hikariConfig1.acquireRetries;
        hikariConfig1.setConnectionTestQuery("HikariPool-516");
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.dataSource = dataSource5;
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.leakDetectionThreshold = 0L;
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        java.lang.String str14 = hikariConfig1.getCatalog();
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        long long14 = hikariConfig1.getIdleTimeout();
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-670");
        hikariConfig1.maxPoolSize = (short) 1;
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.leakDetectionThreshold = 100;
        boolean boolean26 = hikariConfig23.isJdbc4connectionTest;
        long long27 = hikariConfig23.getIdleTimeout();
        hikariConfig23.setUseInstrumentation(false);
        hikariConfig23.setJdbc4ConnectionTest(false);
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        java.lang.String str35 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionTestQuery = "HikariPool-1233";
        javax.sql.DataSource dataSource38 = hikariConfig1.getDataSource();
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig40.setConnectionInitSql("hi!");
        long long43 = hikariConfig40.getLeakDetectionThreshold();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        int int50 = hikariConfig45.getMaximumPoolSize();
        int int51 = hikariConfig45.transactionIsolation;
        java.util.Properties properties52 = hikariConfig45.dataSourceProperties;
        hikariConfig40.dataSourceProperties = properties52;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig1.dataSourceProperties = properties52;
        boolean boolean56 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-670" + "'", str35, "HikariPool-670");
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 60 + "'", int50 == 60);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        hikariConfig1.idleTimeout = 1800000L;
        java.lang.String str10 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39014" + "'", str10, "HikariPool-39014");
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-105";
        int int11 = hikariConfig1.getAcquireRetries();
        long long12 = hikariConfig1.connectionTimeout;
        int int13 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.transactionIsolation;
        javax.sql.DataSource dataSource22 = null;
        hikariConfig16.dataSource = dataSource22;
        boolean boolean24 = hikariConfig16.isAutoCommit();
        hikariConfig16.setMaximumPoolSize((int) '#');
        hikariConfig16.connectionInitSql = "HikariPool-260";
        boolean boolean29 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.connectionCustomizerClassName = "HikariPool-730";
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str33 = hikariConfig32.poolName;
        hikariConfig32.setMinimumPoolSize((int) '4');
        hikariConfig32.minPoolSize = (byte) 0;
        long long38 = hikariConfig32.connectionTimeout;
        int int39 = hikariConfig32.minPoolSize;
        int int40 = hikariConfig32.getMaximumPoolSize();
        hikariConfig32.setDataSourceClassName("HikariPool-3106");
        java.util.Properties properties43 = hikariConfig32.getDataSourceProperties();
        hikariConfig16.dataSourceProperties = properties43;
        hikariConfig1.setDataSourceProperties(properties43);
        hikariConfig1.leakDetectionThreshold = 0L;
        java.lang.String str48 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-39017" + "'", str33, "HikariPool-39017");
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        int int10 = hikariConfig1.acquireRetries;
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.catalog = "HikariPool-975";
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-104" + "'", str13, "HikariPool-104");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.leakDetectionThreshold = 100;
        java.lang.String str10 = hikariConfig7.connectionTestQuery;
        hikariConfig7.setMaximumPoolSize(87);
        java.lang.String str13 = hikariConfig7.connectionCustomizerClassName;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setConnectionInitSql("hi!");
        long long18 = hikariConfig15.getLeakDetectionThreshold();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        int int25 = hikariConfig20.getMaximumPoolSize();
        int int26 = hikariConfig20.transactionIsolation;
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties27;
        java.util.Properties properties29 = hikariConfig15.getDataSourceProperties();
        hikariConfig7.dataSourceProperties = properties29;
        hikariConfig1.setDataSourceProperties(properties29);
        javax.sql.DataSource dataSource32 = hikariConfig1.getDataSource();
        int int33 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str34 = hikariConfig1.poolName;
        hikariConfig1.setConnectionTestQuery("HikariPool-31569");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-39021" + "'", str34, "HikariPool-39021");
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-39025" + "'", str8, "HikariPool-39025");
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.catalog = "HikariPool-173";
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setCatalog("");
        boolean boolean10 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-12934");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.transactionIsolationName = "HikariPool-27";
        long long9 = hikariConfig1.maxLifetime;
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        int int9 = hikariConfig8.getTransactionIsolation();
        hikariConfig8.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig8.transactionIsolationName;
        int int13 = hikariConfig8.transactionIsolation;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig8.dataSource = dataSource14;
        long long16 = hikariConfig8.maxLifetime;
        java.lang.String str17 = hikariConfig8.dataSourceClassName;
        hikariConfig8.setRegisterMbeans(true);
        hikariConfig1.addDataSourceProperty("HikariPool-114", (java.lang.Object) hikariConfig8);
        int int21 = hikariConfig8.minPoolSize;
        boolean boolean22 = hikariConfig8.isAutoCommit();
        java.lang.String str23 = hikariConfig8.connectionInitSql;
        hikariConfig8.acquireRetries = (byte) 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionTestQuery = "HikariPool-1041";
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-173" + "'", str13, "HikariPool-173");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties5 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        boolean boolean7 = hikariConfig6.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        java.util.Properties properties13 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.catalog = "HikariPool-6049";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-104";
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.maxLifetime = 'a';
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-208");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        hikariConfig16.isInitializationFailFast = true;
        int int22 = hikariConfig16.acquireRetries;
        boolean boolean23 = hikariConfig16.isJdbc4connectionTest;
        hikariConfig16.connectionTestQuery = "";
        java.util.Properties properties26 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties26;
        hikariConfig1.maxLifetime = 60L;
        java.lang.String str30 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        hikariConfig11.connectionInitSql = "HikariPool-222";
        hikariConfig11.setPoolName("HikariPool-114");
        hikariConfig11.setUseInstrumentation(true);
        long long24 = hikariConfig11.getAcquireRetryDelay();
        boolean boolean25 = hikariConfig11.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig11.connectionCustomizer;
        boolean boolean27 = hikariConfig11.isJdbc4connectionTest;
        long long28 = hikariConfig11.getMaxLifetime();
        java.lang.String str29 = hikariConfig11.connectionTestQuery;
        boolean boolean30 = hikariConfig11.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getConnectionTimeout();
        long long5 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.poolName = "HikariPool-11754";
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setCatalog("HikariPool-6");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setPoolName("HikariPool-654");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.setUseInstrumentation(true);
        hikariConfig18.connectionTestQuery = "HikariPool-104";
        hikariConfig18.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource28 = null;
        hikariConfig18.setDataSource(dataSource28);
        java.lang.String str30 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isAutoCommit;
        hikariConfig33.poolName = "hi!";
        hikariConfig33.setTransactionIsolation("hi!");
        long long39 = hikariConfig33.connectionTimeout;
        java.lang.String str40 = hikariConfig33.getPoolName();
        boolean boolean41 = hikariConfig33.isRegisterMbeans;
        boolean boolean42 = hikariConfig33.isRegisterMbeans;
        java.lang.String str43 = hikariConfig33.dataSourceClassName;
        hikariConfig18.addDataSourceProperty("HikariPool-410", (java.lang.Object) hikariConfig33);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer45 = hikariConfig33.connectionCustomizer;
        hikariConfig33.isAutoCommit = true;
        hikariConfig33.connectionTimeout = 10L;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        java.lang.String str53 = hikariConfig52.getConnectionTestQuery();
        long long54 = hikariConfig52.idleTimeout;
        long long55 = hikariConfig52.leakDetectionThreshold;
        long long56 = hikariConfig52.getLeakDetectionThreshold();
        long long57 = hikariConfig52.getConnectionTimeout();
        boolean boolean58 = hikariConfig52.isRegisterMbeans;
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        int int61 = hikariConfig60.getTransactionIsolation();
        hikariConfig60.setRegisterMbeans(false);
        java.lang.String str64 = hikariConfig60.transactionIsolationName;
        long long65 = hikariConfig60.getIdleTimeout();
        java.lang.String str66 = hikariConfig60.getConnectionTestQuery();
        javax.sql.DataSource dataSource67 = hikariConfig60.dataSource;
        hikariConfig60.leakDetectionThreshold = 0;
        hikariConfig60.setJdbc4ConnectionTest(false);
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        boolean boolean74 = hikariConfig73.isAutoCommit;
        hikariConfig73.poolName = "hi!";
        hikariConfig73.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource79 = null;
        hikariConfig73.dataSource = dataSource79;
        int int81 = hikariConfig73.minPoolSize;
        int int82 = hikariConfig73.minPoolSize;
        java.lang.String str83 = hikariConfig73.dataSourceClassName;
        java.util.Properties properties84 = hikariConfig73.getDataSourceProperties();
        hikariConfig60.setDataSourceProperties(properties84);
        hikariConfig52.dataSourceProperties = properties84;
        hikariConfig33.addDataSourceProperty("HikariPool-2573", (java.lang.Object) properties84);
        hikariConfig1.setDataSourceProperties(properties84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(iConnectionCustomizer45);
        org.junit.Assert.assertNull(str53);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 60L + "'", long54 == 60L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(str64);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 60L + "'", long65 == 60L);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(dataSource67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(properties84);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.transactionIsolation = (byte) 1;
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        java.lang.String str15 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-39047" + "'", str8, "HikariPool-39047");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-39047" + "'", str15, "HikariPool-39047");
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.connectionInitSql = "HikariPool-306";
        hikariConfig1.setCatalog("");
        java.util.Properties properties25 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-308");
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        hikariConfig1.setCatalog("HikariPool-292");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        java.lang.String str15 = hikariConfig1.catalog;
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-292" + "'", str15, "HikariPool-292");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setDataSourceClassName("HikariPool-409");
        hikariConfig1.maxLifetime = 'a';
        int int10 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str8 = hikariConfig1.poolName;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isAutoCommit;
        hikariConfig11.poolName = "hi!";
        hikariConfig11.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig11.dataSource = dataSource17;
        int int19 = hikariConfig11.minPoolSize;
        int int20 = hikariConfig11.minPoolSize;
        hikariConfig11.isInitializationFailFast = false;
        java.lang.String str23 = hikariConfig11.getCatalog();
        hikariConfig11.isAutoCommit = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer26;
        hikariConfig11.leakDetectionThreshold = (byte) -1;
        hikariConfig1.addDataSourceProperty("HikariPool-388", (java.lang.Object) (byte) -1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-39059" + "'", str8, "HikariPool-39059");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        long long11 = hikariConfig1.getConnectionTimeout();
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int15 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = 32L;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-910");
        long long18 = hikariConfig1.getIdleTimeout();
        int int19 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.maxPoolSize = 52;
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.poolName;
        int int8 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-308";
        java.lang.String str11 = hikariConfig0.catalog;
        hikariConfig0.validate();
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-39064" + "'", str7, "HikariPool-39064");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-204");
        hikariConfig1.setTransactionIsolation("HikariPool-134");
        hikariConfig1.dataSourceClassName = "HikariPool-251";
        hikariConfig1.dataSourceClassName = "HikariPool-556";
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 1800000L;
        long long10 = hikariConfig1.maxLifetime;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        int int8 = hikariConfig1.getAcquireRetries();
        java.lang.String str9 = hikariConfig1.poolName;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        long long11 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-39067" + "'", str9, "HikariPool-39067");
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        hikariConfig1.acquireRetries = (short) -1;
        hikariConfig1.setConnectionInitSql("HikariPool-119");
        hikariConfig1.minPoolSize = 'a';
        hikariConfig1.connectionCustomizerClassName = "HikariPool-325";
        hikariConfig1.maxPoolSize = 32;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.idleTimeout = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(0);
        java.lang.String str19 = hikariConfig1.dataSourceClassName;
        int int20 = hikariConfig1.getTransactionIsolation();
        int int21 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        hikariConfig24.isInitializationFailFast = true;
        hikariConfig24.dataSourceClassName = "HikariPool-249";
        hikariConfig24.connectionTestQuery = "HikariPool-6";
        hikariConfig24.isJdbc4connectionTest = true;
        hikariConfig24.poolName = "HikariPool-1157";
        hikariConfig24.connectionCustomizerClassName = "HikariPool-402";
        hikariConfig1.addDataSourceProperty("HikariPool-34443", (java.lang.Object) hikariConfig24);
        hikariConfig1.dataSourceClassName = "HikariPool-7040";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        hikariConfig1.setAcquireRetries(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        int int26 = hikariConfig1.transactionIsolation;
        int int27 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource28 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource29 = hikariConfig1.dataSource;
        hikariConfig1.transactionIsolationName = "HikariPool-2510";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(dataSource29);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        hikariConfig1.setAutoCommit(false);
        java.lang.String str13 = hikariConfig1.getPoolName();
        int int14 = hikariConfig1.getTransactionIsolation();
        java.lang.String str15 = hikariConfig1.catalog;
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-39074" + "'", str13, "HikariPool-39074");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "HikariPool-3412";
        hikariConfig1.acquireRetries = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.setCatalog("HikariPool-252");
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setCatalog("hi!");
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        int int18 = hikariConfig1.minPoolSize;
        hikariConfig1.setMinimumPoolSize(60);
        int int21 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.catalog = "HikariPool-1555";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setRegisterMbeans(true);
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setDataSourceClassName("");
        hikariConfig13.validate();
        long long17 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.setIdleTimeout((long) '4');
        java.lang.String str20 = hikariConfig13.connectionCustomizerClassName;
        hikariConfig13.idleTimeout = (short) 0;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) (short) 0);
        boolean boolean24 = hikariConfig1.isInitializationFailFast();
        boolean boolean25 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource26 = hikariConfig1.getDataSource();
        java.lang.String str27 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        long long12 = hikariConfig1.getConnectionTimeout();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str18 = hikariConfig1.getPoolName();
        int int19 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        boolean boolean6 = hikariConfig1.isInitializationFailFast;
        java.lang.String str7 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-39087" + "'", str7, "HikariPool-39087");
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.leakDetectionThreshold = 100;
        hikariConfig8.minPoolSize = (byte) 1;
        hikariConfig8.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig8.connectionCustomizer;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.dataSourceClassName = "";
        hikariConfig17.setTransactionIsolation("");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.isInitializationFailFast = true;
        int int32 = hikariConfig26.acquireRetries;
        hikariConfig26.setMaxLifetime((long) (-1));
        int int35 = hikariConfig26.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.transactionIsolation;
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig17.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig8.dataSourceProperties = properties44;
        boolean boolean49 = hikariConfig8.isInitializationFailFast();
        boolean boolean50 = hikariConfig8.isInitializationFailFast;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setConnectionInitSql("hi!");
        long long55 = hikariConfig52.getLeakDetectionThreshold();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        int int58 = hikariConfig57.getTransactionIsolation();
        hikariConfig57.setRegisterMbeans(false);
        java.lang.String str61 = hikariConfig57.transactionIsolationName;
        int int62 = hikariConfig57.getMaximumPoolSize();
        int int63 = hikariConfig57.transactionIsolation;
        java.util.Properties properties64 = hikariConfig57.dataSourceProperties;
        hikariConfig52.dataSourceProperties = properties64;
        java.util.Properties properties66 = hikariConfig52.getDataSourceProperties();
        hikariConfig8.dataSourceProperties = properties66;
        hikariConfig1.dataSourceProperties = properties66;
        long long69 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.maxLifetime = (short) 1;
        java.lang.String str72 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 100L + "'", long69 == 100L);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setRegisterMbeans(true);
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setDataSourceClassName("");
        hikariConfig13.validate();
        long long17 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.setIdleTimeout((long) '4');
        java.lang.String str20 = hikariConfig13.connectionCustomizerClassName;
        hikariConfig13.idleTimeout = (short) 0;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) (short) 0);
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        int int26 = hikariConfig1.transactionIsolation;
        java.lang.String str27 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = hikariConfig1.connectionCustomizer;
        java.lang.String str31 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(iConnectionCustomizer30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.maxPoolSize = (-1);
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setTransactionIsolation("HikariPool-1187");
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str11 = hikariConfig1.poolName;
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39099" + "'", str11, "HikariPool-39099");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        long long6 = hikariConfig1.getConnectionTimeout();
        long long7 = hikariConfig1.getConnectionTimeout();
        long long8 = hikariConfig1.connectionTimeout;
        java.lang.String str9 = hikariConfig1.catalog;
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.transactionIsolationName;
        int int17 = hikariConfig12.transactionIsolation;
        java.lang.String str18 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.isAutoCommit = true;
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        java.lang.String str23 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39101" + "'", str10, "HikariPool-39101");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        long long19 = hikariConfig14.connectionTimeout;
        boolean boolean20 = hikariConfig14.isRegisterMbeans();
        hikariConfig14.setInitializationFailFast(false);
        hikariConfig1.addDataSourceProperty("HikariPool-714", (java.lang.Object) false);
        hikariConfig1.catalog = "HikariPool-35";
        hikariConfig1.minPoolSize = (byte) 10;
        long long28 = hikariConfig1.leakDetectionThreshold;
        long long29 = hikariConfig1.maxLifetime;
        long long30 = hikariConfig1.connectionTimeout;
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setCatalog("HikariPool-597");
        hikariConfig1.catalog = "HikariPool-1211";
        hikariConfig1.maxLifetime = 5000L;
        long long17 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        long long11 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        boolean boolean14 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-32987");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-32987 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setCatalog("HikariPool-770");
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((-1L));
        java.lang.String str19 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("HikariPool-19303");
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-770" + "'", str19, "HikariPool-770");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.leakDetectionThreshold = 100;
        hikariConfig14.setTransactionIsolation("hi!");
        int int19 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig1.addDataSourceProperty("HikariPool-112", (java.lang.Object) hikariConfig14);
        boolean boolean23 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.setConnectionTimeout((long) 0);
        java.lang.String str28 = hikariConfig1.poolName;
        java.util.Properties properties29 = hikariConfig1.getDataSourceProperties();
        java.lang.String str30 = hikariConfig1.connectionTestQuery;
        boolean boolean31 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-39117" + "'", str28, "HikariPool-39117");
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        hikariConfig1.setMinimumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTestQuery("HikariPool-320");
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        int int23 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-39120" + "'", str15, "HikariPool-39120");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        long long10 = hikariConfig1.idleTimeout;
        hikariConfig1.leakDetectionThreshold = 87;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setMinimumPoolSize(100);
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        long long12 = hikariConfig1.getIdleTimeout();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setCatalog("HikariPool-38700");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.transactionIsolation = ' ';
        hikariConfig1.setConnectionTestQuery("HikariPool-34");
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.maxPoolSize = 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-472" + "'", str12, "HikariPool-472");
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionInitSql("HikariPool-1230");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        int int4 = hikariConfig1.getAcquireRetries();
        hikariConfig1.poolName = "";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setInitializationFailFast(false);
        long long12 = hikariConfig9.getLeakDetectionThreshold();
        boolean boolean13 = hikariConfig9.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        boolean boolean8 = hikariConfig1.isAutoCommit;
        int int9 = hikariConfig1.transactionIsolation;
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        long long11 = hikariConfig1.maxLifetime;
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        boolean boolean47 = hikariConfig46.isAutoCommit;
        hikariConfig46.poolName = "hi!";
        java.lang.String str50 = hikariConfig46.dataSourceClassName;
        java.lang.String str51 = hikariConfig46.dataSourceClassName;
        hikariConfig46.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer54 = hikariConfig46.connectionCustomizer;
        hikariConfig46.setInitializationFailFast(true);
        int int57 = hikariConfig46.transactionIsolation;
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.dataSourceClassName = "";
        java.util.Properties properties62 = hikariConfig59.dataSourceProperties;
        hikariConfig46.setDataSourceProperties(properties62);
        hikariConfig1.setDataSourceProperties(properties62);
        hikariConfig1.maxLifetime = 87;
        java.lang.String str67 = hikariConfig1.getConnectionTestQuery();
        boolean boolean68 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(iConnectionCustomizer54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.getPoolName();
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionTestQuery("HikariPool-1632");
        hikariConfig11.connectionTestQuery = "HikariPool-551";
        hikariConfig11.connectionCustomizerClassName = "";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        int int9 = hikariConfig1.maxPoolSize;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.transactionIsolation;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig11.dataSource = dataSource17;
        long long19 = hikariConfig11.maxLifetime;
        hikariConfig11.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties22;
        boolean boolean24 = hikariConfig1.isAutoCommit;
        java.lang.String str25 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-39146" + "'", str25, "HikariPool-39146");
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.validate();
        hikariConfig1.setDataSourceClassName("HikariPool-387");
        hikariConfig1.transactionIsolationName = "HikariPool-389";
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer7;
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.maxLifetime = 87;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        long long17 = hikariConfig1.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        hikariConfig16.setTransactionIsolation("hi!");
        long long22 = hikariConfig16.connectionTimeout;
        java.lang.String str23 = hikariConfig16.getPoolName();
        boolean boolean24 = hikariConfig16.isRegisterMbeans;
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        java.lang.String str26 = hikariConfig16.dataSourceClassName;
        hikariConfig1.addDataSourceProperty("HikariPool-410", (java.lang.Object) hikariConfig16);
        boolean boolean28 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig16.connectionTestQuery = "HikariPool-718";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig16.connectionCustomizer = iConnectionCustomizer31;
        hikariConfig16.acquireRetries = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.transactionIsolationName = "HikariPool-126";
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.transactionIsolation = 1;
        hikariConfig1.maxPoolSize = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        boolean boolean47 = hikariConfig46.isAutoCommit;
        hikariConfig46.poolName = "hi!";
        java.lang.String str50 = hikariConfig46.dataSourceClassName;
        java.lang.String str51 = hikariConfig46.dataSourceClassName;
        hikariConfig46.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer54 = hikariConfig46.connectionCustomizer;
        hikariConfig46.setInitializationFailFast(true);
        int int57 = hikariConfig46.transactionIsolation;
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.dataSourceClassName = "";
        java.util.Properties properties62 = hikariConfig59.dataSourceProperties;
        hikariConfig46.setDataSourceProperties(properties62);
        hikariConfig1.setDataSourceProperties(properties62);
        hikariConfig1.transactionIsolationName = "HikariPool-597";
        long long67 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(iConnectionCustomizer54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties62);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 60L + "'", long67 == 60L);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAutoCommit(true);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.transactionIsolation = (short) -1;
        hikariConfig1.acquireRetries = 3;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1503";
        int int24 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig1.connectionCustomizer;
        long long26 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.poolName;
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.connectionInitSql = "HikariPool-403";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39166" + "'", str10, "HikariPool-39166");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.isInitializationFailFast = true;
        int int15 = hikariConfig9.acquireRetries;
        hikariConfig9.setMaxLifetime((long) (-1));
        int int18 = hikariConfig9.getTransactionIsolation();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        int int25 = hikariConfig20.getMaximumPoolSize();
        int int26 = hikariConfig20.transactionIsolation;
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        hikariConfig9.setDataSourceProperties(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        hikariConfig1.connectionInitSql = "HikariPool-523";
        long long32 = hikariConfig1.getIdleTimeout();
        int int33 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60L + "'", long32 == 60L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig5.dataSourceClassName = "";
        hikariConfig5.setTransactionIsolation("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.isInitializationFailFast = true;
        int int20 = hikariConfig14.acquireRetries;
        hikariConfig14.setMaxLifetime((long) (-1));
        int int23 = hikariConfig14.getTransactionIsolation();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig14.setDataSourceProperties(properties32);
        hikariConfig5.dataSourceProperties = properties32;
        hikariConfig1.dataSourceProperties = properties32;
        java.util.Properties properties36 = hikariConfig1.dataSourceProperties;
        java.lang.String str37 = hikariConfig1.getDataSourceClassName();
        java.lang.String str38 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionInitSql = "HikariPool-752";
        int int41 = hikariConfig1.acquireRetries;
        java.lang.String str42 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.connectionTimeout;
        int int11 = hikariConfig1.getTransactionIsolation();
        int int12 = hikariConfig1.transactionIsolation;
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig1.catalog;
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionTestQuery = "HikariPool-37381";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.maxPoolSize;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-981");
        hikariConfig0.setInitializationFailFast(false);
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isAutoCommit;
        hikariConfig9.poolName = "hi!";
        java.lang.String str13 = hikariConfig9.dataSourceClassName;
        java.lang.String str14 = hikariConfig9.dataSourceClassName;
        hikariConfig9.setJdbc4ConnectionTest(false);
        hikariConfig9.maxLifetime = '#';
        java.lang.String str19 = hikariConfig9.catalog;
        java.lang.String str20 = hikariConfig9.getConnectionInitSql();
        int int21 = hikariConfig9.getTransactionIsolation();
        java.util.Properties properties22 = hikariConfig9.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties22;
        hikariConfig0.dataSourceClassName = "HikariPool-451";
        int int26 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = 35;
        hikariConfig0.setAcquireRetries(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60 + "'", int1 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.connectionTimeout = 1;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-2213");
        hikariConfig1.connectionInitSql = "HikariPool-423";
        int int17 = hikariConfig1.minPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39182" + "'", str11, "HikariPool-39182");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        hikariConfig1.setDataSourceClassName("HikariPool-308");
        hikariConfig1.setMaxLifetime(35L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-21");
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.transactionIsolationName = "HikariPool-158";
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.catalog = "HikariPool-177";
        hikariConfig1.setMinimumPoolSize(1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.maxPoolSize = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setUseInstrumentation(true);
        int int15 = hikariConfig1.maxPoolSize;
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean5 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setPoolName("HikariPool-35758");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        int int18 = hikariConfig1.minPoolSize;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("hi!");
        long long23 = hikariConfig20.getLeakDetectionThreshold();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties32;
        java.util.Properties properties34 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties34);
        java.lang.String str36 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        int int39 = hikariConfig1.minPoolSize;
        java.lang.String str40 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-690";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-409";
        int int45 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        int int11 = hikariConfig1.getAcquireRetries();
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.dataSourceClassName = "HikariPool-36005";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.maxLifetime = 0L;
        java.lang.String str9 = hikariConfig1.getPoolName();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-39195" + "'", str9, "HikariPool-39195");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        boolean boolean14 = hikariConfig1.isAutoCommit;
        hikariConfig1.setConnectionTestQuery("HikariPool-6319");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-306");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.leakDetectionThreshold = 100;
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.maxPoolSize = 0;
        hikariConfig12.setCatalog("HikariPool-104");
        java.lang.String str23 = hikariConfig12.getConnectionCustomizerClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-90", (java.lang.Object) hikariConfig12);
        java.lang.String str25 = hikariConfig1.transactionIsolationName;
        boolean boolean26 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setAutoCommit(false);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        long long11 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        hikariConfig1.setCatalog("HikariPool-1049");
        hikariConfig1.connectionTestQuery = "HikariPool-348";
        hikariConfig1.setConnectionTestQuery("HikariPool-2820");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-551");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-551 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.acquireRetries = 97;
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.minPoolSize = 87;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        long long16 = hikariConfig1.getMaxLifetime();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        int int18 = hikariConfig1.getMaximumPoolSize();
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.catalog;
        int int22 = hikariConfig20.getMinimumPoolSize();
        hikariConfig20.connectionCustomizerClassName = "hi!";
        hikariConfig20.setMaximumPoolSize((int) (byte) 100);
        int int27 = hikariConfig20.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig20.connectionCustomizer;
        hikariConfig20.minPoolSize = (short) -1;
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        hikariConfig32.setUseInstrumentation(true);
        hikariConfig32.setConnectionInitSql("");
        hikariConfig32.setRegisterMbeans(true);
        long long42 = hikariConfig32.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig44.setDataSourceClassName("");
        hikariConfig44.validate();
        long long48 = hikariConfig44.getLeakDetectionThreshold();
        hikariConfig44.setIdleTimeout((long) '4');
        java.lang.String str51 = hikariConfig44.connectionCustomizerClassName;
        hikariConfig44.idleTimeout = (short) 0;
        hikariConfig32.addDataSourceProperty("HikariPool-222", (java.lang.Object) (short) 0);
        hikariConfig32.setIdleTimeout((long) (byte) 10);
        java.util.Properties properties57 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        boolean boolean59 = hikariConfig58.isAutoCommit;
        hikariConfig58.poolName = "hi!";
        java.lang.String str62 = hikariConfig58.dataSourceClassName;
        java.lang.String str63 = hikariConfig58.dataSourceClassName;
        hikariConfig58.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer66 = hikariConfig58.connectionCustomizer;
        hikariConfig58.setMaxLifetime((long) (short) 0);
        hikariConfig58.setAcquireRetries(100);
        long long71 = hikariConfig58.getIdleTimeout();
        java.lang.String str72 = hikariConfig58.dataSourceClassName;
        long long73 = hikariConfig58.getMaxLifetime();
        long long74 = hikariConfig58.getLeakDetectionThreshold();
        int int75 = hikariConfig58.getMaximumPoolSize();
        boolean boolean76 = hikariConfig58.isJdbc4ConnectionTest();
        java.util.Properties properties77 = hikariConfig58.dataSourceProperties;
        hikariConfig32.setDataSourceProperties(properties77);
        hikariConfig20.setDataSourceProperties(properties77);
        hikariConfig1.dataSourceProperties = properties77;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6580");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(iConnectionCustomizer66);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + 60L + "'", long71 == 60L);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 60 + "'", int75 == 60);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(properties77);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.poolName = "HikariPool-36";
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.dataSourceClassName = "HikariPool-530";
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isJdbc4connectionTest = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.transactionIsolationName = "HikariPool-68";
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        int int8 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.poolName = "hi!";
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.dataSource = dataSource14;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig10.setDataSource(dataSource16);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        java.lang.String str23 = hikariConfig19.transactionIsolationName;
        long long24 = hikariConfig19.connectionTimeout;
        hikariConfig19.setIdleTimeout(0L);
        java.util.Properties properties27 = hikariConfig19.dataSourceProperties;
        hikariConfig10.setDataSourceProperties(properties27);
        hikariConfig1.dataSourceProperties = properties27;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.maxPoolSize = 0;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.poolName;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.connectionTestQuery;
        java.lang.String str15 = hikariConfig13.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.catalog;
        int int18 = hikariConfig16.getMinimumPoolSize();
        java.util.Properties properties19 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig13.dataSourceProperties = properties19;
        hikariConfig13.setDataSourceClassName("HikariPool-7178");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39223" + "'", str11, "HikariPool-39223");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-68");
        int int11 = hikariConfig1.getTransactionIsolation();
        java.lang.String str12 = hikariConfig1.poolName;
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-39227" + "'", str12, "HikariPool-39227");
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.poolName;
        hikariConfig10.setDataSourceClassName("");
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig10);
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setDataSourceClassName("HikariPool-472");
        int int18 = hikariConfig1.acquireRetries;
        hikariConfig1.connectionTimeout = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-559");
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str25 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39229" + "'", str11, "HikariPool-39229");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getTransactionIsolation();
        hikariConfig7.setRegisterMbeans(false);
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.connectionTestQuery = "HikariPool-104";
        hikariConfig7.maxPoolSize = (short) 100;
        hikariConfig7.setCatalog("HikariPool-26");
        java.lang.String str19 = hikariConfig7.transactionIsolationName;
        java.lang.String str20 = hikariConfig7.catalog;
        boolean boolean21 = hikariConfig7.isRegisterMbeans();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig23.transactionIsolationName;
        int int28 = hikariConfig23.transactionIsolation;
        java.lang.String str29 = hikariConfig23.getConnectionInitSql();
        hikariConfig23.isAutoCommit = true;
        long long32 = hikariConfig23.getIdleTimeout();
        hikariConfig23.setAutoCommit(true);
        int int35 = hikariConfig23.getAcquireRetries();
        hikariConfig23.connectionCustomizerClassName = "HikariPool-292";
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        int int44 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.isRegisterMbeans = false;
        boolean boolean47 = hikariConfig39.isRegisterMbeans();
        java.lang.String str48 = hikariConfig39.getCatalog();
        hikariConfig39.transactionIsolation = 100;
        java.util.Properties properties51 = hikariConfig39.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties51);
        hikariConfig7.setDataSourceProperties(properties51);
        hikariConfig7.connectionTimeout = 3;
        hikariConfig0.addDataSourceProperty("HikariPool-950", (java.lang.Object) 3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-26" + "'", str20, "HikariPool-26");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60L + "'", long32 == 60L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        hikariConfig1.idleTimeout = 1800000L;
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isAutoCommit;
        hikariConfig12.poolName = "hi!";
        java.lang.String str16 = hikariConfig12.dataSourceClassName;
        java.lang.String str17 = hikariConfig12.dataSourceClassName;
        hikariConfig12.setJdbc4ConnectionTest(false);
        int int20 = hikariConfig12.maxPoolSize;
        hikariConfig12.isRegisterMbeans = false;
        hikariConfig12.setLeakDetectionThreshold((long) 60);
        hikariConfig12.connectionTimeout = 1800000L;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        java.lang.String str32 = hikariConfig28.transactionIsolationName;
        int int33 = hikariConfig28.transactionIsolation;
        java.lang.String str34 = hikariConfig28.getConnectionInitSql();
        hikariConfig28.isAutoCommit = true;
        java.util.Properties properties37 = hikariConfig28.getDataSourceProperties();
        java.util.Properties properties38 = hikariConfig28.dataSourceProperties;
        hikariConfig12.dataSourceProperties = properties38;
        hikariConfig1.setDataSourceProperties(properties38);
        hikariConfig1.setConnectionTestQuery("HikariPool-94");
        hikariConfig1.connectionInitSql = "HikariPool-437";
        long long45 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties46 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39234" + "'", str10, "HikariPool-39234");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        hikariConfig1.leakDetectionThreshold = ' ';
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        long long9 = hikariConfig1.connectionTimeout;
        long long10 = hikariConfig1.getMaxLifetime();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.leakDetectionThreshold = (byte) 0;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        hikariConfig1.idleTimeout = 52L;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolationName = "HikariPool-145";
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str16 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.setMaxLifetime((long) 3);
        long long15 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.dataSourceClassName = "HikariPool-222";
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionInitSql("HikariPool-359");
        hikariConfig1.poolName = "HikariPool-327";
        hikariConfig1.isJdbc4connectionTest = false;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.leakDetectionThreshold = 100;
        boolean boolean21 = hikariConfig18.isJdbc4connectionTest;
        long long22 = hikariConfig18.getIdleTimeout();
        hikariConfig18.setUseInstrumentation(false);
        hikariConfig18.setJdbc4ConnectionTest(false);
        java.util.Properties properties27 = hikariConfig18.dataSourceProperties;
        hikariConfig18.setConnectionCustomizerClassName("HikariPool-306");
        hikariConfig18.connectionTestQuery = "HikariPool-306";
        hikariConfig18.setCatalog("HikariPool-142");
        java.lang.String str34 = hikariConfig18.getConnectionCustomizerClassName();
        hikariConfig18.idleTimeout = 52L;
        long long37 = hikariConfig18.getIdleTimeout();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        long long44 = hikariConfig39.getIdleTimeout();
        java.lang.String str45 = hikariConfig39.getCatalog();
        long long46 = hikariConfig39.getConnectionTimeout();
        java.lang.String str47 = hikariConfig39.transactionIsolationName;
        java.lang.String str48 = hikariConfig39.connectionCustomizerClassName;
        hikariConfig39.transactionIsolation = (short) 1;
        java.util.Properties properties51 = hikariConfig39.getDataSourceProperties();
        hikariConfig18.dataSourceProperties = properties51;
        hikariConfig1.dataSourceProperties = properties51;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-306" + "'", str34, "HikariPool-306");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 60L + "'", long44 == 60L);
        org.junit.Assert.assertNull(str45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.transactionIsolationName = "HikariPool-205";
        long long16 = hikariConfig1.getIdleTimeout();
        java.lang.String str17 = hikariConfig1.connectionInitSql;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setPoolName("HikariPool-222");
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = false;
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.transactionIsolation = 52;
        int int16 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.transactionIsolationName = "HikariPool-205";
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setConnectionInitSql("hi!");
        int int21 = hikariConfig18.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-780", (java.lang.Object) int21);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        hikariConfig24.isInitializationFailFast = true;
        int int30 = hikariConfig24.acquireRetries;
        hikariConfig24.setMaxLifetime((long) (-1));
        boolean boolean33 = hikariConfig24.isInitializationFailFast();
        long long34 = hikariConfig24.maxLifetime;
        hikariConfig24.minPoolSize = (byte) -1;
        boolean boolean37 = hikariConfig24.isJdbc4connectionTest;
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        long long44 = hikariConfig39.getIdleTimeout();
        java.lang.String str45 = hikariConfig39.getCatalog();
        java.lang.String str46 = hikariConfig39.getConnectionTestQuery();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig48.dataSourceClassName = "";
        java.util.Properties properties51 = hikariConfig48.dataSourceProperties;
        hikariConfig39.setDataSourceProperties(properties51);
        hikariConfig24.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig1.setDataSourceProperties(properties51);
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setConnectionInitSql("HikariPool-344");
        hikariConfig1.setConnectionTestQuery("HikariPool-2758");
        hikariConfig1.setPoolName("HikariPool-30812");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 60L + "'", long44 == 60L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaxLifetime((long) 60);
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setConnectionInitSql("hi!");
        boolean boolean21 = hikariConfig18.isRegisterMbeans();
        hikariConfig18.setIdleTimeout((long) (short) 100);
        hikariConfig18.maxPoolSize = (-1);
        long long26 = hikariConfig18.getAcquireRetryDelay();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.poolName = "hi!";
        hikariConfig28.acquireRetries = ' ';
        hikariConfig28.connectionTimeout = (byte) 1;
        hikariConfig28.setUseInstrumentation(true);
        hikariConfig28.transactionIsolation = 100;
        java.util.Properties properties40 = hikariConfig28.dataSourceProperties;
        hikariConfig18.setDataSourceProperties(properties40);
        hikariConfig1.dataSourceProperties = properties40;
        java.util.Properties properties43 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int7 = hikariConfig1.getAcquireRetries();
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.maxLifetime = 0L;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.maxLifetime = (-1L);
        hikariConfig1.transactionIsolationName = "HikariPool-2015";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1413");
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39264" + "'", str11, "HikariPool-39264");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-514";
        long long15 = hikariConfig1.getIdleTimeout();
        long long16 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionTestQuery = "HikariPool-1251";
        hikariConfig1.setCatalog("HikariPool-20702");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isAutoCommit;
        hikariConfig13.poolName = "hi!";
        java.lang.String str17 = hikariConfig13.dataSourceClassName;
        java.lang.String str18 = hikariConfig13.dataSourceClassName;
        hikariConfig13.setJdbc4ConnectionTest(false);
        int int21 = hikariConfig13.maxPoolSize;
        hikariConfig13.idleTimeout = (byte) -1;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        hikariConfig25.dataSourceClassName = "";
        hikariConfig25.setTransactionIsolation("");
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        hikariConfig34.isInitializationFailFast = true;
        int int40 = hikariConfig34.acquireRetries;
        hikariConfig34.setMaxLifetime((long) (-1));
        int int43 = hikariConfig34.getTransactionIsolation();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        int int50 = hikariConfig45.getMaximumPoolSize();
        int int51 = hikariConfig45.transactionIsolation;
        java.util.Properties properties52 = hikariConfig45.dataSourceProperties;
        hikariConfig34.setDataSourceProperties(properties52);
        hikariConfig25.dataSourceProperties = properties52;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig13.dataSourceProperties = properties52;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig1.addDataSourceProperty("HikariPool-31602", (java.lang.Object) properties52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 60 + "'", int50 == 60);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(properties52);
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setMaxLifetime(97L);
        hikariConfig1.connectionInitSql = "HikariPool-495";
        long long16 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-18626");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionTimeout(5000L);
        hikariConfig1.setDataSourceClassName("HikariPool-252");
        hikariConfig1.setConnectionInitSql("HikariPool-220");
        hikariConfig1.maxPoolSize = 87;
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        hikariConfig1.setDataSourceClassName("HikariPool-5863");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.dataSourceClassName = "HikariPool-320";
        hikariConfig0.connectionCustomizerClassName = "HikariPool-5522";
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setAutoCommit(false);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig15.transactionIsolationName;
        int int20 = hikariConfig15.transactionIsolation;
        java.lang.String str21 = hikariConfig15.getConnectionInitSql();
        hikariConfig15.isAutoCommit = true;
        long long24 = hikariConfig15.getIdleTimeout();
        hikariConfig15.setMaximumPoolSize((int) 'a');
        hikariConfig15.setMinimumPoolSize(0);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        boolean boolean32 = hikariConfig31.isAutoCommit;
        hikariConfig31.connectionTestQuery = "";
        java.lang.String str35 = hikariConfig31.connectionCustomizerClassName;
        int int36 = hikariConfig31.getAcquireIncrement();
        java.lang.String str37 = hikariConfig31.getPoolName();
        hikariConfig31.dataSourceClassName = "HikariPool-247";
        java.util.Properties properties40 = hikariConfig31.dataSourceProperties;
        hikariConfig15.addDataSourceProperty("HikariPool-1099", (java.lang.Object) properties40);
        hikariConfig1.dataSourceProperties = properties40;
        long long43 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60L + "'", long24 == 60L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-39280" + "'", str37, "HikariPool-39280");
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.leakDetectionThreshold = 100;
        hikariConfig8.minPoolSize = (byte) 1;
        hikariConfig8.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig8.connectionCustomizer;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.dataSourceClassName = "";
        hikariConfig17.setTransactionIsolation("");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.isInitializationFailFast = true;
        int int32 = hikariConfig26.acquireRetries;
        hikariConfig26.setMaxLifetime((long) (-1));
        int int35 = hikariConfig26.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.transactionIsolation;
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig17.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig8.dataSourceProperties = properties44;
        boolean boolean49 = hikariConfig8.isInitializationFailFast();
        boolean boolean50 = hikariConfig8.isInitializationFailFast;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setConnectionInitSql("hi!");
        long long55 = hikariConfig52.getLeakDetectionThreshold();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        int int58 = hikariConfig57.getTransactionIsolation();
        hikariConfig57.setRegisterMbeans(false);
        java.lang.String str61 = hikariConfig57.transactionIsolationName;
        int int62 = hikariConfig57.getMaximumPoolSize();
        int int63 = hikariConfig57.transactionIsolation;
        java.util.Properties properties64 = hikariConfig57.dataSourceProperties;
        hikariConfig52.dataSourceProperties = properties64;
        java.util.Properties properties66 = hikariConfig52.getDataSourceProperties();
        hikariConfig8.dataSourceProperties = properties66;
        hikariConfig1.dataSourceProperties = properties66;
        int int69 = hikariConfig1.getAcquireIncrement();
        int int70 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.poolName = "HikariPool-678";
        java.util.Properties properties74 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties74);
        boolean boolean76 = hikariConfig75.isAutoCommit;
        hikariConfig75.poolName = "hi!";
        java.lang.String str79 = hikariConfig75.dataSourceClassName;
        long long80 = hikariConfig75.connectionTimeout;
        hikariConfig75.setTransactionIsolation("HikariPool-517");
        java.util.Properties properties83 = hikariConfig75.dataSourceProperties;
        hikariConfig1.addDataSourceProperty("HikariPool-395", (java.lang.Object) hikariConfig75);
        hikariConfig1.setDataSourceClassName("HikariPool-1485");
        hikariConfig1.isInitializationFailFast = true;
        long long89 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(60L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 87 + "'", int70 == 87);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(str79);
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + 10L + "'", long80 == 10L);
        org.junit.Assert.assertNotNull(properties83);
// flaky:         org.junit.Assert.assertTrue("'" + long89 + "' != '" + 10L + "'", long89 == 10L);
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = ' ';
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1227");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str10 = hikariConfig1.poolName;
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionTimeout = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39291" + "'", str10, "HikariPool-39291");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.acquireRetries = (short) 0;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.minPoolSize = (byte) 0;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) ' ');
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.minPoolSize = 97;
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        int int15 = hikariConfig1.getAcquireRetries();
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = false;
        long long19 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionInitSql = "HikariPool-70";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig5.isInitializationFailFast = true;
        int int11 = hikariConfig5.acquireRetries;
        hikariConfig5.setMaxLifetime((long) (-1));
        int int14 = hikariConfig5.getTransactionIsolation();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties23);
        int int25 = hikariConfig5.getTransactionIsolation();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int28 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.setRegisterMbeans(false);
        java.lang.String str31 = hikariConfig27.transactionIsolationName;
        int int32 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.isRegisterMbeans = false;
        boolean boolean35 = hikariConfig27.isRegisterMbeans();
        java.lang.String str36 = hikariConfig27.getCatalog();
        hikariConfig27.transactionIsolation = 100;
        java.util.Properties properties39 = hikariConfig27.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties39);
        java.util.Properties properties41 = hikariConfig5.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties41);
        hikariConfig0.poolName = "HikariPool-22357";
        hikariConfig0.minPoolSize = 52;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        long long15 = hikariConfig1.getMaxLifetime();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        long long14 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setPoolName("HikariPool-140");
        hikariConfig1.isJdbc4connectionTest = false;
        int int17 = hikariConfig1.getAcquireIncrement();
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setPoolName("HikariPool-104");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-145");
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean16 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setInitializationFailFast(true);
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.dataSourceClassName = "";
        java.util.Properties properties17 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.poolName = "HikariPool-521";
        int int23 = hikariConfig1.maxPoolSize;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        java.lang.String str30 = hikariConfig25.connectionCustomizerClassName;
        hikariConfig25.setConnectionTestQuery("hi!");
        java.lang.String str33 = hikariConfig25.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = hikariConfig25.connectionCustomizer;
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setConnectionInitSql("hi!");
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.dataSourceClassName = "";
        hikariConfig40.setTransactionIsolation("");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        int int50 = hikariConfig49.getTransactionIsolation();
        hikariConfig49.setRegisterMbeans(false);
        hikariConfig49.isInitializationFailFast = true;
        int int55 = hikariConfig49.acquireRetries;
        hikariConfig49.setMaxLifetime((long) (-1));
        int int58 = hikariConfig49.getTransactionIsolation();
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        int int61 = hikariConfig60.getTransactionIsolation();
        hikariConfig60.setRegisterMbeans(false);
        java.lang.String str64 = hikariConfig60.transactionIsolationName;
        int int65 = hikariConfig60.getMaximumPoolSize();
        int int66 = hikariConfig60.transactionIsolation;
        java.util.Properties properties67 = hikariConfig60.dataSourceProperties;
        hikariConfig49.setDataSourceProperties(properties67);
        hikariConfig40.dataSourceProperties = properties67;
        hikariConfig36.dataSourceProperties = properties67;
        hikariConfig25.setDataSourceProperties(properties67);
        java.util.Properties properties72 = hikariConfig25.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties72;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer75 = hikariConfig74.connectionCustomizer;
        hikariConfig74.setAcquireRetries(52);
        boolean boolean78 = hikariConfig74.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(iConnectionCustomizer34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 60 + "'", int65 == 60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertNull(iConnectionCustomizer75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.idleTimeout;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        int int12 = hikariConfig1.getAcquireRetries();
        long long13 = hikariConfig1.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        long long12 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(false);
        int int17 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-306");
        hikariConfig1.connectionTestQuery = "HikariPool-306";
        hikariConfig1.setCatalog("HikariPool-142");
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.idleTimeout = 52L;
        long long20 = hikariConfig1.getIdleTimeout();
        java.lang.String str21 = hikariConfig1.connectionInitSql;
        java.lang.String str22 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-306" + "'", str17, "HikariPool-306");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-110");
        hikariConfig1.setConnectionTestQuery("HikariPool-470");
        int int14 = hikariConfig1.minPoolSize;
        int int15 = hikariConfig1.getAcquireRetries();
        java.lang.String str16 = hikariConfig1.getPoolName();
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-39330" + "'", str16, "HikariPool-39330");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.leakDetectionThreshold = 100;
        hikariConfig14.setTransactionIsolation("hi!");
        int int19 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig1.addDataSourceProperty("HikariPool-112", (java.lang.Object) hikariConfig14);
        boolean boolean23 = hikariConfig1.isAutoCommit();
        java.util.Properties properties24 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties25 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setPoolName("HikariPool-647");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionTestQuery = "HikariPool-764";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        long long11 = hikariConfig1.getIdleTimeout();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaxLifetime((long) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isAutoCommit;
        hikariConfig7.poolName = "hi!";
        hikariConfig7.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig7.dataSource = dataSource13;
        int int15 = hikariConfig7.minPoolSize;
        int int16 = hikariConfig7.minPoolSize;
        hikariConfig7.setCatalog("HikariPool-550");
        hikariConfig1.addDataSourceProperty("HikariPool-481", (java.lang.Object) hikariConfig7);
        java.lang.String str20 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setPoolName("HikariPool-927");
        hikariConfig1.setConnectionTestQuery("HikariPool-2371");
        boolean boolean25 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.transactionIsolationName = "HikariPool-727";
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(1);
        java.lang.String str13 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        hikariConfig1.catalog = "HikariPool-1372";
        hikariConfig1.setCatalog("HikariPool-249");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer20;
        hikariConfig1.setAutoCommit(false);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.dataSource = dataSource24;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.catalog = "HikariPool-2254";
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setInitializationFailFast(false);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.minPoolSize = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionInitSql = "HikariPool-104";
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        int int13 = hikariConfig1.maxPoolSize;
        int int14 = hikariConfig1.getTransactionIsolation();
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        long long16 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaxLifetime(10L);
        int int19 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionCustomizerClassName("");
        boolean boolean17 = hikariConfig1.isAutoCommit();
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer21;
        int int23 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str5 = hikariConfig0.getPoolName();
        int int6 = hikariConfig0.getAcquireRetries();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        long long8 = hikariConfig0.maxLifetime;
        int int9 = hikariConfig0.maxPoolSize;
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        hikariConfig0.setIdleTimeout((long) 60);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isAutoCommit;
        hikariConfig14.poolName = "hi!";
        hikariConfig14.setMinimumPoolSize(1);
        int int20 = hikariConfig14.maxPoolSize;
        java.util.Properties properties21 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig0.setDataSourceProperties(properties21);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-39347" + "'", str5, "HikariPool-39347");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.poolName;
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39351" + "'", str10, "HikariPool-39351");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-104");
        hikariConfig1.setMaxLifetime(52L);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        long long12 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.connectionTimeout;
        int int2 = hikariConfig0.getTransactionIsolation();
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.dataSourceClassName = "HikariPool-1766";
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        hikariConfig0.catalog = "";
        hikariConfig0.maxLifetime = 0L;
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.transactionIsolationName = "HikariPool-205";
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        long long19 = hikariConfig1.idleTimeout;
        int int20 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig1.dataSource = dataSource28;
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3198");
        int int33 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-6");
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1476";
        int int18 = hikariConfig1.getAcquireRetries();
        int int19 = hikariConfig1.getTransactionIsolation();
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setIdleTimeout((long) (short) 0);
        long long15 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTestQuery = "HikariPool-26818";
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39362" + "'", str11, "HikariPool-39362");
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21959");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21959 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        long long6 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        hikariConfig1.setAcquireRetries((int) (short) 10);
        long long11 = hikariConfig1.getMaxLifetime();
        long long12 = hikariConfig1.maxLifetime;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionTestQuery("HikariPool-5823");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str13 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        int int15 = hikariConfig1.getAcquireIncrement();
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = 97;
        int int19 = hikariConfig1.acquireRetries;
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.idleTimeout = 32;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.dataSource = dataSource7;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        int int12 = hikariConfig1.getAcquireRetries();
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-35522";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39377" + "'", str11, "HikariPool-39377");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        int int4 = hikariConfig1.getMinimumPoolSize();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        hikariConfig1.leakDetectionThreshold = '#';
        int int9 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        long long15 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str16 = hikariConfig1.getCatalog();
        long long17 = hikariConfig1.connectionTimeout;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1307");
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str22 = hikariConfig1.connectionInitSql;
        java.lang.String str23 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.maxPoolSize = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-1307" + "'", str23, "HikariPool-1307");
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        hikariConfig1.idleTimeout = 60;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.leakDetectionThreshold = 100;
        hikariConfig9.minPoolSize = (byte) 1;
        hikariConfig9.catalog = "";
        boolean boolean16 = hikariConfig9.isRegisterMbeans;
        java.lang.String str17 = hikariConfig9.transactionIsolationName;
        boolean boolean18 = hikariConfig9.isRegisterMbeans;
        boolean boolean19 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setConnectionInitSql("HikariPool-763");
        hikariConfig9.setInitializationFailFast(false);
        boolean boolean24 = hikariConfig9.isRegisterMbeans;
        hikariConfig1.addDataSourceProperty("HikariPool-5701", (java.lang.Object) boolean24);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int28 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.setRegisterMbeans(false);
        hikariConfig27.isInitializationFailFast = true;
        hikariConfig27.dataSourceClassName = "HikariPool-249";
        hikariConfig27.connectionTestQuery = "HikariPool-6";
        long long37 = hikariConfig27.getMaxLifetime();
        hikariConfig27.setAcquireRetries((int) (short) 10);
        boolean boolean40 = hikariConfig27.isRegisterMbeans;
        javax.sql.DataSource dataSource41 = hikariConfig27.dataSource;
        hikariConfig27.setConnectionTestQuery("HikariPool-1242");
        long long44 = hikariConfig27.maxLifetime;
        hikariConfig27.acquireRetries = (short) 100;
        hikariConfig27.connectionTimeout = 2147483647L;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        java.lang.String str54 = hikariConfig50.connectionTestQuery;
        int int55 = hikariConfig50.getAcquireIncrement();
        java.util.Properties properties56 = hikariConfig50.dataSourceProperties;
        hikariConfig27.dataSourceProperties = properties56;
        hikariConfig1.dataSourceProperties = properties56;
        int int59 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(dataSource41);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 35L + "'", long44 == 35L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3187");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3187 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        int int13 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        long long11 = hikariConfig1.getIdleTimeout();
        boolean boolean12 = hikariConfig1.isAutoCommit;
        java.lang.String str13 = hikariConfig1.catalog;
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.isInitializationFailFast = true;
        long long19 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.transactionIsolationName = "HikariPool-68";
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-68" + "'", str14, "HikariPool-68");
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isRegisterMbeans = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.setMaxLifetime(87L);
        hikariConfig1.setMaxLifetime(1800000L);
        hikariConfig1.maxPoolSize = '4';
        hikariConfig1.transactionIsolationName = "HikariPool-690";
        hikariConfig1.setConnectionTestQuery("HikariPool-38");
        boolean boolean31 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer32;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        java.util.Properties properties13 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.idleTimeout = 'a';
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-1166");
        int int21 = hikariConfig1.getTransactionIsolation();
        long long22 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-57");
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-57" + "'", str9, "HikariPool-57");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setDataSourceClassName("HikariPool-320");
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.minPoolSize = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setPoolName("HikariPool-1971");
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-173" + "'", str15, "HikariPool-173");
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-311";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        hikariConfig1.setPoolName("HikariPool-4005");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
        java.lang.String str21 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-4005" + "'", str21, "HikariPool-4005");
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        hikariConfig1.idleTimeout = 32L;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-114" + "'", str10, "HikariPool-114");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.maxLifetime = 60L;
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.dataSourceClassName = "";
        hikariConfig14.setIdleTimeout((long) (short) 100);
        java.util.Properties properties22 = hikariConfig14.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties22;
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-133");
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource29 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(dataSource29);
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig0.poolName;
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        boolean boolean12 = hikariConfig0.isAutoCommit;
        hikariConfig0.setCatalog("HikariPool-1485");
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.poolName;
        hikariConfig16.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource20 = hikariConfig16.dataSource;
        java.lang.String str21 = hikariConfig16.connectionInitSql;
        int int22 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setTransactionIsolation("HikariPool-271");
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig16);
        boolean boolean26 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39418" + "'", str10, "HikariPool-39418");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-39419" + "'", str17, "HikariPool-39419");
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setPoolName("HikariPool-306");
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.connectionInitSql = "HikariPool-164";
        int int12 = hikariConfig1.minPoolSize;
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        long long17 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.transactionIsolation = 100;
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setConnectionTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.isInitializationFailFast = true;
        int int15 = hikariConfig9.acquireRetries;
        hikariConfig9.setMaxLifetime((long) (-1));
        int int18 = hikariConfig9.getTransactionIsolation();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        int int25 = hikariConfig20.getMaximumPoolSize();
        int int26 = hikariConfig20.transactionIsolation;
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        hikariConfig9.setDataSourceProperties(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        int int30 = hikariConfig1.maxPoolSize;
        hikariConfig1.maxPoolSize = 10;
        boolean boolean33 = hikariConfig1.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        int int4 = hikariConfig1.maxPoolSize;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setRegisterMbeans(false);
        int int8 = hikariConfig1.getAcquireRetries();
        long long9 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        long long11 = hikariConfig1.maxLifetime;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str15 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setDataSourceClassName("");
        boolean boolean13 = hikariConfig1.isAutoCommit();
        hikariConfig1.maxLifetime = (short) 100;
        long long16 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-25550";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isAutoCommit;
        hikariConfig14.poolName = "hi!";
        java.lang.String str18 = hikariConfig14.dataSourceClassName;
        java.lang.String str19 = hikariConfig14.dataSourceClassName;
        hikariConfig14.setJdbc4ConnectionTest(false);
        int int22 = hikariConfig14.maxPoolSize;
        hikariConfig14.setIdleTimeout(52L);
        java.lang.String str25 = hikariConfig14.connectionInitSql;
        hikariConfig14.acquireRetries = 97;
        java.lang.String str28 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.isInitializationFailFast = false;
        java.util.Properties properties31 = hikariConfig14.dataSourceProperties;
        hikariConfig1.addDataSourceProperty("HikariPool-31430", (java.lang.Object) properties31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionTestQuery = "HikariPool-173";
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.isInitializationFailFast = false;
        long long17 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolation = 10;
        hikariConfig1.isJdbc4connectionTest = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 60);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.maxLifetime = 60;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTimeout((long) 0);
        javax.sql.DataSource dataSource10 = hikariConfig1.dataSource;
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.transactionIsolation;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout(32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setCatalog("HikariPool-597");
        hikariConfig1.catalog = "HikariPool-1211";
        hikariConfig1.maxLifetime = 5000L;
        int int17 = hikariConfig1.getMinimumPoolSize();
        long long18 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.acquireRetries = (-1);
        hikariConfig1.idleTimeout = 2147483647L;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.minPoolSize = 97;
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.setAcquireRetries(97);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.maxPoolSize = (byte) 100;
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.minPoolSize = 87;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-12799");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        hikariConfig1.acquireRetries = (short) -1;
        hikariConfig1.setConnectionInitSql("HikariPool-119");
        hikariConfig1.minPoolSize = 'a';
        hikariConfig1.connectionCustomizerClassName = "HikariPool-325";
        hikariConfig1.maxPoolSize = 32;
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str27 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-9815", (java.lang.Object) "HikariPool-23871");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setAutoCommit(false);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        int int13 = hikariConfig1.minPoolSize;
        hikariConfig1.connectionInitSql = "HikariPool-831";
        java.lang.String str16 = hikariConfig1.catalog;
        hikariConfig1.connectionTestQuery = "HikariPool-36084";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        int int9 = hikariConfig1.getAcquireIncrement();
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        hikariConfig1.transactionIsolationName = "HikariPool-197";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        int int16 = hikariConfig1.transactionIsolation;
        hikariConfig1.maxLifetime = 52L;
        hikariConfig1.setTransactionIsolation("HikariPool-952");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.isInitializationFailFast = true;
        java.lang.String str18 = hikariConfig12.getConnectionCustomizerClassName();
        hikariConfig12.transactionIsolationName = "";
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int23 = hikariConfig22.getTransactionIsolation();
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.dataSourceClassName = "";
        hikariConfig22.setTransactionIsolation("");
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.isInitializationFailFast = true;
        int int37 = hikariConfig31.acquireRetries;
        hikariConfig31.setMaxLifetime((long) (-1));
        int int40 = hikariConfig31.getTransactionIsolation();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        int int43 = hikariConfig42.getTransactionIsolation();
        hikariConfig42.setRegisterMbeans(false);
        java.lang.String str46 = hikariConfig42.transactionIsolationName;
        int int47 = hikariConfig42.getMaximumPoolSize();
        int int48 = hikariConfig42.transactionIsolation;
        java.util.Properties properties49 = hikariConfig42.dataSourceProperties;
        hikariConfig31.setDataSourceProperties(properties49);
        hikariConfig22.dataSourceProperties = properties49;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig12.setDataSourceProperties(properties49);
        hikariConfig1.setDataSourceProperties(properties49);
        hikariConfig1.transactionIsolation = 10;
        int int57 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setInitializationFailFast(true);
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.connectionInitSql = "HikariPool-363";
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setMaximumPoolSize(60);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isRegisterMbeans = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        long long16 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionTestQuery("HikariPool-385");
        long long10 = hikariConfig1.maxLifetime;
        hikariConfig1.connectionInitSql = "HikariPool-2288";
        hikariConfig1.setConnectionTestQuery("HikariPool-820");
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-39471" + "'", str15, "HikariPool-39471");
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionTestQuery = "HikariPool-1251";
        long long12 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10815");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10815 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaxLifetime((long) 60);
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        hikariConfig1.isAutoCommit = true;
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.isInitializationFailFast = true;
        int int16 = hikariConfig10.acquireRetries;
        hikariConfig10.setMaxLifetime((long) (-1));
        int int19 = hikariConfig10.getTransactionIsolation();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        java.lang.String str25 = hikariConfig21.transactionIsolationName;
        int int26 = hikariConfig21.getMaximumPoolSize();
        int int27 = hikariConfig21.transactionIsolation;
        java.util.Properties properties28 = hikariConfig21.dataSourceProperties;
        hikariConfig10.setDataSourceProperties(properties28);
        hikariConfig1.dataSourceProperties = properties28;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int32 = hikariConfig31.maxPoolSize;
        hikariConfig31.isInitializationFailFast = false;
        hikariConfig31.setMaximumPoolSize((int) (byte) 1);
        hikariConfig31.setCatalog("HikariPool-32708");
        java.lang.String str39 = hikariConfig31.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        hikariConfig1.setCatalog("HikariPool-26");
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        int int14 = hikariConfig1.getTransactionIsolation();
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.dataSourceClassName = "";
        hikariConfig14.setIdleTimeout((long) (short) 100);
        java.util.Properties properties22 = hikariConfig14.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties22;
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-838");
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.dataSource = dataSource27;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("hi!");
        long long12 = hikariConfig9.getLeakDetectionThreshold();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.getMaximumPoolSize();
        int int20 = hikariConfig14.transactionIsolation;
        java.util.Properties properties21 = hikariConfig14.dataSourceProperties;
        hikariConfig9.dataSourceProperties = properties21;
        java.util.Properties properties23 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties23;
        int int25 = hikariConfig1.getAcquireRetries();
        hikariConfig1.idleTimeout = (byte) 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.catalog;
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.connectionTimeout = 3L;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.minPoolSize = (byte) 0;
        hikariConfig1.isInitializationFailFast = true;
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setAcquireRetries((int) (short) 1);
        hikariConfig1.setIdleTimeout((-1L));
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.setTransactionIsolation("HikariPool-1586");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        boolean boolean14 = hikariConfig11.isRegisterMbeans();
        hikariConfig11.setInitializationFailFast(true);
        long long17 = hikariConfig11.getAcquireRetryDelay();
        int int18 = hikariConfig11.getAcquireRetries();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        hikariConfig20.isInitializationFailFast = true;
        int int26 = hikariConfig20.acquireRetries;
        hikariConfig20.setMaxLifetime((long) (-1));
        boolean boolean29 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.poolName = "HikariPool-59";
        java.util.Properties properties32 = hikariConfig20.dataSourceProperties;
        hikariConfig11.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        hikariConfig1.setConnectionInitSql("HikariPool-18189");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.maxPoolSize;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setPoolName("HikariPool-1927");
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.dataSourceClassName = "HikariPool-16487";
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 35L;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.idleTimeout;
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        long long15 = hikariConfig1.idleTimeout;
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.getMaximumPoolSize();
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isRegisterMbeans = false;
        int int13 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-21");
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.isRegisterMbeans = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        int int11 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        long long13 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.lang.String str7 = hikariConfig1.poolName;
        hikariConfig1.transactionIsolationName = "";
        int int10 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-39515" + "'", str6, "HikariPool-39515");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-39515" + "'", str7, "HikariPool-39515");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.isJdbc4connectionTest = true;
        long long17 = hikariConfig1.getConnectionTimeout();
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        hikariConfig1.leakDetectionThreshold = (-1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = 3;
        long long14 = hikariConfig1.connectionTimeout;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        long long11 = hikariConfig1.connectionTimeout;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.transactionIsolation = 100;
        long long13 = hikariConfig1.leakDetectionThreshold;
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolationName = "HikariPool-13657";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.idleTimeout = 60;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        long long12 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.leakDetectionThreshold = 100;
        hikariConfig8.minPoolSize = (byte) 1;
        hikariConfig8.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig8.connectionCustomizer;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.dataSourceClassName = "";
        hikariConfig17.setTransactionIsolation("");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.isInitializationFailFast = true;
        int int32 = hikariConfig26.acquireRetries;
        hikariConfig26.setMaxLifetime((long) (-1));
        int int35 = hikariConfig26.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.transactionIsolation;
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig17.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig8.dataSourceProperties = properties44;
        boolean boolean49 = hikariConfig8.isInitializationFailFast();
        boolean boolean50 = hikariConfig8.isInitializationFailFast;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setConnectionInitSql("hi!");
        long long55 = hikariConfig52.getLeakDetectionThreshold();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        int int58 = hikariConfig57.getTransactionIsolation();
        hikariConfig57.setRegisterMbeans(false);
        java.lang.String str61 = hikariConfig57.transactionIsolationName;
        int int62 = hikariConfig57.getMaximumPoolSize();
        int int63 = hikariConfig57.transactionIsolation;
        java.util.Properties properties64 = hikariConfig57.dataSourceProperties;
        hikariConfig52.dataSourceProperties = properties64;
        java.util.Properties properties66 = hikariConfig52.getDataSourceProperties();
        hikariConfig8.dataSourceProperties = properties66;
        hikariConfig1.dataSourceProperties = properties66;
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig69.setInitializationFailFast(false);
        java.lang.String str72 = hikariConfig69.dataSourceClassName;
        java.lang.String str73 = hikariConfig69.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) -1;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        long long21 = hikariConfig16.getIdleTimeout();
        java.lang.String str22 = hikariConfig16.getCatalog();
        java.lang.String str23 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.dataSourceClassName = "";
        java.util.Properties properties28 = hikariConfig25.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.util.Properties properties34 = hikariConfig33.dataSourceProperties;
        int int35 = hikariConfig33.getMinimumPoolSize();
        hikariConfig33.minPoolSize = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.poolName = "HikariPool-1157";
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setTransactionIsolation("HikariPool-1125");
        hikariConfig1.connectionTestQuery = "HikariPool-870";
        long long12 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.setConnectionTestQuery("HikariPool-3244");
        long long11 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 87L + "'", long11 == 87L);
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.leakDetectionThreshold = (byte) 100;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-31217";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        hikariConfig0.isJdbc4connectionTest = true;
        int int4 = hikariConfig0.minPoolSize;
        long long5 = hikariConfig0.getMaxLifetime();
        boolean boolean6 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setDataSourceClassName("HikariPool-68");
        hikariConfig1.transactionIsolationName = "HikariPool-105";
        hikariConfig1.maxLifetime = 32;
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.addDataSourceProperty("HikariPool-413", (java.lang.Object) 32L);
        hikariConfig1.setPoolName("HikariPool-786");
        hikariConfig1.dataSourceClassName = "HikariPool-725";
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) -1;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        long long21 = hikariConfig16.getIdleTimeout();
        java.lang.String str22 = hikariConfig16.getCatalog();
        java.lang.String str23 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.dataSourceClassName = "";
        java.util.Properties properties28 = hikariConfig25.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig31.maxLifetime = 3;
        hikariConfig31.setPoolName("HikariPool-165");
        hikariConfig31.isRegisterMbeans = true;
        java.lang.String str38 = hikariConfig31.getConnectionTestQuery();
        long long39 = hikariConfig31.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig0.poolName;
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        boolean boolean12 = hikariConfig0.isAutoCommit;
        hikariConfig0.setCatalog("HikariPool-1485");
        hikariConfig0.setDataSourceClassName("HikariPool-20181");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39551" + "'", str10, "HikariPool-39551");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-21");
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        int int10 = hikariConfig1.getAcquireRetries();
        long long11 = hikariConfig1.connectionTimeout;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAutoCommit(true);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.catalog = "HikariPool-69";
        long long20 = hikariConfig1.idleTimeout;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.connectionTimeout = 0L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = false;
        long long11 = hikariConfig1.connectionTimeout;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setPoolName("HikariPool-517");
        java.lang.String str6 = hikariConfig1.connectionTestQuery;
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.catalog = "HikariPool-24427";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        long long16 = hikariConfig1.connectionTimeout;
        hikariConfig1.minPoolSize = 1;
        hikariConfig1.setPoolName("HikariPool-19737");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        boolean boolean13 = hikariConfig1.isAutoCommit();
        hikariConfig1.setDataSourceClassName("HikariPool-24359");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-68");
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        int int15 = hikariConfig1.getAcquireRetries();
        java.lang.String str16 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-68" + "'", str14, "HikariPool-68");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-39564" + "'", str16, "HikariPool-39564");
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig9.transactionIsolationName;
        int int14 = hikariConfig9.transactionIsolation;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig9.dataSource = dataSource15;
        long long17 = hikariConfig9.maxLifetime;
        hikariConfig9.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties20 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties20;
        java.lang.String str22 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setPoolName("HikariPool-420");
        hikariConfig1.transactionIsolationName = "HikariPool-1136";
        hikariConfig1.poolName = "HikariPool-2505";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        int int8 = hikariConfig1.maxPoolSize;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.transactionIsolationName = "HikariPool-707";
        hikariConfig1.setConnectionTestQuery("HikariPool-780");
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setConnectionInitSql("HikariPool-32702");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.leakDetectionThreshold = 100;
        boolean boolean30 = hikariConfig27.isJdbc4ConnectionTest();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.transactionIsolationName;
        long long37 = hikariConfig32.getIdleTimeout();
        java.lang.String str38 = hikariConfig32.getCatalog();
        java.lang.String str39 = hikariConfig32.getConnectionTestQuery();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig41.dataSourceClassName = "";
        java.util.Properties properties44 = hikariConfig41.dataSourceProperties;
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig27.dataSourceProperties = properties44;
        java.util.Properties properties47 = hikariConfig27.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties47;
        java.lang.String str49 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 0;
        javax.sql.DataSource dataSource54 = hikariConfig1.getDataSource();
        long long55 = hikariConfig1.leakDetectionThreshold;
        java.lang.Class<?> wildcardClass56 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(dataSource54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setTransactionIsolation("HikariPool-14129");
        hikariConfig1.setIdleTimeout((long) 'a');
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionInitSql = "HikariPool-69";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-719");
        long long15 = hikariConfig1.maxLifetime;
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.maxPoolSize = 97;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.transactionIsolation = (-1);
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.transactionIsolation = 1;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-39587" + "'", str7, "HikariPool-39587");
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-39587" + "'", str15, "HikariPool-39587");
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        long long12 = hikariConfig1.getConnectionTimeout();
        int int13 = hikariConfig1.minPoolSize;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAcquireRetries(100);
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.leakDetectionThreshold = 3L;
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.maxPoolSize;
        boolean boolean14 = hikariConfig1.isAutoCommit;
        long long15 = hikariConfig1.maxLifetime;
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.maxPoolSize = 60;
        hikariConfig1.setMinimumPoolSize(60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.minPoolSize = 60;
        int int22 = hikariConfig1.acquireRetries;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(0L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        java.util.Properties properties13 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        long long17 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        java.lang.String str20 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        java.lang.String str22 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.addDataSourceProperty("HikariPool-413", (java.lang.Object) 32L);
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        hikariConfig1.acquireRetries = (short) -1;
        hikariConfig1.connectionInitSql = "HikariPool-4005";
        hikariConfig1.setPoolName("HikariPool-9222");
        java.lang.String str21 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-9222" + "'", str21, "HikariPool-9222");
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        long long11 = hikariConfig1.getMaxLifetime();
        long long12 = hikariConfig1.getMaxLifetime();
        int int13 = hikariConfig1.getAcquireRetries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        int int26 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig11);
        hikariConfig11.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig11.connectionCustomizer;
        long long30 = hikariConfig11.getMaxLifetime();
        int int31 = hikariConfig11.getMaximumPoolSize();
        java.lang.String str32 = hikariConfig11.getPoolName();
        java.util.Properties properties33 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-39601" + "'", str32, "HikariPool-39601");
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxLifetime = 1800000L;
        hikariConfig1.dataSourceClassName = "HikariPool-489";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-320");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionInitSql = "HikariPool-69";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-719");
        hikariConfig1.transactionIsolation = '#';
        hikariConfig1.setTransactionIsolation("HikariPool-20511");
        int int19 = hikariConfig1.transactionIsolation;
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize(3);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.acquireRetries = (-1);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.dataSourceClassName = "";
        hikariConfig13.setIdleTimeout((long) (short) 100);
        java.util.Properties properties21 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.addDataSourceProperty("HikariPool-104", (java.lang.Object) 1800000L);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-3612";
        hikariConfig1.minPoolSize = 3;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setInitializationFailFast(true);
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.minPoolSize = 35;
        int int12 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        long long15 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionTestQuery("HikariPool-68");
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-16175");
        int int23 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        int int5 = hikariConfig0.getMinimumPoolSize();
        int int6 = hikariConfig0.maxPoolSize;
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMaxLifetime((long) 32);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-37433";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.acquireRetries = (short) 0;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig1.connectionTimeout = 32;
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isAutoCommit;
        hikariConfig11.poolName = "hi!";
        hikariConfig11.setMinimumPoolSize(1);
        int int17 = hikariConfig11.maxPoolSize;
        java.util.Properties properties18 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.transactionIsolationName = "HikariPool-684";
        java.lang.String str23 = hikariConfig1.connectionInitSql;
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        int int8 = hikariConfig1.getMaximumPoolSize();
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setCatalog("HikariPool-22907");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-354");
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.connectionInitSql = "HikariPool-8743";
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold(87L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.connectionTimeout = 1800000L;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("HikariPool-3881");
        int int20 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        hikariConfig11.connectionInitSql = "HikariPool-222";
        hikariConfig11.setPoolName("HikariPool-114");
        hikariConfig11.setUseInstrumentation(true);
        long long24 = hikariConfig11.getAcquireRetryDelay();
        boolean boolean25 = hikariConfig11.isRegisterMbeans();
        long long26 = hikariConfig11.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setCatalog("HikariPool-236");
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        hikariConfig1.setPoolName("HikariPool-657");
        int int12 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig1.setAutoCommit(true);
        javax.sql.DataSource dataSource17 = hikariConfig1.dataSource;
        long long18 = hikariConfig1.getIdleTimeout();
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionInitSql("HikariPool-780");
        java.lang.String str10 = hikariConfig1.getPoolName();
        int int11 = hikariConfig1.minPoolSize;
        int int12 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39627" + "'", str10, "HikariPool-39627");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        hikariConfig1.idleTimeout = 32L;
        hikariConfig1.setConnectionInitSql("HikariPool-168");
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.connectionTimeout = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.poolName;
        hikariConfig12.setMinimumPoolSize((int) '4');
        hikariConfig12.minPoolSize = (byte) 0;
        hikariConfig1.addDataSourceProperty("HikariPool-256", (java.lang.Object) hikariConfig12);
        int int19 = hikariConfig12.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-39631" + "'", str13, "HikariPool-39631");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxLifetime = 1800000L;
        hikariConfig1.dataSourceClassName = "HikariPool-489";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-320");
        int int15 = hikariConfig1.getAcquireRetries();
        long long16 = hikariConfig1.getIdleTimeout();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isAutoCommit;
        hikariConfig20.poolName = "hi!";
        hikariConfig20.leakDetectionThreshold = 1L;
        hikariConfig20.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource28 = hikariConfig20.getDataSource();
        hikariConfig20.isInitializationFailFast = true;
        hikariConfig1.addDataSourceProperty("HikariPool-354", (java.lang.Object) hikariConfig20);
        long long32 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-489" + "'", str17, "HikariPool-489");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        hikariConfig1.setCatalog("HikariPool-260");
        hikariConfig1.minPoolSize = (-1);
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isJdbc4connectionTest = false;
        long long20 = hikariConfig1.maxLifetime;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-25275");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        int int9 = hikariConfig1.getAcquireRetries();
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-39637" + "'", str6, "HikariPool-39637");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        int int10 = hikariConfig1.acquireRetries;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isAutoCommit;
        hikariConfig12.poolName = "hi!";
        java.lang.String str16 = hikariConfig12.dataSourceClassName;
        java.lang.String str17 = hikariConfig12.dataSourceClassName;
        hikariConfig12.setJdbc4ConnectionTest(false);
        int int20 = hikariConfig12.maxPoolSize;
        hikariConfig12.setIdleTimeout(52L);
        java.lang.String str23 = hikariConfig12.connectionCustomizerClassName;
        hikariConfig12.connectionTimeout = 87;
        java.util.Properties properties26 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties26;
        hikariConfig1.transactionIsolationName = "HikariPool-10848";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaxLifetime(0L);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        int int9 = hikariConfig8.getTransactionIsolation();
        hikariConfig8.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig8.transactionIsolationName;
        int int13 = hikariConfig8.transactionIsolation;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig8.dataSource = dataSource14;
        long long16 = hikariConfig8.maxLifetime;
        java.lang.String str17 = hikariConfig8.dataSourceClassName;
        hikariConfig8.setRegisterMbeans(true);
        hikariConfig1.addDataSourceProperty("HikariPool-114", (java.lang.Object) hikariConfig8);
        int int21 = hikariConfig8.getTransactionIsolation();
        hikariConfig8.dataSourceClassName = "HikariPool-1952";
        boolean boolean24 = hikariConfig8.isRegisterMbeans;
        javax.sql.DataSource dataSource25 = hikariConfig8.getDataSource();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        hikariConfig1.minPoolSize = 97;
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        int int17 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        hikariConfig1.minPoolSize = (short) 10;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.connectionTestQuery;
        long long17 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setJdbc4ConnectionTest(false);
        java.lang.String str20 = hikariConfig12.getCatalog();
        hikariConfig1.addDataSourceProperty("HikariPool-763", (java.lang.Object) hikariConfig12);
        long long22 = hikariConfig12.getMaxLifetime();
        java.lang.String str23 = hikariConfig12.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-39652" + "'", str23, "HikariPool-39652");
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.transactionIsolationName;
        int int17 = hikariConfig12.getMaximumPoolSize();
        int int18 = hikariConfig12.transactionIsolation;
        java.util.Properties properties19 = hikariConfig12.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties19);
        int int21 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig23.transactionIsolationName;
        int int28 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.isRegisterMbeans = false;
        boolean boolean31 = hikariConfig23.isRegisterMbeans();
        java.lang.String str32 = hikariConfig23.getCatalog();
        hikariConfig23.transactionIsolation = 100;
        java.util.Properties properties35 = hikariConfig23.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties35);
        java.util.Properties properties37 = hikariConfig1.dataSourceProperties;
        java.lang.String str38 = hikariConfig1.dataSourceClassName;
        int int39 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.setCatalog("HikariPool-320");
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1766";
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        int int14 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 1800000L;
        hikariConfig1.connectionInitSql = "HikariPool-142";
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-3245";
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.isAutoCommit = false;
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.connectionTestQuery = "HikariPool-12386";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.setIdleTimeout((long) (short) 1);
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str33 = hikariConfig1.getDataSourceClassName();
        java.lang.String str34 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        hikariConfig1.connectionInitSql = "HikariPool-726";
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str21 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.connectionTimeout = 1L;
        hikariConfig1.maxLifetime = 5000L;
        hikariConfig1.setPoolName("HikariPool-183");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.catalog = "HikariPool-489";
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setMaxLifetime(52L);
        java.lang.String str20 = hikariConfig1.poolName;
        hikariConfig1.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.transactionIsolation = (byte) 0;
        hikariConfig0.transactionIsolation = (byte) 10;
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        java.lang.String str8 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-39677" + "'", str8, "HikariPool-39677");
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24863");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24863 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.setPoolName("HikariPool-87");
        java.lang.String str17 = hikariConfig1.catalog;
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.idleTimeout = 'a';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setCatalog("HikariPool-180");
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.minPoolSize;
        hikariConfig1.setLeakDetectionThreshold(60L);
        hikariConfig1.dataSourceClassName = "HikariPool-1418";
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        boolean boolean6 = hikariConfig1.isAutoCommit;
        hikariConfig1.maxLifetime = (byte) -1;
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        long long11 = hikariConfig1.connectionTimeout;
        int int12 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.transactionIsolation = (short) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.catalog = "HikariPool-8966";
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("HikariPool-29434");
        java.lang.String str18 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-449");
        hikariConfig1.setTransactionIsolation("HikariPool-875");
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-39688" + "'", str8, "HikariPool-39688");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        int int11 = hikariConfig6.getMaximumPoolSize();
        int int12 = hikariConfig6.transactionIsolation;
        java.util.Properties properties13 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties13;
        int int15 = hikariConfig1.minPoolSize;
        hikariConfig1.connectionTimeout = 'a';
        long long18 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.poolName = "HikariPool-501";
        long long13 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39692" + "'", str10, "HikariPool-39692");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 1800000L;
        long long10 = hikariConfig1.maxLifetime;
        int int11 = hikariConfig1.getAcquireIncrement();
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) 'a');
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        java.lang.String str5 = hikariConfig0.connectionInitSql;
        hikariConfig0.acquireRetries = (short) 1;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig9.transactionIsolationName;
        int int14 = hikariConfig9.getMaximumPoolSize();
        int int15 = hikariConfig9.transactionIsolation;
        java.util.Properties properties16 = hikariConfig9.dataSourceProperties;
        hikariConfig9.transactionIsolation = (byte) 1;
        hikariConfig9.dataSourceClassName = "";
        boolean boolean21 = hikariConfig9.isJdbc4connectionTest;
        hikariConfig9.setJdbc4ConnectionTest(true);
        hikariConfig9.connectionTestQuery = "HikariPool-470";
        hikariConfig9.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig9.setInitializationFailFast(false);
        java.lang.String str30 = hikariConfig9.connectionCustomizerClassName;
        java.util.Properties properties31 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties31;
        hikariConfig0.setPoolName("HikariPool-1252");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        int int37 = hikariConfig0.getAcquireRetries();
        hikariConfig0.isRegisterMbeans = false;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-39695" + "'", str1, "HikariPool-39695");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries(10);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        int int21 = hikariConfig1.getMaximumPoolSize();
        boolean boolean22 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.minPoolSize = (byte) 1;
        java.lang.String str27 = hikariConfig1.getCatalog();
        int int28 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        hikariConfig1.setAutoCommit(true);
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.minPoolSize = 100;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-752");
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        int int16 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout((long) 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-516");
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isRegisterMbeans = false;
        int int13 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isAutoCommit;
        hikariConfig15.poolName = "hi!";
        java.lang.String str19 = hikariConfig15.dataSourceClassName;
        java.lang.String str20 = hikariConfig15.dataSourceClassName;
        hikariConfig15.setJdbc4ConnectionTest(false);
        int int23 = hikariConfig15.maxPoolSize;
        hikariConfig15.setIdleTimeout(52L);
        java.lang.String str26 = hikariConfig15.connectionCustomizerClassName;
        hikariConfig15.connectionTimeout = 87;
        java.util.Properties properties29 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        javax.sql.DataSource dataSource31 = null;
        hikariConfig1.dataSource = dataSource31;
        java.util.Properties properties33 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        hikariConfig1.setCatalog("HikariPool-1049");
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("HikariPool-900");
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setDataSourceClassName("HikariPool-5150");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "";
        hikariConfig1.setConnectionTestQuery("HikariPool-173");
        int int12 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionTestQuery("HikariPool-432");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        long long16 = hikariConfig11.getIdleTimeout();
        java.lang.String str17 = hikariConfig11.getCatalog();
        java.util.Properties properties18 = hikariConfig11.getDataSourceProperties();
        hikariConfig11.setRegisterMbeans(true);
        hikariConfig11.leakDetectionThreshold = 0L;
        javax.sql.DataSource dataSource23 = null;
        hikariConfig11.setDataSource(dataSource23);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isAutoCommit;
        int int28 = hikariConfig26.getAcquireIncrement();
        java.util.Properties properties29 = hikariConfig26.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties29;
        hikariConfig11.transactionIsolation = '#';
        hikariConfig11.setPoolName("HikariPool-1258");
        hikariConfig1.addDataSourceProperty("HikariPool-449", (java.lang.Object) "HikariPool-1258");
        java.lang.String str36 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-432" + "'", str36, "HikariPool-432");
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) -1;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1136";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig13.connectionCustomizer;
        int int25 = hikariConfig13.getMaximumPoolSize();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig13.setDataSource(dataSource26);
        hikariConfig13.isAutoCommit = false;
        int int30 = hikariConfig13.getAcquireIncrement();
        hikariConfig13.setIdleTimeout((long) ' ');
        java.lang.String str33 = hikariConfig13.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig11);
        boolean boolean27 = hikariConfig11.isJdbc4connectionTest;
        long long28 = hikariConfig11.getLeakDetectionThreshold();
        boolean boolean29 = hikariConfig11.isAutoCommit;
        long long30 = hikariConfig11.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.setAcquireRetryDelay((long) 60);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60L + "'", long30 == 60L);
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-215";
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig10.transactionIsolationName;
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.transactionIsolation = (short) 1;
        long long20 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setInitializationFailFast(true);
        hikariConfig10.transactionIsolationName = "HikariPool-205";
        javax.sql.DataSource dataSource25 = hikariConfig10.dataSource;
        hikariConfig10.setDataSourceClassName("HikariPool-1050");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setRegisterMbeans(false);
        java.lang.String str33 = hikariConfig29.transactionIsolationName;
        int int34 = hikariConfig29.transactionIsolation;
        javax.sql.DataSource dataSource35 = null;
        hikariConfig29.dataSource = dataSource35;
        java.lang.String str37 = hikariConfig29.getConnectionTestQuery();
        java.util.Properties properties38 = hikariConfig29.getDataSourceProperties();
        hikariConfig10.dataSourceProperties = properties38;
        hikariConfig1.dataSourceProperties = properties38;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties38);
        boolean boolean43 = hikariConfig42.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isAutoCommit = false;
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        java.lang.String str19 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("HikariPool-15185");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-517" + "'", str19, "HikariPool-517");
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.dataSourceClassName = "";
        hikariConfig13.connectionTimeout = 10L;
        hikariConfig13.connectionTestQuery = "HikariPool-104";
        int int20 = hikariConfig13.transactionIsolation;
        hikariConfig13.setRegisterMbeans(false);
        boolean boolean23 = hikariConfig13.isRegisterMbeans();
        hikariConfig13.transactionIsolation = (short) 0;
        java.util.Properties properties26 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties26;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        long long6 = hikariConfig1.getConnectionTimeout();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setTransactionIsolation("HikariPool-38");
        java.lang.String str10 = hikariConfig1.getCatalog();
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setDataSourceClassName("HikariPool-1971");
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39725" + "'", str11, "HikariPool-39725");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.transactionIsolationName = "HikariPool-1069";
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        java.lang.String str18 = hikariConfig1.poolName;
        java.lang.String str19 = hikariConfig1.catalog;
        hikariConfig1.setCatalog("HikariPool-86");
        int int22 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-39726" + "'", str18, "HikariPool-39726");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.dataSourceClassName = "HikariPool-197";
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        long long18 = hikariConfig1.idleTimeout;
        int int19 = hikariConfig1.minPoolSize;
        boolean boolean20 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.transactionIsolation = 100;
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.transactionIsolation = (short) 0;
        hikariConfig1.setMaxLifetime(3L);
        java.lang.String str17 = hikariConfig1.catalog;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        java.lang.String str23 = hikariConfig19.transactionIsolationName;
        int int24 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.isRegisterMbeans = false;
        hikariConfig19.isRegisterMbeans = true;
        hikariConfig19.setPoolName("HikariPool-320");
        long long31 = hikariConfig19.getMaxLifetime();
        int int32 = hikariConfig19.maxPoolSize;
        hikariConfig19.minPoolSize = (-1);
        long long35 = hikariConfig19.getMaxLifetime();
        boolean boolean36 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setCatalog("HikariPool-87");
        hikariConfig19.acquireRetries = (short) 1;
        java.util.Properties properties41 = hikariConfig19.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.leakDetectionThreshold = 35;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39731" + "'", str11, "HikariPool-39731");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setInitializationFailFast(true);
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.dataSourceClassName = "";
        java.util.Properties properties17 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.poolName = "HikariPool-521";
        int int23 = hikariConfig1.maxPoolSize;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        java.lang.String str30 = hikariConfig25.connectionCustomizerClassName;
        hikariConfig25.setConnectionTestQuery("hi!");
        java.lang.String str33 = hikariConfig25.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = hikariConfig25.connectionCustomizer;
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setConnectionInitSql("hi!");
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.dataSourceClassName = "";
        hikariConfig40.setTransactionIsolation("");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        int int50 = hikariConfig49.getTransactionIsolation();
        hikariConfig49.setRegisterMbeans(false);
        hikariConfig49.isInitializationFailFast = true;
        int int55 = hikariConfig49.acquireRetries;
        hikariConfig49.setMaxLifetime((long) (-1));
        int int58 = hikariConfig49.getTransactionIsolation();
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        int int61 = hikariConfig60.getTransactionIsolation();
        hikariConfig60.setRegisterMbeans(false);
        java.lang.String str64 = hikariConfig60.transactionIsolationName;
        int int65 = hikariConfig60.getMaximumPoolSize();
        int int66 = hikariConfig60.transactionIsolation;
        java.util.Properties properties67 = hikariConfig60.dataSourceProperties;
        hikariConfig49.setDataSourceProperties(properties67);
        hikariConfig40.dataSourceProperties = properties67;
        hikariConfig36.dataSourceProperties = properties67;
        hikariConfig25.setDataSourceProperties(properties67);
        java.util.Properties properties72 = hikariConfig25.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties72;
        java.util.Properties properties75 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties75);
        int int77 = hikariConfig76.getTransactionIsolation();
        hikariConfig76.setRegisterMbeans(false);
        java.lang.String str80 = hikariConfig76.transactionIsolationName;
        int int81 = hikariConfig76.transactionIsolation;
        java.lang.String str82 = hikariConfig76.getConnectionInitSql();
        int int83 = hikariConfig76.transactionIsolation;
        int int84 = hikariConfig76.maxPoolSize;
        hikariConfig76.setMinimumPoolSize(0);
        hikariConfig1.addDataSourceProperty("HikariPool-1161", (java.lang.Object) hikariConfig76);
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(iConnectionCustomizer34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 60 + "'", int65 == 60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 60 + "'", int84 == 60);
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) 'a');
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        hikariConfig1.minPoolSize = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.transactionIsolationName = "HikariPool-410";
        long long21 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str22 = hikariConfig1.poolName;
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
        long long24 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-15142");
        hikariConfig1.catalog = "HikariPool-24190";
        boolean boolean31 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        hikariConfig16.setTransactionIsolation("hi!");
        long long22 = hikariConfig16.connectionTimeout;
        java.lang.String str23 = hikariConfig16.getPoolName();
        boolean boolean24 = hikariConfig16.isRegisterMbeans;
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        java.lang.String str26 = hikariConfig16.dataSourceClassName;
        hikariConfig1.addDataSourceProperty("HikariPool-410", (java.lang.Object) hikariConfig16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig16.connectionCustomizer;
        hikariConfig16.isAutoCommit = true;
        hikariConfig16.connectionTimeout = 10L;
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.lang.String str36 = hikariConfig35.getConnectionTestQuery();
        long long37 = hikariConfig35.idleTimeout;
        long long38 = hikariConfig35.leakDetectionThreshold;
        long long39 = hikariConfig35.getLeakDetectionThreshold();
        long long40 = hikariConfig35.getConnectionTimeout();
        boolean boolean41 = hikariConfig35.isRegisterMbeans;
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        int int44 = hikariConfig43.getTransactionIsolation();
        hikariConfig43.setRegisterMbeans(false);
        java.lang.String str47 = hikariConfig43.transactionIsolationName;
        long long48 = hikariConfig43.getIdleTimeout();
        java.lang.String str49 = hikariConfig43.getConnectionTestQuery();
        javax.sql.DataSource dataSource50 = hikariConfig43.dataSource;
        hikariConfig43.leakDetectionThreshold = 0;
        hikariConfig43.setJdbc4ConnectionTest(false);
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        boolean boolean57 = hikariConfig56.isAutoCommit;
        hikariConfig56.poolName = "hi!";
        hikariConfig56.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource62 = null;
        hikariConfig56.dataSource = dataSource62;
        int int64 = hikariConfig56.minPoolSize;
        int int65 = hikariConfig56.minPoolSize;
        java.lang.String str66 = hikariConfig56.dataSourceClassName;
        java.util.Properties properties67 = hikariConfig56.getDataSourceProperties();
        hikariConfig43.setDataSourceProperties(properties67);
        hikariConfig35.dataSourceProperties = properties67;
        hikariConfig16.addDataSourceProperty("HikariPool-2573", (java.lang.Object) properties67);
        java.util.Properties properties71 = hikariConfig16.dataSourceProperties;
        boolean boolean72 = hikariConfig16.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 60L + "'", long48 == 60L);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.catalog = "HikariPool-22";
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.leakDetectionThreshold = 35L;
        hikariConfig1.setMinimumPoolSize((int) 'a');
        int int18 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-624");
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.poolName = "hi!";
        hikariConfig13.acquireRetries = ' ';
        hikariConfig13.setMaxLifetime(0L);
        long long21 = hikariConfig13.maxLifetime;
        long long22 = hikariConfig13.connectionTimeout;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        hikariConfig24.isInitializationFailFast = true;
        int int30 = hikariConfig24.acquireRetries;
        hikariConfig24.setMaxLifetime((long) (-1));
        int int33 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.maxLifetime = 32L;
        java.util.Properties properties36 = hikariConfig24.dataSourceProperties;
        hikariConfig13.dataSourceProperties = properties36;
        hikariConfig1.dataSourceProperties = properties36;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int40 = hikariConfig39.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        boolean boolean13 = hikariConfig1.isAutoCommit();
        long long14 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        int int22 = hikariConfig17.getMaximumPoolSize();
        int int23 = hikariConfig17.transactionIsolation;
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        hikariConfig17.transactionIsolation = (byte) 1;
        hikariConfig17.dataSourceClassName = "";
        javax.sql.DataSource dataSource29 = null;
        hikariConfig17.setDataSource(dataSource29);
        long long31 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) hikariConfig17);
        long long33 = hikariConfig17.getIdleTimeout();
        javax.sql.DataSource dataSource34 = null;
        hikariConfig17.setDataSource(dataSource34);
        hikariConfig17.connectionInitSql = "HikariPool-596";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig17.setConnectionTimeout(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 60L + "'", long33 == 60L);
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(true);
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setTransactionIsolation("HikariPool-3948");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        java.lang.String str19 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-39760" + "'", str19, "HikariPool-39760");
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.idleTimeout = 0L;
        int int10 = hikariConfig1.acquireRetries;
        java.lang.String str11 = hikariConfig1.catalog;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        int int13 = hikariConfig1.acquireRetries;
        java.lang.String str14 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-39761" + "'", str14, "HikariPool-39761");
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTestQuery("HikariPool-789");
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.setPoolName("HikariPool-21785");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.maxPoolSize = (-1);
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        long long14 = hikariConfig1.getIdleTimeout();
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-670");
        hikariConfig1.maxPoolSize = (short) 1;
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.leakDetectionThreshold = 100;
        boolean boolean26 = hikariConfig23.isJdbc4connectionTest;
        long long27 = hikariConfig23.getIdleTimeout();
        hikariConfig23.setUseInstrumentation(false);
        hikariConfig23.setJdbc4ConnectionTest(false);
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        java.lang.String str35 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize(0);
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        hikariConfig39.dataSourceClassName = "";
        hikariConfig39.setIdleTimeout((long) (short) 100);
        java.util.Properties properties47 = hikariConfig39.getDataSourceProperties();
        java.lang.String str48 = hikariConfig39.connectionInitSql;
        hikariConfig39.idleTimeout = 87L;
        java.util.Properties properties51 = hikariConfig39.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties51;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer53 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-28007");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-670" + "'", str35, "HikariPool-670");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNull(iConnectionCustomizer53);
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        java.lang.String str18 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setIdleTimeout((long) 87);
        hikariConfig16.setConnectionInitSql("HikariPool-114");
        hikariConfig16.idleTimeout = 32L;
        boolean boolean25 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig16.poolName = "HikariPool-407";
        long long28 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-25715", (java.lang.Object) hikariConfig16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setCatalog("HikariPool-23830");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.leakDetectionThreshold = 1L;
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        long long17 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        int int10 = hikariConfig1.getMinimumPoolSize();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionInitSql = "HikariPool-37351";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        int int9 = hikariConfig8.getTransactionIsolation();
        hikariConfig8.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig8.transactionIsolationName;
        int int13 = hikariConfig8.transactionIsolation;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig8.dataSource = dataSource14;
        long long16 = hikariConfig8.maxLifetime;
        java.lang.String str17 = hikariConfig8.dataSourceClassName;
        hikariConfig8.setRegisterMbeans(true);
        hikariConfig1.addDataSourceProperty("HikariPool-114", (java.lang.Object) hikariConfig8);
        int int21 = hikariConfig8.getAcquireRetries();
        int int22 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setIdleTimeout((long) (byte) 1);
        hikariConfig8.setDataSourceClassName("HikariPool-379");
        int int27 = hikariConfig8.transactionIsolation;
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.poolName = "HikariPool-2411";
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        int int5 = hikariConfig0.acquireRetries;
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionTestQuery("HikariPool-1503");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-11585";
        java.lang.String str21 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setPoolName("HikariPool-2303");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-1503" + "'", str21, "HikariPool-1503");
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig5.dataSourceClassName = "";
        hikariConfig5.setTransactionIsolation("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.isInitializationFailFast = true;
        int int20 = hikariConfig14.acquireRetries;
        hikariConfig14.setMaxLifetime((long) (-1));
        int int23 = hikariConfig14.getTransactionIsolation();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig14.setDataSourceProperties(properties32);
        hikariConfig5.dataSourceProperties = properties32;
        hikariConfig1.dataSourceProperties = properties32;
        java.util.Properties properties36 = hikariConfig1.dataSourceProperties;
        java.lang.String str37 = hikariConfig1.getDataSourceClassName();
        java.lang.String str38 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str39 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties40 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries(87);
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isInitializationFailFast = true;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.catalog = "HikariPool-27725";
        hikariConfig1.setLeakDetectionThreshold(10L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 87 + "'", int12 == 87);
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.transactionIsolationName;
        int int17 = hikariConfig12.getMaximumPoolSize();
        int int18 = hikariConfig12.transactionIsolation;
        java.util.Properties properties19 = hikariConfig12.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties19);
        int int21 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig23.transactionIsolationName;
        int int28 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.isRegisterMbeans = false;
        boolean boolean31 = hikariConfig23.isRegisterMbeans();
        java.lang.String str32 = hikariConfig23.getCatalog();
        hikariConfig23.transactionIsolation = 100;
        java.util.Properties properties35 = hikariConfig23.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties35);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-221";
        hikariConfig1.dataSourceClassName = "HikariPool-310";
        java.util.Properties properties43 = hikariConfig1.dataSourceProperties;
        boolean boolean44 = hikariConfig1.isInitializationFailFast();
        int int45 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-252";
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        long long15 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.connectionTimeout = 87;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-414";
        java.lang.String str10 = hikariConfig1.getPoolName();
        long long11 = hikariConfig1.getIdleTimeout();
        int int12 = hikariConfig1.maxPoolSize;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        java.lang.String str14 = hikariConfig1.getCatalog();
        long long15 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.maxPoolSize = (short) 0;
        int int18 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-39795" + "'", str10, "HikariPool-39795");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.minPoolSize = 97;
        int int18 = hikariConfig1.acquireRetries;
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str11 = hikariConfig1.poolName;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionInitSql = "HikariPool-995";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39798" + "'", str11, "HikariPool-39798");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.acquireRetries = (-1);
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2545");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        boolean boolean16 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.poolName = "HikariPool-12748";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        java.lang.String str27 = hikariConfig11.getDataSourceClassName();
        boolean boolean28 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setIdleTimeout(100L);
        hikariConfig11.isInitializationFailFast = true;
        hikariConfig11.setCatalog("HikariPool-3822");
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str12 = hikariConfig1.poolName;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.dataSourceClassName = "";
        hikariConfig14.setTransactionIsolation("");
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig14.dataSourceProperties = properties41;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig46.setMinimumPoolSize((int) (short) 1);
        int int49 = hikariConfig46.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-39806" + "'", str12, "HikariPool-39806");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.poolName = "HikariPool-770";
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries(10);
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        long long20 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.dataSource = dataSource21;
        hikariConfig1.connectionTestQuery = "HikariPool-1444";
        long long25 = hikariConfig1.connectionTimeout;
        int int26 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.leakDetectionThreshold = 100;
        hikariConfig29.connectionInitSql = "hi!";
        hikariConfig29.maxPoolSize = (short) -1;
        java.lang.String str36 = hikariConfig29.getPoolName();
        hikariConfig29.leakDetectionThreshold = 100;
        hikariConfig29.poolName = "HikariPool-381";
        hikariConfig29.setConnectionInitSql("HikariPool-183");
        hikariConfig1.addDataSourceProperty("HikariPool-29477", (java.lang.Object) hikariConfig29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-39815" + "'", str36, "HikariPool-39815");
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionInitSql = "HikariPool-173";
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        java.lang.String str22 = hikariConfig1.poolName;
        hikariConfig1.idleTimeout = 0L;
        javax.sql.DataSource dataSource25 = hikariConfig1.dataSource;
        hikariConfig1.poolName = "HikariPool-2553";
        long long28 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setMaximumPoolSize((int) '4');
        hikariConfig1.setMaxLifetime((long) 0);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-481";
        long long17 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.leakDetectionThreshold = 100;
        boolean boolean22 = hikariConfig19.isJdbc4connectionTest;
        long long23 = hikariConfig19.getIdleTimeout();
        hikariConfig19.setUseInstrumentation(false);
        hikariConfig19.setJdbc4ConnectionTest(false);
        java.util.Properties properties28 = hikariConfig19.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        hikariConfig1.minPoolSize = (byte) -1;
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        int int14 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(false);
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionInitSql = "HikariPool-413";
        hikariConfig1.catalog = "HikariPool-707";
        hikariConfig1.acquireRetries = ' ';
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.transactionIsolation = 10;
        hikariConfig1.connectionInitSql = "HikariPool-220";
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        int int15 = hikariConfig1.maxPoolSize;
        boolean boolean16 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.minPoolSize = 100;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-752");
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-34128");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-752" + "'", str16, "HikariPool-752");
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        long long14 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str19 = hikariConfig1.catalog;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setIdleTimeout(1L);
        java.lang.String str13 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        long long13 = hikariConfig1.connectionTimeout;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        long long15 = hikariConfig1.idleTimeout;
        long long16 = hikariConfig1.idleTimeout;
        long long17 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionInitSql = "HikariPool-203";
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either jdbc4ConnectionTest must be enabled or a connectionTestQuery must be specified.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        long long15 = hikariConfig1.idleTimeout;
        long long16 = hikariConfig1.maxLifetime;
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaxLifetime((long) ' ');
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.minPoolSize = (-1);
        int int11 = hikariConfig1.maxPoolSize;
        int int12 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setCatalog("HikariPool-2991");
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        int int18 = hikariConfig1.minPoolSize;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("hi!");
        long long23 = hikariConfig20.getLeakDetectionThreshold();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties32;
        java.util.Properties properties34 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties34);
        java.lang.String str36 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        int int39 = hikariConfig1.minPoolSize;
        long long40 = hikariConfig1.connectionTimeout;
        java.lang.String str41 = hikariConfig1.getCatalog();
        java.lang.String str42 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        hikariConfig1.catalog = "HikariPool-893";
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) "HikariPool-33443");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.isInitializationFailFast = true;
        int int16 = hikariConfig10.acquireRetries;
        hikariConfig10.setMaxLifetime((long) (-1));
        int int19 = hikariConfig10.getTransactionIsolation();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        java.lang.String str25 = hikariConfig21.transactionIsolationName;
        int int26 = hikariConfig21.getMaximumPoolSize();
        int int27 = hikariConfig21.transactionIsolation;
        java.util.Properties properties28 = hikariConfig21.dataSourceProperties;
        hikariConfig10.setDataSourceProperties(properties28);
        hikariConfig1.dataSourceProperties = properties28;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.lang.String str32 = hikariConfig31.connectionInitSql;
        hikariConfig31.setIdleTimeout((long) (byte) -1);
        hikariConfig31.catalog = "HikariPool-59";
        hikariConfig31.setCatalog("HikariPool-222");
        hikariConfig31.setMinimumPoolSize(87);
        int int41 = hikariConfig31.acquireRetries;
        boolean boolean42 = hikariConfig31.isAutoCommit();
        boolean boolean43 = hikariConfig31.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        boolean boolean13 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        long long13 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolationName = "HikariPool-348";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        long long13 = hikariConfig1.maxLifetime;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.acquireRetries = 52;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.leakDetectionThreshold = 100;
        hikariConfig14.setTransactionIsolation("hi!");
        int int19 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig1.addDataSourceProperty("HikariPool-112", (java.lang.Object) hikariConfig14);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig14.dataSource = dataSource23;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig14.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.poolName;
        int int8 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource9 = hikariConfig0.dataSource;
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        int int12 = hikariConfig0.getAcquireIncrement();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-39864" + "'", str7, "HikariPool-39864");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setTransactionIsolation("HikariPool-1125");
        hikariConfig1.connectionTestQuery = "HikariPool-870";
        boolean boolean12 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }
}
