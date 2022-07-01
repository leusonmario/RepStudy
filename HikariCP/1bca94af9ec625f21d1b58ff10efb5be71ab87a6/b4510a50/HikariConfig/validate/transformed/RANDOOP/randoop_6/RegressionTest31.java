import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setMaxLifetime((long) 1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
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
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.idleTimeout = 5000L;
        boolean boolean30 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setAcquireRetries(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.dataSourceClassName = "";
        java.util.Properties properties17 = hikariConfig14.dataSourceProperties;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isAutoCommit;
        hikariConfig20.poolName = "hi!";
        hikariConfig20.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig20.dataSource = dataSource26;
        int int28 = hikariConfig20.minPoolSize;
        int int29 = hikariConfig20.minPoolSize;
        hikariConfig20.setCatalog("HikariPool-550");
        hikariConfig14.addDataSourceProperty("HikariPool-481", (java.lang.Object) hikariConfig20);
        java.lang.String str33 = hikariConfig14.transactionIsolationName;
        hikariConfig1.addDataSourceProperty("HikariPool-26957", (java.lang.Object) hikariConfig14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
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
        long long15 = hikariConfig1.getIdleTimeout();
        int int16 = hikariConfig1.maxPoolSize;
        boolean boolean17 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int7 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.poolName = "HikariPool-394";
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.catalog = "HikariPool-173";
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setMinimumPoolSize(32);
        java.lang.String str10 = hikariConfig0.catalog;
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-173" + "'", str10, "HikariPool-173");
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        long long9 = hikariConfig1.getAcquireRetryDelay();
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
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
        java.lang.String str25 = hikariConfig1.catalog;
        boolean boolean26 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties27 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource28 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(dataSource28);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.isJdbc4connectionTest = false;
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaxLifetime(1800000L);
        hikariConfig1.isJdbc4connectionTest = false;
        long long17 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
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
        java.lang.String str27 = hikariConfig1.catalog;
        hikariConfig1.minPoolSize = 1;
        long long30 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str31 = hikariConfig1.connectionInitSql;
        java.lang.String str32 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-3416");
        hikariConfig1.idleTimeout = 52;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        long long25 = hikariConfig20.getIdleTimeout();
        java.lang.String str26 = hikariConfig20.getCatalog();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setIdleTimeout((long) (short) 10);
        hikariConfig20.maxLifetime = (-1);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.transactionIsolation;
        java.lang.String str39 = hikariConfig33.getConnectionInitSql();
        int int40 = hikariConfig33.getMaximumPoolSize();
        hikariConfig33.setJdbc4ConnectionTest(false);
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.util.Properties properties52 = hikariConfig45.getDataSourceProperties();
        hikariConfig45.setUseInstrumentation(false);
        hikariConfig33.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig45);
        hikariConfig33.poolName = "HikariPool-104";
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.leakDetectionThreshold = 100;
        boolean boolean62 = hikariConfig59.isJdbc4ConnectionTest();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getTransactionIsolation();
        hikariConfig64.setRegisterMbeans(false);
        java.lang.String str68 = hikariConfig64.transactionIsolationName;
        long long69 = hikariConfig64.getIdleTimeout();
        java.lang.String str70 = hikariConfig64.getCatalog();
        java.lang.String str71 = hikariConfig64.getConnectionTestQuery();
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig73.dataSourceClassName = "";
        java.util.Properties properties76 = hikariConfig73.dataSourceProperties;
        hikariConfig64.setDataSourceProperties(properties76);
        hikariConfig59.dataSourceProperties = properties76;
        java.util.Properties properties79 = hikariConfig59.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties79;
        hikariConfig20.dataSourceProperties = properties79;
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        hikariConfig1.setMaxLifetime((long) 10);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str88 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.connectionInitSql = "HikariPool-20046";
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.setConnectionInitSql("HikariPool-704");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 60L + "'", long69 == 60L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.catalog;
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-19303");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setPoolName("HikariPool-517");
        java.lang.String str6 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-780");
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        int int10 = hikariConfig1.acquireRetries;
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.setTransactionIsolation("HikariPool-11779");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
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
        int int34 = hikariConfig31.getMinimumPoolSize();
        hikariConfig31.isRegisterMbeans = true;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
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
            hikariConfig1.setAcquireIncrement(97);
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
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        javax.sql.DataSource dataSource4 = hikariConfig0.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getTransactionIsolation();
        hikariConfig7.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig7.transactionIsolationName;
        int int12 = hikariConfig7.getTransactionIsolation();
        hikariConfig7.setMaximumPoolSize(87);
        hikariConfig7.transactionIsolationName = "HikariPool-222";
        java.lang.String str17 = hikariConfig7.connectionInitSql;
        hikariConfig7.idleTimeout = 10;
        hikariConfig7.setAcquireRetries((int) '4');
        hikariConfig0.addDataSourceProperty("HikariPool-1211", (java.lang.Object) hikariConfig7);
        long long23 = hikariConfig0.maxLifetime;
        long long24 = hikariConfig0.maxLifetime;
        hikariConfig0.setIdleTimeout((long) ' ');
        hikariConfig0.setMaxLifetime((-1L));
        int int29 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.idleTimeout = 60;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.connectionTimeout = (short) 100;
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        int int14 = hikariConfig1.getTransactionIsolation();
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
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
        long long12 = hikariConfig1.getAcquireRetryDelay();
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
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
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setPoolName("HikariPool-166");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        int int22 = hikariConfig17.transactionIsolation;
        java.lang.String str23 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.isAutoCommit = true;
        long long26 = hikariConfig17.getIdleTimeout();
        hikariConfig17.setAutoCommit(true);
        long long29 = hikariConfig17.maxLifetime;
        hikariConfig17.transactionIsolationName = "HikariPool-205";
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setConnectionInitSql("hi!");
        int int37 = hikariConfig34.getMinimumPoolSize();
        hikariConfig17.addDataSourceProperty("HikariPool-780", (java.lang.Object) int37);
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.isInitializationFailFast = true;
        int int46 = hikariConfig40.acquireRetries;
        hikariConfig40.setMaxLifetime((long) (-1));
        boolean boolean49 = hikariConfig40.isInitializationFailFast();
        long long50 = hikariConfig40.maxLifetime;
        hikariConfig40.minPoolSize = (byte) -1;
        boolean boolean53 = hikariConfig40.isJdbc4connectionTest;
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        int int56 = hikariConfig55.getTransactionIsolation();
        hikariConfig55.setRegisterMbeans(false);
        java.lang.String str59 = hikariConfig55.transactionIsolationName;
        long long60 = hikariConfig55.getIdleTimeout();
        java.lang.String str61 = hikariConfig55.getCatalog();
        java.lang.String str62 = hikariConfig55.getConnectionTestQuery();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        hikariConfig64.dataSourceClassName = "";
        java.util.Properties properties67 = hikariConfig64.dataSourceProperties;
        hikariConfig55.setDataSourceProperties(properties67);
        hikariConfig40.setDataSourceProperties(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig17.setDataSourceProperties(properties67);
        hikariConfig1.setDataSourceProperties(properties67);
        hikariConfig1.setCatalog("HikariPool-204");
        long long75 = hikariConfig1.getLeakDetectionThreshold();
        int int76 = hikariConfig1.getMinimumPoolSize();
        boolean boolean77 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.poolName = "HikariPool-1002";
        java.util.Properties properties80 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 60L + "'", long26 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(str59);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 60L + "'", long60 == 60L);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(properties80);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        long long7 = hikariConfig1.idleTimeout;
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(0);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        java.lang.String str13 = hikariConfig1.poolName;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2019";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        hikariConfig1.dataSourceClassName = "HikariPool-22907";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-43360" + "'", str13, "HikariPool-43360");
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setDataSourceClassName("HikariPool-222");
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.leakDetectionThreshold = 0L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setTransactionIsolation("HikariPool-104");
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setCatalog("HikariPool-403");
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-28643";
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-292");
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-74");
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        hikariConfig15.isInitializationFailFast = true;
        int int21 = hikariConfig15.acquireRetries;
        hikariConfig15.setMaxLifetime((long) (-1));
        int int24 = hikariConfig15.getTransactionIsolation();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig26.transactionIsolationName;
        int int31 = hikariConfig26.getMaximumPoolSize();
        int int32 = hikariConfig26.transactionIsolation;
        java.util.Properties properties33 = hikariConfig26.dataSourceProperties;
        hikariConfig15.setDataSourceProperties(properties33);
        int int35 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.maxLifetime = 87L;
        java.lang.String str38 = hikariConfig15.connectionCustomizerClassName;
        hikariConfig15.setUseInstrumentation(false);
        hikariConfig15.catalog = "HikariPool-9912";
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        int int50 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.isRegisterMbeans = false;
        hikariConfig45.isRegisterMbeans = true;
        hikariConfig45.setPoolName("HikariPool-320");
        hikariConfig45.dataSourceClassName = "HikariPool-166";
        hikariConfig45.setJdbc4ConnectionTest(true);
        hikariConfig15.addDataSourceProperty("HikariPool-9669", (java.lang.Object) hikariConfig45);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) "HikariPool-9669");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        hikariConfig1.transactionIsolationName = "HikariPool-1260";
        hikariConfig1.setConnectionTestQuery("HikariPool-5662");
        long long18 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setInitializationFailFast(true);
        int int11 = hikariConfig1.acquireRetries;
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.connectionTimeout = 60;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
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
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-222");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.maxPoolSize = (-1);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setConnectionInitSql("hi!");
        hikariConfig18.minPoolSize = (short) 0;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.transactionIsolation;
        javax.sql.DataSource dataSource31 = null;
        hikariConfig25.dataSource = dataSource31;
        long long33 = hikariConfig25.maxLifetime;
        java.lang.String str34 = hikariConfig25.dataSourceClassName;
        hikariConfig25.setRegisterMbeans(true);
        hikariConfig18.addDataSourceProperty("HikariPool-114", (java.lang.Object) hikariConfig25);
        hikariConfig18.setLeakDetectionThreshold((long) (short) 1);
        java.lang.String str40 = hikariConfig18.getConnectionCustomizerClassName();
        hikariConfig18.acquireRetries = (byte) 1;
        javax.sql.DataSource dataSource43 = null;
        hikariConfig18.dataSource = dataSource43;
        hikariConfig18.catalog = "HikariPool-26";
        long long47 = hikariConfig18.getIdleTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-3317", (java.lang.Object) hikariConfig18);
        int int49 = hikariConfig18.acquireRetries;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 60L + "'", long47 == 60L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
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
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        int int16 = hikariConfig1.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAcquireRetries(0);
        int int14 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        java.lang.String str9 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.transactionIsolationName = "HikariPool-823";
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-43380" + "'", str8, "HikariPool-43380");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setAcquireRetries(0);
        int int13 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setConnectionInitSql("HikariPool-760");
        javax.sql.DataSource dataSource16 = hikariConfig10.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
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
        hikariConfig1.setAcquireRetries(100);
        int int19 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionTimeout = 87L;
        int int22 = hikariConfig1.getAcquireRetries();
        hikariConfig1.dataSourceClassName = "HikariPool-17725";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
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
        int int16 = hikariConfig1.getMaximumPoolSize();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        int int9 = hikariConfig1.acquireRetries;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.transactionIsolation;
        hikariConfig1.transactionIsolation = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setConnectionTestQuery("HikariPool-1067");
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
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
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-208";
        hikariConfig1.transactionIsolation = (short) 0;
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setMaximumPoolSize(52);
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-208" + "'", str21, "HikariPool-208");
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setIdleTimeout((long) ' ');
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.poolName = "HikariPool-197";
        hikariConfig1.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        long long8 = hikariConfig1.getMaxLifetime();
        int int9 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setPoolName("HikariPool-517");
        java.lang.String str6 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-780");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTimeout = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-517" + "'", str9, "HikariPool-517");
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        int int10 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.maxLifetime = (short) 10;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.transactionIsolationName = "HikariPool-13956";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
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
        long long13 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMaxLifetime((long) 100);
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-112";
        java.lang.String str18 = hikariConfig1.catalog;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.maxPoolSize = (short) 10;
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.minPoolSize = (short) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
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
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionInitSql = "HikariPool-730";
        java.lang.String str22 = hikariConfig1.getCatalog();
        int int23 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setConnectionTestQuery("HikariPool-472");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setTransactionIsolation("HikariPool-834");
        hikariConfig1.setConnectionInitSql("HikariPool-572");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.idleTimeout = 100;
        java.lang.String str16 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getPoolName();
        hikariConfig1.dataSourceClassName = "HikariPool-10756";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-43405" + "'", str3, "HikariPool-43405");
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
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
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        long long20 = hikariConfig1.connectionTimeout;
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMinimumPoolSize(100);
        boolean boolean24 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setIdleTimeout((long) 97);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setRegisterMbeans(false);
        java.lang.String str33 = hikariConfig29.transactionIsolationName;
        int int34 = hikariConfig29.transactionIsolation;
        java.lang.String str35 = hikariConfig29.getConnectionInitSql();
        int int36 = hikariConfig29.getMaximumPoolSize();
        java.lang.String str37 = hikariConfig29.getDataSourceClassName();
        int int38 = hikariConfig29.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("HikariPool-3038", (java.lang.Object) int38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
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
        int int13 = hikariConfig1.minPoolSize;
        hikariConfig1.poolName = "HikariPool-3058";
        hikariConfig1.dataSourceClassName = "HikariPool-999";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        int int4 = hikariConfig1.acquireRetries;
        long long5 = hikariConfig1.maxLifetime;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "";
        hikariConfig1.transactionIsolation = (byte) 1;
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        int int9 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-517");
        javax.sql.DataSource dataSource29 = hikariConfig1.dataSource;
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.idleTimeout = (byte) 0;
        long long33 = hikariConfig1.maxLifetime;
        hikariConfig1.acquireRetries = '#';
        hikariConfig1.setAutoCommit(true);
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
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(properties30);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.maxLifetime = 3L;
        hikariConfig1.setLeakDetectionThreshold(35L);
        hikariConfig1.acquireRetries = (byte) -1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setTransactionIsolation("HikariPool-543");
        hikariConfig1.idleTimeout = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMaxLifetime((long) 100);
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-112";
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        boolean boolean5 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setAcquireRetries(97);
        int int8 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
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
        int int11 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionInitSql = "HikariPool-373";
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        boolean boolean10 = hikariConfig1.isAutoCommit;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMaxLifetime(35L);
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.transactionIsolation = 0;
        java.lang.String str15 = hikariConfig1.getCatalog();
        int int16 = hikariConfig1.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
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
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
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
        long long15 = hikariConfig1.getConnectionTimeout();
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
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
        javax.sql.DataSource dataSource33 = null;
        hikariConfig1.dataSource = dataSource33;
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "HikariPool-614";
        int int8 = hikariConfig1.maxPoolSize;
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionTestQuery = "HikariPool-28537";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-614" + "'", str9, "HikariPool-614");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        hikariConfig0.setLeakDetectionThreshold(1800000L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.lang.String str7 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-43439" + "'", str7, "HikariPool-43439");
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.catalog = "HikariPool-204";
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        java.lang.String str21 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int24 = hikariConfig16.maxPoolSize;
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int27 = hikariConfig16.minPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str29 = hikariConfig28.catalog;
        hikariConfig28.leakDetectionThreshold = (-1L);
        hikariConfig28.catalog = "HikariPool-173";
        hikariConfig28.setJdbc4ConnectionTest(true);
        int int36 = hikariConfig28.minPoolSize;
        java.util.Properties properties37 = hikariConfig28.getDataSourceProperties();
        hikariConfig16.dataSourceProperties = properties37;
        hikariConfig1.dataSourceProperties = properties37;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-43445" + "'", str11, "HikariPool-43445");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaxLifetime((-1L));
        int int14 = hikariConfig1.maxPoolSize;
        int int15 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
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
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(87);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
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
        int int14 = hikariConfig1.acquireRetries;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        java.lang.String str21 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int24 = hikariConfig16.maxPoolSize;
        hikariConfig16.idleTimeout = (byte) -1;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.dataSourceClassName = "";
        hikariConfig28.setTransactionIsolation("");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        hikariConfig37.isInitializationFailFast = true;
        int int43 = hikariConfig37.acquireRetries;
        hikariConfig37.setMaxLifetime((long) (-1));
        int int46 = hikariConfig37.getTransactionIsolation();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        int int49 = hikariConfig48.getTransactionIsolation();
        hikariConfig48.setRegisterMbeans(false);
        java.lang.String str52 = hikariConfig48.transactionIsolationName;
        int int53 = hikariConfig48.getMaximumPoolSize();
        int int54 = hikariConfig48.transactionIsolation;
        java.util.Properties properties55 = hikariConfig48.dataSourceProperties;
        hikariConfig37.setDataSourceProperties(properties55);
        hikariConfig28.dataSourceProperties = properties55;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig16.dataSourceProperties = properties55;
        hikariConfig1.setDataSourceProperties(properties55);
        boolean boolean61 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-410";
        hikariConfig1.dataSourceClassName = "HikariPool-26";
        hikariConfig1.setAutoCommit(false);
        boolean boolean68 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(87L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.connectionTimeout = 100L;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-9921";
        long long12 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.dataSourceClassName = "";
        hikariConfig10.setTransactionIsolation("");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        hikariConfig19.isInitializationFailFast = true;
        int int25 = hikariConfig19.acquireRetries;
        hikariConfig19.setMaxLifetime((long) (-1));
        int int28 = hikariConfig19.getTransactionIsolation();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        int int35 = hikariConfig30.getMaximumPoolSize();
        int int36 = hikariConfig30.transactionIsolation;
        java.util.Properties properties37 = hikariConfig30.dataSourceProperties;
        hikariConfig19.setDataSourceProperties(properties37);
        hikariConfig10.dataSourceProperties = properties37;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.dataSourceProperties = properties37;
        boolean boolean42 = hikariConfig1.isInitializationFailFast();
        boolean boolean43 = hikariConfig1.isInitializationFailFast;
        int int44 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        int int47 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource48 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolation = (short) -1;
        hikariConfig1.transactionIsolationName = "HikariPool-5802";
        hikariConfig1.setConnectionInitSql("HikariPool-41183");
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(dataSource48);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.maxLifetime = 0L;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.connectionInitSql = "HikariPool-8218";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        hikariConfig1.setMaxLifetime(10L);
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-13356";
        hikariConfig1.connectionTimeout = 1800000L;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setInitializationFailFast(false);
        int int9 = hikariConfig1.maxPoolSize;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig13.connectionCustomizer = iConnectionCustomizer15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-531");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer19;
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.maxPoolSize = 32;
        long long26 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setCatalog("HikariPool-26");
        java.lang.String str15 = hikariConfig1.catalog;
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-26" + "'", str15, "HikariPool-26");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26318");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26318 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
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
        javax.sql.DataSource dataSource39 = null;
        hikariConfig1.setDataSource(dataSource39);
        long long41 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str44 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
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
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60L + "'", long41 == 60L);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
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
        hikariConfig1.maxPoolSize = 60;
        hikariConfig1.maxPoolSize = 97;
        hikariConfig1.dataSourceClassName = "HikariPool-5449";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
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
        boolean boolean13 = hikariConfig1.isAutoCommit;
        int int14 = hikariConfig1.acquireRetries;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setCatalog("HikariPool-43170");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
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
        java.lang.String str40 = hikariConfig1.dataSourceClassName;
        int int41 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-39458";
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
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
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean21 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
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
        hikariConfig1.setTransactionIsolation("HikariPool-1307");
        hikariConfig1.setMaxLifetime(5000L);
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
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getTransactionIsolation();
        int int12 = hikariConfig1.getTransactionIsolation();
        java.lang.String str13 = hikariConfig1.catalog;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str12 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-43495" + "'", str12, "HikariPool-43495");
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.isRegisterMbeans = true;
        int int14 = hikariConfig1.minPoolSize;
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.acquireRetries = (short) 10;
        hikariConfig1.idleTimeout = 87;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-43497" + "'", str11, "HikariPool-43497");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        hikariConfig1.setIdleTimeout((long) (-1));
        hikariConfig1.setDataSourceClassName("HikariPool-249");
        hikariConfig1.connectionTestQuery = "HikariPool-633";
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.minPoolSize = (short) -1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer21;
        long long23 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
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
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        long long15 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.setUseInstrumentation(true);
        hikariConfig17.setConnectionInitSql("");
        hikariConfig17.setRegisterMbeans(true);
        long long27 = hikariConfig17.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setDataSourceClassName("");
        hikariConfig29.validate();
        long long33 = hikariConfig29.getLeakDetectionThreshold();
        hikariConfig29.setIdleTimeout((long) '4');
        java.lang.String str36 = hikariConfig29.connectionCustomizerClassName;
        hikariConfig29.idleTimeout = (short) 0;
        hikariConfig17.addDataSourceProperty("HikariPool-222", (java.lang.Object) (short) 0);
        hikariConfig17.setIdleTimeout((long) (byte) 10);
        hikariConfig17.setPoolName("HikariPool-756");
        java.util.Properties properties44 = hikariConfig17.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.maxPoolSize = 32;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
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
        int int14 = hikariConfig1.getAcquireRetries();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        java.lang.String str24 = hikariConfig18.getConnectionCustomizerClassName();
        hikariConfig18.transactionIsolationName = "";
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.dataSourceClassName = "";
        hikariConfig28.setTransactionIsolation("");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        hikariConfig37.isInitializationFailFast = true;
        int int43 = hikariConfig37.acquireRetries;
        hikariConfig37.setMaxLifetime((long) (-1));
        int int46 = hikariConfig37.getTransactionIsolation();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        int int49 = hikariConfig48.getTransactionIsolation();
        hikariConfig48.setRegisterMbeans(false);
        java.lang.String str52 = hikariConfig48.transactionIsolationName;
        int int53 = hikariConfig48.getMaximumPoolSize();
        int int54 = hikariConfig48.transactionIsolation;
        java.util.Properties properties55 = hikariConfig48.dataSourceProperties;
        hikariConfig37.setDataSourceProperties(properties55);
        hikariConfig28.dataSourceProperties = properties55;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig18.setDataSourceProperties(properties55);
        hikariConfig1.setDataSourceProperties(properties55);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer61 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer61;
        java.lang.String str63 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionInitSql = "HikariPool-1293";
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        long long16 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
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
        long long30 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaximumPoolSize(10);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.leakDetectionThreshold = 100;
        hikariConfig34.connectionInitSql = "hi!";
        hikariConfig34.maxPoolSize = (short) -1;
        long long41 = hikariConfig34.maxLifetime;
        long long42 = hikariConfig34.maxLifetime;
        java.util.Properties properties43 = hikariConfig34.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties43;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 35L + "'", long41 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
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
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-9");
        int int22 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.transactionIsolation = (-1);
        java.lang.String str13 = hikariConfig1.catalog;
        hikariConfig1.minPoolSize = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setCatalog("");
        hikariConfig1.idleTimeout = 60;
        long long13 = hikariConfig1.idleTimeout;
        int int14 = hikariConfig1.transactionIsolation;
        hikariConfig1.connectionTimeout = 32;
        long long17 = hikariConfig1.getMaxLifetime();
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        int int19 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(35);
        java.lang.String str22 = hikariConfig1.catalog;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-306");
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.acquireRetries = (byte) 10;
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int18 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-43526" + "'", str10, "HikariPool-43526");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        java.lang.String str6 = hikariConfig0.dataSourceClassName;
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.dataSourceClassName = "HikariPool-127";
        hikariConfig0.setPoolName("HikariPool-16698");
        hikariConfig0.connectionTimeout = 1800000L;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-43527" + "'", str1, "HikariPool-43527");
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-900");
        hikariConfig1.setConnectionTestQuery("HikariPool-357");
        hikariConfig1.setMaxLifetime(100L);
        boolean boolean77 = hikariConfig1.isInitializationFailFast;
        long long78 = hikariConfig1.getConnectionTimeout();
        java.lang.String str79 = hikariConfig1.getConnectionTestQuery();
        long long80 = hikariConfig1.idleTimeout;
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L + "'", long78 == 10L);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "HikariPool-357" + "'", str79, "HikariPool-357");
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + 60L + "'", long80 == 60L);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.setConnectionTestQuery("HikariPool-3244");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setCatalog("HikariPool-10736");
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig15.transactionIsolationName;
        java.lang.String str20 = hikariConfig15.connectionCustomizerClassName;
        hikariConfig15.setConnectionTestQuery("hi!");
        java.lang.String str23 = hikariConfig15.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig15.connectionCustomizer;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("hi!");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        hikariConfig30.dataSourceClassName = "";
        hikariConfig30.setTransactionIsolation("");
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        hikariConfig39.isInitializationFailFast = true;
        int int45 = hikariConfig39.acquireRetries;
        hikariConfig39.setMaxLifetime((long) (-1));
        int int48 = hikariConfig39.getTransactionIsolation();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        java.lang.String str54 = hikariConfig50.transactionIsolationName;
        int int55 = hikariConfig50.getMaximumPoolSize();
        int int56 = hikariConfig50.transactionIsolation;
        java.util.Properties properties57 = hikariConfig50.dataSourceProperties;
        hikariConfig39.setDataSourceProperties(properties57);
        hikariConfig30.dataSourceProperties = properties57;
        hikariConfig26.dataSourceProperties = properties57;
        hikariConfig15.setDataSourceProperties(properties57);
        hikariConfig1.dataSourceProperties = properties57;
        long long63 = hikariConfig1.connectionTimeout;
        java.lang.String str64 = hikariConfig1.getPoolName();
        long long65 = hikariConfig1.leakDetectionThreshold;
        int int66 = hikariConfig1.getAcquireRetries();
        java.lang.String str67 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(properties57);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "HikariPool-43537" + "'", str64, "HikariPool-43537");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
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
        long long43 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMinimumPoolSize(97);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-43543" + "'", str10, "HikariPool-43543");
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.poolName = "";
        hikariConfig1.setMaximumPoolSize(52);
        int int16 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
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
        hikariConfig1.setPoolName("HikariPool-2449");
        hikariConfig1.validate();
        hikariConfig1.catalog = "HikariPool-29832";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.catalog;
        hikariConfig13.leakDetectionThreshold = (-1L);
        hikariConfig13.catalog = "HikariPool-173";
        hikariConfig13.setJdbc4ConnectionTest(true);
        int int21 = hikariConfig13.minPoolSize;
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties22;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str25 = hikariConfig24.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-35906");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-35906 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-550";
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setTransactionIsolation("hi!");
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.leakDetectionThreshold = 100;
        int int16 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-204");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.leakDetectionThreshold = 100;
        boolean boolean23 = hikariConfig20.isJdbc4connectionTest;
        long long24 = hikariConfig20.getIdleTimeout();
        java.lang.String str25 = hikariConfig20.getPoolName();
        hikariConfig20.setMaximumPoolSize((int) (byte) 10);
        hikariConfig20.setConnectionInitSql("HikariPool-1485");
        hikariConfig20.isJdbc4connectionTest = false;
        java.util.Properties properties32 = hikariConfig20.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties32);
        hikariConfig1.dataSourceProperties = properties32;
        java.util.Properties properties35 = hikariConfig1.getDataSourceProperties();
        long long36 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60L + "'", long24 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-43557" + "'", str25, "HikariPool-43557");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-481");
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-365";
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
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
        int int22 = hikariConfig8.getMaximumPoolSize();
        long long23 = hikariConfig8.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
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
        hikariConfig1.setConnectionInitSql("HikariPool-69");
        java.lang.String str15 = hikariConfig1.getPoolName();
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.idleTimeout = 0L;
        java.lang.String str19 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-43563" + "'", str11, "HikariPool-43563");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-43563" + "'", str15, "HikariPool-43563");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
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
        hikariConfig1.setPoolName("HikariPool-927");
        boolean boolean33 = hikariConfig1.isRegisterMbeans();
        int int34 = hikariConfig1.acquireRetries;
        int int35 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = false;
        long long13 = hikariConfig1.connectionTimeout;
        long long14 = hikariConfig1.getMaxLifetime();
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig18.transactionIsolationName;
        int int23 = hikariConfig18.getMaximumPoolSize();
        int int24 = hikariConfig18.transactionIsolation;
        java.util.Properties properties25 = hikariConfig18.dataSourceProperties;
        boolean boolean26 = hikariConfig18.isRegisterMbeans;
        javax.sql.DataSource dataSource27 = hikariConfig18.getDataSource();
        hikariConfig18.setMaxLifetime((long) 3);
        hikariConfig1.addDataSourceProperty("HikariPool-531", (java.lang.Object) hikariConfig18);
        hikariConfig18.setAcquireRetries((int) (short) 1);
        hikariConfig18.setLeakDetectionThreshold((long) (short) 1);
        int int35 = hikariConfig18.minPoolSize;
        long long36 = hikariConfig18.leakDetectionThreshold;
        int int37 = hikariConfig18.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
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
        long long14 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setPoolName("HikariPool-4128");
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        int int7 = hikariConfig1.getTransactionIsolation();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-24596");
        int int11 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-43569" + "'", str6, "HikariPool-43569");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.transactionIsolation = (byte) 0;
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setMaxLifetime(10L);
        long long9 = hikariConfig0.connectionTimeout;
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        long long11 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
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
        java.lang.String str21 = hikariConfig1.poolName;
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str24 = hikariConfig1.getConnectionTestQuery();
        int int25 = hikariConfig1.minPoolSize;
        java.lang.String str26 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        int int29 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-43571" + "'", str21, "HikariPool-43571");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-43574" + "'", str8, "HikariPool-43574");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setLeakDetectionThreshold(0L);
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        int int9 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.poolName = "HikariPool-157";
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        long long15 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-43578" + "'", str8, "HikariPool-43578");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig16.setPoolName("HikariPool-168");
        java.lang.String str19 = hikariConfig16.getPoolName();
        hikariConfig16.setMaxLifetime((long) (-1));
        hikariConfig16.setPoolName("HikariPool-732");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig16.connectionCustomizer;
        long long25 = hikariConfig16.maxLifetime;
        hikariConfig16.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-168" + "'", str19, "HikariPool-168");
        org.junit.Assert.assertNull(iConnectionCustomizer24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "HikariPool-548";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
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
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.leakDetectionThreshold = 1800000L;
        long long12 = hikariConfig1.idleTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
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
        hikariConfig1.poolName = "HikariPool-1825";
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionInitSql("HikariPool-6");
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
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.maxPoolSize = (byte) 0;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        java.lang.String str12 = hikariConfig1.catalog;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1649");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        long long10 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1485");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1485 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        boolean boolean14 = hikariConfig11.isJdbc4connectionTest;
        long long15 = hikariConfig11.getIdleTimeout();
        java.lang.String str16 = hikariConfig11.getPoolName();
        int int17 = hikariConfig11.getTransactionIsolation();
        java.lang.String str18 = hikariConfig11.getConnectionCustomizerClassName();
        long long19 = hikariConfig11.getIdleTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-12501", (java.lang.Object) hikariConfig11);
        int int21 = hikariConfig11.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-43598" + "'", str16, "HikariPool-43598");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        long long7 = hikariConfig1.idleTimeout;
        hikariConfig1.maxLifetime = 100;
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold((long) ' ');
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(1);
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setIdleTimeout(97L);
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        long long10 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionInitSql("HikariPool-472");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig1.setTransactionIsolation("HikariPool-764");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.catalog;
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTimeout(0L);
        long long12 = hikariConfig1.connectionTimeout;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        int int14 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-43604" + "'", str9, "HikariPool-43604");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2147483647L + "'", long12 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        java.lang.String str11 = hikariConfig1.catalog;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.idleTimeout = 0L;
        long long15 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        java.lang.String str12 = hikariConfig1.catalog;
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.leakDetectionThreshold = (byte) 0;
        int int17 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
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
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.connectionInitSql = "HikariPool-633";
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        java.lang.String str24 = hikariConfig18.getConnectionInitSql();
        java.lang.String str25 = hikariConfig18.transactionIsolationName;
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int28 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.setRegisterMbeans(false);
        java.lang.String str31 = hikariConfig27.connectionTestQuery;
        long long32 = hikariConfig27.getIdleTimeout();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        java.lang.String str39 = hikariConfig34.connectionCustomizerClassName;
        hikariConfig34.setConnectionTestQuery("hi!");
        java.lang.String str42 = hikariConfig34.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = hikariConfig34.connectionCustomizer;
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig45.setConnectionInitSql("hi!");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        int int50 = hikariConfig49.getTransactionIsolation();
        hikariConfig49.setRegisterMbeans(false);
        hikariConfig49.dataSourceClassName = "";
        hikariConfig49.setTransactionIsolation("");
        java.util.Properties properties57 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        int int59 = hikariConfig58.getTransactionIsolation();
        hikariConfig58.setRegisterMbeans(false);
        hikariConfig58.isInitializationFailFast = true;
        int int64 = hikariConfig58.acquireRetries;
        hikariConfig58.setMaxLifetime((long) (-1));
        int int67 = hikariConfig58.getTransactionIsolation();
        java.util.Properties properties68 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties68);
        int int70 = hikariConfig69.getTransactionIsolation();
        hikariConfig69.setRegisterMbeans(false);
        java.lang.String str73 = hikariConfig69.transactionIsolationName;
        int int74 = hikariConfig69.getMaximumPoolSize();
        int int75 = hikariConfig69.transactionIsolation;
        java.util.Properties properties76 = hikariConfig69.dataSourceProperties;
        hikariConfig58.setDataSourceProperties(properties76);
        hikariConfig49.dataSourceProperties = properties76;
        hikariConfig45.dataSourceProperties = properties76;
        hikariConfig34.setDataSourceProperties(properties76);
        hikariConfig27.dataSourceProperties = properties76;
        hikariConfig18.setDataSourceProperties(properties76);
        hikariConfig1.dataSourceProperties = properties76;
        hikariConfig1.setPoolName("HikariPool-22");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer86 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer86;
        java.lang.String str88 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setIdleTimeout((long) 'a');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer91 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer91;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60L + "'", long32 == 60L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(iConnectionCustomizer43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 60 + "'", int74 == 60);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "HikariPool-633" + "'", str88, "HikariPool-633");
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
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
        hikariConfig1.setCatalog("HikariPool-696");
        hikariConfig1.acquireRetries = 87;
        long long25 = hikariConfig1.connectionTimeout;
        hikariConfig1.isInitializationFailFast = true;
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
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        long long12 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isAutoCommit;
        hikariConfig15.poolName = "hi!";
        java.lang.String str19 = hikariConfig15.dataSourceClassName;
        java.lang.String str20 = hikariConfig15.dataSourceClassName;
        hikariConfig15.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig15.connectionCustomizer;
        hikariConfig15.setMaxLifetime((long) (short) 0);
        hikariConfig15.setAcquireRetries(100);
        hikariConfig15.setJdbc4ConnectionTest(false);
        hikariConfig15.idleTimeout = 87L;
        hikariConfig15.idleTimeout = (short) -1;
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig15);
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setCatalog("HikariPool-292");
        int int11 = hikariConfig1.getMaximumPoolSize();
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.poolName = "HikariPool-5476";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime(35L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
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
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.leakDetectionThreshold = 100;
        boolean boolean39 = hikariConfig36.isJdbc4ConnectionTest();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        int int42 = hikariConfig41.getTransactionIsolation();
        hikariConfig41.setRegisterMbeans(false);
        java.lang.String str45 = hikariConfig41.transactionIsolationName;
        long long46 = hikariConfig41.getIdleTimeout();
        java.lang.String str47 = hikariConfig41.getCatalog();
        java.lang.String str48 = hikariConfig41.getConnectionTestQuery();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig50.dataSourceClassName = "";
        java.util.Properties properties53 = hikariConfig50.dataSourceProperties;
        hikariConfig41.setDataSourceProperties(properties53);
        hikariConfig36.dataSourceProperties = properties53;
        hikariConfig36.connectionInitSql = "HikariPool-306";
        hikariConfig36.setCatalog("");
        java.util.Properties properties60 = hikariConfig36.dataSourceProperties;
        hikariConfig31.setDataSourceProperties(properties60);
        hikariConfig31.connectionTimeout = '#';
        long long64 = hikariConfig31.idleTimeout;
        java.lang.String str65 = hikariConfig31.dataSourceClassName;
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 60L + "'", long46 == 60L);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.leakDetectionThreshold = (short) 100;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
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
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.transactionIsolation = 60;
        long long23 = hikariConfig1.maxLifetime;
        hikariConfig1.isRegisterMbeans = false;
        javax.sql.DataSource dataSource26 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.leakDetectionThreshold = 97L;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionTestQuery = "HikariPool-5234";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        hikariConfig0.connectionInitSql = "hi!";
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str10 = hikariConfig0.connectionInitSql;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-43634" + "'", str1, "HikariPool-43634");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
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
        java.lang.String str46 = hikariConfig1.getConnectionInitSql();
        long long47 = hikariConfig1.getIdleTimeout();
        int int48 = hikariConfig1.getMinimumPoolSize();
        boolean boolean49 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
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
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-43635" + "'", str45, "HikariPool-43635");
        org.junit.Assert.assertNull(str46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 60L + "'", long47 == 60L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.dataSourceClassName = "HikariPool-140";
        hikariConfig1.idleTimeout = 32;
        hikariConfig1.transactionIsolation = 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        long long19 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.catalog = "HikariPool-21";
        hikariConfig1.setTransactionIsolation("HikariPool-770");
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = 32;
        hikariConfig1.setTransactionIsolation("HikariPool-373");
        hikariConfig1.setIdleTimeout((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.minPoolSize = (short) 0;
        int int12 = hikariConfig1.getMaximumPoolSize();
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.poolName = "HikariPool-21";
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        hikariConfig1.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(0L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.setConnectionInitSql("HikariPool-756");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getAcquireIncrement();
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.connectionTimeout = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
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
        hikariConfig1.setPoolName("");
        javax.sql.DataSource dataSource75 = null;
        hikariConfig1.setDataSource(dataSource75);
        hikariConfig1.transactionIsolationName = "HikariPool-32715";
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
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
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
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        long long13 = hikariConfig1.getConnectionTimeout();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
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
        boolean boolean22 = hikariConfig1.isRegisterMbeans;
        long long23 = hikariConfig1.idleTimeout;
        hikariConfig1.setIdleTimeout(100L);
        int int26 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-43657" + "'", str11, "HikariPool-43657");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.connectionInitSql = "HikariPool-164";
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.catalog = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.isRegisterMbeans = true;
        int int14 = hikariConfig1.minPoolSize;
        long long15 = hikariConfig1.connectionTimeout;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1327";
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-43660" + "'", str11, "HikariPool-43660");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
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
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.poolName = "HikariPool-197";
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        long long9 = hikariConfig1.idleTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60L + "'", long9 == 60L);
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig5.transactionIsolationName;
        int int10 = hikariConfig5.transactionIsolation;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig5.dataSource = dataSource11;
        long long13 = hikariConfig5.maxLifetime;
        hikariConfig5.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties16 = hikariConfig5.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties16);
        hikariConfig0.isInitializationFailFast = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getConnectionTimeout();
        long long5 = hikariConfig1.maxLifetime;
        hikariConfig1.setInitializationFailFast(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        int int5 = hikariConfig1.getTransactionIsolation();
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str9 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-43676" + "'", str9, "HikariPool-43676");
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIdleTimeout(52L);
        boolean boolean12 = hikariConfig1.isAutoCommit;
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        hikariConfig1.setCatalog("HikariPool-647");
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionTestQuery = "HikariPool-412";
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setDataSourceClassName("HikariPool-2067");
        hikariConfig1.transactionIsolationName = "HikariPool-154";
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
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
        java.util.Properties properties73 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        int int75 = hikariConfig74.getTransactionIsolation();
        hikariConfig74.setRegisterMbeans(false);
        hikariConfig74.isInitializationFailFast = true;
        int int80 = hikariConfig74.acquireRetries;
        hikariConfig74.setMaxLifetime((long) (-1));
        boolean boolean83 = hikariConfig74.isInitializationFailFast();
        long long84 = hikariConfig74.maxLifetime;
        hikariConfig74.minPoolSize = (byte) -1;
        int int87 = hikariConfig74.getMaximumPoolSize();
        hikariConfig69.addDataSourceProperty("HikariPool-245", (java.lang.Object) hikariConfig74);
        hikariConfig69.dataSourceClassName = "HikariPool-376";
        boolean boolean91 = hikariConfig69.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer92 = hikariConfig69.connectionCustomizer;
        java.lang.String str93 = hikariConfig69.getDataSourceClassName();
        hikariConfig69.validate();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 60 + "'", int87 == 60);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "HikariPool-376" + "'", str93, "HikariPool-376");
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
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
        java.util.Properties properties71 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.connectionTimeout = (short) 0;
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
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionInitSql = "HikariPool-220";
        hikariConfig1.connectionInitSql = "HikariPool-312";
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str18 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-43694" + "'", str18, "HikariPool-43694");
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        boolean boolean9 = hikariConfig1.isAutoCommit;
        hikariConfig1.isInitializationFailFast = true;
        long long12 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
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
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        int int15 = hikariConfig1.minPoolSize;
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        long long17 = hikariConfig1.connectionTimeout;
        hikariConfig1.minPoolSize = (byte) 100;
        hikariConfig1.catalog = "HikariPool-9391";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-320" + "'", str16, "HikariPool-320");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
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
        java.lang.String str18 = hikariConfig1.poolName;
        hikariConfig1.setInitializationFailFast(false);
        long long21 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-1952");
        hikariConfig1.validate();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-43697" + "'", str18, "HikariPool-43697");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
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
        hikariConfig1.setConnectionInitSql("HikariPool-39377");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.maxPoolSize;
        long long11 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.maxPoolSize = (short) -1;
        long long15 = hikariConfig1.connectionTimeout;
        hikariConfig1.transactionIsolationName = "HikariPool-36974";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout((long) 52);
        hikariConfig1.setCatalog("HikariPool-280");
        long long14 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
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
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        int int13 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        java.lang.String str5 = hikariConfig0.dataSourceClassName;
        int int6 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-6776");
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.maxPoolSize = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
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
        int int14 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.minPoolSize = (byte) 0;
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.idleTimeout = 3L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig15.transactionIsolationName;
        java.lang.String str20 = hikariConfig15.connectionCustomizerClassName;
        hikariConfig15.setConnectionTestQuery("hi!");
        java.lang.String str23 = hikariConfig15.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig15.connectionCustomizer;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("hi!");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        hikariConfig30.dataSourceClassName = "";
        hikariConfig30.setTransactionIsolation("");
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        hikariConfig39.isInitializationFailFast = true;
        int int45 = hikariConfig39.acquireRetries;
        hikariConfig39.setMaxLifetime((long) (-1));
        int int48 = hikariConfig39.getTransactionIsolation();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        java.lang.String str54 = hikariConfig50.transactionIsolationName;
        int int55 = hikariConfig50.getMaximumPoolSize();
        int int56 = hikariConfig50.transactionIsolation;
        java.util.Properties properties57 = hikariConfig50.dataSourceProperties;
        hikariConfig39.setDataSourceProperties(properties57);
        hikariConfig30.dataSourceProperties = properties57;
        hikariConfig26.dataSourceProperties = properties57;
        hikariConfig15.setDataSourceProperties(properties57);
        hikariConfig1.dataSourceProperties = properties57;
        long long63 = hikariConfig1.connectionTimeout;
        java.lang.String str64 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(properties57);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        boolean boolean10 = hikariConfig1.isAutoCommit();
        int int11 = hikariConfig1.acquireRetries;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-3031");
        hikariConfig1.setRegisterMbeans(false);
        int int18 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
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
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        long long20 = hikariConfig1.getConnectionTimeout();
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setTransactionIsolation("HikariPool-22247");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTestQuery = "HikariPool-577";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.maxLifetime = 3;
        long long14 = hikariConfig1.getMaxLifetime();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setIdleTimeout((long) 60);
        long long9 = hikariConfig1.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
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
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setMaxLifetime((long) 'a');
        java.lang.String str25 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.dataSource = dataSource26;
        int int28 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.dataSourceClassName = "";
        hikariConfig10.setTransactionIsolation("");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        hikariConfig19.isInitializationFailFast = true;
        int int25 = hikariConfig19.acquireRetries;
        hikariConfig19.setMaxLifetime((long) (-1));
        int int28 = hikariConfig19.getTransactionIsolation();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        int int35 = hikariConfig30.getMaximumPoolSize();
        int int36 = hikariConfig30.transactionIsolation;
        java.util.Properties properties37 = hikariConfig30.dataSourceProperties;
        hikariConfig19.setDataSourceProperties(properties37);
        hikariConfig10.dataSourceProperties = properties37;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.dataSourceProperties = properties37;
        boolean boolean42 = hikariConfig1.isInitializationFailFast();
        boolean boolean43 = hikariConfig1.isInitializationFailFast;
        long long44 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str45 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource46 = null;
        hikariConfig1.dataSource = dataSource46;
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.connectionTimeout = 87L;
        java.lang.String str52 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
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
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        hikariConfig1.leakDetectionThreshold = 10;
        int int16 = hikariConfig1.minPoolSize;
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        hikariConfig1.minPoolSize = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        int int6 = hikariConfig1.getAcquireIncrement();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
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
        int int22 = hikariConfig9.getMinimumPoolSize();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig24.transactionIsolationName;
        long long29 = hikariConfig24.getIdleTimeout();
        java.lang.String str30 = hikariConfig24.getCatalog();
        java.util.Properties properties31 = hikariConfig24.getDataSourceProperties();
        hikariConfig24.setRegisterMbeans(true);
        hikariConfig24.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.transactionIsolation;
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig24.setDataSourceProperties(properties44);
        hikariConfig9.dataSourceProperties = properties44;
        hikariConfig1.setDataSourceProperties(properties44);
        int int48 = hikariConfig1.getTransactionIsolation();
        long long49 = hikariConfig1.idleTimeout;
        hikariConfig1.setIdleTimeout(1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 60L + "'", long29 == 60L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 60L + "'", long49 == 60L);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
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
        hikariConfig1.setConnectionInitSql("HikariPool-57");
        hikariConfig1.poolName = "HikariPool-5234";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
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
        hikariConfig1.setUseInstrumentation(true);
        long long15 = hikariConfig1.idleTimeout;
        int int16 = hikariConfig1.getAcquireIncrement();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setRegisterMbeans(true);
        java.lang.Class<?> wildcardClass21 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-68");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-21");
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.leakDetectionThreshold = 2147483647L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
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
        boolean boolean22 = hikariConfig1.isAutoCommit();
        hikariConfig1.minPoolSize = 0;
        javax.sql.DataSource dataSource25 = null;
        hikariConfig1.dataSource = dataSource25;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
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
        hikariConfig1.maxLifetime = 87L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setIdleTimeout(87L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = 0;
        int int11 = hikariConfig1.acquireRetries;
        java.lang.String str12 = hikariConfig1.poolName;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.dataSourceClassName = "";
        hikariConfig14.setIdleTimeout((long) (short) 100);
        java.util.Properties properties22 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.dataSourceProperties = properties22;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-43746" + "'", str12, "HikariPool-43746");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
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
        java.lang.String str13 = hikariConfig9.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        int int8 = hikariConfig1.acquireRetries;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-22247";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
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
        hikariConfig1.poolName = "HikariPool-55";
        int int14 = hikariConfig1.getAcquireRetries();
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.minPoolSize = (byte) 0;
        hikariConfig1.isInitializationFailFast = true;
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        hikariConfig1.idleTimeout = (byte) 1;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.setConnectionTestQuery("HikariPool-25957");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
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
        long long45 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str46 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource47 = hikariConfig1.dataSource;
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
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(dataSource47);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-306");
        hikariConfig1.maxLifetime = (short) 100;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        int int16 = hikariConfig1.getAcquireRetries();
        java.lang.String str17 = hikariConfig1.catalog;
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str20 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-306" + "'", str20, "HikariPool-306");
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        java.lang.String str13 = hikariConfig1.poolName;
        hikariConfig1.dataSourceClassName = "HikariPool-320";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-43762" + "'", str13, "HikariPool-43762");
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.dataSourceClassName = "";
        hikariConfig10.setIdleTimeout((long) (short) 100);
        java.util.Properties properties18 = hikariConfig10.getDataSourceProperties();
        long long19 = hikariConfig10.getMaxLifetime();
        java.util.Properties properties20 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties20);
        java.lang.String str22 = hikariConfig1.connectionTestQuery;
        hikariConfig1.idleTimeout = 1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
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
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-208";
        hikariConfig1.transactionIsolation = 60;
        hikariConfig1.acquireRetries = 87;
        hikariConfig1.setPoolName("HikariPool-1611");
        java.lang.String str22 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-1611" + "'", str22, "HikariPool-1611");
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.acquireRetries = 87;
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.transactionIsolationName = "HikariPool-477";
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
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
        hikariConfig74.setIdleTimeout((long) 87);
        javax.sql.DataSource dataSource80 = null;
        hikariConfig74.dataSource = dataSource80;
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
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
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
        int int17 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        java.lang.String str19 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-43775" + "'", str19, "HikariPool-43775");
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
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
        hikariConfig1.leakDetectionThreshold = (short) 0;
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setAutoCommit(true);
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.dataSourceClassName = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
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
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        long long15 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionTestQuery = "HikariPool-412";
        hikariConfig1.catalog = "";
        hikariConfig1.transactionIsolationName = "HikariPool-153";
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        hikariConfig1.setMaximumPoolSize(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        java.lang.String str12 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.minPoolSize = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        int int13 = hikariConfig1.maxPoolSize;
        hikariConfig1.acquireRetries = 97;
        long long16 = hikariConfig1.getIdleTimeout();
        hikariConfig1.catalog = "HikariPool-2451";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2249");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-43785" + "'", str8, "HikariPool-43785");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        int int6 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("hi!");
        boolean boolean12 = hikariConfig9.isRegisterMbeans();
        hikariConfig9.setIdleTimeout((long) (short) 100);
        hikariConfig9.maxPoolSize = (-1);
        java.lang.String str17 = hikariConfig9.getConnectionCustomizerClassName();
        int int18 = hikariConfig9.getAcquireIncrement();
        java.lang.String str19 = hikariConfig9.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("HikariPool-4961", (java.lang.Object) hikariConfig9);
        long long21 = hikariConfig9.connectionTimeout;
        hikariConfig9.setPoolName("HikariPool-41077");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
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
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setMinimumPoolSize(87);
        int int26 = hikariConfig23.getMaximumPoolSize();
        long long27 = hikariConfig23.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
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
        boolean boolean22 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.idleTimeout = 10L;
        hikariConfig1.setMaxLifetime(1L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either jdbc4ConnectionTest must be enabled or a connectionTestQuery must be specified.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
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
        hikariConfig1.setPoolName("hi!");
        long long25 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
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
        hikariConfig31.setPoolName("HikariPool-1952");
        java.lang.String str34 = hikariConfig31.catalog;
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        int int37 = hikariConfig36.getTransactionIsolation();
        hikariConfig36.setRegisterMbeans(false);
        java.lang.String str40 = hikariConfig36.transactionIsolationName;
        int int41 = hikariConfig36.getMaximumPoolSize();
        int int42 = hikariConfig36.transactionIsolation;
        java.util.Properties properties43 = hikariConfig36.dataSourceProperties;
        boolean boolean44 = hikariConfig36.isRegisterMbeans;
        javax.sql.DataSource dataSource45 = hikariConfig36.getDataSource();
        hikariConfig36.setMaxLifetime((long) 3);
        boolean boolean48 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setRegisterMbeans(false);
        int int51 = hikariConfig36.acquireRetries;
        hikariConfig36.setAutoCommit(true);
        hikariConfig36.setUseInstrumentation(false);
        java.lang.String str56 = hikariConfig36.catalog;
        java.util.Properties properties57 = hikariConfig36.getDataSourceProperties();
        hikariConfig31.setDataSourceProperties(properties57);
        hikariConfig31.setJdbc4ConnectionTest(true);
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(dataSource45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties57);
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-21418");
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
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
        long long12 = hikariConfig1.connectionTimeout;
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setPoolName("HikariPool-249");
        long long9 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.transactionIsolation = (byte) 0;
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setConnectionTestQuery("HikariPool-173");
        hikariConfig1.setMinimumPoolSize(87);
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setCatalog("HikariPool-365");
        hikariConfig1.setAcquireRetries(0);
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-173" + "'", str14, "HikariPool-173");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
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
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        boolean boolean22 = hikariConfig1.isAutoCommit;
        int int23 = hikariConfig1.getTransactionIsolation();
        int int24 = hikariConfig1.maxPoolSize;
        long long25 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
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
        int int14 = hikariConfig1.minPoolSize;
        hikariConfig1.setTransactionIsolation("HikariPool-81");
        int int17 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
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
        hikariConfig31.setPoolName("HikariPool-1952");
        java.lang.String str34 = hikariConfig31.catalog;
        java.lang.Class<?> wildcardClass35 = hikariConfig31.getClass();
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAcquireRetries(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15743");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        long long7 = hikariConfig1.getConnectionTimeout();
        long long8 = hikariConfig1.connectionTimeout;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1871";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15744");
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
        java.lang.String str25 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isInitializationFailFast = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15745");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-517");
        javax.sql.DataSource dataSource29 = hikariConfig1.dataSource;
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.idleTimeout = (byte) 0;
        long long33 = hikariConfig1.maxLifetime;
        long long34 = hikariConfig1.getMaxLifetime();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = hikariConfig1.connectionCustomizer;
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
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(properties30);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15746");
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
        hikariConfig1.setAcquireRetries((int) (short) 1);
        hikariConfig1.setMaximumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15747");
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
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        hikariConfig34.setUseInstrumentation(true);
        hikariConfig34.setConnectionInitSql("");
        hikariConfig34.setConnectionCustomizerClassName("hi!");
        boolean boolean44 = hikariConfig34.isInitializationFailFast;
        hikariConfig34.maxPoolSize = ' ';
        int int47 = hikariConfig34.maxPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig48.setDataSourceClassName("");
        hikariConfig48.validate();
        long long52 = hikariConfig48.getLeakDetectionThreshold();
        hikariConfig48.setIdleTimeout((long) '4');
        java.lang.String str55 = hikariConfig48.connectionCustomizerClassName;
        java.util.Properties properties56 = hikariConfig48.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig34.setDataSourceProperties(properties56);
        hikariConfig11.dataSourceProperties = properties56;
        int int61 = hikariConfig11.maxPoolSize;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNull(iConnectionCustomizer29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-43833" + "'", str32, "HikariPool-43833");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 60 + "'", int61 == 60);
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize((int) '4');
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.isRegisterMbeans = true;
        int int13 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        long long15 = hikariConfig1.getConnectionTimeout();
        int int16 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15749");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        long long13 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getMaxLifetime();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.maxLifetime = (byte) 1;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15751");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15752");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIdleTimeout((long) 1);
        hikariConfig1.setTransactionIsolation("HikariPool-165");
        java.lang.String str13 = hikariConfig1.poolName;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries(1);
        long long17 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-43844" + "'", str13, "HikariPool-43844");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15753");
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
        hikariConfig11.setIdleTimeout((long) 52);
        boolean boolean34 = hikariConfig11.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15754");
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
        java.lang.String str18 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) 1);
        long long21 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = 87;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-43848" + "'", str18, "HikariPool-43848");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15755");
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
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.leakDetectionThreshold = 100;
        java.lang.String str30 = hikariConfig27.connectionTestQuery;
        hikariConfig27.setMaximumPoolSize(87);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.leakDetectionThreshold = 100;
        hikariConfig34.minPoolSize = (byte) 1;
        hikariConfig34.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer41 = hikariConfig34.connectionCustomizer;
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        int int44 = hikariConfig43.getTransactionIsolation();
        hikariConfig43.setRegisterMbeans(false);
        hikariConfig43.dataSourceClassName = "";
        hikariConfig43.setTransactionIsolation("");
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        int int53 = hikariConfig52.getTransactionIsolation();
        hikariConfig52.setRegisterMbeans(false);
        hikariConfig52.isInitializationFailFast = true;
        int int58 = hikariConfig52.acquireRetries;
        hikariConfig52.setMaxLifetime((long) (-1));
        int int61 = hikariConfig52.getTransactionIsolation();
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        int int64 = hikariConfig63.getTransactionIsolation();
        hikariConfig63.setRegisterMbeans(false);
        java.lang.String str67 = hikariConfig63.transactionIsolationName;
        int int68 = hikariConfig63.getMaximumPoolSize();
        int int69 = hikariConfig63.transactionIsolation;
        java.util.Properties properties70 = hikariConfig63.dataSourceProperties;
        hikariConfig52.setDataSourceProperties(properties70);
        hikariConfig43.dataSourceProperties = properties70;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties70);
        hikariConfig34.dataSourceProperties = properties70;
        boolean boolean75 = hikariConfig34.isInitializationFailFast();
        boolean boolean76 = hikariConfig34.isInitializationFailFast;
        java.util.Properties properties77 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig(properties77);
        hikariConfig78.setConnectionInitSql("hi!");
        long long81 = hikariConfig78.getLeakDetectionThreshold();
        java.util.Properties properties82 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties82);
        int int84 = hikariConfig83.getTransactionIsolation();
        hikariConfig83.setRegisterMbeans(false);
        java.lang.String str87 = hikariConfig83.transactionIsolationName;
        int int88 = hikariConfig83.getMaximumPoolSize();
        int int89 = hikariConfig83.transactionIsolation;
        java.util.Properties properties90 = hikariConfig83.dataSourceProperties;
        hikariConfig78.dataSourceProperties = properties90;
        java.util.Properties properties92 = hikariConfig78.getDataSourceProperties();
        hikariConfig34.dataSourceProperties = properties92;
        hikariConfig27.dataSourceProperties = properties92;
        com.zaxxer.hikari.HikariConfig hikariConfig95 = new com.zaxxer.hikari.HikariConfig(properties92);
        com.zaxxer.hikari.HikariConfig hikariConfig96 = new com.zaxxer.hikari.HikariConfig(properties92);
        hikariConfig1.dataSourceProperties = properties92;
        java.lang.Class<?> wildcardClass98 = properties92.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(iConnectionCustomizer41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 60 + "'", int68 == 60);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 60 + "'", int88 == 60);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(properties90);
        org.junit.Assert.assertNotNull(properties92);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15756");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxLifetime = 1800000L;
        hikariConfig1.dataSourceClassName = "HikariPool-489";
        int int13 = hikariConfig1.transactionIsolation;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        int int18 = hikariConfig16.getAcquireIncrement();
        int int19 = hikariConfig16.getAcquireIncrement();
        java.lang.String str20 = hikariConfig16.connectionCustomizerClassName;
        hikariConfig16.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig16.connectionCustomizer;
        hikariConfig16.transactionIsolation = (byte) 100;
        long long26 = hikariConfig16.getIdleTimeout();
        hikariConfig16.setCatalog("HikariPool-6");
        java.lang.String str29 = hikariConfig16.dataSourceClassName;
        java.util.Properties properties30 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties30;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 60L + "'", long26 == 60L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15757");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-898");
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.poolName = "HikariPool-26235";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15758");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        int int15 = hikariConfig1.acquireRetries;
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        long long17 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionInitSql("HikariPool-9102");
        hikariConfig1.setCatalog("HikariPool-6248");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15759");
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
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        int int17 = hikariConfig1.getAcquireRetries();
        java.lang.String str18 = hikariConfig1.getCatalog();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("hi!");
        boolean boolean23 = hikariConfig20.isRegisterMbeans();
        hikariConfig20.setIdleTimeout((long) (short) 100);
        hikariConfig20.maxPoolSize = (-1);
        long long28 = hikariConfig20.getAcquireRetryDelay();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.poolName = "hi!";
        hikariConfig30.acquireRetries = ' ';
        hikariConfig30.connectionTimeout = (byte) 1;
        hikariConfig30.setUseInstrumentation(true);
        hikariConfig30.transactionIsolation = 100;
        java.util.Properties properties42 = hikariConfig30.dataSourceProperties;
        hikariConfig20.setDataSourceProperties(properties42);
        hikariConfig1.dataSourceProperties = properties42;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15760");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.connectionTestQuery = "HikariPool-173";
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15761");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.transactionIsolationName = "HikariPool-253";
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.poolName = "HikariPool-236";
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.idleTimeout = 10L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15762");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaxLifetime((long) '#');
        hikariConfig1.minPoolSize = '4';
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource17 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15763");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-37055");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-37055 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15764");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        hikariConfig1.idleTimeout = 1800000L;
        hikariConfig1.poolName = "HikariPool-581";
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.poolName;
        hikariConfig1.connectionTestQuery = "HikariPool-93";
        hikariConfig1.connectionTimeout = 60L;
        hikariConfig1.isAutoCommit = false;
        boolean boolean20 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-581" + "'", str13, "HikariPool-581");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15765");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setPoolName("");
        java.lang.String str37 = hikariConfig1.connectionCustomizerClassName;
        int int38 = hikariConfig1.getTransactionIsolation();
        long long39 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15766");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.transactionIsolation;
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.maxPoolSize = 60;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15767");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionInitSql = "HikariPool-413";
        hikariConfig1.minPoolSize = 87;
        hikariConfig1.minPoolSize = (byte) 100;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-215";
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-334";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-428");
        java.lang.String str15 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test15769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        int int11 = hikariConfig1.getAcquireIncrement();
        long long12 = hikariConfig1.getMaxLifetime();
        int int13 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        hikariConfig15.setUseInstrumentation(true);
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        hikariConfig15.maxPoolSize = (short) 100;
        java.lang.String str25 = hikariConfig15.transactionIsolationName;
        java.lang.String str26 = hikariConfig15.dataSourceClassName;
        java.util.Properties properties27 = hikariConfig15.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties27;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test15770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15770");
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
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.poolName = "HikariPool-483";
        java.lang.String str17 = hikariConfig1.catalog;
        hikariConfig1.idleTimeout = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMaximumPoolSize((int) ' ');
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test15772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15772");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        java.lang.String str12 = hikariConfig1.getCatalog();
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test15773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15773");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        int int6 = hikariConfig1.getAcquireIncrement();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("HikariPool-391");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test15774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15774");
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
        long long17 = hikariConfig1.getMaxLifetime();
        hikariConfig1.dataSourceClassName = "HikariPool-645";
        long long20 = hikariConfig1.idleTimeout;
        boolean boolean21 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test15775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15775");
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
        int int17 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test15776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15776");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setDataSourceClassName("HikariPool-252");
        long long12 = hikariConfig1.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        hikariConfig1.dataSourceClassName = "HikariPool-13337";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test15777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.maxPoolSize = (-1);
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.poolName = "hi!";
        hikariConfig11.acquireRetries = ' ';
        hikariConfig11.connectionTimeout = (byte) 1;
        hikariConfig11.setUseInstrumentation(true);
        hikariConfig11.transactionIsolation = 100;
        java.util.Properties properties23 = hikariConfig11.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties23);
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean27 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties28 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.connectionTestQuery = "HikariPool-22160";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test15778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15778");
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
        java.lang.String str23 = hikariConfig14.poolName;
        int int24 = hikariConfig14.maxPoolSize;
        hikariConfig14.transactionIsolationName = "HikariPool-512";
        boolean boolean27 = hikariConfig14.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-43902" + "'", str23, "HikariPool-43902");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test15779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15779");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.leakDetectionThreshold = 0L;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15780");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-29");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        hikariConfig13.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15781");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.idleTimeout = 'a';
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-11503");
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-43906" + "'", str10, "HikariPool-43906");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15782");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        long long7 = hikariConfig1.connectionTimeout;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test15783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15783");
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
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setMaxLifetime((long) '4');
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15784");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig16.setPoolName("HikariPool-168");
        java.lang.String str19 = hikariConfig16.getPoolName();
        java.util.Properties properties20 = hikariConfig16.getDataSourceProperties();
        java.lang.String str21 = hikariConfig16.getConnectionCustomizerClassName();
        hikariConfig16.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-168" + "'", str19, "HikariPool-168");
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15785");
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
        hikariConfig1.connectionTimeout = (short) 0;
        hikariConfig1.setLeakDetectionThreshold(3L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 1800000L;
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setTransactionIsolation("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15787");
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
        int int34 = hikariConfig31.acquireRetries;
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        java.lang.String str36 = hikariConfig31.connectionInitSql;
        boolean boolean37 = hikariConfig31.isAutoCommit();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test15788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15788");
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
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str17 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolationName = "HikariPool-208";
        long long20 = hikariConfig1.maxLifetime;
        hikariConfig1.leakDetectionThreshold = 10;
        hikariConfig1.minPoolSize = ' ';
        int int25 = hikariConfig1.minPoolSize;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test15789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15789");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.connectionTimeout = 100L;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test15790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15790");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionInitSql("HikariPool-1035");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test15791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15791");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.setConnectionInitSql("HikariPool-10516");
        hikariConfig1.maxLifetime = 0;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test15792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15792");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        int int9 = hikariConfig1.transactionIsolation;
        hikariConfig1.connectionTimeout = 0L;
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-43924" + "'", str6, "HikariPool-43924");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15793");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-59";
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.transactionIsolation = (byte) 10;
        int int17 = hikariConfig1.getTransactionIsolation();
        int int18 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTestQuery("HikariPool-719");
        int int21 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test15794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15794");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        hikariConfig1.leakDetectionThreshold = ' ';
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        long long9 = hikariConfig1.connectionTimeout;
        long long10 = hikariConfig1.getMaxLifetime();
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15795");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.acquireRetries = (short) 0;
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15796");
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
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        java.lang.String str23 = hikariConfig19.transactionIsolationName;
        int int24 = hikariConfig19.transactionIsolation;
        java.lang.String str25 = hikariConfig19.getConnectionInitSql();
        int int26 = hikariConfig19.getMaximumPoolSize();
        hikariConfig19.setJdbc4ConnectionTest(false);
        hikariConfig19.connectionTestQuery = "";
        java.lang.String str31 = hikariConfig19.dataSourceClassName;
        java.util.Properties properties32 = hikariConfig19.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties32);
        java.lang.String str34 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test15797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15797");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test15798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15798");
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
        int int14 = hikariConfig1.acquireRetries;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        java.lang.String str21 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int24 = hikariConfig16.maxPoolSize;
        hikariConfig16.idleTimeout = (byte) -1;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.dataSourceClassName = "";
        hikariConfig28.setTransactionIsolation("");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        hikariConfig37.isInitializationFailFast = true;
        int int43 = hikariConfig37.acquireRetries;
        hikariConfig37.setMaxLifetime((long) (-1));
        int int46 = hikariConfig37.getTransactionIsolation();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        int int49 = hikariConfig48.getTransactionIsolation();
        hikariConfig48.setRegisterMbeans(false);
        java.lang.String str52 = hikariConfig48.transactionIsolationName;
        int int53 = hikariConfig48.getMaximumPoolSize();
        int int54 = hikariConfig48.transactionIsolation;
        java.util.Properties properties55 = hikariConfig48.dataSourceProperties;
        hikariConfig37.setDataSourceProperties(properties55);
        hikariConfig28.dataSourceProperties = properties55;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig16.dataSourceProperties = properties55;
        hikariConfig1.setDataSourceProperties(properties55);
        boolean boolean61 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-410";
        hikariConfig1.dataSourceClassName = "HikariPool-26";
        hikariConfig1.setMaxLifetime((long) (short) 1);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-21");
        int int70 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties71 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 60 + "'", int70 == 60);
        org.junit.Assert.assertNotNull(properties71);
    }

    @Test
    public void test15799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15799");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.setUseInstrumentation(true);
        hikariConfig18.connectionTestQuery = "HikariPool-104";
        hikariConfig18.maxPoolSize = (short) 100;
        java.lang.String str28 = hikariConfig18.getPoolName();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        long long35 = hikariConfig30.getIdleTimeout();
        java.lang.String str36 = hikariConfig30.getCatalog();
        java.util.Properties properties37 = hikariConfig30.getDataSourceProperties();
        hikariConfig18.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        int int43 = hikariConfig42.getTransactionIsolation();
        hikariConfig42.setRegisterMbeans(false);
        hikariConfig42.setUseInstrumentation(true);
        hikariConfig42.setConnectionInitSql("");
        hikariConfig42.setRegisterMbeans(true);
        hikariConfig42.transactionIsolation = 1;
        hikariConfig1.addDataSourceProperty("HikariPool-366", (java.lang.Object) 1);
        hikariConfig1.setRegisterMbeans(true);
        int int57 = hikariConfig1.acquireRetries;
        hikariConfig1.maxPoolSize = 60;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-43947" + "'", str28, "HikariPool-43947");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60L + "'", long35 == 60L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
    }

    @Test
    public void test15800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        hikariConfig1.setCatalog("HikariPool-26");
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setLeakDetectionThreshold(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15801");
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
        hikariConfig11.setDataSourceClassName("HikariPool-105");
        hikariConfig11.transactionIsolationName = "HikariPool-657";
        hikariConfig11.setInitializationFailFast(true);
        hikariConfig11.setCatalog("HikariPool-1157");
        int int39 = hikariConfig11.getTransactionIsolation();
        java.util.Properties properties40 = hikariConfig11.dataSourceProperties;
        boolean boolean41 = hikariConfig11.isRegisterMbeans();
        java.lang.String str42 = hikariConfig11.getCatalog();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-1157" + "'", str42, "HikariPool-1157");
    }

    @Test
    public void test15802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15802");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test15803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15803");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getConnectionTimeout();
        long long5 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.idleTimeout;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        hikariConfig1.maxLifetime = (byte) 0;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.setAutoCommit(false);
        int int16 = hikariConfig1.getTransactionIsolation();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test15804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.minPoolSize = (short) 10;
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        long long13 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test15805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.isAutoCommit = true;
        long long15 = hikariConfig1.connectionTimeout;
        hikariConfig1.minPoolSize = (short) 1;
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setPoolName("HikariPool-1289");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15806");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.maxPoolSize = (byte) 0;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        java.lang.String str12 = hikariConfig1.catalog;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-24326";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15807");
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
        hikariConfig1.connectionInitSql = "HikariPool-6";
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = false;
        long long19 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
    }

    @Test
    public void test15808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15808");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.connectionInitSql = "HikariPool-21";
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test15809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15809");
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
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        java.lang.String str13 = hikariConfig1.getPoolName();
        long long14 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-43962" + "'", str13, "HikariPool-43962");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test15810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15810");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.maxPoolSize;
        boolean boolean2 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setDataSourceClassName("HikariPool-18189");
        hikariConfig0.connectionInitSql = "HikariPool-2325";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60 + "'", int1 == 60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15811");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.dataSourceClassName = "";
        hikariConfig10.setTransactionIsolation("");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        hikariConfig19.isInitializationFailFast = true;
        int int25 = hikariConfig19.acquireRetries;
        hikariConfig19.setMaxLifetime((long) (-1));
        int int28 = hikariConfig19.getTransactionIsolation();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        int int35 = hikariConfig30.getMaximumPoolSize();
        int int36 = hikariConfig30.transactionIsolation;
        java.util.Properties properties37 = hikariConfig30.dataSourceProperties;
        hikariConfig19.setDataSourceProperties(properties37);
        hikariConfig10.dataSourceProperties = properties37;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.dataSourceProperties = properties37;
        boolean boolean42 = hikariConfig1.isInitializationFailFast();
        boolean boolean43 = hikariConfig1.isInitializationFailFast;
        long long44 = hikariConfig1.leakDetectionThreshold;
        boolean boolean45 = hikariConfig1.isRegisterMbeans();
        boolean boolean46 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        hikariConfig1.setAcquireRetries(52);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test15812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15812");
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
        hikariConfig1.setPoolName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-461");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test15813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15813");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.getMaximumPoolSize();
        int int20 = hikariConfig14.transactionIsolation;
        java.util.Properties properties21 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig24.acquireRetries = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test15814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15814");
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
        java.util.Properties properties21 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        long long23 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource24 = hikariConfig1.dataSource;
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(dataSource22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test15815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.maxLifetime = (-1);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15816");
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
        long long28 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.transactionIsolation = (short) 100;
        hikariConfig13.setLeakDetectionThreshold((long) 1);
        java.lang.String str33 = hikariConfig13.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test15817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.dataSourceClassName = "HikariPool-113";
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-104" + "'", str9, "HikariPool-104");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15818");
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
        hikariConfig1.transactionIsolation = 32;
        int int16 = hikariConfig1.getAcquireIncrement();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.isAutoCommit = true;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-770";
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test15820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15820");
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
        long long17 = hikariConfig1.getMaxLifetime();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-87");
        hikariConfig1.acquireRetries = (short) 1;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setRegisterMbeans(false);
        java.lang.String str33 = hikariConfig29.transactionIsolationName;
        java.lang.String str34 = hikariConfig29.connectionCustomizerClassName;
        hikariConfig29.setConnectionTestQuery("hi!");
        java.lang.String str37 = hikariConfig29.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig29.connectionCustomizer;
        hikariConfig25.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig29);
        java.lang.String str40 = hikariConfig25.getConnectionTestQuery();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig25.dataSource = dataSource41;
        hikariConfig1.addDataSourceProperty("HikariPool-1839", (java.lang.Object) hikariConfig25);
        java.lang.String str44 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.minPoolSize = 32;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(iConnectionCustomizer38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test15821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15821");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setMaximumPoolSize(3);
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isAutoCommit;
        hikariConfig15.poolName = "hi!";
        hikariConfig15.setTransactionIsolation("hi!");
        long long21 = hikariConfig15.connectionTimeout;
        long long22 = hikariConfig15.idleTimeout;
        hikariConfig15.setConnectionTestQuery("HikariPool-204");
        hikariConfig15.catalog = "HikariPool-204";
        java.lang.String str27 = hikariConfig15.connectionInitSql;
        hikariConfig15.maxPoolSize = '4';
        hikariConfig1.addDataSourceProperty("HikariPool-761", (java.lang.Object) hikariConfig15);
        hikariConfig1.acquireRetries = (byte) 100;
        hikariConfig1.connectionTestQuery = "HikariPool-27801";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15822");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        int int10 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test15823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15823");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.poolName = "HikariPool-501";
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setCatalog("HikariPool-551");
        hikariConfig1.catalog = "HikariPool-200";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-11034";
        hikariConfig1.setTransactionIsolation("HikariPool-1534");
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionInitSql = "HikariPool-30875";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-43993" + "'", str10, "HikariPool-43993");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-11034" + "'", str22, "HikariPool-11034");
    }

    @Test
    public void test15824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties5 = hikariConfig1.dataSourceProperties;
        hikariConfig1.minPoolSize = 35;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test15825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15825");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setCatalog("HikariPool-870");
        hikariConfig1.minPoolSize = 60;
        java.lang.String str13 = hikariConfig1.catalog;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-870" + "'", str13, "HikariPool-870");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test15827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15827");
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
        int int23 = hikariConfig1.minPoolSize;
        hikariConfig1.acquireRetries = 60;
        java.lang.String str26 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-43998" + "'", str11, "HikariPool-43998");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-43998" + "'", str26, "HikariPool-43998");
    }

    @Test
    public void test15828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15828");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.isRegisterMbeans = true;
        long long14 = hikariConfig1.getMaxLifetime();
        long long15 = hikariConfig1.maxLifetime;
        boolean boolean16 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-44000" + "'", str11, "HikariPool-44000");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15829");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        long long4 = hikariConfig1.leakDetectionThreshold;
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        long long6 = hikariConfig1.getConnectionTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig9.transactionIsolationName;
        long long14 = hikariConfig9.getIdleTimeout();
        java.lang.String str15 = hikariConfig9.getConnectionTestQuery();
        javax.sql.DataSource dataSource16 = hikariConfig9.dataSource;
        hikariConfig9.leakDetectionThreshold = 0;
        hikariConfig9.setJdbc4ConnectionTest(false);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isAutoCommit;
        hikariConfig22.poolName = "hi!";
        hikariConfig22.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig22.dataSource = dataSource28;
        int int30 = hikariConfig22.minPoolSize;
        int int31 = hikariConfig22.minPoolSize;
        java.lang.String str32 = hikariConfig22.dataSourceClassName;
        java.util.Properties properties33 = hikariConfig22.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties33);
        hikariConfig1.dataSourceProperties = properties33;
        java.lang.String str36 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test15830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15830");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.poolName = "HikariPool-381";
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-44004" + "'", str8, "HikariPool-44004");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test15831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15831");
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
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test15832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15832");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        long long25 = hikariConfig20.getIdleTimeout();
        java.lang.String str26 = hikariConfig20.getCatalog();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setIdleTimeout((long) (short) 10);
        hikariConfig20.maxLifetime = (-1);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.transactionIsolation;
        java.lang.String str39 = hikariConfig33.getConnectionInitSql();
        int int40 = hikariConfig33.getMaximumPoolSize();
        hikariConfig33.setJdbc4ConnectionTest(false);
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.util.Properties properties52 = hikariConfig45.getDataSourceProperties();
        hikariConfig45.setUseInstrumentation(false);
        hikariConfig33.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig45);
        hikariConfig33.poolName = "HikariPool-104";
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.leakDetectionThreshold = 100;
        boolean boolean62 = hikariConfig59.isJdbc4ConnectionTest();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getTransactionIsolation();
        hikariConfig64.setRegisterMbeans(false);
        java.lang.String str68 = hikariConfig64.transactionIsolationName;
        long long69 = hikariConfig64.getIdleTimeout();
        java.lang.String str70 = hikariConfig64.getCatalog();
        java.lang.String str71 = hikariConfig64.getConnectionTestQuery();
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig73.dataSourceClassName = "";
        java.util.Properties properties76 = hikariConfig73.dataSourceProperties;
        hikariConfig64.setDataSourceProperties(properties76);
        hikariConfig59.dataSourceProperties = properties76;
        java.util.Properties properties79 = hikariConfig59.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties79;
        hikariConfig20.dataSourceProperties = properties79;
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        hikariConfig1.setMaxLifetime((long) 10);
        hikariConfig1.isInitializationFailFast = true;
        long long88 = hikariConfig1.idleTimeout;
        java.lang.String str89 = hikariConfig1.connectionInitSql;
        java.lang.String str90 = hikariConfig1.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer91 = hikariConfig1.connectionCustomizer;
        int int92 = hikariConfig1.acquireRetries;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 60L + "'", long69 == 60L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties79);
// flaky:         org.junit.Assert.assertTrue("'" + long88 + "' != '" + 60L + "'", long88 == 60L);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "HikariPool-222" + "'", str90, "HikariPool-222");
        org.junit.Assert.assertNull(iConnectionCustomizer91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 100 + "'", int92 == 100);
    }

    @Test
    public void test15833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15833");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.getAcquireRetries();
        java.lang.String str7 = hikariConfig1.poolName;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = (short) 0;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-44019" + "'", str7, "HikariPool-44019");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15834");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getAcquireIncrement();
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        int int12 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test15836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15836");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        java.lang.String str9 = hikariConfig1.poolName;
        java.lang.String str10 = hikariConfig1.catalog;
        int int11 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44022" + "'", str9, "HikariPool-44022");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test15837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15837");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        int int15 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test15838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15838");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIdleTimeout(52L);
        boolean boolean12 = hikariConfig1.isAutoCommit;
        hikariConfig1.setTransactionIsolation("HikariPool-777");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        hikariConfig1.maxPoolSize = (short) 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionTestQuery("HikariPool-1435");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test15839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15839");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        long long25 = hikariConfig20.getIdleTimeout();
        java.lang.String str26 = hikariConfig20.getCatalog();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setIdleTimeout((long) (short) 10);
        hikariConfig20.maxLifetime = (-1);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.transactionIsolation;
        java.lang.String str39 = hikariConfig33.getConnectionInitSql();
        int int40 = hikariConfig33.getMaximumPoolSize();
        hikariConfig33.setJdbc4ConnectionTest(false);
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.util.Properties properties52 = hikariConfig45.getDataSourceProperties();
        hikariConfig45.setUseInstrumentation(false);
        hikariConfig33.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig45);
        hikariConfig33.poolName = "HikariPool-104";
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.leakDetectionThreshold = 100;
        boolean boolean62 = hikariConfig59.isJdbc4ConnectionTest();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getTransactionIsolation();
        hikariConfig64.setRegisterMbeans(false);
        java.lang.String str68 = hikariConfig64.transactionIsolationName;
        long long69 = hikariConfig64.getIdleTimeout();
        java.lang.String str70 = hikariConfig64.getCatalog();
        java.lang.String str71 = hikariConfig64.getConnectionTestQuery();
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig73.dataSourceClassName = "";
        java.util.Properties properties76 = hikariConfig73.dataSourceProperties;
        hikariConfig64.setDataSourceProperties(properties76);
        hikariConfig59.dataSourceProperties = properties76;
        java.util.Properties properties79 = hikariConfig59.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties79;
        hikariConfig20.dataSourceProperties = properties79;
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        java.util.Properties properties84 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource87 = hikariConfig1.dataSource;
        java.lang.String str88 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 60L + "'", long69 == 60L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNotNull(properties84);
        org.junit.Assert.assertNull(dataSource87);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test15840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        long long18 = hikariConfig1.getConnectionTimeout();
        java.lang.String str19 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15841");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) 'a');
        long long5 = hikariConfig0.maxLifetime;
        java.lang.String str6 = hikariConfig0.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setLeakDetectionThreshold(52L);
        long long12 = hikariConfig1.idleTimeout;
        hikariConfig1.catalog = "HikariPool-14402";
        hikariConfig1.setConnectionInitSql("HikariPool-7260");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
    }

    @Test
    public void test15843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15843");
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
        int int18 = hikariConfig1.getAcquireIncrement();
        boolean boolean19 = hikariConfig1.isRegisterMbeans;
        int int20 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test15844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15844");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.transactionIsolation = (short) -1;
        int int11 = hikariConfig1.getTransactionIsolation();
        long long12 = hikariConfig1.maxLifetime;
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15845");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        int int15 = hikariConfig1.acquireRetries;
        int int16 = hikariConfig1.getMinimumPoolSize();
        int int17 = hikariConfig1.getAcquireRetries();
        hikariConfig1.dataSourceClassName = "HikariPool-35911";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test15846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15846");
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
        hikariConfig1.catalog = "HikariPool-302";
        long long43 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer44 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) 10);
        long long47 = hikariConfig1.maxLifetime;
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-44049" + "'", str10, "HikariPool-44049");
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
    }

    @Test
    public void test15847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15847");
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
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaximumPoolSize(100);
        javax.sql.DataSource dataSource20 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test15848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15848");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        long long25 = hikariConfig20.getIdleTimeout();
        java.lang.String str26 = hikariConfig20.getCatalog();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setIdleTimeout((long) (short) 10);
        hikariConfig20.maxLifetime = (-1);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.transactionIsolation;
        java.lang.String str39 = hikariConfig33.getConnectionInitSql();
        int int40 = hikariConfig33.getMaximumPoolSize();
        hikariConfig33.setJdbc4ConnectionTest(false);
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.util.Properties properties52 = hikariConfig45.getDataSourceProperties();
        hikariConfig45.setUseInstrumentation(false);
        hikariConfig33.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig45);
        hikariConfig33.poolName = "HikariPool-104";
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.leakDetectionThreshold = 100;
        boolean boolean62 = hikariConfig59.isJdbc4ConnectionTest();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getTransactionIsolation();
        hikariConfig64.setRegisterMbeans(false);
        java.lang.String str68 = hikariConfig64.transactionIsolationName;
        long long69 = hikariConfig64.getIdleTimeout();
        java.lang.String str70 = hikariConfig64.getCatalog();
        java.lang.String str71 = hikariConfig64.getConnectionTestQuery();
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig73.dataSourceClassName = "";
        java.util.Properties properties76 = hikariConfig73.dataSourceProperties;
        hikariConfig64.setDataSourceProperties(properties76);
        hikariConfig59.dataSourceProperties = properties76;
        java.util.Properties properties79 = hikariConfig59.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties79;
        hikariConfig20.dataSourceProperties = properties79;
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        hikariConfig1.setMaxLifetime((long) 10);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str88 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = 0;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 60L + "'", long69 == 60L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test15849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15849");
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
        java.lang.String str21 = hikariConfig1.poolName;
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str24 = hikariConfig1.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-44061" + "'", str21, "HikariPool-44061");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test15850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15850");
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
        int int14 = hikariConfig1.minPoolSize;
        hikariConfig1.setTransactionIsolation("HikariPool-81");
        long long17 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15851");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setInitializationFailFast(true);
        int int9 = hikariConfig0.transactionIsolation;
        hikariConfig0.setPoolName("HikariPool-9613");
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.idleTimeout = (-1);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        long long15 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-44067" + "'", str11, "HikariPool-44067");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test15854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15854");
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
        boolean boolean21 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.dataSource = dataSource22;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test15855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15855");
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
        hikariConfig1.setAcquireRetries(100);
        int int19 = hikariConfig1.getMaximumPoolSize();
        long long20 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAcquireRetries((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test15856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15856");
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
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        int int16 = hikariConfig1.getAcquireIncrement();
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15857");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        hikariConfig1.transactionIsolation = 60;
        hikariConfig1.setMinimumPoolSize(60);
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.acquireRetries = 10;
        hikariConfig1.setCatalog("HikariPool-28980");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test15858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15858");
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
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.maxPoolSize = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15859");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        int int8 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test15860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15860");
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
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.connectionInitSql = "HikariPool-633";
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        java.lang.String str24 = hikariConfig18.getConnectionInitSql();
        java.lang.String str25 = hikariConfig18.transactionIsolationName;
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int28 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.setRegisterMbeans(false);
        java.lang.String str31 = hikariConfig27.connectionTestQuery;
        long long32 = hikariConfig27.getIdleTimeout();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        java.lang.String str39 = hikariConfig34.connectionCustomizerClassName;
        hikariConfig34.setConnectionTestQuery("hi!");
        java.lang.String str42 = hikariConfig34.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = hikariConfig34.connectionCustomizer;
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig45.setConnectionInitSql("hi!");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        int int50 = hikariConfig49.getTransactionIsolation();
        hikariConfig49.setRegisterMbeans(false);
        hikariConfig49.dataSourceClassName = "";
        hikariConfig49.setTransactionIsolation("");
        java.util.Properties properties57 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        int int59 = hikariConfig58.getTransactionIsolation();
        hikariConfig58.setRegisterMbeans(false);
        hikariConfig58.isInitializationFailFast = true;
        int int64 = hikariConfig58.acquireRetries;
        hikariConfig58.setMaxLifetime((long) (-1));
        int int67 = hikariConfig58.getTransactionIsolation();
        java.util.Properties properties68 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties68);
        int int70 = hikariConfig69.getTransactionIsolation();
        hikariConfig69.setRegisterMbeans(false);
        java.lang.String str73 = hikariConfig69.transactionIsolationName;
        int int74 = hikariConfig69.getMaximumPoolSize();
        int int75 = hikariConfig69.transactionIsolation;
        java.util.Properties properties76 = hikariConfig69.dataSourceProperties;
        hikariConfig58.setDataSourceProperties(properties76);
        hikariConfig49.dataSourceProperties = properties76;
        hikariConfig45.dataSourceProperties = properties76;
        hikariConfig34.setDataSourceProperties(properties76);
        hikariConfig27.dataSourceProperties = properties76;
        hikariConfig18.setDataSourceProperties(properties76);
        hikariConfig1.dataSourceProperties = properties76;
        hikariConfig1.setPoolName("HikariPool-22");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer86 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer86;
        java.lang.String str88 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        javax.sql.DataSource dataSource91 = null;
        hikariConfig1.setDataSource(dataSource91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60L + "'", long32 == 60L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(iConnectionCustomizer43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 60 + "'", int74 == 60);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "HikariPool-633" + "'", str88, "HikariPool-633");
    }

    @Test
    public void test15861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15861");
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
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-373";
        hikariConfig1.acquireRetries = (byte) 100;
        boolean boolean20 = hikariConfig1.isAutoCommit();
        int int21 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test15862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15862");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-490");
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test15863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        long long12 = hikariConfig1.connectionTimeout;
        hikariConfig1.dataSourceClassName = "HikariPool-8843";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test15864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15864");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.isInitializationFailFast = true;
        java.lang.String str16 = hikariConfig10.getConnectionCustomizerClassName();
        hikariConfig10.transactionIsolationName = "";
        long long19 = hikariConfig10.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig10.getPoolName();
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties21;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str25 = hikariConfig24.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-44090" + "'", str20, "HikariPool-44090");
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test15865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15865");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-59";
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.dataSourceClassName = "HikariPool-707";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        int int18 = hikariConfig1.getMaximumPoolSize();
        long long19 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setConnectionInitSql("hi!");
        hikariConfig22.isAutoCommit = false;
        java.lang.String str27 = hikariConfig22.connectionInitSql;
        hikariConfig22.catalog = "HikariPool-1547";
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        hikariConfig32.setUseInstrumentation(true);
        hikariConfig32.connectionTestQuery = "HikariPool-104";
        hikariConfig32.maxPoolSize = (short) 100;
        java.lang.String str42 = hikariConfig32.transactionIsolationName;
        hikariConfig32.setUseInstrumentation(false);
        hikariConfig22.addDataSourceProperty("HikariPool-2359", (java.lang.Object) hikariConfig32);
        hikariConfig1.addDataSourceProperty("HikariPool-118", (java.lang.Object) hikariConfig22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test15866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15866");
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
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.catalog = "HikariPool-9955";
        java.lang.String str35 = hikariConfig1.getConnectionInitSql();
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
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test15867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15867");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        long long16 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test15868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15868");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.poolName = "HikariPool-501";
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setCatalog("HikariPool-551");
        hikariConfig1.catalog = "HikariPool-200";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-11034";
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-44100" + "'", str10, "HikariPool-44100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test15869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15869");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.poolName = "HikariPool-9682";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test15870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15870");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15871");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.transactionIsolationName = "HikariPool-27";
        long long9 = hikariConfig1.maxLifetime;
        int int10 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test15872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15872");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        int int13 = hikariConfig1.getMinimumPoolSize();
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-22322";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test15873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15873");
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
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        long long20 = hikariConfig1.connectionTimeout;
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        boolean boolean22 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15874");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.dataSourceClassName = "";
        long long15 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-531", (java.lang.Object) long15);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean19 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test15875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15875");
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
        hikariConfig11.setAcquireRetries(1);
        javax.sql.DataSource dataSource29 = hikariConfig11.getDataSource();
        java.lang.String str30 = hikariConfig11.connectionTestQuery;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer31;
        hikariConfig11.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig11.setConnectionTestQuery("HikariPool-12389");
        int int37 = hikariConfig11.transactionIsolation;
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
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test15876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15876");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionTimeout = (byte) 0;
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "HikariPool-1161";
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setDataSourceClassName("HikariPool-39127");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test15877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15877");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.maxPoolSize = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.maxLifetime;
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolation = (short) 1;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test15879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15879");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionInitSql = "HikariPool-523";
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        hikariConfig1.setLeakDetectionThreshold(10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.minPoolSize = (byte) 0;
        hikariConfig1.setAcquireRetries(60);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15881");
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
        javax.sql.DataSource dataSource26 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test15882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15882");
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
        boolean boolean13 = hikariConfig1.isAutoCommit;
        int int14 = hikariConfig1.acquireRetries;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        long long16 = hikariConfig1.connectionTimeout;
        long long17 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test15883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15883");
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
        hikariConfig1.setCatalog("HikariPool-5656");
        java.lang.String str32 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-44120" + "'", str28, "HikariPool-44120");
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-5656" + "'", str32, "HikariPool-5656");
    }

    @Test
    public void test15884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-36");
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-430");
        hikariConfig1.idleTimeout = 60L;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15885");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        hikariConfig1.transactionIsolationName = "HikariPool-173";
        hikariConfig1.setIdleTimeout((long) '#');
        hikariConfig1.connectionTestQuery = "HikariPool-28090";
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test15886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15886");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setConnectionTestQuery("HikariPool-1040");
        int int13 = hikariConfig1.acquireRetries;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        hikariConfig1.setMaxLifetime((long) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test15887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15887");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.idleTimeout = (-1);
        java.lang.String str13 = hikariConfig1.catalog;
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.poolName;
        int int8 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource9 = hikariConfig0.dataSource;
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.dataSource = dataSource13;
        hikariConfig0.poolName = "HikariPool-10736";
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-44126" + "'", str7, "HikariPool-44126");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.idleTimeout = 100L;
        hikariConfig1.connectionTestQuery = "HikariPool-133";
        long long12 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test15890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15890");
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
        long long49 = hikariConfig1.connectionTimeout;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setPoolName("HikariPool-431");
        boolean boolean54 = hikariConfig1.isAutoCommit;
        int int55 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-10793";
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
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
    }

    @Test
    public void test15891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15891");
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
        java.lang.String str26 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean27 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource28 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
    }

    @Test
    public void test15892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15892");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-696");
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test15893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15893");
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
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test15894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15894");
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
        java.lang.String str49 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean50 = hikariConfig1.isInitializationFailFast();
        long long51 = hikariConfig1.maxLifetime;
        hikariConfig1.transactionIsolationName = "HikariPool-260";
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setTransactionIsolation("HikariPool-1136");
        hikariConfig1.maxPoolSize = (byte) 1;
        javax.sql.DataSource dataSource60 = null;
        hikariConfig1.setDataSource(dataSource60);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35L + "'", long51 == 35L);
    }

    @Test
    public void test15895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15895");
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
        hikariConfig31.catalog = "";
        java.lang.String str36 = hikariConfig31.poolName;
        javax.sql.DataSource dataSource37 = null;
        hikariConfig31.dataSource = dataSource37;
        long long39 = hikariConfig31.getMaxLifetime();
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
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-44148" + "'", str36, "HikariPool-44148");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3L + "'", long39 == 3L);
    }

    @Test
    public void test15896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15896");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.transactionIsolationName = "HikariPool-629";
        hikariConfig1.setCatalog("HikariPool-391");
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig1.getCatalog();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-391" + "'", str10, "HikariPool-391");
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test15897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15897");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.maxPoolSize;
        int int2 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionInitSql = "HikariPool-893";
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.dataSource = dataSource5;
        hikariConfig0.maxLifetime = (short) -1;
        int int9 = hikariConfig0.minPoolSize;
        hikariConfig0.maxPoolSize = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60 + "'", int1 == 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test15898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15898");
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
        hikariConfig31.dataSourceClassName = "HikariPool-308";
        boolean boolean37 = hikariConfig31.isAutoCommit();
        hikariConfig31.catalog = "HikariPool-1469";
        hikariConfig31.setMaximumPoolSize(3);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test15899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15899");
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
        hikariConfig1.setConnectionInitSql("HikariPool-500");
        hikariConfig1.dataSourceClassName = "HikariPool-5476";
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15900");
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
        boolean boolean49 = hikariConfig1.isInitializationFailFast;
        long long50 = hikariConfig1.maxLifetime;
        hikariConfig1.setJdbc4ConnectionTest(true);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 35L + "'", long50 == 35L);
    }

    @Test
    public void test15901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15901");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        hikariConfig0.transactionIsolation = (short) 100;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        hikariConfig10.connectionTimeout = 10L;
        hikariConfig10.connectionTestQuery = "HikariPool-104";
        int int17 = hikariConfig10.transactionIsolation;
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig10.poolName;
        hikariConfig0.addDataSourceProperty("HikariPool-81", (java.lang.Object) hikariConfig10);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig23.transactionIsolationName;
        int int28 = hikariConfig23.transactionIsolation;
        java.lang.String str29 = hikariConfig23.getConnectionInitSql();
        hikariConfig23.isAutoCommit = true;
        java.util.Properties properties32 = hikariConfig23.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig10.setDataSourceProperties(properties32);
        hikariConfig10.isAutoCommit = true;
        java.lang.String str37 = hikariConfig10.connectionCustomizerClassName;
        hikariConfig10.setMaxLifetime(10L);
        java.lang.String str40 = hikariConfig10.transactionIsolationName;
        hikariConfig10.setCatalog("HikariPool-1275");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-44163" + "'", str1, "HikariPool-44163");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-44164" + "'", str20, "HikariPool-44164");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test15902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15902");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer9;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15903");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionInitSql("HikariPool-780");
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.leakDetectionThreshold = 100;
        boolean boolean15 = hikariConfig12.isJdbc4connectionTest;
        long long16 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setUseInstrumentation(false);
        hikariConfig12.setJdbc4ConnectionTest(false);
        java.util.Properties properties21 = hikariConfig12.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.connectionInitSql = "HikariPool-714";
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.catalog = "HikariPool-2127";
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-44168" + "'", str10, "HikariPool-44168");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test15904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15904");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-6";
        hikariConfig1.connectionInitSql = "HikariPool-187";
        hikariConfig1.maxPoolSize = (short) 10;
        hikariConfig1.setConnectionTestQuery("HikariPool-1156");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test15905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15905");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig16.setPoolName("HikariPool-168");
        hikariConfig16.connectionTimeout = '#';
        hikariConfig16.setTransactionIsolation("HikariPool-898");
        hikariConfig16.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test15906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15906");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setCatalog("HikariPool-12372");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15907");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        long long25 = hikariConfig20.getIdleTimeout();
        java.lang.String str26 = hikariConfig20.getCatalog();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setIdleTimeout((long) (short) 10);
        hikariConfig20.maxLifetime = (-1);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.transactionIsolation;
        java.lang.String str39 = hikariConfig33.getConnectionInitSql();
        int int40 = hikariConfig33.getMaximumPoolSize();
        hikariConfig33.setJdbc4ConnectionTest(false);
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.util.Properties properties52 = hikariConfig45.getDataSourceProperties();
        hikariConfig45.setUseInstrumentation(false);
        hikariConfig33.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig45);
        hikariConfig33.poolName = "HikariPool-104";
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.leakDetectionThreshold = 100;
        boolean boolean62 = hikariConfig59.isJdbc4ConnectionTest();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getTransactionIsolation();
        hikariConfig64.setRegisterMbeans(false);
        java.lang.String str68 = hikariConfig64.transactionIsolationName;
        long long69 = hikariConfig64.getIdleTimeout();
        java.lang.String str70 = hikariConfig64.getCatalog();
        java.lang.String str71 = hikariConfig64.getConnectionTestQuery();
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig73.dataSourceClassName = "";
        java.util.Properties properties76 = hikariConfig73.dataSourceProperties;
        hikariConfig64.setDataSourceProperties(properties76);
        hikariConfig59.dataSourceProperties = properties76;
        java.util.Properties properties79 = hikariConfig59.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties79;
        hikariConfig20.dataSourceProperties = properties79;
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        java.util.Properties properties84 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource87 = hikariConfig1.dataSource;
        int int88 = hikariConfig1.minPoolSize;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-29815";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 60L + "'", long69 == 60L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNotNull(properties84);
        org.junit.Assert.assertNull(dataSource87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
    }

    @Test
    public void test15908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15908");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        int int8 = hikariConfig1.transactionIsolation;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.leakDetectionThreshold = 100;
        hikariConfig14.connectionInitSql = "hi!";
        hikariConfig14.maxPoolSize = (short) -1;
        long long21 = hikariConfig14.maxLifetime;
        long long22 = hikariConfig14.maxLifetime;
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties23;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test15909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15909");
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
        hikariConfig1.setPoolName("HikariPool-55");
        int int16 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test15910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15910");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "";
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test15911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15911");
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
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        java.lang.String str17 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15912");
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
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1427";
        hikariConfig1.isInitializationFailFast = false;
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test15913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15913");
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
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15914");
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
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.leakDetectionThreshold = 100;
        boolean boolean28 = hikariConfig25.isJdbc4ConnectionTest();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        long long35 = hikariConfig30.getIdleTimeout();
        java.lang.String str36 = hikariConfig30.getCatalog();
        java.lang.String str37 = hikariConfig30.getConnectionTestQuery();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.dataSourceClassName = "";
        java.util.Properties properties42 = hikariConfig39.dataSourceProperties;
        hikariConfig30.setDataSourceProperties(properties42);
        hikariConfig25.dataSourceProperties = properties42;
        java.util.Properties properties45 = hikariConfig25.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties45);
        java.lang.String str47 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60L + "'", long35 == 60L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test15915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15915");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) '4');
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        hikariConfig1.setAcquireRetries(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test15916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15916");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        int int12 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-852";
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15917");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.maxPoolSize;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.getMinimumPoolSize();
        int int13 = hikariConfig1.minPoolSize;
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.acquireRetries = (short) 10;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test15918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15918");
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
        int int43 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        int int50 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.isRegisterMbeans = false;
        boolean boolean53 = hikariConfig45.isRegisterMbeans();
        java.lang.String str54 = hikariConfig45.getCatalog();
        hikariConfig45.transactionIsolation = 100;
        java.util.Properties properties57 = hikariConfig45.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties57);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties57);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties57);
        hikariConfig1.dataSourceProperties = properties57;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties57);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(properties57);
    }

    @Test
    public void test15919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15919");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(false);
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15920");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setCatalog("HikariPool-385");
        hikariConfig1.transactionIsolationName = "HikariPool-22";
        hikariConfig1.setLeakDetectionThreshold(10L);
        long long15 = hikariConfig1.maxLifetime;
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test15921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15921");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.maxPoolSize;
        int int2 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionInitSql = "HikariPool-893";
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.dataSource = dataSource5;
        hikariConfig0.maxLifetime = (short) -1;
        hikariConfig0.setCatalog("HikariPool-2097");
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.dataSource = dataSource11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60 + "'", int1 == 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15922");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 10;
        hikariConfig1.acquireRetries = (short) -1;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-59");
        hikariConfig1.setDataSourceClassName("HikariPool-834");
        int int20 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.acquireRetries = 60;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test15923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15923");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15924");
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
        int int29 = hikariConfig16.getAcquireRetries();
        hikariConfig16.isAutoCommit = true;
        hikariConfig16.setDataSourceClassName("HikariPool-174");
        hikariConfig16.setConnectionInitSql("HikariPool-552");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test15925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15925");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        hikariConfig1.maxLifetime = (short) 100;
        hikariConfig1.setMaxLifetime(35L);
        int int20 = hikariConfig1.minPoolSize;
        long long21 = hikariConfig1.getIdleTimeout();
        boolean boolean22 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test15926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15926");
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
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getConnectionInitSql();
        hikariConfig18.setAcquireRetries(1);
        hikariConfig18.setTransactionIsolation("HikariPool-63");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15927");
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
        java.lang.String str20 = hikariConfig1.catalog;
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15928");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-403");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.minPoolSize = (byte) 0;
        hikariConfig1.maxLifetime = (short) 1;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test15929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15929");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer21;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15930");
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
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties62);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties62);
        hikariConfig66.setInitializationFailFast(true);
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
    }

    @Test
    public void test15931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15931");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        hikariConfig1.setCatalog("HikariPool-26");
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        java.lang.String str14 = hikariConfig1.catalog;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-26" + "'", str14, "HikariPool-26");
    }

    @Test
    public void test15932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15932");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.connectionTimeout = 35L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15933");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries(3);
        hikariConfig1.maxLifetime = 0L;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        java.lang.String str21 = hikariConfig16.getDataSourceClassName();
        java.util.Properties properties22 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties22;
        hikariConfig1.transactionIsolation = ' ';
        java.util.Properties properties26 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test15934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15934");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        boolean boolean10 = hikariConfig1.isAutoCommit();
        int int11 = hikariConfig1.getTransactionIsolation();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMinimumPoolSize(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15935");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        int int12 = hikariConfig1.maxPoolSize;
        hikariConfig1.setLeakDetectionThreshold(3L);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        hikariConfig1.setPoolName("HikariPool-20100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "HikariPool-232";
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout(5000L);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.isInitializationFailFast = true;
        int int20 = hikariConfig14.acquireRetries;
        boolean boolean21 = hikariConfig14.isJdbc4connectionTest;
        boolean boolean22 = hikariConfig14.isJdbc4connectionTest;
        hikariConfig14.minPoolSize = (short) 0;
        int int25 = hikariConfig14.getMaximumPoolSize();
        java.lang.String str26 = hikariConfig14.dataSourceClassName;
        int int27 = hikariConfig14.getAcquireIncrement();
        int int28 = hikariConfig14.getMinimumPoolSize();
        java.util.Properties properties29 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties29);
        hikariConfig1.validate();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test15937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15937");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setUseInstrumentation(true);
        long long18 = hikariConfig1.idleTimeout;
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15938");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-10588");
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test15939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15939");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15940");
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
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setAcquireRetries((int) 'a');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test15941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15941");
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
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-440");
        java.lang.String str17 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test15942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15942");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig5.transactionIsolationName;
        int int10 = hikariConfig5.transactionIsolation;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig5.dataSource = dataSource11;
        long long13 = hikariConfig5.maxLifetime;
        hikariConfig5.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties16 = hikariConfig5.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.lang.String str19 = hikariConfig18.dataSourceClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15943");
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
        int int16 = hikariConfig1.acquireRetries;
        java.lang.String str17 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime(0L);
        long long20 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-44267" + "'", str17, "HikariPool-44267");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test15944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15944");
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
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.transactionIsolation = (short) 100;
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
    public void test15945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15945");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-670");
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test15946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15946");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.dataSourceClassName = "HikariPool-247";
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setDataSourceClassName("HikariPool-453");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-44274" + "'", str7, "HikariPool-44274");
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test15947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.leakDetectionThreshold = (short) -1;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-3392");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.connectionTestQuery = "HikariPool-430";
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
    }

    @Test
    public void test15949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) 'a');
        int int13 = hikariConfig1.acquireRetries;
        long long14 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test15950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15950");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        int int16 = hikariConfig1.acquireRetries;
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15951");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("");
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15952");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setConnectionTestQuery("HikariPool-24830");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        long long8 = hikariConfig1.getMaxLifetime();
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15954");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-481");
        hikariConfig1.isInitializationFailFast = false;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        java.lang.String str21 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setJdbc4ConnectionTest(false);
        hikariConfig16.maxLifetime = '#';
        int int26 = hikariConfig16.getAcquireRetries();
        java.util.Properties properties27 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig29.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test15955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setAutoCommit(false);
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15956");
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
        long long17 = hikariConfig1.leakDetectionThreshold;
        boolean boolean18 = hikariConfig1.isAutoCommit();
        java.lang.String str19 = hikariConfig1.catalog;
        hikariConfig1.setLeakDetectionThreshold(87L);
        hikariConfig1.setLeakDetectionThreshold((-1L));
        java.lang.Class<?> wildcardClass24 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test15957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15957");
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
        long long16 = hikariConfig1.idleTimeout;
        hikariConfig1.leakDetectionThreshold = 35;
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        int int20 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test15958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15958");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMaxLifetime(35L);
        int int12 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-2323");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test15959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        hikariConfig1.idleTimeout = 1800000L;
        java.lang.String str10 = hikariConfig1.getPoolName();
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMaxLifetime((long) (short) 100);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.leakDetectionThreshold = 100;
        hikariConfig15.minPoolSize = (byte) 1;
        long long20 = hikariConfig15.getConnectionTimeout();
        long long21 = hikariConfig15.getConnectionTimeout();
        long long22 = hikariConfig15.connectionTimeout;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig24.transactionIsolationName;
        int int29 = hikariConfig24.transactionIsolation;
        java.lang.String str30 = hikariConfig24.getConnectionInitSql();
        int int31 = hikariConfig24.transactionIsolation;
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setConnectionInitSql("hi!");
        long long37 = hikariConfig34.getLeakDetectionThreshold();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        int int44 = hikariConfig39.getMaximumPoolSize();
        int int45 = hikariConfig39.transactionIsolation;
        java.util.Properties properties46 = hikariConfig39.dataSourceProperties;
        hikariConfig34.dataSourceProperties = properties46;
        java.util.Properties properties48 = hikariConfig34.getDataSourceProperties();
        hikariConfig24.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig34);
        hikariConfig34.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer52 = hikariConfig34.connectionCustomizer;
        long long53 = hikariConfig34.getMaxLifetime();
        int int54 = hikariConfig34.getMaximumPoolSize();
        java.lang.String str55 = hikariConfig34.getPoolName();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        int int58 = hikariConfig57.getTransactionIsolation();
        hikariConfig57.setRegisterMbeans(false);
        hikariConfig57.setUseInstrumentation(true);
        hikariConfig57.setConnectionInitSql("");
        hikariConfig57.setConnectionCustomizerClassName("hi!");
        boolean boolean67 = hikariConfig57.isInitializationFailFast;
        hikariConfig57.maxPoolSize = ' ';
        int int70 = hikariConfig57.maxPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig71.setDataSourceClassName("");
        hikariConfig71.validate();
        long long75 = hikariConfig71.getLeakDetectionThreshold();
        hikariConfig71.setIdleTimeout((long) '4');
        java.lang.String str78 = hikariConfig71.connectionCustomizerClassName;
        java.util.Properties properties79 = hikariConfig71.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties79);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig57.setDataSourceProperties(properties79);
        hikariConfig34.dataSourceProperties = properties79;
        hikariConfig15.setDataSourceProperties(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-44290" + "'", str10, "HikariPool-44290");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNull(iConnectionCustomizer52);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 35L + "'", long53 == 35L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 60 + "'", int54 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-44293" + "'", str55, "HikariPool-44293");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 32 + "'", int70 == 32);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(properties79);
    }

    @Test
    public void test15960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15960");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setConnectionInitSql("HikariPool-40071");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test15961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15961");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setDataSourceClassName("");
        hikariConfig17.validate();
        long long21 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig17.setIdleTimeout((long) '4');
        java.lang.String str24 = hikariConfig17.connectionCustomizerClassName;
        java.util.Properties properties25 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.isAutoCommit = true;
        hikariConfig1.addDataSourceProperty("HikariPool-84", (java.lang.Object) hikariConfig26);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = null;
        hikariConfig26.connectionCustomizer = iConnectionCustomizer30;
        hikariConfig26.setPoolName("HikariPool-117");
        hikariConfig26.isInitializationFailFast = true;
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.transactionIsolation;
        java.lang.String str43 = hikariConfig37.getConnectionInitSql();
        int int44 = hikariConfig37.getMaximumPoolSize();
        hikariConfig37.setJdbc4ConnectionTest(false);
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        int int50 = hikariConfig49.getTransactionIsolation();
        hikariConfig49.setRegisterMbeans(false);
        java.lang.String str53 = hikariConfig49.transactionIsolationName;
        long long54 = hikariConfig49.getIdleTimeout();
        java.lang.String str55 = hikariConfig49.getCatalog();
        java.util.Properties properties56 = hikariConfig49.getDataSourceProperties();
        hikariConfig49.setUseInstrumentation(false);
        hikariConfig37.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig49);
        hikariConfig37.poolName = "HikariPool-104";
        int int62 = hikariConfig37.transactionIsolation;
        hikariConfig37.setConnectionTestQuery("HikariPool-517");
        javax.sql.DataSource dataSource65 = hikariConfig37.dataSource;
        java.util.Properties properties66 = hikariConfig37.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(str53);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 60L + "'", long54 == 60L);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertNotNull(properties66);
    }

    @Test
    public void test15962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15962");
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
        boolean boolean20 = hikariConfig7.isAutoCommit;
        hikariConfig7.setConnectionInitSql("HikariPool-28980");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test15963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15963");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.minPoolSize = (short) 0;
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        long long14 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test15964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15964");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig15.idleTimeout = 60;
        int int21 = hikariConfig15.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-218", (java.lang.Object) hikariConfig15);
        hikariConfig1.dataSourceClassName = "HikariPool-121";
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test15965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15965");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 1800000L;
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.catalog = "HikariPool-2673";
        java.lang.String str14 = hikariConfig1.getPoolName();
        int int15 = hikariConfig1.minPoolSize;
        long long16 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-44320" + "'", str14, "HikariPool-44320");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2147483647L + "'", long16 == 2147483647L);
    }

    @Test
    public void test15966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15966");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        long long8 = hikariConfig1.getConnectionTimeout();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionTestQuery = "HikariPool-394";
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test15967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15967");
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
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setConnectionTestQuery("HikariPool-13088");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test15968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15968");
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
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        long long24 = hikariConfig1.getConnectionTimeout();
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        int int26 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.connectionInitSql = "HikariPool-863";
        java.util.Properties properties29 = hikariConfig1.dataSourceProperties;
        java.lang.String str30 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test15969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15969");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.dataSourceClassName = "";
        hikariConfig12.isRegisterMbeans = true;
        hikariConfig12.minPoolSize = (short) 1;
        hikariConfig12.isJdbc4connectionTest = false;
        java.util.Properties properties24 = hikariConfig12.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties24);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer26;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test15970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15970");
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
        hikariConfig13.transactionIsolation = 97;
        java.lang.String str27 = hikariConfig13.getDataSourceClassName();
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15971");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long13 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setPoolName("HikariPool-67");
        int int18 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test15972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15972");
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
        java.lang.String str23 = hikariConfig12.transactionIsolationName;
        hikariConfig12.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15973");
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
        hikariConfig1.leakDetectionThreshold = 'a';
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig5.transactionIsolationName;
        int int10 = hikariConfig5.transactionIsolation;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig5.dataSource = dataSource11;
        long long13 = hikariConfig5.maxLifetime;
        hikariConfig5.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties16 = hikariConfig5.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties16);
        hikariConfig0.isInitializationFailFast = false;
        java.lang.String str20 = hikariConfig0.getPoolName();
        java.util.Properties properties21 = null;
        hikariConfig0.dataSourceProperties = properties21;
        long long23 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNotNull(properties16);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-44344" + "'", str20, "HikariPool-44344");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
    }

    @Test
    public void test15975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15975");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.isJdbc4connectionTest = false;
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaxLifetime(1800000L);
        java.lang.String str15 = hikariConfig1.getCatalog();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test15976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15976");
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
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = 5000L;
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        int int22 = hikariConfig1.getMinimumPoolSize();
        boolean boolean23 = hikariConfig1.isInitializationFailFast;
        java.lang.String str24 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test15977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15977");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        hikariConfig1.connectionTimeout = 1L;
        hikariConfig1.maxLifetime = 0L;
        hikariConfig1.connectionTimeout = (byte) 0;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15978");
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
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
        long long21 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig24.transactionIsolationName;
        int int29 = hikariConfig24.transactionIsolation;
        java.lang.String str30 = hikariConfig24.getConnectionInitSql();
        hikariConfig24.setMaxLifetime((long) (short) 1);
        java.lang.String str33 = hikariConfig24.getConnectionCustomizerClassName();
        hikariConfig24.setUseInstrumentation(true);
        java.lang.String str36 = hikariConfig24.connectionCustomizerClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-3713", (java.lang.Object) str36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test15979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15979");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.minPoolSize = (byte) 0;
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15980");
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
        long long16 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test15981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15981");
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
        int int34 = hikariConfig31.acquireRetries;
        long long35 = hikariConfig31.getLeakDetectionThreshold();
        hikariConfig31.minPoolSize = (byte) 100;
        hikariConfig31.connectionTimeout = ' ';
        java.lang.String str40 = hikariConfig31.connectionTestQuery;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test15982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15982");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.poolName = "HikariPool-410";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        long long16 = hikariConfig11.getIdleTimeout();
        java.lang.String str17 = hikariConfig11.getConnectionTestQuery();
        java.util.Properties properties18 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties18);
        long long20 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionInitSql("HikariPool-277");
        int int23 = hikariConfig1.getAcquireRetries();
        long long24 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-13088", (java.lang.Object) "HikariPool-10316");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test15983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15983");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.transactionIsolation = (byte) 1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.acquireRetries = 100;
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        hikariConfig1.setCatalog("HikariPool-292");
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = 3L;
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionInitSql("HikariPool-6049");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15985");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(0);
        int int7 = hikariConfig1.minPoolSize;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        int int9 = hikariConfig1.getMaximumPoolSize();
        long long10 = hikariConfig1.getMaxLifetime();
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test15987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15987");
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
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.idleTimeout = 60L;
        int int23 = hikariConfig20.getMaximumPoolSize();
        hikariConfig20.setCatalog("HikariPool-37612");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test15988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15988");
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
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        java.lang.String str17 = hikariConfig1.catalog;
        hikariConfig1.acquireRetries = '4';
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15989");
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
        hikariConfig11.setMaxLifetime(52L);
        int int29 = hikariConfig11.maxPoolSize;
        hikariConfig11.addDataSourceProperty("HikariPool-6933", (java.lang.Object) "HikariPool-26195");
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
    }

    @Test
    public void test15990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.poolName = "HikariPool-2129";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15991");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.setCatalog("HikariPool-320");
        hikariConfig1.setPoolName("HikariPool-253");
        hikariConfig1.setAutoCommit(false);
        long long12 = hikariConfig1.getIdleTimeout();
        int int13 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test15992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15992");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.setConnectionTestQuery("HikariPool-105");
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isAutoCommit;
        int int15 = hikariConfig13.getAcquireIncrement();
        java.util.Properties properties16 = hikariConfig13.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties16);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isAutoCommit;
        hikariConfig19.poolName = "hi!";
        java.lang.String str23 = hikariConfig19.dataSourceClassName;
        hikariConfig19.acquireRetries = (short) 10;
        java.util.Properties properties26 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean30 = hikariConfig29.isAutoCommit();
        long long31 = hikariConfig29.getAcquireRetryDelay();
        hikariConfig29.setJdbc4ConnectionTest(true);
        hikariConfig29.setIdleTimeout(60L);
        int int36 = hikariConfig29.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test15993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15993");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setTransactionIsolation("hi!");
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxPoolSize = 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15995");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.maxLifetime = (-1);
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.isRegisterMbeans = false;
        boolean boolean24 = hikariConfig16.isRegisterMbeans();
        long long25 = hikariConfig16.connectionTimeout;
        hikariConfig16.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource28 = hikariConfig16.getDataSource();
        long long29 = hikariConfig16.getIdleTimeout();
        int int30 = hikariConfig16.transactionIsolation;
        hikariConfig16.isAutoCommit = true;
        hikariConfig16.setConnectionCustomizerClassName("HikariPool-670");
        hikariConfig16.maxPoolSize = (short) 1;
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig38.leakDetectionThreshold = 100;
        boolean boolean41 = hikariConfig38.isJdbc4connectionTest;
        long long42 = hikariConfig38.getIdleTimeout();
        hikariConfig38.setUseInstrumentation(false);
        hikariConfig38.setJdbc4ConnectionTest(false);
        java.util.Properties properties47 = hikariConfig38.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig16.setDataSourceProperties(properties47);
        hikariConfig1.dataSourceProperties = properties47;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNull(dataSource28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 60L + "'", long29 == 60L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 60L + "'", long42 == 60L);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test15996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15996");
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
        java.lang.String str19 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        java.lang.String str21 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15997");
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
        java.util.Properties properties73 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        int int75 = hikariConfig74.getTransactionIsolation();
        hikariConfig74.setRegisterMbeans(false);
        hikariConfig74.isInitializationFailFast = true;
        int int80 = hikariConfig74.acquireRetries;
        hikariConfig74.setMaxLifetime((long) (-1));
        boolean boolean83 = hikariConfig74.isInitializationFailFast();
        long long84 = hikariConfig74.maxLifetime;
        hikariConfig74.minPoolSize = (byte) -1;
        int int87 = hikariConfig74.getMaximumPoolSize();
        hikariConfig69.addDataSourceProperty("HikariPool-245", (java.lang.Object) hikariConfig74);
        hikariConfig69.dataSourceClassName = "HikariPool-376";
        boolean boolean91 = hikariConfig69.isInitializationFailFast();
        hikariConfig69.setInitializationFailFast(false);
        boolean boolean94 = hikariConfig69.isInitializationFailFast();
        long long95 = hikariConfig69.getIdleTimeout();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 60 + "'", int87 == 60);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long95 + "' != '" + 60L + "'", long95 == 60L);
    }

    @Test
    public void test15998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        boolean boolean2 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean3 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.minPoolSize = (short) 10;
        hikariConfig0.setCatalog("HikariPool-27");
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.poolName;
        hikariConfig8.setMinimumPoolSize((int) '4');
        hikariConfig8.minPoolSize = (byte) 0;
        java.lang.String str14 = hikariConfig8.dataSourceClassName;
        long long15 = hikariConfig8.getIdleTimeout();
        hikariConfig8.dataSourceClassName = "HikariPool-127";
        hikariConfig8.connectionCustomizerClassName = "HikariPool-293";
        java.util.Properties properties20 = hikariConfig8.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties20);
        long long22 = hikariConfig0.getMaxLifetime();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-44401" + "'", str1, "HikariPool-44401");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44402" + "'", str9, "HikariPool-44402");
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
    }

    @Test
    public void test15999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15999");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        long long17 = hikariConfig1.getMaxLifetime();
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
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test16000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test16000");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        long long11 = hikariConfig1.leakDetectionThreshold;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        hikariConfig1.transactionIsolationName = "HikariPool-1023";
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
    }
}
