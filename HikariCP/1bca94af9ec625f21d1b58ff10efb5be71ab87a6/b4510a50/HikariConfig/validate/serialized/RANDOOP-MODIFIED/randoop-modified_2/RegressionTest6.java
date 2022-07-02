import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getAcquireRetries();
        int int9 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setisInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString7();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter14.deserializeObjectHikariDataSource15();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter14;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-164";
        hikariConfig1.setPoolName("");
        long long25 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-32" + "'", str17, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        java.lang.String str6 = hikariConfig1.connectionInitSql;
        long long7 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 183);
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = true;
        boolean boolean14 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig11.dataSource = dataSource13;
        boolean boolean15 = hikariConfig11.isInitializationFailFast;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig17.getConnectionCustomizer();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.dataSource = dataSource19;
        boolean boolean21 = hikariConfig17.isInitializationFailFast;
        java.util.Properties properties22 = hikariConfig17.getDataSourceProperties();
        hikariConfig11.dataSourceProperties = properties22;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int27 = hikariConfig26.getMinimumPoolSize();
        long long28 = hikariConfig26.getConnectionTimeout();
        hikariConfig26.connectionCustomizerClassName = "HikariPool-56";
        java.lang.String str31 = hikariConfig26.getCatalog();
        boolean boolean32 = hikariConfig26.getisRegisterMbeans();
        hikariConfig26.isInitializationFailFast = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.transactionIsolation = 146;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getpoolNumber();
        boolean boolean2 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setPoolName("HikariPool-123");
        hikariConfig0.connectionTimeout = (-1L);
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.getConnectionCustomizer();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 146 + "'", int1 == 146);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setConnectionTimeout((long) 110);
        long long6 = hikariConfig1.getCONNECTION_TIMEOUT();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.connectionTimeout = 183;
        hikariConfig8.setTransactionIsolation("");
        hikariConfig8.idleTimeout = 120;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        org.slf4j.Logger logger5 = hikariConfig1.getLOGGER();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        long long10 = hikariConfig1.getMaxLifetime();
        int int11 = hikariConfig1.getminPoolSize();
        int int12 = hikariConfig1.getpoolNumber();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 152 + "'", int12 == 152);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str10, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setMinimumPoolSize(10);
        int int13 = hikariConfig1.maxPoolSize;
        int int14 = hikariConfig1.getpoolNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 153 + "'", int14 == 153);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaximumPoolSize(10);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.leakDetectionThreshold = 174;
        hikariConfig1.setInitializationFailFast(true);
        int int16 = hikariConfig1.getmaxPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setLeakDetectionThreshold(10L);
        hikariConfig1.setCatalog("");
        int int13 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.setLeakDetectionThreshold((long) 65);
        int int16 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-13" + "'", str6, "HikariPool-13");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        long long7 = hikariConfig1.connectionTimeout;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.setisInitializationFailFast(false);
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolation = 69;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.lang.String str12 = hikariConfig1.gettransactionIsolationName();
        int int13 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str14 = hikariConfig1.catalog;
        hikariConfig1.settransactionIsolationName("HikariPool-131");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        int int8 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.connectionTimeout = 0L;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.dataSource = dataSource13;
        hikariConfig10.setmaxPoolSize((int) (byte) 100);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig19.getConnectionCustomizer();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig19.dataSource = dataSource21;
        hikariConfig19.setInitializationFailFast(true);
        hikariConfig10.addDataSourceProperty("HikariPool-18", (java.lang.Object) true);
        hikariConfig1.copyState(hikariConfig10);
        int int27 = hikariConfig1.maxPoolSize;
        hikariConfig1.setpoolNumber(113);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.transactionIsolationName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig1.settransactionIsolationName("HikariPool-133");
        hikariConfig1.setisAutoCommit(false);
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.maxLifetime = 129;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        hikariConfig1.dataSourceProperties = properties6;
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-221";
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setConnectionTimeout((long) 110);
        long long6 = hikariConfig1.getCONNECTION_TIMEOUT();
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-112");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-112 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.transactionIsolationName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig1.settransactionIsolationName("HikariPool-133");
        hikariConfig1.setCatalog("HikariPool-65");
        org.slf4j.Logger logger13 = hikariConfig1.getLOGGER();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-291";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNotNull(logger13);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.idleTimeout;
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.dataSourceClassName = "HikariPool-59";
        hikariConfig1.maxPoolSize = 0;
        java.lang.String str16 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolationName = "HikariPool-48";
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setmaxPoolSize(205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig11.dataSource = dataSource13;
        boolean boolean15 = hikariConfig11.isInitializationFailFast;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig17.getConnectionCustomizer();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.dataSource = dataSource19;
        boolean boolean21 = hikariConfig17.isInitializationFailFast;
        java.util.Properties properties22 = hikariConfig17.getDataSourceProperties();
        hikariConfig11.dataSourceProperties = properties22;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        hikariConfig1.setLeakDetectionThreshold((long) 183);
        hikariConfig1.setLeakDetectionThreshold((long) 140);
        int int30 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger14 = serializedObjectSupporter11.deserializeObjectLogger1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.idleTimeout = 59;
        hikariConfig1.settransactionIsolationName("HikariPool-73");
        int int21 = hikariConfig1.getpoolNumber();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 129 + "'", int21 == 129);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig7.getConnectionCustomizer();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.dataSource = dataSource9;
        boolean boolean11 = hikariConfig7.isInitializationFailFast;
        java.util.Properties properties12 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties12;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long15 = hikariConfig14.idleTimeout;
        hikariConfig14.setminPoolSize(60);
        hikariConfig14.isAutoCommit = true;
        boolean boolean20 = hikariConfig14.isInitializationFailFast();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.getCatalog();
        java.lang.String str14 = hikariConfig11.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setUseInstrumentation(false);
        int int18 = hikariConfig11.getTransactionIsolation();
        java.lang.String str19 = hikariConfig11.getConnectionTestQuery();
        hikariConfig1.copyState(hikariConfig11);
        javax.sql.DataSource dataSource21 = hikariConfig11.dataSource;
        hikariConfig11.setMinimumPoolSize(10);
        hikariConfig11.setAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter26.deserializeObjectHikariDataSource17();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter26.deserializeObjectHikariDataSource17();
        java.lang.String str31 = serializedObjectSupporter26.deserializeObjectString6();
        java.lang.String str32 = serializedObjectSupporter26.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource33 = serializedObjectSupporter26.deserializeObjectHikariDataSource17();
        hikariConfig11.serializedObjectSupporter = serializedObjectSupporter26;
        java.lang.String str35 = serializedObjectSupporter26.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource36 = serializedObjectSupporter26.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertNull(hikariDataSource28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-33" + "'", str29, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str31, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-6" + "'", str32, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-32" + "'", str35, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource36);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getCONNECTION_TIMEOUT();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetryDelay((long) 49);
        hikariConfig1.maxPoolSize = 28;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionTimeout = 39;
        hikariConfig1.setConnectionInitSql("HikariPool-187");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger14 = serializedObjectSupporter11.deserializeObjectLogger1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        java.lang.String str17 = serializedObjectSupporter11.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter11.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        java.lang.String str20 = serializedObjectSupporter11.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter11.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger14);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-6" + "'", str17, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-32" + "'", str20, "HikariPool-32");
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNull(hikariDataSource22);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.getCatalog();
        java.lang.String str14 = hikariConfig11.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setUseInstrumentation(false);
        int int18 = hikariConfig11.getTransactionIsolation();
        java.lang.String str19 = hikariConfig11.getConnectionTestQuery();
        hikariConfig1.copyState(hikariConfig11);
        javax.sql.DataSource dataSource21 = hikariConfig11.dataSource;
        hikariConfig11.setMinimumPoolSize(10);
        hikariConfig11.setAutoCommit(false);
        hikariConfig11.setAcquireRetryDelay((long) 261);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig11.setDataSource(dataSource28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = (byte) -1;
        long long4 = hikariConfig0.getMAX_LIFETIME();
        hikariConfig0.transactionIsolation = 74;
        java.lang.String str7 = hikariConfig0.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-143" + "'", str7, "HikariPool-143");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig11.dataSource = dataSource13;
        boolean boolean15 = hikariConfig11.isInitializationFailFast;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig17.getConnectionCustomizer();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.dataSource = dataSource19;
        boolean boolean21 = hikariConfig17.isInitializationFailFast;
        java.util.Properties properties22 = hikariConfig17.getDataSourceProperties();
        hikariConfig11.dataSourceProperties = properties22;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig27.setMinimumPoolSize((int) 'a');
        java.lang.String str30 = hikariConfig27.connectionTestQuery;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        long long7 = hikariConfig1.getAcquireRetryDelay();
        long long8 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setConnectionTestQuery("HikariPool-19");
        java.lang.String str15 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-49");
        hikariConfig1.setConnectionInitSql("HikariPool-152");
        long long23 = hikariConfig1.getIDLE_TIMEOUT();
        int int24 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.catalog = "HikariPool-102";
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig14.getConnectionCustomizer();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig14.dataSource = dataSource16;
        boolean boolean18 = hikariConfig14.isInitializationFailFast;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig20.getConnectionCustomizer();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig20.dataSource = dataSource22;
        boolean boolean24 = hikariConfig20.isInitializationFailFast;
        java.util.Properties properties25 = hikariConfig20.getDataSourceProperties();
        hikariConfig14.dataSourceProperties = properties25;
        java.lang.String str27 = hikariConfig14.catalog;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = hikariConfig29.getConnectionCustomizer();
        javax.sql.DataSource dataSource31 = null;
        hikariConfig29.dataSource = dataSource31;
        hikariConfig29.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter35 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource36 = serializedObjectSupporter35.deserializeObjectHikariDataSource1();
        hikariConfig29.serializedObjectSupporter = serializedObjectSupporter35;
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.maxPoolSize;
        java.lang.String str41 = hikariConfig39.gettransactionIsolationName();
        hikariConfig39.minPoolSize = (short) -1;
        java.lang.String str44 = hikariConfig39.dataSourceClassName;
        java.util.Properties properties45 = hikariConfig39.getDataSourceProperties();
        hikariConfig29.dataSourceProperties = properties45;
        hikariConfig14.setDataSourceProperties(properties45);
        hikariConfig1.setDataSourceProperties(properties45);
        long long49 = hikariConfig1.getCONNECTION_TIMEOUT();
        long long50 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.connectionTestQuery = "HikariPool-2";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(iConnectionCustomizer30);
        org.junit.Assert.assertNull(hikariDataSource36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 5000L + "'", long49 == 5000L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 5000L + "'", long50 == 5000L);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.util.Properties properties10 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.catalog = "";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        hikariConfig11.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig11.getConnectionCustomizer();
        hikariConfig1.copyState(hikariConfig11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig11.connectionCustomizer;
        hikariConfig11.isRegisterMbeans = false;
        boolean boolean20 = hikariConfig11.isRegisterMbeans();
        boolean boolean21 = hikariConfig11.isRegisterMbeans;
        javax.sql.DataSource dataSource22 = null;
        hikariConfig11.setDataSource(dataSource22);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig11.dataSource = dataSource24;
        long long26 = hikariConfig11.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig15.getConnectionCustomizer();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.dataSource = dataSource17;
        java.util.Properties properties19 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.copyState(hikariConfig15);
        boolean boolean21 = hikariConfig15.isInitializationFailFast();
        java.lang.String str22 = hikariConfig15.connectionInitSql;
        java.lang.String str23 = hikariConfig15.getDataSourceClassName();
        int int24 = hikariConfig15.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig12.getConnectionCustomizer();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig12.dataSource = dataSource14;
        boolean boolean16 = hikariConfig12.isInitializationFailFast;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig18.getConnectionCustomizer();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig18.dataSource = dataSource20;
        boolean boolean22 = hikariConfig18.isInitializationFailFast;
        java.util.Properties properties23 = hikariConfig18.getDataSourceProperties();
        hikariConfig12.dataSourceProperties = properties23;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int30 = hikariConfig29.getMaximumPoolSize();
        hikariConfig29.setAcquireRetryDelay((long) 142);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-58");
        int int14 = hikariConfig1.getmaxPoolSize();
        int int15 = hikariConfig1.minPoolSize;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        int int17 = hikariConfig1.getminPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolationName = "HikariPool-11";
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        int int11 = hikariConfig1.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.copyState(hikariConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Exception copying HikariConfig state: null");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-11" + "'", str8, "HikariPool-11");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.idleTimeout = 41;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.isAutoCommit = true;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAcquireRetryDelay((long) 39);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        int int8 = hikariConfig1.getminPoolSize();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-177";
        int int13 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig8.getConnectionCustomizer();
        boolean boolean10 = hikariConfig8.isRegisterMbeans();
        hikariConfig8.setDataSourceClassName("hi!");
        java.lang.String str13 = hikariConfig8.poolName;
        hikariConfig8.setMaxLifetime((long) '4');
        hikariConfig8.setRegisterMbeans(false);
        hikariConfig8.isJdbc4connectionTest = true;
        hikariConfig8.connectionTestQuery = "HikariPool-17";
        hikariConfig6.copyState(hikariConfig8);
        hikariConfig6.setMinimumPoolSize(39);
        hikariConfig6.setLeakDetectionThreshold((long) 219);
        hikariConfig6.setConnectionTestQuery("HikariPool-152");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-186" + "'", str13, "HikariPool-186");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig7.getConnectionCustomizer();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.dataSource = dataSource9;
        boolean boolean11 = hikariConfig7.isInitializationFailFast;
        java.util.Properties properties12 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties12;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(169);
        hikariConfig1.setMaximumPoolSize(21);
        int int19 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 21 + "'", int19 == 21);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        hikariConfig1.setAcquireRetryDelay((long) 100);
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMinimumPoolSize(29);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-147";
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.maxPoolSize;
        java.lang.String str16 = hikariConfig14.getCatalog();
        java.lang.String str17 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str21 = hikariConfig14.getDataSourceClassName();
        java.util.Properties properties22 = hikariConfig14.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties22;
        java.lang.String str24 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setRegisterMbeans(false);
        int int27 = hikariConfig1.getAcquireIncrement();
        long long28 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.catalog = "";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.getCatalog();
        java.lang.String str14 = hikariConfig11.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig11.getConnectionCustomizer();
        hikariConfig11.maxLifetime = 1;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int23 = hikariConfig22.maxPoolSize;
        java.lang.String str24 = hikariConfig22.getCatalog();
        java.lang.String str25 = hikariConfig22.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig22.getConnectionTestQuery();
        hikariConfig22.setUseInstrumentation(false);
        java.lang.String str29 = hikariConfig22.getDataSourceClassName();
        java.util.Properties properties30 = hikariConfig22.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig11.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig1.dataSourceProperties = properties30;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        hikariConfig1.poolName = "HikariPool-11";
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getMAX_LIFETIME();
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetryDelay((long) 85);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setTransactionIsolation("HikariPool-45");
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setMaximumPoolSize(68);
        hikariConfig1.setAcquireIncrement(94);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getpoolNumber();
        long long3 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.idleTimeout = 0L;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 210 + "'", int2 == 210);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.idleTimeout;
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.dataSourceClassName = "HikariPool-59";
        hikariConfig1.validate();
        long long15 = hikariConfig1.getMAX_LIFETIME();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.maxLifetime = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-59" + "'", str16, "HikariPool-59");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = (byte) -1;
        long long4 = hikariConfig0.getIDLE_TIMEOUT();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.setLeakDetectionThreshold((long) 46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-58");
        int int14 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.setisRegisterMbeans(false);
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        hikariConfig1.setCatalog("HikariPool-218");
        hikariConfig1.setmaxPoolSize(12);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        hikariConfig1.setConnectionInitSql("HikariPool-39");
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        hikariConfig1.setmaxPoolSize((int) (byte) 100);
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig10.getConnectionCustomizer();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.dataSource = dataSource12;
        hikariConfig10.setInitializationFailFast(true);
        hikariConfig1.addDataSourceProperty("HikariPool-18", (java.lang.Object) true);
        java.lang.String str17 = hikariConfig1.poolName;
        hikariConfig1.connectionTimeout = 244;
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(iConnectionCustomizer11);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-213" + "'", str17, "HikariPool-213");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        hikariConfig1.transactionIsolationName = "HikariPool-297";
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        int int10 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        hikariConfig1.setAcquireRetryDelay((long) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        long long9 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.transactionIsolation = 0;
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.leakDetectionThreshold = 72;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-31";
        boolean boolean6 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isRegisterMbeans = false;
        long long5 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.setCatalog("HikariPool-34");
        long long8 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.settransactionIsolationName("HikariPool-18");
        hikariConfig1.connectionTimeout = (byte) 0;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-178");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-178 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.getmaxPoolSize();
        int int11 = hikariConfig1.getAcquireRetries();
        java.lang.String str12 = hikariConfig1.gettransactionIsolationName();
        int int13 = hikariConfig1.getpoolNumber();
        long long14 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 235 + "'", int13 == 235);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SELECT 1" + "'", str10, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-115";
        boolean boolean14 = hikariConfig1.getisJdbc4connectionTest();
        long long15 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.transactionIsolation = 77;
        boolean boolean18 = hikariConfig1.isAutoCommit();
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-65" + "'", str10, "HikariPool-65");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetries(49);
        hikariConfig1.transactionIsolationName = "HikariPool-54";
        hikariConfig1.setIdleTimeout((long) 29);
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setisRegisterMbeans(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        int int9 = hikariConfig1.getmaxPoolSize();
        int int10 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties11 = null;
        hikariConfig1.dataSourceProperties = properties11;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        long long12 = hikariConfig1.getMAX_LIFETIME();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        boolean boolean15 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.validate();
        hikariConfig1.maxPoolSize = 26;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.settransactionIsolationName("HikariPool-230");
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        java.util.Properties properties17 = serializedObjectSupporter11.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.dataSourceProperties = properties17;
        int int20 = hikariConfig1.transactionIsolation;
        int int21 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        hikariConfig1.setAcquireRetryDelay((long) 100);
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-43");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setisJdbc4connectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig14.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        int int19 = hikariConfig14.getMaximumPoolSize();
        java.util.Properties properties20 = hikariConfig14.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties20;
        java.lang.String str22 = hikariConfig1.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer23;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-65" + "'", str10, "HikariPool-65");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-293" + "'", str22, "HikariPool-293");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionCustomizerClassName = "";
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        java.lang.String str15 = hikariConfig1.getPoolName();
        int int16 = hikariConfig1.getAcquireRetries();
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-295" + "'", str15, "HikariPool-295");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setConnectionInitSql("HikariPool-13");
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setisAutoCommit(true);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.maxPoolSize;
        java.lang.String str19 = hikariConfig17.gettransactionIsolationName();
        hikariConfig17.minPoolSize = (short) -1;
        java.lang.String str22 = hikariConfig17.dataSourceClassName;
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig24.setConnectionCustomizerClassName("HikariPool-32");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.maxPoolSize;
        java.lang.String str32 = hikariConfig30.getCatalog();
        java.lang.String str33 = hikariConfig30.getConnectionCustomizerClassName();
        java.lang.String str34 = hikariConfig30.getConnectionTestQuery();
        hikariConfig30.setUseInstrumentation(false);
        int int37 = hikariConfig30.getAcquireRetries();
        int int38 = hikariConfig30.getAcquireRetries();
        boolean boolean39 = hikariConfig30.isJdbc4ConnectionTest();
        long long40 = hikariConfig30.idleTimeout;
        java.lang.String str41 = hikariConfig30.connectionTestQuery;
        java.util.Properties properties42 = hikariConfig30.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig24.dataSourceProperties = properties42;
        hikariConfig1.dataSourceProperties = properties42;
        hikariConfig1.setIdleTimeout((long) 37);
        java.lang.String str48 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 600000L + "'", long40 == 600000L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        java.lang.String str10 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionTimeout = (short) 100;
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long14 = hikariConfig1.connectionTimeout;
        hikariConfig1.setMinimumPoolSize(68);
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        hikariConfig1.isJdbc4connectionTest = true;
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.dataSource = dataSource21;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.poolName = "HikariPool-19";
        int int9 = hikariConfig1.acquireRetries;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.gettransactionIsolationName();
        hikariConfig11.minPoolSize = (short) -1;
        java.lang.String str16 = hikariConfig11.dataSourceClassName;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.maxPoolSize;
        java.lang.String str20 = hikariConfig18.getCatalog();
        java.lang.String str21 = hikariConfig18.getConnectionCustomizerClassName();
        java.lang.String str22 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setUseInstrumentation(false);
        java.lang.String str25 = hikariConfig18.getDataSourceClassName();
        java.util.Properties properties26 = hikariConfig18.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig11.dataSourceProperties = properties26;
        hikariConfig11.setisJdbc4connectionTest(true);
        hikariConfig1.copyState(hikariConfig11);
        hikariConfig1.transactionIsolation = 21;
        hikariConfig1.setDataSourceClassName("HikariPool-49");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setDataSourceClassName("");
        int int10 = hikariConfig1.getminPoolSize();
        long long11 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.leakDetectionThreshold = 0L;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        hikariConfig1.poolName = "HikariPool-11";
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setpoolNumber(184);
        int int19 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-6" + "'", str13, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource14);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setminPoolSize((int) (byte) 10);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariConfig1.serializedObjectSupporter;
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        long long8 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.setisRegisterMbeans(true);
        int int11 = hikariConfig1.getmaxPoolSize();
        long long12 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-115";
        boolean boolean14 = hikariConfig1.getisJdbc4connectionTest();
        long long15 = hikariConfig1.getConnectionTimeout();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-65" + "'", str10, "HikariPool-65");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-115" + "'", str17, "HikariPool-115");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setConnectionTimeout((long) 110);
        hikariConfig1.setConnectionInitSql("HikariPool-61");
        hikariConfig1.transactionIsolationName = "HikariPool-151";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        long long13 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource6();
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter14.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter14.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter14.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter14.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter14;
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter14.deserializeObjectHikariDataSource10();
        java.lang.String str26 = serializedObjectSupporter14.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter14.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter14.deserializeObjectHikariConfig1();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-6" + "'", str19, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNull(hikariDataSource22);
        org.junit.Assert.assertNull(hikariConfig23);
        org.junit.Assert.assertNull(hikariDataSource25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-6" + "'", str26, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertNull(hikariConfig28);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.zaxxer.hikari.HikariConfig.poolNumber = 291;
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.catalog = "HikariPool-249";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        boolean boolean13 = hikariConfig11.isRegisterMbeans();
        hikariConfig11.setDataSourceClassName("hi!");
        java.lang.String str16 = hikariConfig11.poolName;
        hikariConfig11.setMaxLifetime((long) '4');
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.isJdbc4connectionTest = true;
        hikariConfig1.addDataSourceProperty("HikariPool-134", (java.lang.Object) hikariConfig11);
        hikariConfig11.setTransactionIsolation("HikariPool-13");
        hikariConfig11.connectionInitSql = "HikariPool-151";
        int int28 = hikariConfig11.getminPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-296" + "'", str16, "HikariPool-296");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        hikariConfig11.setDataSourceClassName("HikariPool-32");
        hikariConfig11.minPoolSize = 10;
        java.lang.String str17 = hikariConfig11.gettransactionIsolationName();
        hikariConfig11.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig21.getConnectionCustomizer();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig21.dataSource = dataSource23;
        boolean boolean25 = hikariConfig21.isInitializationFailFast;
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig27.getConnectionCustomizer();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig27.dataSource = dataSource29;
        boolean boolean31 = hikariConfig27.isInitializationFailFast;
        java.util.Properties properties32 = hikariConfig27.getDataSourceProperties();
        hikariConfig21.dataSourceProperties = properties32;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig11.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = hikariConfig39.getConnectionCustomizer();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig39.dataSource = dataSource41;
        hikariConfig39.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter45 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource46 = serializedObjectSupporter45.deserializeObjectHikariDataSource1();
        hikariConfig39.serializedObjectSupporter = serializedObjectSupporter45;
        hikariConfig1.copyState(hikariConfig39);
        java.lang.String str49 = hikariConfig1.dataSourceClassName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter50 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig51 = serializedObjectSupporter50.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource52 = serializedObjectSupporter50.deserializeObjectHikariDataSource10();
        java.lang.String str53 = serializedObjectSupporter50.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig54 = serializedObjectSupporter50.deserializeObjectHikariConfig2();
        java.lang.String str55 = serializedObjectSupporter50.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = serializedObjectSupporter50.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter50;
        com.zaxxer.hikari.HikariDataSource hikariDataSource58 = serializedObjectSupporter50.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource59 = serializedObjectSupporter50.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(iConnectionCustomizer40);
        org.junit.Assert.assertNull(hikariDataSource46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(hikariConfig51);
        org.junit.Assert.assertNull(hikariDataSource52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str53, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-33" + "'", str55, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig56);
        org.junit.Assert.assertNull(hikariDataSource58);
        org.junit.Assert.assertNull(hikariDataSource59);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setConnectionTimeout((long) 110);
        long long6 = hikariConfig1.getCONNECTION_TIMEOUT();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.connectionTimeout = 183;
        hikariConfig8.setTransactionIsolation("");
        int int13 = hikariConfig8.getMinimumPoolSize();
        java.lang.String str14 = hikariConfig8.connectionCustomizerClassName;
        hikariConfig8.transactionIsolationName = "";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource10();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter8;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str11, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str11 = hikariConfig1.getCatalog();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(false);
        boolean boolean15 = hikariConfig1.getisJdbc4connectionTest();
        int int16 = hikariConfig1.getTransactionIsolation();
        java.lang.String str17 = hikariConfig1.poolName;
        hikariConfig1.setConnectionTestQuery("HikariPool-16");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-309" + "'", str17, "HikariPool-309");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setConnectionTestQuery("HikariPool-19");
        java.lang.String str15 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        long long18 = hikariConfig1.idleTimeout;
        hikariConfig1.idleTimeout = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        int int5 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        boolean boolean7 = hikariConfig1.getisAutoCommit();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter7.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig11.dataSource = dataSource13;
        boolean boolean15 = hikariConfig11.isInitializationFailFast;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig17.getConnectionCustomizer();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.dataSource = dataSource19;
        boolean boolean21 = hikariConfig17.isInitializationFailFast;
        java.util.Properties properties22 = hikariConfig17.getDataSourceProperties();
        hikariConfig11.dataSourceProperties = properties22;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str27 = hikariConfig26.connectionCustomizerClassName;
        java.lang.String str28 = hikariConfig26.poolName;
        int int29 = hikariConfig26.transactionIsolation;
        hikariConfig26.setAcquireRetryDelay((long) 122);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-317" + "'", str28, "HikariPool-317");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties2);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties2);
        int int6 = hikariConfig5.acquireRetries;
        long long7 = hikariConfig5.idleTimeout;
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig8);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("");
        hikariConfig1.dataSourceClassName = "HikariPool-271";
        hikariConfig1.setminPoolSize(226);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.minPoolSize = 38;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        java.lang.String str6 = hikariConfig1.connectionInitSql;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = 20;
        hikariConfig1.maxLifetime = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.dataSourceClassName = "HikariPool-99";
        hikariConfig1.dataSourceClassName = "HikariPool-118";
        long long12 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.leakDetectionThreshold = 'a';
        long long16 = hikariConfig1.connectionTimeout;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        long long18 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        int int7 = hikariConfig1.transactionIsolation;
        int int8 = hikariConfig1.getpoolNumber();
        java.lang.String str9 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 339 + "'", int8 == 339);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-338" + "'", str9, "HikariPool-338");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        long long11 = hikariConfig1.idleTimeout;
        hikariConfig1.acquireRetries = 29;
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.catalog = "";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        hikariConfig11.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig11.getConnectionCustomizer();
        hikariConfig1.copyState(hikariConfig11);
        hikariConfig11.dataSourceClassName = "HikariPool-29";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter19.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter19.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter19.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter19.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter19.deserializeObjectHikariConfig1();
        hikariConfig11.serializedObjectSupporter = serializedObjectSupporter19;
        boolean boolean26 = hikariConfig11.getisAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNull(hikariConfig22);
        org.junit.Assert.assertNull(hikariDataSource23);
        org.junit.Assert.assertNull(hikariConfig24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource3();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString6();
        java.util.Properties properties12 = serializedObjectSupporter7.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.connectionInitSql;
        java.util.Properties properties15 = hikariConfig13.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setConnectionCustomizerClassName("HikariPool-131");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.idleTimeout = 100L;
        hikariConfig1.connectionTestQuery = "HikariPool-135";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        long long12 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-6";
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        long long11 = hikariConfig1.idleTimeout;
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.minPoolSize = 240;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.maxPoolSize;
        java.lang.String str18 = hikariConfig16.getCatalog();
        java.lang.String str19 = hikariConfig16.getConnectionCustomizerClassName();
        java.lang.String str20 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setUseInstrumentation(false);
        int int23 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter26.deserializeObjectHikariConfig2();
        java.lang.String str28 = serializedObjectSupporter26.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger29 = serializedObjectSupporter26.deserializeObjectLogger1();
        hikariConfig16.serializedObjectSupporter = serializedObjectSupporter26;
        java.lang.String str31 = serializedObjectSupporter26.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter26.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = serializedObjectSupporter26.deserializeObjectHikariConfig1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter26;
        hikariConfig1.maxPoolSize = 108;
        javax.sql.DataSource dataSource37 = null;
        hikariConfig1.setDataSource(dataSource37);
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.maxPoolSize;
        java.lang.String str42 = hikariConfig40.getCatalog();
        java.lang.String str43 = hikariConfig40.getConnectionCustomizerClassName();
        java.lang.String str44 = hikariConfig40.connectionInitSql;
        hikariConfig40.setUseInstrumentation(false);
        javax.sql.DataSource dataSource47 = null;
        hikariConfig40.setDataSource(dataSource47);
        javax.sql.DataSource dataSource49 = hikariConfig40.getDataSource();
        hikariConfig40.setAutoCommit(false);
        long long52 = hikariConfig40.leakDetectionThreshold;
        boolean boolean53 = hikariConfig40.getisInitializationFailFast();
        long long54 = hikariConfig40.getIdleTimeout();
        int int55 = hikariConfig40.getminPoolSize();
        int int56 = hikariConfig40.minPoolSize;
        hikariConfig1.copyState(hikariConfig40);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(hikariConfig27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SELECT 1" + "'", str28, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str31, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource32);
        org.junit.Assert.assertNull(hikariConfig33);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 600000L + "'", long54 == 600000L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getpoolNumber();
        boolean boolean2 = hikariConfig0.isRegisterMbeans;
        java.util.Properties properties3 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig4.getConnectionCustomizer();
        hikariConfig4.setDataSourceClassName("HikariPool-32");
        hikariConfig4.minPoolSize = 10;
        boolean boolean10 = hikariConfig4.isInitializationFailFast;
        int int11 = hikariConfig4.getminPoolSize();
        hikariConfig0.copyState(hikariConfig4);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-110";
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 357 + "'", int1 == 357);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.poolName;
        long long11 = hikariConfig1.idleTimeout;
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.settransactionIsolationName("HikariPool-84");
        hikariConfig1.setTransactionIsolation("HikariPool-230");
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        long long18 = hikariConfig1.getIDLE_TIMEOUT();
        java.lang.String str19 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-358" + "'", str10, "HikariPool-358");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("");
        hikariConfig1.dataSourceClassName = "HikariPool-271";
        hikariConfig1.setminPoolSize(226);
        hikariConfig1.setMaximumPoolSize(95);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setIdleTimeout((long) 203);
        int int10 = hikariConfig1.getminPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        hikariConfig1.poolName = "HikariPool-11";
        hikariConfig1.setDataSourceClassName("HikariPool-108");
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        long long7 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.isRegisterMbeans = true;
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-267");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.transactionIsolationName = "HikariPool-267";
        hikariConfig1.leakDetectionThreshold = 0L;
        hikariConfig1.connectionInitSql = "HikariPool-205";
        long long19 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        int int11 = hikariConfig1.getpoolNumber();
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-6");
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setLeakDetectionThreshold((long) 68);
        hikariConfig1.setCatalog("HikariPool-36");
        hikariConfig1.setPoolName("HikariPool-49");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 376 + "'", int11 == 376);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.util.Properties properties9 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = 49;
        int int4 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setisAutoCommit(false);
        long long7 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-32" + "'", str11, "HikariPool-32");
        org.junit.Assert.assertNull(hikariConfig12);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig8.setConnectionCustomizerClassName("HikariPool-32");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.maxPoolSize;
        java.lang.String str16 = hikariConfig14.getCatalog();
        java.lang.String str17 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setUseInstrumentation(false);
        int int21 = hikariConfig14.getAcquireRetries();
        int int22 = hikariConfig14.getAcquireRetries();
        boolean boolean23 = hikariConfig14.isJdbc4ConnectionTest();
        long long24 = hikariConfig14.idleTimeout;
        java.lang.String str25 = hikariConfig14.connectionTestQuery;
        java.util.Properties properties26 = hikariConfig14.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig8.dataSourceProperties = properties26;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.maxPoolSize;
        java.lang.String str32 = hikariConfig30.getCatalog();
        java.lang.String str33 = hikariConfig30.getConnectionCustomizerClassName();
        java.lang.String str34 = hikariConfig30.getConnectionTestQuery();
        hikariConfig30.setUseInstrumentation(false);
        int int37 = hikariConfig30.getAcquireRetries();
        int int38 = hikariConfig30.getAcquireRetries();
        boolean boolean39 = hikariConfig30.isJdbc4ConnectionTest();
        hikariConfig30.settransactionIsolationName("TRANSACTION_REPEATABLE_READ");
        int int42 = hikariConfig30.acquireRetries;
        java.util.Properties properties43 = hikariConfig30.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties43);
        hikariConfig8.setMaxLifetime((long) 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        hikariConfig1.transactionIsolationName = "HikariPool-297";
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        int int10 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig5);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-59";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        hikariConfig1.setConnectionInitSql("HikariPool-33");
        int int7 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.transactionIsolation = 0;
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        boolean boolean8 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setIdleTimeout((long) 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        int int11 = hikariConfig1.getpoolNumber();
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-6");
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.idleTimeout = 100L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.getConnectionCustomizer();
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        long long22 = hikariConfig1.getIDLE_TIMEOUT();
        long long23 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-58");
        int int14 = hikariConfig1.getmaxPoolSize();
        int int15 = hikariConfig1.minPoolSize;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        int int17 = hikariConfig1.maxPoolSize;
        java.lang.String str18 = hikariConfig1.catalog;
        hikariConfig1.setDataSourceClassName("HikariPool-16");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.poolName;
        long long11 = hikariConfig1.idleTimeout;
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.settransactionIsolationName("HikariPool-84");
        hikariConfig1.setTransactionIsolation("HikariPool-230");
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        int int19 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-19" + "'", str10, "HikariPool-19");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str9 = hikariConfig1.catalog;
        hikariConfig1.setConnectionInitSql("HikariPool-43");
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.connectionTimeout = 0L;
        int int16 = hikariConfig13.getMaximumPoolSize();
        hikariConfig13.setJdbc4ConnectionTest(true);
        hikariConfig13.connectionTimeout = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig13.getConnectionCustomizer();
        hikariConfig1.copyState(hikariConfig13);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig13.dataSource = dataSource23;
        boolean boolean25 = hikariConfig13.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig11.dataSource = dataSource13;
        boolean boolean15 = hikariConfig11.isInitializationFailFast;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig17.getConnectionCustomizer();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.dataSource = dataSource19;
        boolean boolean21 = hikariConfig17.isInitializationFailFast;
        java.util.Properties properties22 = hikariConfig17.getDataSourceProperties();
        hikariConfig11.dataSourceProperties = properties22;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        int int26 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        hikariConfig1.poolName = "HikariPool-11";
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.isAutoCommit = false;
        long long15 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.catalog = "HikariPool-43";
        long long11 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.copyState(hikariConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Exception copying HikariConfig state: null");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariConfig3);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        long long3 = hikariConfig1.idleTimeout;
        org.slf4j.Logger logger4 = hikariConfig1.getLOGGER();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource5();
        java.util.Properties properties8 = serializedObjectSupporter5.deserializeObjectProperties1();
        hikariConfig1.dataSourceProperties = properties8;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.maxPoolSize;
        java.lang.String str16 = hikariConfig14.getCatalog();
        java.lang.String str17 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str21 = hikariConfig14.getDataSourceClassName();
        java.util.Properties properties22 = hikariConfig14.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties22;
        java.lang.String str24 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(true);
        int int27 = hikariConfig1.getpoolNumber();
        hikariConfig1.settransactionIsolationName("HikariPool-324");
        int int30 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37 + "'", int27 == 37);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.getmaxPoolSize();
        int int11 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        long long10 = hikariConfig1.connectionTimeout;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        int int13 = hikariConfig1.getMinimumPoolSize();
        boolean boolean14 = hikariConfig1.getisRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.getConnectionCustomizer();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setInitializationFailFast(false);
        org.slf4j.Logger logger12 = hikariConfig1.getLOGGER();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getAcquireIncrement();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.setMaximumPoolSize(203);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setIdleTimeout((long) 203);
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.maxPoolSize;
        java.lang.String str15 = hikariConfig13.getCatalog();
        java.lang.String str16 = hikariConfig13.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.setUseInstrumentation(false);
        int int20 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setTransactionIsolation("hi!");
        hikariConfig1.addDataSourceProperty("HikariPool-110", (java.lang.Object) "hi!");
        org.slf4j.Logger logger24 = hikariConfig1.getLOGGER();
        java.lang.String str25 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(logger24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-44" + "'", str25, "HikariPool-44");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties7 = hikariConfig6.dataSourceProperties;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setTransactionIsolation("HikariPool-45");
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setMaximumPoolSize(68);
        hikariConfig1.setIdleTimeout((long) 288);
        hikariConfig1.setLeakDetectionThreshold((long) 46);
        long long15 = hikariConfig1.maxLifetime;
        hikariConfig1.catalog = "HikariPool-190";
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str12 = hikariConfig1.gettransactionIsolationName();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.maxPoolSize;
        java.lang.String str16 = hikariConfig14.getCatalog();
        java.lang.String str17 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str21 = hikariConfig14.getDataSourceClassName();
        java.util.Properties properties22 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.setmaxPoolSize(99);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        int int5 = hikariConfig1.maxPoolSize;
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireIncrement(101);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariConfig1.serializedObjectSupporter;
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        hikariConfig1.setPoolName("HikariPool-145");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.gettransactionIsolationName();
        hikariConfig11.minPoolSize = (short) -1;
        java.lang.String str16 = hikariConfig11.dataSourceClassName;
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties17;
        hikariConfig1.isJdbc4connectionTest = false;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean22 = hikariConfig21.isAutoCommit();
        hikariConfig21.setpoolNumber((int) (byte) 10);
        int int25 = hikariConfig21.minPoolSize;
        int int26 = hikariConfig21.getMaximumPoolSize();
        hikariConfig1.copyState(hikariConfig21);
        hikariConfig1.setPoolName("HikariPool-178");
        hikariConfig1.isRegisterMbeans = true;
        long long32 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getpoolNumber();
        boolean boolean2 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setPoolName("HikariPool-123");
        hikariConfig0.connectionTimeout = (-1L);
        boolean boolean7 = hikariConfig0.isAutoCommit();
        java.lang.String str8 = hikariConfig0.getPoolName();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-123" + "'", str8, "HikariPool-123");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-57");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-57 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setIdleTimeout((long) 203);
        int int10 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig12.getConnectionCustomizer();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig12.dataSource = dataSource14;
        boolean boolean16 = hikariConfig12.isInitializationFailFast;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig18.getConnectionCustomizer();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig18.dataSource = dataSource20;
        boolean boolean22 = hikariConfig18.isInitializationFailFast;
        java.util.Properties properties23 = hikariConfig18.getDataSourceProperties();
        hikariConfig12.dataSourceProperties = properties23;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setAcquireIncrement(98);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.transactionIsolation = 146;
        hikariConfig1.setLeakDetectionThreshold((long) 0);
        hikariConfig1.setminPoolSize(8);
        hikariConfig1.setMaxLifetime((long) 202);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.minPoolSize = 32;
        int int15 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setisJdbc4connectionTest(true);
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-22" + "'", str18, "HikariPool-22");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.zaxxer.hikari.HikariConfig.poolNumber = 28;
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        long long10 = hikariConfig1.getIdleTimeout();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("HikariPool-294");
        hikariConfig1.setisJdbc4connectionTest(true);
        int int16 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource17 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.connectionTestQuery = "";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str8 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.idleTimeout = 261;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        hikariConfig1.maxLifetime = 50;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig7.getConnectionCustomizer();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.dataSource = dataSource9;
        boolean boolean11 = hikariConfig7.isInitializationFailFast;
        java.util.Properties properties12 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties12;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long15 = hikariConfig14.idleTimeout;
        int int16 = hikariConfig14.minPoolSize;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.transactionIsolationName = "HikariPool-123";
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setPoolName("HikariPool-74");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        int int12 = hikariConfig1.getAcquireRetries();
        int int13 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.getmaxPoolSize();
        int int11 = hikariConfig1.getAcquireRetries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.setminPoolSize(29);
        hikariConfig1.setPoolName("HikariPool-232");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        int int11 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-130";
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        hikariConfig1.dataSourceProperties = properties6;
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionCustomizerClassName = "";
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.zaxxer.hikari.HikariConfig.poolNumber = 205;
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        int int9 = hikariConfig1.getmaxPoolSize();
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        int int11 = hikariConfig1.getpoolNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 206 + "'", int11 == 206);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        long long13 = hikariConfig1.getCONNECTION_TIMEOUT();
        int int14 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setLeakDetectionThreshold((long) 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig12.getConnectionCustomizer();
        hikariConfig12.setDataSourceClassName("HikariPool-32");
        hikariConfig12.minPoolSize = 10;
        boolean boolean18 = hikariConfig12.isInitializationFailFast;
        long long19 = hikariConfig12.getMaxLifetime();
        long long20 = hikariConfig12.getIdleTimeout();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.acquireRetries = 161;
        boolean boolean25 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setCatalog("");
        org.slf4j.Logger logger8 = hikariConfig1.getLOGGER();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig8.getConnectionCustomizer();
        boolean boolean10 = hikariConfig8.isRegisterMbeans();
        hikariConfig8.setDataSourceClassName("hi!");
        java.lang.String str13 = hikariConfig8.poolName;
        hikariConfig8.setMaxLifetime((long) '4');
        hikariConfig8.setRegisterMbeans(false);
        hikariConfig8.isJdbc4connectionTest = true;
        hikariConfig8.connectionTestQuery = "HikariPool-17";
        hikariConfig6.copyState(hikariConfig8);
        hikariConfig6.setMinimumPoolSize(39);
        hikariConfig6.setIdleTimeout((long) 58);
        int int27 = hikariConfig6.getMinimumPoolSize();
        boolean boolean28 = hikariConfig6.isAutoCommit();
        long long29 = hikariConfig6.getConnectionTimeout();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-213" + "'", str13, "HikariPool-213");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        java.lang.String str6 = hikariConfig1.connectionInitSql;
        long long7 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 183);
        long long10 = hikariConfig1.getMAX_LIFETIME();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-6" + "'", str12, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32" + "'", str13, "HikariPool-32");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str9 = hikariConfig1.catalog;
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.connectionTestQuery = "HikariPool-30";
        hikariConfig1.setConnectionInitSql("HikariPool-59");
        hikariConfig1.setMinimumPoolSize(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        int int5 = hikariConfig1.transactionIsolation;
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.transactionIsolationName = "HikariPool-71";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = hikariConfig1.serializedObjectSupporter;
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        long long10 = hikariConfig1.getIdleTimeout();
        int int11 = hikariConfig1.acquireRetries;
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        org.slf4j.Logger logger13 = hikariConfig1.getLOGGER();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        java.lang.String str15 = serializedObjectSupporter6.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter6.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource16);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        long long7 = hikariConfig1.connectionTimeout;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setpoolNumber(181);
        hikariConfig1.setAcquireRetryDelay((long) 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        int int9 = hikariConfig1.getmaxPoolSize();
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMinimumPoolSize(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.gettransactionIsolationName();
        hikariConfig11.minPoolSize = (short) -1;
        java.lang.String str16 = hikariConfig11.dataSourceClassName;
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties17;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig8);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.transactionIsolationName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig1.setisInitializationFailFast(true);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAcquireIncrement((int) (short) 10);
        hikariConfig1.dataSourceClassName = "HikariPool-121";
        int int15 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setmaxPoolSize(100);
        hikariConfig1.idleTimeout = (short) 1;
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setIdleTimeout((long) 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.maxPoolSize = 101;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.isJdbc4connectionTest = false;
        int int13 = hikariConfig1.minPoolSize;
        int int14 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-28";
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-28" + "'", str17, "HikariPool-28");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        int int16 = hikariConfig1.maxPoolSize;
        hikariConfig1.setisInitializationFailFast(false);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger14 = serializedObjectSupporter11.deserializeObjectLogger1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter11.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter11.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str16, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertNull(hikariDataSource20);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNull(hikariDataSource22);
        org.junit.Assert.assertNull(hikariDataSource23);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        long long6 = hikariConfig1.getIDLE_TIMEOUT();
        long long7 = hikariConfig1.getMaxLifetime();
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString8();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString4();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter7.deserializeObjectLogger1();
        java.lang.String str13 = serializedObjectSupporter7.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-33" + "'", str10, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str11, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(simpleLogger12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig14);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariConfig8);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        int int5 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        boolean boolean7 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-47");
        java.lang.Class<?> wildcardClass10 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig1.getPoolName();
        int int10 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-121" + "'", str9, "HikariPool-121");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        int int4 = hikariConfig0.minPoolSize;
        hikariConfig0.setpoolNumber(139);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter7.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource10();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter7.deserializeObjectHikariConfig2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString8();
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter7;
        hikariConfig0.transactionIsolationName = "HikariPool-2";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str10, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-33" + "'", str12, "HikariPool-33");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.maxLifetime = 140;
        int int13 = hikariConfig1.getAcquireIncrement();
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        hikariConfig1.poolName = "HikariPool-11";
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setpoolNumber(184);
        long long19 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-89");
        int int10 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = (byte) -1;
        long long4 = hikariConfig0.getMAX_LIFETIME();
        hikariConfig0.transactionIsolation = 74;
        hikariConfig0.setisRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.setRegisterMbeans(true);
        long long16 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setConnectionInitSql("HikariPool-13");
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setisJdbc4connectionTest(false);
        boolean boolean11 = hikariConfig1.isAutoCommit;
        long long12 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.maxLifetime = 139;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = hikariConfig1.serializedObjectSupporter;
        long long12 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.setpoolNumber(159);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.poolName = "HikariPool-19";
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetryDelay((long) (short) 10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int14 = hikariConfig1.getminPoolSize();
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.dataSourceClassName = "HikariPool-222";
        hikariConfig1.setpoolNumber(35);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.gettransactionIsolationName();
        hikariConfig11.minPoolSize = (short) -1;
        java.lang.String str16 = hikariConfig11.dataSourceClassName;
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties17;
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        int int20 = hikariConfig1.minPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.connectionTimeout;
        java.lang.String str2 = hikariConfig0.getCatalog();
        java.lang.String str3 = hikariConfig0.poolName;
        hikariConfig0.connectionTestQuery = "HikariPool-143";
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-37" + "'", str3, "HikariPool-37");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger14 = serializedObjectSupporter11.deserializeObjectLogger1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter11.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter11.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger14);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertNull(hikariConfig20);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        long long11 = hikariConfig1.getIDLE_TIMEOUT();
        long long12 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getAcquireRetries();
        int int9 = hikariConfig1.getAcquireRetries();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        long long11 = hikariConfig1.idleTimeout;
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig14.dataSource = dataSource15;
        hikariConfig14.connectionTimeout = 69;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        int int11 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-130";
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.lang.String str6 = hikariConfig5.getDataSourceClassName();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        hikariConfig1.leakDetectionThreshold = ' ';
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.setminPoolSize(0);
        hikariConfig1.idleTimeout = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig15.getConnectionCustomizer();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.dataSource = dataSource17;
        java.util.Properties properties19 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.copyState(hikariConfig15);
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionInitSql = "HikariPool-123";
        java.lang.String str24 = hikariConfig1.connectionTestQuery;
        boolean boolean25 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource3();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter7.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter7.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        java.lang.String str17 = serializedObjectSupporter7.deserializeObjectString8();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-33" + "'", str17, "HikariPool-33");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.setDataSourceClassName("HikariPool-110");
        hikariConfig1.maxLifetime = 3;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties24 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.leakDetectionThreshold = 110;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setpoolNumber((int) (byte) 100);
        long long5 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setLeakDetectionThreshold(140L);
        int int10 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-100" + "'", str6, "HikariPool-100");
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.leakDetectionThreshold = (short) 10;
        hikariConfig1.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig1.setisInitializationFailFast(false);
        boolean boolean10 = hikariConfig1.getisAutoCommit();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.acquireRetries = (short) 100;
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.settransactionIsolationName("HikariPool-59");
        hikariConfig1.setisAutoCommit(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        hikariConfig0.connectionInitSql = "HikariPool-33";
        hikariConfig0.isJdbc4connectionTest = false;
        long long8 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-33" + "'", str9, "HikariPool-33");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = (byte) -1;
        long long4 = hikariConfig0.getMAX_LIFETIME();
        hikariConfig0.transactionIsolation = 74;
        java.lang.String str7 = hikariConfig0.poolName;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        boolean boolean9 = hikariConfig0.getisInitializationFailFast();
        hikariConfig0.idleTimeout = 4;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-11" + "'", str7, "HikariPool-11");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        boolean boolean4 = hikariConfig1.getisRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        int int11 = hikariConfig1.getpoolNumber();
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-6");
        hikariConfig1.setTransactionIsolation("HikariPool-122");
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setisInitializationFailFast(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setCatalog("");
        hikariConfig1.setisInitializationFailFast(true);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.getCatalog();
        java.lang.String str14 = hikariConfig11.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig11.connectionInitSql;
        hikariConfig11.setUseInstrumentation(false);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig11.setDataSource(dataSource18);
        long long20 = hikariConfig11.idleTimeout;
        int int21 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.dataSourceClassName = "HikariPool-59";
        hikariConfig11.maxPoolSize = 0;
        hikariConfig11.setisAutoCommit(false);
        hikariConfig1.copyState(hikariConfig11);
        int int29 = hikariConfig1.getpoolNumber();
        javax.sql.DataSource dataSource30 = null;
        hikariConfig1.setDataSource(dataSource30);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 17 + "'", int29 == 17);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        hikariConfig0.connectionInitSql = "HikariPool-33";
        hikariConfig0.poolName = "HikariPool-47";
        hikariConfig0.setIdleTimeout(140L);
        java.lang.String str10 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.isInitializationFailFast = true;
        long long6 = hikariConfig3.getMAX_LIFETIME();
        hikariConfig3.setConnectionInitSql("HikariPool-189");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setCatalog("");
        hikariConfig1.dataSourceClassName = "HikariPool-271";
        hikariConfig1.transactionIsolation = 59;
        hikariConfig1.leakDetectionThreshold = 183;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        hikariConfig1.setisAutoCommit(false);
        hikariConfig1.settransactionIsolationName("HikariPool-102");
        int int16 = hikariConfig1.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        boolean boolean19 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.transactionIsolationName = "hi!";
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-17");
        hikariConfig1.connectionTestQuery = "HikariPool-145";
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        hikariConfig1.poolName = "HikariPool-11";
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(serializedObjectSupporter14);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean13 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.addDataSourceProperty("HikariPool-40", (java.lang.Object) "HikariPool-18");
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.connectionInitSql = "HikariPool-13";
        hikariConfig1.setMaxLifetime(97L);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-43");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-43 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.getCatalog();
        java.lang.String str14 = hikariConfig11.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setUseInstrumentation(false);
        int int18 = hikariConfig11.getTransactionIsolation();
        java.lang.String str19 = hikariConfig11.getConnectionTestQuery();
        hikariConfig1.copyState(hikariConfig11);
        javax.sql.DataSource dataSource21 = hikariConfig11.dataSource;
        hikariConfig11.setMinimumPoolSize(10);
        java.lang.String str24 = hikariConfig11.getConnectionTestQuery();
        javax.sql.DataSource dataSource25 = hikariConfig11.getDataSource();
        java.lang.String str26 = hikariConfig11.connectionTestQuery;
        hikariConfig11.setCatalog("HikariPool-36");
        boolean boolean29 = hikariConfig11.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        long long3 = hikariConfig1.idleTimeout;
        org.slf4j.Logger logger4 = hikariConfig1.getLOGGER();
        hikariConfig1.leakDetectionThreshold = 32L;
        boolean boolean7 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setmaxPoolSize(88);
        hikariConfig1.settransactionIsolationName("HikariPool-221");
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.transactionIsolationName = "HikariPool-152";
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        int int12 = hikariConfig1.getminPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        hikariConfig1.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getCatalog();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setminPoolSize(112);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.transactionIsolationName = "HikariPool-123";
        int int6 = hikariConfig1.getmaxPoolSize();
        boolean boolean7 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.maxPoolSize;
        java.lang.String str11 = hikariConfig9.getCatalog();
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig9);
        boolean boolean14 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.connectionTestQuery = "HikariPool-48";
        hikariConfig1.setPoolName("");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.minPoolSize = '#';
        boolean boolean13 = hikariConfig1.getisRegisterMbeans();
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        long long15 = hikariConfig1.idleTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.catalog = "HikariPool-102";
        hikariConfig1.setisInitializationFailFast(true);
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setisRegisterMbeans(true);
        boolean boolean19 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.transactionIsolation = 0;
        org.slf4j.Logger logger13 = hikariConfig1.getLOGGER();
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setisInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.getConnectionCustomizer();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.leakDetectionThreshold = 1L;
        int int7 = hikariConfig1.minPoolSize;
        long long8 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        long long11 = hikariConfig1.idleTimeout;
        hikariConfig1.acquireRetries = 29;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-62";
        int int18 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.dataSourceClassName = "HikariPool-12";
        hikariConfig1.setConnectionInitSql("HikariPool-256");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.settransactionIsolationName("HikariPool-230");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isAutoCommit;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) 62);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        long long10 = hikariConfig1.getIdleTimeout();
        int int11 = hikariConfig1.acquireRetries;
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        org.slf4j.Logger logger13 = hikariConfig1.getLOGGER();
        java.lang.String str14 = hikariConfig1.catalog;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig16.getConnectionCustomizer();
        boolean boolean18 = hikariConfig16.isRegisterMbeans();
        hikariConfig16.setDataSourceClassName("hi!");
        hikariConfig16.setDataSourceClassName("");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.maxPoolSize;
        java.lang.String str26 = hikariConfig24.getCatalog();
        java.lang.String str27 = hikariConfig24.getConnectionCustomizerClassName();
        java.lang.String str28 = hikariConfig24.getConnectionTestQuery();
        hikariConfig24.setUseInstrumentation(false);
        java.lang.String str31 = hikariConfig24.getDataSourceClassName();
        java.util.Properties properties32 = hikariConfig24.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig16.setDataSourceProperties(properties32);
        boolean boolean36 = hikariConfig16.isAutoCommit();
        javax.sql.DataSource dataSource37 = hikariConfig16.dataSource;
        hikariConfig16.setisInitializationFailFast(false);
        hikariConfig1.copyState(hikariConfig16);
        hikariConfig16.transactionIsolation = 234;
        hikariConfig16.setisRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(dataSource37);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45");
        hikariConfig1.setAcquireRetries((int) 'a');
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        int int8 = hikariConfig1.getminPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer9;
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-32" + "'", str11, "HikariPool-32");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig15.getConnectionCustomizer();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.dataSource = dataSource17;
        java.util.Properties properties19 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.copyState(hikariConfig15);
        boolean boolean21 = hikariConfig15.isInitializationFailFast();
        java.lang.String str22 = hikariConfig15.connectionInitSql;
        java.lang.String str23 = hikariConfig15.getDataSourceClassName();
        hikariConfig15.poolName = "HikariPool-103";
        long long26 = hikariConfig15.getMAX_LIFETIME();
        hikariConfig15.idleTimeout = 3;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        hikariConfig1.dataSourceProperties = properties6;
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionCustomizerClassName = "";
        long long11 = hikariConfig1.getMaxLifetime();
        org.slf4j.Logger logger12 = hikariConfig1.getLOGGER();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.maxPoolSize;
        java.lang.String str13 = hikariConfig11.gettransactionIsolationName();
        hikariConfig11.minPoolSize = (short) -1;
        java.lang.String str16 = hikariConfig11.dataSourceClassName;
        hikariConfig11.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig11.setMaximumPoolSize(0);
        hikariConfig1.copyState(hikariConfig11);
        org.slf4j.Logger logger22 = hikariConfig11.getLOGGER();
        hikariConfig11.setConnectionTimeout(140L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(logger22);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.maxPoolSize = (byte) 0;
        java.lang.String str8 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionTestQuery("HikariPool-73");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig7.getConnectionCustomizer();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.dataSource = dataSource9;
        boolean boolean11 = hikariConfig7.isInitializationFailFast;
        java.util.Properties properties12 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties12;
        int int14 = hikariConfig1.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.getConnectionCustomizer();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionTimeout = '4';
        hikariConfig1.setConnectionTestQuery("HikariPool-132");
        int int13 = hikariConfig1.getAcquireRetries();
        int int14 = hikariConfig1.getAcquireRetries();
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setLeakDetectionThreshold(10L);
        boolean boolean11 = hikariConfig1.getisAutoCommit();
        long long12 = hikariConfig1.getCONNECTION_TIMEOUT();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-66" + "'", str6, "HikariPool-66");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.idleTimeout = 100L;
        hikariConfig1.setCatalog("HikariPool-42");
        java.lang.String str18 = hikariConfig1.poolName;
        int int19 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMaximumPoolSize(339);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-68" + "'", str18, "HikariPool-68");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.idleTimeout;
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.leakDetectionThreshold = 82;
        hikariConfig1.setIdleTimeout((long) 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.getmaxPoolSize();
        int int11 = hikariConfig1.getAcquireRetries();
        java.lang.String str12 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.leakDetectionThreshold = (short) 10;
        boolean boolean15 = hikariConfig1.isAutoCommit;
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize(132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties2);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties2);
        int int6 = hikariConfig5.getMaximumPoolSize();
        hikariConfig5.maxLifetime = 250;
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        hikariConfig1.setAcquireRetryDelay((long) 100);
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.acquireRetries = 43;
        hikariConfig1.setMinimumPoolSize(250);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.catalog = "";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        hikariConfig11.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig11.getConnectionCustomizer();
        hikariConfig1.copyState(hikariConfig11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig11.connectionCustomizer;
        hikariConfig11.isRegisterMbeans = false;
        java.lang.String str20 = hikariConfig11.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        hikariConfig1.poolName = "HikariPool-140";
        hikariConfig1.catalog = "HikariPool-185";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.minPoolSize = 32;
        hikariConfig1.setAcquireRetries(40);
        hikariConfig1.maxLifetime = 92;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.acquireRetries;
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMinimumPoolSize(128);
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.settransactionIsolationName("HikariPool-230");
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean20 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        java.lang.String str8 = serializedObjectSupporter6.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.String str12 = serializedObjectSupporter6.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter6.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-32" + "'", str12, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.maxLifetime = 100;
        boolean boolean14 = hikariConfig1.getisAutoCommit();
        hikariConfig1.maxLifetime = 49;
        hikariConfig1.setTransactionIsolation("SELECT 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        long long7 = hikariConfig1.connectionTimeout;
        int int8 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.maxPoolSize;
        java.lang.String str15 = hikariConfig13.getCatalog();
        java.lang.String str16 = hikariConfig13.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.setUseInstrumentation(false);
        int int20 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setTransactionIsolation("hi!");
        hikariConfig1.addDataSourceProperty("HikariPool-110", (java.lang.Object) "hi!");
        org.slf4j.Logger logger24 = hikariConfig1.getLOGGER();
        int int25 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-33");
        hikariConfig1.connectionTestQuery = "HikariPool-139";
        int int30 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.settransactionIsolationName("HikariPool-18");
        hikariConfig1.connectionTimeout = (byte) 0;
        int int10 = hikariConfig1.getmaxPoolSize();
        long long11 = hikariConfig1.maxLifetime;
        long long12 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireIncrement(0);
        hikariConfig0.setMaximumPoolSize(288);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.catalog = "";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        hikariConfig11.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig11.getConnectionCustomizer();
        hikariConfig1.copyState(hikariConfig11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig11.connectionCustomizer;
        hikariConfig11.isRegisterMbeans = false;
        boolean boolean20 = hikariConfig11.isRegisterMbeans();
        boolean boolean21 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setisRegisterMbeans(true);
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.acquireRetries = (short) 100;
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        int int9 = hikariConfig1.getTransactionIsolation();
        long long10 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionInitSql("HikariPool-187");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.validate();
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.isAutoCommit = false;
        int int14 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-18" + "'", str11, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-240");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-240 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        org.slf4j.Logger logger5 = hikariConfig1.getLOGGER();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        long long10 = hikariConfig1.getMaxLifetime();
        int int11 = hikariConfig1.getminPoolSize();
        int int12 = hikariConfig1.getpoolNumber();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig14.getConnectionCustomizer();
        hikariConfig14.setDataSourceClassName("HikariPool-32");
        hikariConfig14.minPoolSize = 10;
        boolean boolean20 = hikariConfig14.isInitializationFailFast;
        boolean boolean21 = hikariConfig14.isInitializationFailFast;
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.util.Properties properties24 = hikariConfig23.dataSourceProperties;
        hikariConfig14.setDataSourceProperties(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.dataSourceProperties = properties24;
        java.util.Properties properties28 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getmaxPoolSize();
        hikariConfig29.connectionInitSql = "HikariPool-37";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setCatalog("HikariPool-189");
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        int int9 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.leakDetectionThreshold = 1L;
        hikariConfig1.setisRegisterMbeans(false);
        long long9 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.slf4j.Logger logger10 = hikariConfig1.getLOGGER();
        hikariConfig1.dataSourceClassName = "HikariPool-116";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertNotNull(logger10);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        java.lang.String str6 = hikariConfig1.connectionInitSql;
        long long7 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 183);
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter6.deserializeObjectLogger1();
        java.lang.String str13 = serializedObjectSupporter6.deserializeObjectString4();
        java.lang.String str14 = serializedObjectSupporter6.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(simpleLogger12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str13, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource15);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.setisRegisterMbeans(false);
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        java.lang.String str13 = hikariConfig1.gettransactionIsolationName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setpoolNumber(226);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-37" + "'", str6, "HikariPool-37");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        hikariConfig1.dataSourceProperties = properties6;
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-221";
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.maxLifetime = 1;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.maxPoolSize;
        java.lang.String str14 = hikariConfig12.getCatalog();
        java.lang.String str15 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str16 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setUseInstrumentation(false);
        java.lang.String str19 = hikariConfig12.getDataSourceClassName();
        java.util.Properties properties20 = hikariConfig12.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig1.setDataSourceProperties(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long26 = hikariConfig25.getMaxLifetime();
        hikariConfig25.connectionInitSql = "HikariPool-142";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.maxLifetime = 288;
        hikariConfig1.setIdleTimeout(0L);
        java.lang.String str8 = hikariConfig1.gettransactionIsolationName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setmaxPoolSize(100);
        hikariConfig1.idleTimeout = (short) 1;
        hikariConfig1.maxPoolSize = 0;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.setMaximumPoolSize(74);
        hikariConfig1.dataSourceClassName = "HikariPool-149";
        hikariConfig1.idleTimeout = 23;
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45");
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setmaxPoolSize(0);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        hikariConfig1.setminPoolSize(1);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-121";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        int int8 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionTimeout((long) 156);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setUseInstrumentation(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString7();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString6();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter7.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter7.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str9 = hikariConfig1.catalog;
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.connectionTestQuery = "HikariPool-30";
        hikariConfig1.setConnectionInitSql("HikariPool-59");
        hikariConfig1.setisInitializationFailFast(false);
        hikariConfig1.maxPoolSize = 376;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        java.lang.String str8 = serializedObjectSupporter6.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter6.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource15();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        java.lang.String str14 = serializedObjectSupporter6.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        org.slf4j.impl.SimpleLogger simpleLogger17 = serializedObjectSupporter6.deserializeObjectLogger1();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(simpleLogger17);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        long long7 = hikariConfig1.connectionTimeout;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig1.isAutoCommit;
        hikariConfig1.setAcquireRetries(211);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45");
        hikariConfig1.setInitializationFailFast(true);
        long long14 = hikariConfig1.getMAX_LIFETIME();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.acquireRetries = 0;
        boolean boolean18 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.poolName = "HikariPool-18";
        int int11 = hikariConfig1.getmaxPoolSize();
        boolean boolean12 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.getmaxPoolSize();
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetryDelay((long) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45");
        hikariConfig1.setAcquireRetries((int) 'a');
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.maxPoolSize = 88;
        hikariConfig1.validate();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-65");
        long long10 = hikariConfig1.getIdleTimeout();
        int int11 = hikariConfig1.getpoolNumber();
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 262 + "'", int11 == 262);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = 49;
        long long4 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean7 = hikariConfig0.isAutoCommit();
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.acquireRetries = 50;
        hikariConfig1.connectionTestQuery = "HikariPool-62";
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.leakDetectionThreshold = 1L;
        hikariConfig1.setisRegisterMbeans(false);
        java.lang.String str9 = hikariConfig1.poolName;
        long long10 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-265" + "'", str9, "HikariPool-265");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        long long7 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaximumPoolSize(311);
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-4";
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.poolName = "HikariPool-114";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.setConnectionTimeout(0L);
        long long6 = hikariConfig3.getConnectionTimeout();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2147483647L + "'", long6 == 2147483647L);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetries(49);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig7.getConnectionCustomizer();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.dataSource = dataSource9;
        boolean boolean11 = hikariConfig7.isInitializationFailFast;
        java.util.Properties properties12 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties12;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long15 = hikariConfig14.idleTimeout;
        hikariConfig14.setUseInstrumentation(false);
        hikariConfig14.setPoolName("HikariPool-45");
        hikariConfig14.setisAutoCommit(false);
        hikariConfig14.catalog = "HikariPool-338";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.dataSourceClassName = "HikariPool-48";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.dataSourceClassName = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.zaxxer.hikari.HikariConfig.poolNumber = 161;
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setmaxPoolSize(68);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaximumPoolSize(227);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.transactionIsolationName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig1.settransactionIsolationName("HikariPool-133");
        hikariConfig1.setCatalog("HikariPool-65");
        hikariConfig1.isInitializationFailFast = true;
        int int15 = hikariConfig1.minPoolSize;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setminPoolSize(60);
        boolean boolean11 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        hikariConfig1.catalog = "HikariPool-101";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionCustomizerClassName = "";
        java.lang.String str12 = hikariConfig1.catalog;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.minPoolSize = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.connectionInitSql;
        hikariConfig1.setLeakDetectionThreshold((long) 139);
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setpoolNumber((int) '4');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.zaxxer.hikari.HikariConfig.poolNumber = '#';
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getCONNECTION_TIMEOUT();
        long long11 = hikariConfig1.getConnectionTimeout();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-152");
        hikariConfig1.minPoolSize = 123;
        hikariConfig1.setDataSourceClassName("HikariPool-242");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-156");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-134");
        long long6 = hikariConfig1.getIDLE_TIMEOUT();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.minPoolSize = 32;
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.maxPoolSize;
        java.lang.String str19 = hikariConfig17.getCatalog();
        java.lang.String str20 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig17.getConnectionTestQuery();
        int int22 = hikariConfig17.getMaximumPoolSize();
        java.lang.String str23 = hikariConfig17.catalog;
        hikariConfig1.copyState(hikariConfig17);
        boolean boolean25 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str26 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaxLifetime((long) 205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setmaxPoolSize(3);
        boolean boolean13 = hikariConfig1.getisRegisterMbeans();
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = 2147483647L;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 140L + "'", long14 == 140L);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIdleTimeout((long) 158);
        java.lang.String str21 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-1");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-18" + "'", str21, "HikariPool-18");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTimeout = 1800000L;
        hikariConfig1.catalog = "HikariPool-62";
        hikariConfig1.setmaxPoolSize(113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.validate();
        hikariConfig1.maxLifetime = 17;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.setAcquireIncrement(111);
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(false);
        long long13 = hikariConfig1.leakDetectionThreshold;
        boolean boolean14 = hikariConfig1.getisInitializationFailFast();
        long long15 = hikariConfig1.getIdleTimeout();
        int int16 = hikariConfig1.getTransactionIsolation();
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        java.lang.String str18 = hikariConfig1.gettransactionIsolationName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.maxPoolSize;
        java.lang.String str16 = hikariConfig14.getCatalog();
        java.lang.String str17 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str21 = hikariConfig14.getDataSourceClassName();
        java.util.Properties properties22 = hikariConfig14.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties22;
        java.lang.String str24 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str25 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str26 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.dataSource = dataSource27;
        hikariConfig1.setPoolName("HikariPool-301");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.util.Properties properties14 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setDataSourceClassName("HikariPool-37");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.catalog = "HikariPool-103";
        hikariConfig1.setMaximumPoolSize(63);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.transactionIsolationName = "HikariPool-45";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setisRegisterMbeans(true);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionTimeout = 74;
        org.slf4j.Logger logger12 = hikariConfig1.getLOGGER();
        long long13 = hikariConfig1.getMaxLifetime();
        java.lang.String str14 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-15" + "'", str14, "HikariPool-15");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-33" + "'", str7, "HikariPool-33");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter2.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter2.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter2.deserializeObjectHikariConfig1();
        java.util.Properties properties6 = serializedObjectSupporter2.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig1.dataSourceProperties = properties6;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource7();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter9.deserializeObjectHikariConfig2();
        java.lang.String str16 = serializedObjectSupporter9.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter9.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter9;
        org.slf4j.Logger logger20 = hikariConfig1.getLOGGER();
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-32" + "'", str11, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-33" + "'", str16, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(logger20);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setLeakDetectionThreshold(10L);
        org.slf4j.Logger logger11 = hikariConfig1.getLOGGER();
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.setConnectionInitSql("HikariPool-266");
        boolean boolean17 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-19" + "'", str6, "HikariPool-19");
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setAcquireRetryDelay(100L);
        hikariConfig1.maxPoolSize = ' ';
        hikariConfig1.setisJdbc4connectionTest(true);
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-189");
        hikariConfig1.setMinimumPoolSize(23);
        int int22 = hikariConfig1.minPoolSize;
        long long23 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 23 + "'", int22 == 23);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig15.getConnectionCustomizer();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.dataSource = dataSource17;
        java.util.Properties properties19 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.copyState(hikariConfig15);
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.dataSource = dataSource22;
        boolean boolean24 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-58");
        int int14 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.setisRegisterMbeans(false);
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        hikariConfig1.setCatalog("HikariPool-218");
        hikariConfig1.setmaxPoolSize(12);
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-58");
        int int14 = hikariConfig1.getmaxPoolSize();
        int int15 = hikariConfig1.minPoolSize;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        int int17 = hikariConfig1.maxPoolSize;
        java.lang.String str18 = hikariConfig1.catalog;
        int int19 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTimeout = (byte) 0;
        hikariConfig1.setDataSourceClassName("HikariPool-39");
        hikariConfig1.connectionTestQuery = "HikariPool-211";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.zaxxer.hikari.HikariConfig.poolNumber = 232;
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        int int9 = hikariConfig1.getmaxPoolSize();
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        int int5 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        boolean boolean7 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setpoolNumber(10);
        hikariConfig1.validate();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        int int12 = hikariConfig1.getpoolNumber();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32" + "'", str13, "HikariPool-32");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        hikariConfig1.setmaxPoolSize((int) (byte) 100);
        java.lang.String str8 = hikariConfig1.catalog;
        int int9 = hikariConfig1.getmaxPoolSize();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        long long13 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setAcquireRetries(29);
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaxLifetime((long) 120);
        hikariConfig1.setisRegisterMbeans(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setDataSourceClassName("");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean12 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-12" + "'", str6, "HikariPool-12");
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setAcquireRetryDelay(100L);
        hikariConfig1.maxPoolSize = ' ';
        hikariConfig1.setisJdbc4connectionTest(true);
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-189");
        int int20 = hikariConfig1.maxPoolSize;
        int int21 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariConfig5);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        javax.sql.DataSource dataSource10 = hikariConfig1.dataSource;
        long long11 = hikariConfig1.getCONNECTION_TIMEOUT();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        org.slf4j.Logger logger5 = hikariConfig1.getLOGGER();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        long long10 = hikariConfig1.getMaxLifetime();
        boolean boolean11 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.maxPoolSize = 38;
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setMaximumPoolSize(0);
        int int11 = hikariConfig1.getmaxPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.getConnectionCustomizer();
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig15.setMaximumPoolSize(153);
        hikariConfig15.setMinimumPoolSize(146);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        int int11 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-130";
        hikariConfig1.setMaximumPoolSize(72);
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setisInitializationFailFast(false);
        hikariConfig1.setCatalog("HikariPool-36");
        long long21 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties2);
        boolean boolean5 = hikariConfig4.isAutoCommit();
        hikariConfig4.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        java.lang.String str6 = hikariConfig1.connectionInitSql;
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long9 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str9 = hikariConfig1.catalog;
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        int int12 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        hikariConfig1.setpoolNumber(152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        long long4 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionTestQuery = "HikariPool-132";
        int int13 = hikariConfig1.minPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13");
        hikariConfig1.setDataSourceClassName("HikariPool-227");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        java.lang.String str8 = serializedObjectSupporter6.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.getisJdbc4connectionTest();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("HikariPool-123");
        boolean boolean13 = hikariConfig1.getisAutoCommit();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-89");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        long long4 = hikariConfig1.getIdleTimeout();
        java.lang.String str5 = hikariConfig1.catalog;
        int int6 = hikariConfig1.getpoolNumber();
        hikariConfig1.setTransactionIsolation("HikariPool-19");
        hikariConfig1.setCatalog("HikariPool-339");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 163 + "'", int6 == 163);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        java.util.Properties properties9 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariConfig14);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionCustomizerClassName = "";
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.connectionCustomizerClassName = "hi!";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        hikariConfig1.setConnectionInitSql("HikariPool-68");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        hikariConfig1.setConnectionInitSql("HikariPool-33");
        int int7 = hikariConfig1.getMinimumPoolSize();
        long long8 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("HikariPool-48");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setisRegisterMbeans(false);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        int int12 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        long long15 = hikariConfig1.connectionTimeout;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-26");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolationName = "HikariPool-11";
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-128");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-11" + "'", str8, "HikariPool-11");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-33" + "'", str7, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        long long8 = hikariConfig1.getMaxLifetime();
        long long9 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.transactionIsolationName = "hi!";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        long long8 = hikariConfig1.maxLifetime;
        hikariConfig1.setTransactionIsolation("HikariPool-39");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        java.util.Properties properties9 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setisJdbc4connectionTest(false);
        boolean boolean11 = hikariConfig1.isAutoCommit;
        boolean boolean12 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.poolName = "HikariPool-58";
        hikariConfig1.transactionIsolationName = "HikariPool-87";
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        int int10 = hikariConfig1.getMinimumPoolSize();
        boolean boolean11 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionCustomizerClassName = "hi!";
        hikariConfig1.connectionInitSql = "HikariPool-82";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        long long7 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.isRegisterMbeans = true;
        long long10 = hikariConfig1.connectionTimeout;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig12.getConnectionCustomizer();
        hikariConfig12.setDataSourceClassName("HikariPool-32");
        hikariConfig12.minPoolSize = 10;
        boolean boolean18 = hikariConfig12.isInitializationFailFast;
        int int19 = hikariConfig12.getminPoolSize();
        java.util.Properties properties20 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties20;
        java.lang.String str22 = hikariConfig1.connectionInitSql;
        hikariConfig1.isJdbc4connectionTest = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.isAutoCommit = false;
        java.lang.String str11 = hikariConfig1.getPoolName();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-195" + "'", str11, "HikariPool-195");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.idleTimeout;
        hikariConfig1.setDataSourceClassName("HikariPool-65");
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setisRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setisRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        int int5 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        boolean boolean7 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-47");
        int int10 = hikariConfig1.acquireRetries;
        boolean boolean11 = hikariConfig1.getisJdbc4connectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.catalog = "HikariPool-16";
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        hikariConfig1.setMaxLifetime((long) 112);
        boolean boolean19 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        int int11 = hikariConfig1.getpoolNumber();
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 210 + "'", int11 == 210);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-209" + "'", str15, "HikariPool-209");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        int int12 = hikariConfig1.getpoolNumber();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.maxPoolSize;
        java.lang.String str17 = hikariConfig15.getCatalog();
        java.lang.String str18 = hikariConfig15.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        hikariConfig15.setUseInstrumentation(false);
        java.lang.String str22 = hikariConfig15.getDataSourceClassName();
        hikariConfig15.dataSourceClassName = "HikariPool-18";
        long long25 = hikariConfig15.getLeakDetectionThreshold();
        hikariConfig15.setTransactionIsolation("HikariPool-58");
        long long28 = hikariConfig15.idleTimeout;
        boolean boolean29 = hikariConfig15.isRegisterMbeans;
        hikariConfig1.addDataSourceProperty("HikariPool-135", (java.lang.Object) hikariConfig15);
        hikariConfig1.isRegisterMbeans = false;
        javax.sql.DataSource dataSource33 = null;
        hikariConfig1.setDataSource(dataSource33);
        java.lang.String str35 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-210" + "'", str35, "HikariPool-210");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.poolName = "HikariPool-19";
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetryDelay((long) (short) 10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setPoolName("HikariPool-183");
        long long19 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        int int5 = hikariConfig1.transactionIsolation;
        boolean boolean6 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setConnectionTestQuery("HikariPool-19");
        java.lang.String str15 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-49");
        hikariConfig1.setConnectionInitSql("HikariPool-152");
        long long23 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.acquireRetries = 37;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setAcquireRetries(29);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setAcquireRetries(202);
        boolean boolean16 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        long long10 = hikariConfig1.getIdleTimeout();
        int int11 = hikariConfig1.acquireRetries;
        long long12 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str9 = hikariConfig1.getCatalog();
        int int10 = hikariConfig1.minPoolSize;
        long long11 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertNull(hikariConfig14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariConfig17);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.acquireRetries = (short) 100;
        long long12 = hikariConfig1.getMaxLifetime();
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setLeakDetectionThreshold(140L);
        hikariConfig1.validate();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-223" + "'", str6, "HikariPool-223");
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        org.slf4j.Logger logger5 = hikariConfig1.getLOGGER();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        long long10 = hikariConfig1.getMaxLifetime();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter6.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getpoolNumber();
        boolean boolean2 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setPoolName("HikariPool-123");
        hikariConfig0.connectionTimeout = (-1L);
        boolean boolean7 = hikariConfig0.isAutoCommit();
        java.lang.String str8 = hikariConfig0.poolName;
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 231 + "'", int1 == 231);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-123" + "'", str8, "HikariPool-123");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str8 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-153");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionCustomizerClassName = "";
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        boolean boolean15 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setisAutoCommit(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig15.getConnectionCustomizer();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.dataSource = dataSource17;
        java.util.Properties properties19 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.copyState(hikariConfig15);
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "HikariPool-183";
        boolean boolean24 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.getPoolName();
        long long5 = hikariConfig1.getMaxLifetime();
        hikariConfig1.connectionTimeout = 200;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.maxLifetime = 234;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        int int5 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        boolean boolean7 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setpoolNumber(10);
        hikariConfig1.validate();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.maxPoolSize;
        java.lang.String str14 = hikariConfig12.getCatalog();
        java.lang.String str15 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str16 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setUseInstrumentation(false);
        java.lang.String str19 = hikariConfig12.getDataSourceClassName();
        java.util.Properties properties20 = hikariConfig12.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig1.setDataSourceProperties(properties20);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        org.slf4j.Logger logger4 = hikariConfig1.getLOGGER();
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.catalog = "HikariPool-132";
        int int8 = hikariConfig1.getmaxPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isAutoCommit();
        hikariConfig9.acquireRetries = (byte) -1;
        long long13 = hikariConfig9.getIDLE_TIMEOUT();
        hikariConfig9.connectionInitSql = "HikariPool-100";
        hikariConfig9.dataSourceClassName = "HikariPool-110";
        long long18 = hikariConfig9.leakDetectionThreshold;
        hikariConfig1.copyState(hikariConfig9);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.idleTimeout;
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.dataSourceClassName = "HikariPool-59";
        hikariConfig1.maxPoolSize = 0;
        java.lang.String str16 = hikariConfig1.catalog;
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = hikariConfig1.serializedObjectSupporter;
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        hikariConfig11.setDataSourceClassName("HikariPool-32");
        hikariConfig11.minPoolSize = 10;
        java.lang.String str17 = hikariConfig11.gettransactionIsolationName();
        hikariConfig11.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig21.getConnectionCustomizer();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig21.dataSource = dataSource23;
        boolean boolean25 = hikariConfig21.isInitializationFailFast;
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig27.getConnectionCustomizer();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig27.dataSource = dataSource29;
        boolean boolean31 = hikariConfig27.isInitializationFailFast;
        java.util.Properties properties32 = hikariConfig27.getDataSourceProperties();
        hikariConfig21.dataSourceProperties = properties32;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig11.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = hikariConfig39.getConnectionCustomizer();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig39.dataSource = dataSource41;
        hikariConfig39.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter45 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource46 = serializedObjectSupporter45.deserializeObjectHikariDataSource1();
        hikariConfig39.serializedObjectSupporter = serializedObjectSupporter45;
        hikariConfig1.copyState(hikariConfig39);
        java.lang.String str49 = hikariConfig1.dataSourceClassName;
        boolean boolean50 = hikariConfig1.getisAutoCommit();
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(iConnectionCustomizer40);
        org.junit.Assert.assertNull(hikariDataSource46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource10();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter8;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str11, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariConfig14);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setpoolNumber((int) (byte) 100);
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.settransactionIsolationName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter6;
        hikariConfig1.setConnectionCustomizerClassName("");
        int int13 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        long long7 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.isJdbc4connectionTest = false;
        long long13 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str14 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.maxPoolSize = (byte) -1;
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.idleTimeout = 15;
        hikariConfig1.connectionTimeout = 32L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.minPoolSize = 15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.catalog = "HikariPool-152";
        long long9 = hikariConfig1.getMAX_LIFETIME();
        long long10 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource11();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter8;
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter8.deserializeObjectHikariDataSource5();
        java.lang.String str15 = serializedObjectSupporter8.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter8.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-33" + "'", str15, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource16);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        java.lang.String str4 = hikariConfig1.getCatalog();
        boolean boolean5 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.settransactionIsolationName("HikariPool-59");
        hikariConfig1.setpoolNumber(140);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig8.getConnectionCustomizer();
        boolean boolean10 = hikariConfig8.isRegisterMbeans();
        hikariConfig8.setDataSourceClassName("hi!");
        java.lang.String str13 = hikariConfig8.poolName;
        hikariConfig8.setMaxLifetime((long) '4');
        hikariConfig8.setRegisterMbeans(false);
        hikariConfig8.isJdbc4connectionTest = true;
        hikariConfig8.connectionTestQuery = "HikariPool-17";
        hikariConfig6.copyState(hikariConfig8);
        int int23 = hikariConfig6.getpoolNumber();
        boolean boolean24 = hikariConfig6.getisJdbc4connectionTest();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-142" + "'", str13, "HikariPool-142");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 143 + "'", int23 == 143);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }
}
