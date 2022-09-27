import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.transactionIsolationName = "HikariPool-134";
        java.lang.String str7 = hikariConfig1.catalog;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.catalog = "HikariPool-37";
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.connectionTimeout = 10;
        hikariConfig1.setminPoolSize(103);
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setisJdbc4connectionTest(false);
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setDataSourceClassName("HikariPool-31");
        hikariConfig1.setAcquireRetries(151);
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.settransactionIsolationName("HikariPool-69");
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        java.lang.Class<?> wildcardClass24 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        java.lang.String str14 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        hikariConfig1.setisAutoCommit(false);
        java.lang.String str14 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-63" + "'", str14, "HikariPool-63");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.setisJdbc4connectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.dataSource = dataSource8;
        long long10 = hikariConfig1.maxLifetime;
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        java.lang.String str13 = hikariConfig1.gettransactionIsolationName();
        int int14 = hikariConfig1.getTransactionIsolation();
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setCatalog("HikariPool-2");
        hikariConfig5.setminPoolSize(61);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.poolName = "HikariPool-18";
        boolean boolean11 = hikariConfig1.getisRegisterMbeans();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariConfig1.serializedObjectSupporter;
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        int int5 = hikariConfig1.transactionIsolation;
        java.lang.String str6 = hikariConfig1.getPoolName();
        int int7 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.connectionTimeout = 0L;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig11.dataSource = dataSource14;
        boolean boolean16 = hikariConfig11.isAutoCommit;
        boolean boolean17 = hikariConfig11.isJdbc4connectionTest;
        long long18 = hikariConfig11.getIDLE_TIMEOUT();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig20.getConnectionCustomizer();
        hikariConfig20.setDataSourceClassName("HikariPool-32");
        hikariConfig20.minPoolSize = 10;
        boolean boolean26 = hikariConfig20.isInitializationFailFast;
        int int27 = hikariConfig20.getminPoolSize();
        java.util.Properties properties28 = hikariConfig20.getDataSourceProperties();
        hikariConfig11.dataSourceProperties = properties28;
        hikariConfig1.dataSourceProperties = properties28;
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = hikariConfig33.getConnectionCustomizer();
        javax.sql.DataSource dataSource35 = null;
        hikariConfig33.dataSource = dataSource35;
        hikariConfig33.transactionIsolationName = "HikariPool-134";
        boolean boolean39 = hikariConfig33.isJdbc4ConnectionTest();
        long long40 = hikariConfig33.getIDLE_TIMEOUT();
        long long41 = hikariConfig33.getCONNECTION_TIMEOUT();
        hikariConfig1.addDataSourceProperty("HikariPool-10", (java.lang.Object) long41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-68" + "'", str6, "HikariPool-68");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(iConnectionCustomizer34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 600000L + "'", long40 == 600000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        org.slf4j.Logger logger12 = hikariConfig1.getLOGGER();
        long long13 = hikariConfig1.getMAX_LIFETIME();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setMaximumPoolSize(0);
        int int11 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.setminPoolSize(0);
        int int14 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.poolName;
        hikariConfig1.setisInitializationFailFast(false);
        java.lang.String str17 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-74" + "'", str14, "HikariPool-74");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-74" + "'", str17, "HikariPool-74");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter22.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter22.deserializeObjectHikariConfig3();
        java.lang.String str25 = serializedObjectSupporter22.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = serializedObjectSupporter22.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter22.deserializeObjectHikariDataSource3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter22;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = serializedObjectSupporter22.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(hikariConfig23);
        org.junit.Assert.assertNull(hikariConfig24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-33" + "'", str25, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig26);
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertNull(hikariConfig29);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.maxPoolSize;
        java.lang.String str15 = hikariConfig13.getCatalog();
        java.lang.String str16 = hikariConfig13.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig13.connectionInitSql;
        hikariConfig13.setUseInstrumentation(false);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig13.setDataSource(dataSource20);
        long long22 = hikariConfig13.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter23.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter23.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        java.util.Properties properties29 = serializedObjectSupporter23.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig13.dataSourceProperties = properties29;
        hikariConfig1.setDataSourceProperties(properties29);
        java.util.Properties properties33 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariDataSource25);
        org.junit.Assert.assertNull(hikariDataSource26);
        org.junit.Assert.assertNull(hikariConfig27);
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMaxLifetime((long) (short) -1);
        hikariConfig1.setisJdbc4connectionTest(false);
        hikariConfig1.leakDetectionThreshold = 122;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        hikariConfig1.catalog = "HikariPool-111";
        hikariConfig1.setisInitializationFailFast(false);
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
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaximumPoolSize(10);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionTimeout = 389;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolationName = "HikariPool-11";
        hikariConfig1.settransactionIsolationName("HikariPool-120");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        boolean boolean29 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.maxPoolSize = 21;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        hikariConfig1.setminPoolSize(0);
        long long24 = hikariConfig1.getMaxLifetime();
        int int25 = hikariConfig1.acquireRetries;
        hikariConfig1.connectionInitSql = "HikariPool-81";
        boolean boolean28 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        hikariConfig11.setLeakDetectionThreshold((long) 62);
        java.lang.String str27 = hikariConfig11.transactionIsolationName;
        hikariConfig11.settransactionIsolationName("HikariPool-340");
        hikariConfig11.setpoolNumber(232);
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-63";
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        java.lang.String str17 = hikariConfig1.getPoolName();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.maxPoolSize;
        java.lang.String str21 = hikariConfig19.getCatalog();
        java.lang.String str22 = hikariConfig19.getConnectionCustomizerClassName();
        java.lang.String str23 = hikariConfig19.getConnectionTestQuery();
        hikariConfig19.setUseInstrumentation(false);
        int int26 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter29 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = serializedObjectSupporter29.deserializeObjectHikariConfig2();
        java.lang.String str31 = serializedObjectSupporter29.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger32 = serializedObjectSupporter29.deserializeObjectLogger1();
        hikariConfig19.serializedObjectSupporter = serializedObjectSupporter29;
        java.lang.String str34 = serializedObjectSupporter29.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource35 = serializedObjectSupporter29.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource36 = serializedObjectSupporter29.deserializeObjectHikariDataSource17();
        java.lang.String str37 = serializedObjectSupporter29.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource38 = serializedObjectSupporter29.deserializeObjectHikariDataSource2();
        java.lang.String str39 = serializedObjectSupporter29.deserializeObjectString2();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter29;
        int int41 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-233" + "'", str17, "HikariPool-233");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(hikariConfig30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "SELECT 1" + "'", str31, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str34, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource35);
        org.junit.Assert.assertNull(hikariDataSource36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-32" + "'", str37, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str39, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariConfig1.serializedObjectSupporter;
        long long7 = hikariConfig1.idleTimeout;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.setminPoolSize(166);
        hikariConfig1.settransactionIsolationName("HikariPool-109");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        org.slf4j.impl.SimpleLogger simpleLogger14 = serializedObjectSupporter6.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        org.slf4j.impl.SimpleLogger simpleLogger19 = serializedObjectSupporter6.deserializeObjectLogger1();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertNotNull(simpleLogger14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(simpleLogger19);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        hikariConfig1.acquireRetries = 40;
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        hikariConfig1.dataSourceProperties = properties15;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        java.lang.String str13 = serializedObjectSupporter6.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter6.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNull(hikariConfig17);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig1.getPoolName();
        long long8 = hikariConfig1.maxLifetime;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-241" + "'", str7, "HikariPool-241");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        hikariConfig1.setminPoolSize(15);
        hikariConfig1.setMaximumPoolSize(134);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        hikariConfig1.isJdbc4connectionTest = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.getConnectionCustomizer();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        long long14 = hikariConfig1.idleTimeout;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.catalog = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        java.lang.String str12 = hikariConfig1.getPoolName();
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-248" + "'", str12, "HikariPool-248");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMinimumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-20");
        hikariConfig1.setminPoolSize(115);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str9 = hikariConfig1.catalog;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        boolean boolean13 = hikariConfig11.isRegisterMbeans();
        hikariConfig11.setDataSourceClassName("hi!");
        hikariConfig11.setDataSourceClassName("");
        hikariConfig11.setConnectionTimeout((long) 140);
        hikariConfig11.connectionInitSql = "HikariPool-110";
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.dataSourceProperties = properties22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        hikariConfig0.connectionInitSql = "HikariPool-33";
        hikariConfig0.setAcquireRetryDelay((long) 3);
        long long8 = hikariConfig0.getMaxLifetime();
        long long9 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        org.slf4j.Logger logger5 = hikariConfig1.getLOGGER();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        long long10 = hikariConfig1.getMAX_LIFETIME();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.connectionInitSql;
        hikariConfig1.setLeakDetectionThreshold((long) 139);
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
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
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter16.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter16.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter16.deserializeObjectHikariDataSource5();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter16;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter16.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter16.deserializeObjectHikariConfig3();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNull(hikariConfig22);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.dataSource = dataSource8;
        long long10 = hikariConfig1.maxLifetime;
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        java.lang.String str13 = hikariConfig1.gettransactionIsolationName();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        int int27 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource28 = hikariConfig1.dataSource;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.maxPoolSize;
        java.lang.String str32 = hikariConfig30.gettransactionIsolationName();
        hikariConfig30.minPoolSize = (short) -1;
        java.lang.String str35 = hikariConfig30.dataSourceClassName;
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.maxPoolSize;
        java.lang.String str39 = hikariConfig37.getCatalog();
        java.lang.String str40 = hikariConfig37.getConnectionCustomizerClassName();
        java.lang.String str41 = hikariConfig37.getConnectionTestQuery();
        hikariConfig37.setUseInstrumentation(false);
        java.lang.String str44 = hikariConfig37.getDataSourceClassName();
        java.util.Properties properties45 = hikariConfig37.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig30.dataSourceProperties = properties45;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties45);
        java.util.Properties properties49 = hikariConfig48.getDataSourceProperties();
        java.lang.String str50 = hikariConfig48.dataSourceClassName;
        hikariConfig1.copyState(hikariConfig48);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter52 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig53 = serializedObjectSupporter52.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource54 = serializedObjectSupporter52.deserializeObjectHikariDataSource5();
        java.util.Properties properties55 = serializedObjectSupporter52.deserializeObjectProperties1();
        hikariConfig1.setDataSourceProperties(properties55);
        hikariConfig1.maxPoolSize = 237;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(hikariConfig53);
        org.junit.Assert.assertNull(hikariDataSource54);
        org.junit.Assert.assertNotNull(properties55);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.leakDetectionThreshold = 159;
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        long long14 = hikariConfig1.maxLifetime;
        hikariConfig1.setisRegisterMbeans(true);
        hikariConfig1.catalog = "HikariPool-122";
        hikariConfig1.setisAutoCommit(true);
        boolean boolean21 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        hikariConfig1.setmaxPoolSize((-1));
        hikariConfig1.poolName = "HikariPool-74";
        hikariConfig1.transactionIsolationName = "HikariPool-189";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
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
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.maxPoolSize = 232;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        java.lang.String str14 = serializedObjectSupporter6.deserializeObjectString2();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        java.lang.String str16 = serializedObjectSupporter6.deserializeObjectString3();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-6" + "'", str16, "HikariPool-6");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
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
        hikariConfig1.setIdleTimeout((long) 6);
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        hikariConfig1.acquireRetries = 151;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        java.lang.String str7 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource10 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-107";
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
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
        boolean boolean14 = hikariConfig13.isRegisterMbeans();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        boolean boolean16 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        int int4 = hikariConfig0.minPoolSize;
        hikariConfig0.setpoolNumber(139);
        long long7 = hikariConfig0.getIDLE_TIMEOUT();
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.connectionTimeout = 279;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        long long10 = hikariConfig1.getMaxLifetime();
        hikariConfig1.dataSourceClassName = "HikariPool-232";
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.maxPoolSize;
        java.lang.String str16 = hikariConfig14.getCatalog();
        java.lang.String str17 = hikariConfig14.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setUseInstrumentation(false);
        int int21 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter24 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter24.deserializeObjectHikariConfig2();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger27 = serializedObjectSupporter24.deserializeObjectLogger1();
        hikariConfig14.serializedObjectSupporter = serializedObjectSupporter24;
        java.lang.String str29 = serializedObjectSupporter24.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter24.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter24.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter24.deserializeObjectHikariDataSource9();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter24;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(hikariConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "SELECT 1" + "'", str26, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str29, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource30);
        org.junit.Assert.assertNull(hikariDataSource31);
        org.junit.Assert.assertNull(hikariDataSource32);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-20";
        long long6 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.setCatalog("HikariPool-6");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariConfig3.serializedObjectSupporter;
        hikariConfig3.setAcquireRetryDelay((long) 1);
        int int9 = hikariConfig3.transactionIsolation;
        hikariConfig3.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean5 = hikariConfig1.isRegisterMbeans;
        boolean boolean6 = hikariConfig1.getisRegisterMbeans();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        int int8 = hikariConfig1.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer9;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        java.lang.String str18 = hikariConfig1.transactionIsolationName;
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        int int11 = hikariConfig1.getmaxPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
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
        hikariConfig1.setConnectionInitSql("HikariPool-162");
        hikariConfig1.setCatalog("HikariPool-177");
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        long long20 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        hikariConfig1.setmaxPoolSize((-1));
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(145);
        hikariConfig1.connectionTestQuery = "HikariPool-137";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString2();
        java.lang.String str25 = serializedObjectSupporter23.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter23.deserializeObjectHikariDataSource7();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        hikariConfig1.addDataSourceProperty("HikariPool-217", (java.lang.Object) serializedObjectSupporter23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str24, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-32" + "'", str25, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SELECT 1" + "'", str27, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig28);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getConnectionTestQuery();
        hikariConfig10.setAcquireRetries(36);
        hikariConfig10.setInitializationFailFast(false);
        long long16 = hikariConfig10.getIDLE_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        java.lang.String str11 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-158" + "'", str11, "HikariPool-158");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        hikariConfig1.setAcquireIncrement(0);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter30 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter30.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter30.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = serializedObjectSupporter30.deserializeObjectHikariConfig1();
        java.util.Properties properties34 = serializedObjectSupporter30.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isAutoCommit();
        long long37 = hikariConfig35.getConnectionTimeout();
        hikariConfig1.copyState(hikariConfig35);
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
        org.junit.Assert.assertNull(hikariDataSource31);
        org.junit.Assert.assertNull(hikariDataSource32);
        org.junit.Assert.assertNull(hikariConfig33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setRegisterMbeans(true);
        int int16 = hikariConfig1.transactionIsolation;
        hikariConfig1.maxPoolSize = 142;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        long long7 = hikariConfig1.connectionTimeout;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.getConnectionCustomizerClassName();
        hikariConfig9.maxPoolSize = 181;
        hikariConfig9.setJdbc4ConnectionTest(true);
        org.slf4j.Logger logger15 = hikariConfig9.getLOGGER();
        hikariConfig9.connectionInitSql = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(logger15);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.minPoolSize = 0;
        hikariConfig1.setAcquireRetries(88);
        long long18 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        int int22 = hikariConfig1.getAcquireRetries();
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-166" + "'", str13, "HikariPool-166");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 88 + "'", int22 == 88);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        hikariConfig25.maxPoolSize = 0;
        long long29 = hikariConfig25.getConnectionTimeout();
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setAcquireRetries(0);
        java.util.Properties properties7 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.leakDetectionThreshold = (short) 10;
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setConnectionTimeout((long) 205);
        int int14 = hikariConfig1.getminPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        java.lang.String str16 = hikariConfig1.poolName;
        hikariConfig1.setisRegisterMbeans(false);
        int int19 = hikariConfig1.getmaxPoolSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-175" + "'", str16, "HikariPool-175");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        java.lang.String str14 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-30";
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-54" + "'", str14, "HikariPool-54");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariConfig5);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
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
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties43);
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
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionTestQuery = "HikariPool-17";
        java.lang.String str15 = hikariConfig1.gettransactionIsolationName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-183" + "'", str6, "HikariPool-183");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
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
        org.junit.Assert.assertNull(hikariConfig14);
        org.junit.Assert.assertNull(hikariDataSource15);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.idleTimeout = 147;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        boolean boolean16 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig20.getConnectionCustomizer();
        hikariConfig20.setDataSourceClassName("HikariPool-32");
        hikariConfig20.minPoolSize = 10;
        java.lang.String str26 = hikariConfig20.gettransactionIsolationName();
        hikariConfig20.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig30.getConnectionCustomizer();
        javax.sql.DataSource dataSource32 = null;
        hikariConfig30.dataSource = dataSource32;
        boolean boolean34 = hikariConfig30.isInitializationFailFast;
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer37 = hikariConfig36.getConnectionCustomizer();
        javax.sql.DataSource dataSource38 = null;
        hikariConfig36.dataSource = dataSource38;
        boolean boolean40 = hikariConfig36.isInitializationFailFast;
        java.util.Properties properties41 = hikariConfig36.getDataSourceProperties();
        hikariConfig30.dataSourceProperties = properties41;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig20.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties41);
        int int46 = hikariConfig45.getMinimumPoolSize();
        java.util.Properties properties47 = hikariConfig45.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNotNull(simpleLogger10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter12.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter12.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter12.deserializeObjectHikariDataSource6();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter12.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter12.deserializeObjectHikariConfig2();
        java.lang.String str20 = serializedObjectSupporter12.deserializeObjectString4();
        java.util.Properties properties21 = serializedObjectSupporter12.deserializeObjectProperties1();
        hikariConfig1.setDataSourceProperties(properties21);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-6" + "'", str17, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str20, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getAcquireRetries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setisAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.catalog = "HikariPool-19";
        boolean boolean11 = hikariConfig1.getisAutoCommit();
        long long12 = hikariConfig1.maxLifetime;
        hikariConfig1.setisInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        long long7 = hikariConfig1.connectionTimeout;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setisJdbc4connectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) 8);
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-194" + "'", str11, "HikariPool-194");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        hikariConfig1.setisAutoCommit(false);
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-178";
        hikariConfig1.setMinimumPoolSize(146);
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-65" + "'", str16, "HikariPool-65");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        long long18 = hikariConfig14.getConnectionTimeout();
        hikariConfig14.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        hikariConfig11.setPoolName("HikariPool-62");
        hikariConfig11.setpoolNumber(134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setmaxPoolSize(88);
        int int15 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        hikariConfig1.setCatalog("HikariPool-205");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setConnectionTimeout(100L);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.maxPoolSize;
        java.lang.String str20 = hikariConfig18.getCatalog();
        java.lang.String str21 = hikariConfig18.getConnectionCustomizerClassName();
        java.lang.String str22 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setUseInstrumentation(false);
        int int25 = hikariConfig18.getTransactionIsolation();
        java.lang.String str26 = hikariConfig18.getConnectionTestQuery();
        boolean boolean27 = hikariConfig18.getisRegisterMbeans();
        java.lang.String str28 = hikariConfig18.transactionIsolationName;
        java.lang.String str29 = hikariConfig18.gettransactionIsolationName();
        hikariConfig18.settransactionIsolationName("HikariPool-15");
        hikariConfig1.copyState(hikariConfig18);
        boolean boolean33 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setPoolName("HikariPool-10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireIncrement(35);
        hikariConfig1.isAutoCommit = true;
        int int17 = hikariConfig1.getMinimumPoolSize();
        long long18 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.slf4j.Logger logger19 = hikariConfig1.getLOGGER();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(logger19);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setisAutoCommit(false);
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.acquireRetries = 62;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        int int15 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter12.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter12.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter12.deserializeObjectHikariDataSource6();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter12.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter12.deserializeObjectHikariConfig2();
        java.lang.String str20 = serializedObjectSupporter12.deserializeObjectString4();
        java.util.Properties properties21 = serializedObjectSupporter12.deserializeObjectProperties1();
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.isAutoCommit = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString2();
        java.lang.String str27 = serializedObjectSupporter25.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter25.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter25.deserializeObjectHikariDataSource6();
        java.lang.String str30 = serializedObjectSupporter25.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter25.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = serializedObjectSupporter25.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = serializedObjectSupporter25.deserializeObjectHikariConfig2();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter25;
        java.lang.String str35 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-6" + "'", str17, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str20, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str26, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-32" + "'", str27, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource28);
        org.junit.Assert.assertNull(hikariDataSource29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-6" + "'", str30, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource31);
        org.junit.Assert.assertNull(hikariConfig32);
        org.junit.Assert.assertNull(hikariConfig33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.maxLifetime = 1;
        hikariConfig1.transactionIsolationName = "HikariPool-76";
        java.lang.String str13 = hikariConfig1.gettransactionIsolationName();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.idleTimeout = 92;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-76" + "'", str13, "HikariPool-76");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        int int17 = hikariConfig1.transactionIsolation;
        hikariConfig1.setCatalog("HikariPool-343");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
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
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean15 = hikariConfig1.getisAutoCommit();
        hikariConfig1.leakDetectionThreshold = (short) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-374");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-374 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = hikariDataSource5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
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
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        hikariConfig1.setAcquireIncrement(29);
        int int17 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        int int8 = hikariConfig1.getminPoolSize();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getMAX_LIFETIME();
        long long12 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean17 = hikariConfig16.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        hikariConfig1.dataSourceProperties = properties6;
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        hikariConfig1.maxPoolSize = 143;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        int int9 = hikariConfig1.getmaxPoolSize();
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.maxLifetime = 339;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.dataSource = dataSource8;
        long long10 = hikariConfig1.maxLifetime;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig25.getConnectionCustomizer();
        hikariConfig25.setDataSourceClassName("HikariPool-32");
        hikariConfig25.minPoolSize = 10;
        boolean boolean31 = hikariConfig25.isInitializationFailFast;
        boolean boolean32 = hikariConfig25.isInitializationFailFast;
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        java.util.Properties properties35 = hikariConfig34.dataSourceProperties;
        hikariConfig25.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig11.setDataSourceProperties(properties35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-159" + "'", str16, "HikariPool-159");
        org.junit.Assert.assertNull(iConnectionCustomizer26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
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
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setminPoolSize(0);
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        boolean boolean13 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-165" + "'", str7, "HikariPool-165");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.transactionIsolation = 158;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setisAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
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
        long long14 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-127";
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig11.connectionCustomizer;
        hikariConfig11.maxPoolSize = 236;
        hikariConfig11.setAcquireRetryDelay((long) 181);
        java.lang.String str26 = hikariConfig11.getConnectionInitSql();
        hikariConfig11.transactionIsolationName = "HikariPool-177";
        hikariConfig11.setpoolNumber(7);
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
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
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
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        int int7 = hikariConfig1.getAcquireIncrement();
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        java.lang.String str14 = serializedObjectSupporter7.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter7.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter7.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig5);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        int int13 = hikariConfig1.maxPoolSize;
        hikariConfig1.setmaxPoolSize(134);
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.idleTimeout = 211;
        int int19 = hikariConfig1.getmaxPoolSize();
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 134 + "'", int19 == 134);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-16";
        java.lang.String str17 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str8 = hikariConfig1.gettransactionIsolationName();
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
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
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.minPoolSize = 0;
        hikariConfig1.setAcquireRetries(88);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-253");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-13" + "'", str13, "HikariPool-13");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        boolean boolean13 = hikariConfig1.isAutoCommit();
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.idleTimeout = 139;
        hikariConfig1.setPoolName("HikariPool-98");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        hikariConfig1.setisRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig25.getConnectionCustomizer();
        hikariConfig25.setDataSourceClassName("HikariPool-32");
        hikariConfig25.catalog = "HikariPool-18";
        hikariConfig25.setMaximumPoolSize(100);
        hikariConfig25.setisAutoCommit(true);
        hikariConfig25.setUseInstrumentation(false);
        boolean boolean37 = hikariConfig25.getisInitializationFailFast();
        hikariConfig1.copyState(hikariConfig25);
        java.lang.String str39 = hikariConfig25.getConnectionTestQuery();
        int int40 = hikariConfig25.maxPoolSize;
        hikariConfig25.setUseInstrumentation(true);
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
        org.junit.Assert.assertNull(iConnectionCustomizer26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getMAX_LIFETIME();
        int int12 = hikariConfig10.getMaximumPoolSize();
        boolean boolean13 = hikariConfig10.isInitializationFailFast;
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.setisJdbc4connectionTest(true);
        hikariConfig10.poolName = "HikariPool-136";
        java.lang.String str20 = hikariConfig10.connectionCustomizerClassName;
        java.lang.String str21 = hikariConfig10.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-136" + "'", str21, "HikariPool-136");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
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
        int int49 = hikariConfig1.transactionIsolation;
        hikariConfig1.isRegisterMbeans = false;
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter22.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter22.deserializeObjectHikariConfig3();
        java.lang.String str25 = serializedObjectSupporter22.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = serializedObjectSupporter22.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter22.deserializeObjectHikariDataSource3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter22;
        java.lang.String str29 = serializedObjectSupporter22.deserializeObjectString2();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(hikariConfig23);
        org.junit.Assert.assertNull(hikariConfig24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-33" + "'", str25, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig26);
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str29, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
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
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.idleTimeout = 58;
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.connectionTestQuery = "HikariPool-79";
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        int int18 = hikariConfig1.getpoolNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setDataSourceClassName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig0.acquireRetries = 36;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-84");
        hikariConfig0.connectionTimeout = 139;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        long long11 = hikariConfig1.idleTimeout;
        long long12 = hikariConfig1.getMaxLifetime();
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-301");
        hikariConfig1.setisJdbc4connectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAcquireRetryDelay((long) 99);
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setRegisterMbeans(true);
        int int9 = hikariConfig1.getAcquireRetries();
        int int10 = hikariConfig1.getpoolNumber();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
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
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertNull(hikariConfig5);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig14.getConnectionCustomizer();
        hikariConfig14.setDataSourceClassName("HikariPool-32");
        hikariConfig14.catalog = "HikariPool-18";
        hikariConfig14.setMaximumPoolSize(100);
        hikariConfig14.setisAutoCommit(true);
        hikariConfig14.setConnectionInitSql("HikariPool-13");
        boolean boolean26 = hikariConfig14.isRegisterMbeans();
        hikariConfig14.setisAutoCommit(true);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.maxPoolSize;
        java.lang.String str32 = hikariConfig30.gettransactionIsolationName();
        hikariConfig30.minPoolSize = (short) -1;
        java.lang.String str35 = hikariConfig30.dataSourceClassName;
        java.util.Properties properties36 = hikariConfig30.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig37.setConnectionCustomizerClassName("HikariPool-32");
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        int int44 = hikariConfig43.maxPoolSize;
        java.lang.String str45 = hikariConfig43.getCatalog();
        java.lang.String str46 = hikariConfig43.getConnectionCustomizerClassName();
        java.lang.String str47 = hikariConfig43.getConnectionTestQuery();
        hikariConfig43.setUseInstrumentation(false);
        int int50 = hikariConfig43.getAcquireRetries();
        int int51 = hikariConfig43.getAcquireRetries();
        boolean boolean52 = hikariConfig43.isJdbc4ConnectionTest();
        long long53 = hikariConfig43.idleTimeout;
        java.lang.String str54 = hikariConfig43.connectionTestQuery;
        java.util.Properties properties55 = hikariConfig43.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig37.dataSourceProperties = properties55;
        hikariConfig14.dataSourceProperties = properties55;
        hikariConfig1.setDataSourceProperties(properties55);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter61 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str62 = serializedObjectSupporter61.deserializeObjectString2();
        java.lang.String str63 = serializedObjectSupporter61.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource64 = serializedObjectSupporter61.deserializeObjectHikariDataSource1();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariDataSource64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 600000L + "'", long53 == 600000L);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str62, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "HikariPool-32" + "'", str63, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource64);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.maxPoolSize = 40;
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter8.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter8.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertNull(hikariDataSource16);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        java.lang.String str8 = hikariConfig1.poolName;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        int int10 = hikariConfig1.transactionIsolation;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaximumPoolSize(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-26" + "'", str8, "HikariPool-26");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig20.getConnectionCustomizer();
        hikariConfig20.setDataSourceClassName("HikariPool-32");
        hikariConfig20.catalog = "HikariPool-18";
        hikariConfig20.setMaximumPoolSize(100);
        boolean boolean28 = hikariConfig20.isInitializationFailFast;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter29 = hikariConfig20.serializedObjectSupporter;
        hikariConfig20.setInitializationFailFast(true);
        hikariConfig20.maxPoolSize = 74;
        boolean boolean34 = hikariConfig20.getisRegisterMbeans();
        hikariConfig20.settransactionIsolationName("HikariPool-18");
        hikariConfig1.copyState(hikariConfig20);
        hikariConfig1.setAcquireIncrement(125);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
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
        hikariConfig1.connectionTimeout = 134;
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
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        int int7 = hikariConfig1.maxPoolSize;
        long long8 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.setConnectionTestQuery("HikariPool-122");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.setMaximumPoolSize(84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setisRegisterMbeans(true);
        hikariConfig1.maxPoolSize = 57;
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
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.zaxxer.hikari.HikariConfig.poolNumber = 169;
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        hikariConfig1.catalog = "";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        hikariConfig1.leakDetectionThreshold = ' ';
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        java.lang.String str14 = serializedObjectSupporter6.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource15);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
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
        java.util.Properties properties28 = hikariConfig26.dataSourceProperties;
        hikariConfig26.connectionCustomizerClassName = "HikariPool-370";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
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
        hikariConfig1.validate();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.setisAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
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
        int int24 = hikariConfig1.acquireRetries;
        boolean boolean25 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-33" + "'", str7, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        java.lang.String str7 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        long long10 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        long long4 = hikariConfig1.getIdleTimeout();
        java.lang.String str5 = hikariConfig1.catalog;
        int int6 = hikariConfig1.getpoolNumber();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIdleTimeout((long) 227);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 182 + "'", int6 == 182);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45");
        hikariConfig1.setInitializationFailFast(true);
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
        com.zaxxer.hikari.HikariConfig hikariConfig34 = serializedObjectSupporter26.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = serializedObjectSupporter26.deserializeObjectHikariConfig3();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-150", (java.lang.Object) hikariConfig35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
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
        org.junit.Assert.assertNull(hikariConfig34);
        org.junit.Assert.assertNull(hikariConfig35);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter2.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter2.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter2.deserializeObjectHikariConfig1();
        java.util.Properties properties6 = serializedObjectSupporter2.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig1.dataSourceProperties = properties6;
        hikariConfig1.setAcquireRetryDelay((long) '4');
        java.lang.String str11 = hikariConfig1.catalog;
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        long long9 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.leakDetectionThreshold = 167;
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMinimumPoolSize(66);
        hikariConfig1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        java.lang.String str11 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setLeakDetectionThreshold((long) 77);
        hikariConfig1.setLeakDetectionThreshold((-1L));
        hikariConfig1.setMaximumPoolSize(73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        hikariConfig27.setAutoCommit(false);
        long long30 = hikariConfig27.getAcquireRetryDelay();
        javax.sql.DataSource dataSource31 = null;
        hikariConfig27.setDataSource(dataSource31);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        long long12 = hikariConfig1.idleTimeout;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        hikariConfig1.poolName = "TRANSACTION_REPEATABLE_READ";
        hikariConfig1.dataSourceClassName = "HikariPool-69";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolationName = "HikariPool-11";
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        int int10 = hikariConfig1.getAcquireIncrement();
        boolean boolean11 = hikariConfig1.getisAutoCommit();
        boolean boolean12 = hikariConfig1.getisAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.poolName = "HikariPool-19";
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetryDelay((long) (short) 10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean14 = hikariConfig1.getisJdbc4connectionTest();
        java.lang.String str15 = hikariConfig1.gettransactionIsolationName();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.maxPoolSize;
        java.lang.String str19 = hikariConfig17.getCatalog();
        java.lang.String str20 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig17.getConnectionTestQuery();
        hikariConfig17.setUseInstrumentation(false);
        int int24 = hikariConfig17.getAcquireRetries();
        int int25 = hikariConfig17.getAcquireRetries();
        boolean boolean26 = hikariConfig17.isJdbc4ConnectionTest();
        long long27 = hikariConfig17.idleTimeout;
        java.lang.String str28 = hikariConfig17.connectionTestQuery;
        hikariConfig1.copyState(hikariConfig17);
        long long30 = hikariConfig17.connectionTimeout;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5000L + "'", long30 == 5000L);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.settransactionIsolationName("HikariPool-65");
        int int9 = hikariConfig1.getmaxPoolSize();
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter7.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = hikariConfig14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariConfig14);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
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
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        java.lang.String str13 = hikariConfig1.poolName;
        int int14 = hikariConfig1.getminPoolSize();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig16.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        int int21 = hikariConfig16.getMaximumPoolSize();
        java.util.Properties properties22 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties22;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 206 + "'", int11 == 206);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-205" + "'", str13, "HikariPool-205");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.poolName = "HikariPool-19";
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetryDelay((long) (short) 10);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionInitSql = "HikariPool-178";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setisJdbc4connectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
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
        java.lang.String str11 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setmaxPoolSize(181);
        long long14 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
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
        hikariConfig1.transactionIsolationName = "HikariPool-83";
        int int15 = hikariConfig1.minPoolSize;
        hikariConfig1.setMinimumPoolSize(376);
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
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
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig1.setisRegisterMbeans(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        hikariConfig1.setmaxPoolSize(134);
        boolean boolean13 = hikariConfig1.getisJdbc4connectionTest();
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-217" + "'", str10, "HikariPool-217");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
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
        hikariConfig1.setisInitializationFailFast(false);
        boolean boolean26 = hikariConfig1.isRegisterMbeans;
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.acquireRetries = (short) 100;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
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
        boolean boolean22 = hikariConfig11.isAutoCommit();
        java.lang.String str23 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setUseInstrumentation(false);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
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
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.settransactionIsolationName("HikariPool-132");
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
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
        hikariConfig1.connectionTimeout = (byte) 100;
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig15.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
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
        java.lang.String str14 = hikariConfig13.connectionCustomizerClassName;
        long long15 = hikariConfig13.getIDLE_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        hikariConfig26.setAcquireRetries(39);
        boolean boolean30 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(false);
        hikariConfig26.setIdleTimeout((long) 291);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        hikariConfig1.setDataSourceClassName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setRegisterMbeans(true);
        javax.sql.DataSource dataSource21 = hikariConfig1.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        org.slf4j.Logger logger5 = hikariConfig1.getLOGGER();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.transactionIsolationName = "HikariPool-102";
        long long10 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-122");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig16.getConnectionCustomizer();
        hikariConfig16.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig16.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = hikariConfig16.serializedObjectSupporter;
        java.lang.String str22 = hikariConfig16.connectionCustomizerClassName;
        hikariConfig1.copyState(hikariConfig16);
        boolean boolean24 = hikariConfig1.getisAutoCommit();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setAcquireRetries(76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMinimumPoolSize();
        int int7 = hikariConfig1.getpoolNumber();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 238 + "'", int7 == 238);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        int int4 = hikariConfig0.minPoolSize;
        hikariConfig0.setpoolNumber(139);
        boolean boolean7 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setMaximumPoolSize(0);
        int int11 = hikariConfig1.getmaxPoolSize();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig13.getConnectionCustomizer();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig13.dataSource = dataSource15;
        hikariConfig13.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource1();
        hikariConfig13.serializedObjectSupporter = serializedObjectSupporter19;
        hikariConfig13.poolName = "HikariPool-11";
        hikariConfig13.setJdbc4ConnectionTest(false);
        hikariConfig1.copyState(hikariConfig13);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertNull(hikariDataSource20);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
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
        hikariConfig17.isInitializationFailFast = false;
        hikariConfig17.poolName = "HikariPool-67";
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
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
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
        long long11 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.setAcquireRetryDelay(100L);
        int int16 = hikariConfig1.getTransactionIsolation();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariConfig9);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        java.lang.String str28 = hikariConfig1.poolName;
        long long29 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-146" + "'", str28, "HikariPool-146");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-291");
        long long7 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.poolName = "HikariPool-18";
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setAcquireRetryDelay(0L);
        hikariConfig1.dataSourceClassName = "HikariPool-11";
        int int16 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-18" + "'", str11, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionTestQuery = "HikariPool-17";
        hikariConfig1.setCatalog("HikariPool-261");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-152" + "'", str6, "HikariPool-152");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
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
        hikariConfig1.setRegisterMbeans(false);
        int int22 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setCatalog("TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig10.getConnectionCustomizer();
        boolean boolean12 = hikariConfig10.isRegisterMbeans();
        hikariConfig10.setDataSourceClassName("hi!");
        boolean boolean15 = hikariConfig10.getisRegisterMbeans();
        java.lang.String str16 = hikariConfig10.getPoolName();
        hikariConfig10.setminPoolSize(0);
        java.lang.String str19 = hikariConfig10.transactionIsolationName;
        java.lang.String str20 = hikariConfig10.getConnectionCustomizerClassName();
        hikariConfig10.connectionTimeout = 23;
        hikariConfig10.setMaximumPoolSize(24);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) 24);
        hikariConfig1.leakDetectionThreshold = 182;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-159" + "'", str16, "HikariPool-159");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig1.setUseInstrumentation(false);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean13 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.maxLifetime = ' ';
        int int16 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAcquireIncrement(149);
        java.lang.String str19 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-32" + "'", str19, "HikariPool-32");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource24 = hikariConfig1.dataSource;
        hikariConfig1.setTransactionIsolation("HikariPool-101");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 163 + "'", int11 == 163);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setisJdbc4connectionTest(false);
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        hikariConfig1.setminPoolSize(0);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setPoolName("");
        boolean boolean22 = hikariConfig19.getisJdbc4connectionTest();
        hikariConfig19.idleTimeout = 'a';
        hikariConfig19.isRegisterMbeans = false;
        java.util.Properties properties27 = hikariConfig19.dataSourceProperties;
        java.lang.String str28 = hikariConfig19.getConnectionTestQuery();
        long long29 = hikariConfig19.idleTimeout;
        hikariConfig19.acquireRetries = 29;
        hikariConfig19.setMaximumPoolSize(234);
        hikariConfig1.copyState(hikariConfig19);
        java.lang.String str35 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-11" + "'", str35, "HikariPool-11");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setLeakDetectionThreshold(10L);
        org.slf4j.Logger logger11 = hikariConfig1.getLOGGER();
        hikariConfig1.setCatalog("SELECT 1");
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.setpoolNumber((int) ' ');
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-39");
        hikariConfig1.minPoolSize = 15;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-167" + "'", str6, "HikariPool-167");
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        hikariConfig1.setIdleTimeout((long) 110);
        hikariConfig1.poolName = "HikariPool-37";
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        long long4 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.dataSourceClassName = "HikariPool-166";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        int int8 = hikariConfig1.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.getConnectionCustomizer();
        boolean boolean10 = hikariConfig1.getisAutoCommit();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getMAX_LIFETIME();
        int int12 = hikariConfig10.getMaximumPoolSize();
        boolean boolean13 = hikariConfig10.isInitializationFailFast;
        long long14 = hikariConfig10.maxLifetime;
        long long15 = hikariConfig10.getLeakDetectionThreshold();
        long long16 = hikariConfig10.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-226");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-226 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        int int7 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        long long9 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-38" + "'", str6, "HikariPool-38");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
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
        java.lang.String str28 = hikariConfig21.connectionCustomizerClassName;
        hikariConfig21.connectionCustomizerClassName = "HikariPool-154";
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.maxPoolSize;
        java.lang.String str34 = hikariConfig32.getCatalog();
        java.lang.String str35 = hikariConfig32.getConnectionCustomizerClassName();
        java.lang.String str36 = hikariConfig32.getConnectionTestQuery();
        hikariConfig32.setUseInstrumentation(false);
        java.lang.String str39 = hikariConfig32.getDataSourceClassName();
        java.util.Properties properties40 = hikariConfig32.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getMAX_LIFETIME();
        int int43 = hikariConfig41.getMaximumPoolSize();
        boolean boolean44 = hikariConfig41.isInitializationFailFast;
        hikariConfig41.setRegisterMbeans(false);
        hikariConfig41.setisJdbc4connectionTest(true);
        hikariConfig41.poolName = "HikariPool-136";
        hikariConfig21.copyState(hikariConfig41);
        hikariConfig21.setAutoCommit(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1800000L + "'", long42 == 1800000L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.transactionIsolationName = "HikariPool-33";
        hikariConfig1.setTransactionIsolation("HikariPool-136");
        hikariConfig1.settransactionIsolationName("HikariPool-27");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-12" + "'", str6, "HikariPool-12");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        hikariConfig1.setminPoolSize(167);
        java.lang.String str14 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-13" + "'", str14, "HikariPool-13");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
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
        hikariConfig1.setIdleTimeout((long) 139);
        hikariConfig1.catalog = "HikariPool-24";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-15" + "'", str18, "HikariPool-15");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = (byte) -1;
        long long4 = hikariConfig0.getIDLE_TIMEOUT();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig6.getConnectionCustomizer();
        hikariConfig6.setDataSourceClassName("HikariPool-32");
        hikariConfig6.minPoolSize = 10;
        hikariConfig6.poolName = "HikariPool-19";
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.maxPoolSize;
        java.lang.String str17 = hikariConfig15.getCatalog();
        java.lang.String str18 = hikariConfig15.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        hikariConfig15.setUseInstrumentation(false);
        int int22 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = serializedObjectSupporter25.deserializeObjectHikariConfig2();
        java.lang.String str27 = serializedObjectSupporter25.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger28 = serializedObjectSupporter25.deserializeObjectLogger1();
        hikariConfig15.serializedObjectSupporter = serializedObjectSupporter25;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = serializedObjectSupporter25.deserializeObjectHikariConfig1();
        java.lang.String str31 = serializedObjectSupporter25.deserializeObjectString3();
        org.slf4j.impl.SimpleLogger simpleLogger32 = serializedObjectSupporter25.deserializeObjectLogger1();
        hikariConfig6.serializedObjectSupporter = serializedObjectSupporter25;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter25;
        com.zaxxer.hikari.HikariDataSource hikariDataSource35 = serializedObjectSupporter25.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(hikariConfig26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SELECT 1" + "'", str27, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger28);
        org.junit.Assert.assertNull(hikariConfig30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-6" + "'", str31, "HikariPool-6");
        org.junit.Assert.assertNotNull(simpleLogger32);
        org.junit.Assert.assertNull(hikariDataSource35);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.setMaxLifetime(32L);
        hikariConfig1.setCatalog("HikariPool-0");
        long long21 = hikariConfig1.idleTimeout;
        hikariConfig1.maxPoolSize = 174;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        com.zaxxer.hikari.HikariConfig.poolNumber = 20;
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-20" + "'", str6, "HikariPool-20");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        hikariConfig11.setConnectionTestQuery("HikariPool-65");
        boolean boolean19 = hikariConfig11.getisRegisterMbeans();
        java.lang.String str20 = hikariConfig11.gettransactionIsolationName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        hikariConfig1.setisRegisterMbeans(false);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) '#');
        java.util.Properties properties23 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig1.getConnectionCustomizer();
        boolean boolean25 = hikariConfig1.isAutoCommit();
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long28 = hikariConfig1.getIDLE_TIMEOUT();
        boolean boolean29 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 353;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str20, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
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
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int39 = hikariConfig38.getminPoolSize();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter6.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter6.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        java.lang.String str16 = serializedObjectSupporter6.deserializeObjectString2();
        org.slf4j.impl.SimpleLogger simpleLogger17 = serializedObjectSupporter6.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str16, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(simpleLogger17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertNull(hikariDataSource20);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig8.setisJdbc4connectionTest(true);
        long long13 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig8.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
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
        hikariConfig1.connectionInitSql = "hi!";
        long long14 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-294");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-294 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.maxLifetime = 1;
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        int int9 = hikariConfig1.getmaxPoolSize();
        java.lang.String str10 = hikariConfig1.gettransactionIsolationName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setCatalog("");
        hikariConfig1.setisInitializationFailFast(true);
        hikariConfig1.acquireRetries = (short) 1;
        int int12 = hikariConfig1.acquireRetries;
        long long13 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.acquireRetries = 236;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45");
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        long long13 = hikariConfig1.getMAX_LIFETIME();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setLeakDetectionThreshold((long) 0);
        hikariConfig1.connectionTimeout = 171;
        hikariConfig1.setTransactionIsolation("HikariPool-197");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.maxPoolSize;
        java.lang.String str26 = hikariConfig24.getCatalog();
        java.lang.String str27 = hikariConfig24.getConnectionCustomizerClassName();
        java.lang.String str28 = hikariConfig24.connectionInitSql;
        hikariConfig24.idleTimeout = 100;
        javax.sql.DataSource dataSource31 = hikariConfig24.dataSource;
        hikariConfig24.poolName = "HikariPool-18";
        java.lang.String str34 = hikariConfig24.poolName;
        hikariConfig24.setAcquireRetryDelay(0L);
        hikariConfig24.dataSourceClassName = "HikariPool-11";
        hikariConfig24.setConnectionTestQuery("HikariPool-4");
        hikariConfig1.addDataSourceProperty("HikariPool-29", (java.lang.Object) "HikariPool-4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-18" + "'", str34, "HikariPool-18");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str9, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
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
        hikariConfig1.transactionIsolationName = "HikariPool-83";
        int int15 = hikariConfig1.minPoolSize;
        hikariConfig1.setMinimumPoolSize(376);
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setConnectionTimeout(0L);
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-47" + "'", str6, "HikariPool-47");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-87";
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-11" + "'", str8, "HikariPool-11");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
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
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter6.deserializeObjectHikariDataSource11();
        java.lang.String str14 = serializedObjectSupporter6.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertNull(hikariConfig16);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getConnectionTestQuery();
        hikariConfig10.setCatalog("HikariPool-16");
        long long14 = hikariConfig10.getIDLE_TIMEOUT();
        int int15 = hikariConfig10.transactionIsolation;
        hikariConfig10.transactionIsolation = 211;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-20");
        hikariConfig1.maxPoolSize = 147;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        int int7 = hikariConfig1.maxPoolSize;
        long long8 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.setConnectionTestQuery("HikariPool-122");
        int int12 = hikariConfig1.transactionIsolation;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
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
        org.junit.Assert.assertNull(iConnectionCustomizer20);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        java.lang.String str16 = serializedObjectSupporter6.deserializeObjectString7();
        java.lang.String str17 = serializedObjectSupporter6.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str17, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig18);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        hikariConfig1.leakDetectionThreshold = 139;
        hikariConfig1.setpoolNumber(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        long long12 = hikariConfig1.idleTimeout;
        boolean boolean13 = hikariConfig1.isAutoCommit();
        long long14 = hikariConfig1.connectionTimeout;
        java.lang.String str15 = hikariConfig1.gettransactionIsolationName();
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-135");
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.idleTimeout = 29;
        java.lang.String str12 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
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
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.setConnectionInitSql("HikariPool-32");
        hikariConfig1.setAcquireRetries(29);
        hikariConfig1.setAutoCommit(false);
        long long14 = hikariConfig1.getMAX_LIFETIME();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setmaxPoolSize(288);
        hikariConfig1.connectionTestQuery = "HikariPool-182";
        hikariConfig1.maxLifetime = 19;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
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
        hikariConfig1.setIdleTimeout((long) 118);
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties9 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        hikariConfig1.setDataSourceClassName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig1.setRegisterMbeans(true);
        javax.sql.DataSource dataSource21 = hikariConfig1.dataSource;
        int int22 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
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
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setConnectionTimeout(100L);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.maxPoolSize;
        java.lang.String str20 = hikariConfig18.getCatalog();
        java.lang.String str21 = hikariConfig18.getConnectionCustomizerClassName();
        java.lang.String str22 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setUseInstrumentation(false);
        int int25 = hikariConfig18.getTransactionIsolation();
        java.lang.String str26 = hikariConfig18.getConnectionTestQuery();
        boolean boolean27 = hikariConfig18.getisRegisterMbeans();
        java.lang.String str28 = hikariConfig18.transactionIsolationName;
        java.lang.String str29 = hikariConfig18.gettransactionIsolationName();
        hikariConfig18.settransactionIsolationName("HikariPool-15");
        hikariConfig1.copyState(hikariConfig18);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.maxPoolSize;
        java.lang.String str37 = hikariConfig35.getCatalog();
        java.lang.String str38 = hikariConfig35.getConnectionCustomizerClassName();
        java.lang.String str39 = hikariConfig35.connectionInitSql;
        hikariConfig35.setUseInstrumentation(false);
        long long42 = hikariConfig35.getMaxLifetime();
        java.lang.String str43 = hikariConfig35.connectionInitSql;
        hikariConfig18.addDataSourceProperty("HikariPool-261", (java.lang.Object) hikariConfig35);
        java.lang.String str45 = hikariConfig18.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1800000L + "'", long42 == 1800000L);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
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
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter6.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(simpleLogger11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.minPoolSize = 339;
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        boolean boolean12 = hikariConfig1.getisInitializationFailFast();
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        long long14 = hikariConfig1.connectionTimeout;
        java.lang.String str15 = hikariConfig1.poolName;
        long long16 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-22" + "'", str15, "HikariPool-22");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
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
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-23" + "'", str13, "HikariPool-23");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
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
        hikariConfig1.setpoolNumber(58);
        java.lang.String str39 = hikariConfig1.connectionInitSql;
        int int40 = hikariConfig1.getminPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer41 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer41;
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
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionTimeout = 26;
        long long15 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-65");
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.leakDetectionThreshold = 1L;
        hikariConfig1.setConnectionTestQuery("HikariPool-134");
        long long11 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig5.connectionCustomizer;
        boolean boolean7 = hikariConfig5.isAutoCommit;
        org.slf4j.Logger logger8 = hikariConfig5.getLOGGER();
        boolean boolean9 = hikariConfig5.getisAutoCommit();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.maxPoolSize;
        java.lang.String str11 = hikariConfig9.getCatalog();
        java.lang.String str12 = hikariConfig9.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setUseInstrumentation(false);
        java.lang.String str16 = hikariConfig9.getDataSourceClassName();
        java.util.Properties properties17 = hikariConfig9.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setisAutoCommit(false);
        int int23 = hikariConfig1.acquireRetries;
        boolean boolean24 = hikariConfig1.isAutoCommit();
        hikariConfig1.validate();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getConnectionTestQuery();
        boolean boolean12 = hikariConfig10.getisJdbc4connectionTest();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.maxPoolSize;
        java.lang.String str17 = hikariConfig15.getCatalog();
        java.lang.String str18 = hikariConfig15.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig15.connectionInitSql;
        hikariConfig15.idleTimeout = 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = hikariConfig15.serializedObjectSupporter;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter25.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter25.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter25.deserializeObjectHikariConfig1();
        java.util.Properties properties29 = serializedObjectSupporter25.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig24.dataSourceProperties = properties29;
        hikariConfig15.dataSourceProperties = properties29;
        hikariConfig10.addDataSourceProperty("HikariPool-180", (java.lang.Object) properties29);
        boolean boolean34 = hikariConfig10.getisAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
        org.junit.Assert.assertNull(hikariDataSource26);
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
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
        java.lang.String str21 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.acquireRetries;
        long long7 = hikariConfig1.getConnectionTimeout();
        int int8 = hikariConfig1.minPoolSize;
        int int9 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-37");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-37 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
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
        org.slf4j.Logger logger14 = hikariConfig1.getLOGGER();
        long long15 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str18 = hikariConfig1.getPoolName();
        long long19 = hikariConfig1.connectionTimeout;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-76" + "'", str18, "HikariPool-76");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.lang.Class<?> wildcardClass9 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.idleTimeout = 159;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-59";
        hikariConfig1.catalog = "HikariPool-58";
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int23 = hikariConfig22.maxPoolSize;
        java.lang.String str24 = hikariConfig22.gettransactionIsolationName();
        hikariConfig22.minPoolSize = (short) -1;
        java.lang.String str27 = hikariConfig22.dataSourceClassName;
        hikariConfig22.setConnectionInitSql("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig22.setMaximumPoolSize(0);
        int int32 = hikariConfig22.getmaxPoolSize();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = hikariConfig34.getConnectionCustomizer();
        javax.sql.DataSource dataSource36 = null;
        hikariConfig34.dataSource = dataSource36;
        hikariConfig34.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter40 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource41 = serializedObjectSupporter40.deserializeObjectHikariDataSource1();
        hikariConfig34.serializedObjectSupporter = serializedObjectSupporter40;
        hikariConfig34.poolName = "HikariPool-11";
        hikariConfig34.setJdbc4ConnectionTest(false);
        hikariConfig22.copyState(hikariConfig34);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
        org.junit.Assert.assertNull(hikariDataSource41);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.setpoolNumber((int) (byte) 10);
        hikariConfig0.connectionInitSql = "HikariPool-33";
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.connectionTimeout = (byte) -1;
        hikariConfig0.setDataSourceClassName("HikariPool-130");
        org.slf4j.Logger logger11 = hikariConfig0.getLOGGER();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(logger11);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        com.zaxxer.hikari.HikariConfig.poolNumber = 26;
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
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
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        int int19 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        hikariConfig1.setminPoolSize((int) (byte) -1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.settransactionIsolationName("HikariPool-249");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.leakDetectionThreshold = 1L;
        hikariConfig1.setAcquireRetries((int) ' ');
        hikariConfig1.dataSourceClassName = "HikariPool-135";
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.acquireRetries = 69;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig1.getPoolName();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        int int9 = hikariConfig1.transactionIsolation;
        hikariConfig1.acquireRetries = 114;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-31" + "'", str7, "HikariPool-31");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.maxPoolSize;
        java.lang.String str11 = hikariConfig9.getCatalog();
        java.lang.String str12 = hikariConfig9.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setUseInstrumentation(false);
        java.lang.String str16 = hikariConfig9.getDataSourceClassName();
        java.util.Properties properties17 = hikariConfig9.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        boolean boolean21 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource22 = hikariConfig1.dataSource;
        hikariConfig1.setisInitializationFailFast(false);
        hikariConfig1.connectionTestQuery = "HikariPool-183";
        hikariConfig1.connectionTimeout = 17;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTimeout((long) 140);
        hikariConfig1.connectionInitSql = "HikariPool-110";
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setmaxPoolSize(88);
        int int15 = hikariConfig1.minPoolSize;
        int int16 = hikariConfig1.minPoolSize;
        org.slf4j.Logger logger17 = hikariConfig1.getLOGGER();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(logger17);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariConfig4);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.getConnectionCustomizer();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig11.getConnectionCustomizer();
        boolean boolean13 = hikariConfig11.isRegisterMbeans();
        hikariConfig11.setDataSourceClassName("hi!");
        hikariConfig11.settransactionIsolationName("HikariPool-18");
        hikariConfig11.setminPoolSize(74);
        long long20 = hikariConfig11.idleTimeout;
        hikariConfig1.copyState(hikariConfig11);
        hikariConfig11.connectionTestQuery = "HikariPool-93";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getMAX_LIFETIME();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.dataSourceClassName = "HikariPool-99";
        int int10 = hikariConfig1.getTransactionIsolation();
        java.lang.String str11 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-39" + "'", str11, "HikariPool-39");
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
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
        hikariConfig1.setMinimumPoolSize(128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-11" + "'", str8, "HikariPool-11");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        java.util.Properties properties9 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
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
        hikariConfig15.setTransactionIsolation("HikariPool-147");
        javax.sql.DataSource dataSource33 = null;
        hikariConfig15.dataSource = dataSource33;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 43 + "'", int12 == 43);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        java.lang.String str7 = hikariConfig1.gettransactionIsolationName();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-63";
        hikariConfig1.validate();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        int int13 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        int int5 = hikariConfig1.maxPoolSize;
        hikariConfig1.acquireRetries = 120;
        int int8 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariConfig1.serializedObjectSupporter;
        int int7 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-46" + "'", str10, "HikariPool-46");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        int int3 = hikariConfig1.getminPoolSize();
        hikariConfig1.maxLifetime = 288;
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setAcquireRetries(171);
        int int10 = hikariConfig1.acquireRetries;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter13.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.util.Properties properties17 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig12.dataSourceProperties = properties17;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int23 = hikariConfig22.maxPoolSize;
        java.lang.String str24 = hikariConfig22.getCatalog();
        boolean boolean25 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.maxLifetime = (byte) 0;
        hikariConfig22.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig22.getPoolName();
        hikariConfig12.addDataSourceProperty("", (java.lang.Object) str30);
        int int32 = hikariConfig12.getpoolNumber();
        hikariConfig12.setIdleTimeout((long) 193);
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        int int37 = hikariConfig36.maxPoolSize;
        java.lang.String str38 = hikariConfig36.getCatalog();
        java.lang.String str39 = hikariConfig36.getConnectionCustomizerClassName();
        java.lang.String str40 = hikariConfig36.getConnectionTestQuery();
        hikariConfig36.setUseInstrumentation(false);
        int int43 = hikariConfig36.getTransactionIsolation();
        hikariConfig36.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter46 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = serializedObjectSupporter46.deserializeObjectHikariConfig2();
        java.lang.String str48 = serializedObjectSupporter46.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger49 = serializedObjectSupporter46.deserializeObjectLogger1();
        hikariConfig36.serializedObjectSupporter = serializedObjectSupporter46;
        java.lang.String str51 = serializedObjectSupporter46.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource52 = serializedObjectSupporter46.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource53 = serializedObjectSupporter46.deserializeObjectHikariDataSource17();
        java.lang.String str54 = serializedObjectSupporter46.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource55 = serializedObjectSupporter46.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = serializedObjectSupporter46.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource57 = serializedObjectSupporter46.deserializeObjectHikariDataSource9();
        hikariConfig12.serializedObjectSupporter = serializedObjectSupporter46;
        hikariConfig1.copyState(hikariConfig12);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 171 + "'", int10 == 171);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-51" + "'", str30, "HikariPool-51");
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(hikariConfig47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "SELECT 1" + "'", str48, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str51, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource52);
        org.junit.Assert.assertNull(hikariDataSource53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "HikariPool-32" + "'", str54, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource55);
        org.junit.Assert.assertNull(hikariConfig56);
        org.junit.Assert.assertNull(hikariDataSource57);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str5 = hikariConfig1.catalog;
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-86");
        hikariConfig1.dataSourceClassName = "HikariPool-296";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.connectionTestQuery = "HikariPool-29";
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        long long16 = hikariConfig1.maxLifetime;
        hikariConfig1.setMinimumPoolSize(7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.setminPoolSize((int) (short) 10);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.transactionIsolation = 134;
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setAcquireRetryDelay((long) 31);
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        java.lang.String str9 = hikariConfig1.catalog;
        int int10 = hikariConfig1.getMaximumPoolSize();
        long long11 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setCatalog("HikariPool-66");
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
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
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str17 = hikariConfig1.catalog;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setisInitializationFailFast(true);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.maxPoolSize;
        java.lang.String str15 = hikariConfig13.gettransactionIsolationName();
        javax.sql.DataSource dataSource16 = hikariConfig13.getDataSource();
        long long17 = hikariConfig13.getMAX_LIFETIME();
        boolean boolean18 = hikariConfig13.isInitializationFailFast();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.dataSourceClassName = "HikariPool-99";
        int int22 = hikariConfig13.getTransactionIsolation();
        hikariConfig1.copyState(hikariConfig13);
        hikariConfig13.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
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
        hikariConfig1.transactionIsolationName = "HikariPool-150";
        hikariConfig1.setmaxPoolSize(38);
        int int20 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionInitSql = "HikariPool-90";
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        int int12 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig14.getConnectionCustomizer();
        hikariConfig14.setDataSourceClassName("HikariPool-32");
        hikariConfig14.catalog = "HikariPool-18";
        hikariConfig14.setMaximumPoolSize(100);
        hikariConfig14.setisAutoCommit(true);
        hikariConfig14.setUseInstrumentation(false);
        hikariConfig14.setMaxLifetime((long) (short) -1);
        hikariConfig14.setisJdbc4connectionTest(false);
        hikariConfig14.setmaxPoolSize(29);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = hikariConfig14.connectionCustomizer;
        hikariConfig1.copyState(hikariConfig14);
        int int34 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(iConnectionCustomizer32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        boolean boolean6 = hikariConfig1.isAutoCommit;
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionTimeout = 39;
        int int10 = hikariConfig1.getAcquireRetries();
        int int11 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-32" + "'", str9, "HikariPool-32");
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setDataSourceClassName("HikariPool-31");
        hikariConfig1.setAcquireRetries(151);
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.settransactionIsolationName("HikariPool-69");
        hikariConfig1.minPoolSize = 15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-33" + "'", str7, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionInitSql = "HikariPool-19";
        hikariConfig1.dataSourceClassName = "HikariPool-130";
        org.slf4j.Logger logger9 = hikariConfig1.getLOGGER();
        long long10 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        org.slf4j.Logger logger5 = hikariConfig1.getLOGGER();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.idleTimeout = (short) 10;
        hikariConfig1.setConnectionTestQuery("HikariPool-256");
        boolean boolean14 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.idleTimeout = 74;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.maxPoolSize;
        java.lang.String str20 = hikariConfig18.getCatalog();
        java.lang.String str21 = hikariConfig18.getConnectionCustomizerClassName();
        java.lang.String str22 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setUseInstrumentation(false);
        int int25 = hikariConfig18.getAcquireRetries();
        int int26 = hikariConfig18.getAcquireRetries();
        boolean boolean27 = hikariConfig18.isJdbc4ConnectionTest();
        long long28 = hikariConfig18.idleTimeout;
        hikariConfig18.connectionTimeout = (byte) 100;
        hikariConfig18.setpoolNumber(200);
        hikariConfig1.copyState(hikariConfig18);
        hikariConfig18.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getpoolNumber();
        boolean boolean2 = hikariConfig0.isRegisterMbeans;
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        int int5 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.isRegisterMbeans = true;
        boolean boolean8 = hikariConfig0.getisJdbc4connectionTest();
        java.lang.String str9 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 201 + "'", int1 == 201);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig1.getPoolName();
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.connectionTimeout = 151;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-201" + "'", str9, "HikariPool-201");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-201" + "'", str10, "HikariPool-201");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
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
        hikariConfig1.transactionIsolation = 23;
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig1.setisInitializationFailFast(false);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setmaxPoolSize(115);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
        hikariConfig1.setmaxPoolSize(140);
        org.slf4j.Logger logger15 = hikariConfig1.getLOGGER();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 205 + "'", int12 == 205);
        org.junit.Assert.assertNotNull(logger15);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        hikariConfig1.setAcquireRetryDelay((long) 100);
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMinimumPoolSize(29);
        hikariConfig1.connectionTestQuery = "HikariPool-227";
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold((long) 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer23;
        java.util.Properties properties25 = hikariConfig1.dataSourceProperties;
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
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
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
        hikariConfig1.setMinimumPoolSize(20);
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
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.maxLifetime = (byte) 0;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTimeout((long) 114);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        long long3 = hikariConfig1.idleTimeout;
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.maxPoolSize;
        java.lang.String str7 = hikariConfig5.getCatalog();
        java.lang.String str8 = hikariConfig5.getConnectionCustomizerClassName();
        java.lang.String str9 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setUseInstrumentation(false);
        java.lang.String str12 = hikariConfig5.getDataSourceClassName();
        java.util.Properties properties13 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig1.setDataSourceProperties(properties13);
        long long17 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.maxPoolSize;
        java.lang.String str21 = hikariConfig19.getCatalog();
        java.lang.String str22 = hikariConfig19.getConnectionCustomizerClassName();
        java.lang.String str23 = hikariConfig19.connectionInitSql;
        hikariConfig19.setUseInstrumentation(false);
        boolean boolean26 = hikariConfig19.getisInitializationFailFast();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = hikariConfig29.getConnectionCustomizer();
        boolean boolean31 = hikariConfig29.isRegisterMbeans();
        hikariConfig29.setDataSourceClassName("hi!");
        java.lang.String str34 = hikariConfig29.poolName;
        hikariConfig29.setMaxLifetime((long) '4');
        hikariConfig29.setRegisterMbeans(false);
        hikariConfig29.isJdbc4connectionTest = true;
        hikariConfig19.addDataSourceProperty("HikariPool-134", (java.lang.Object) hikariConfig29);
        hikariConfig1.copyState(hikariConfig29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-224" + "'", str34, "HikariPool-224");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
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
        java.lang.String str14 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter15.deserializeObjectHikariDataSource5();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter15;
        long long21 = hikariConfig1.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setLeakDetectionThreshold(10L);
        org.slf4j.Logger logger11 = hikariConfig1.getLOGGER();
        hikariConfig1.setCatalog("SELECT 1");
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.setpoolNumber((int) ' ');
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-228" + "'", str6, "HikariPool-228");
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMinimumPoolSize(76);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
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
        long long15 = hikariConfig14.getMaxLifetime();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.maxPoolSize;
        java.lang.String str19 = hikariConfig17.getCatalog();
        java.lang.String str20 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig17.getConnectionTestQuery();
        hikariConfig17.setUseInstrumentation(false);
        hikariConfig17.catalog = "";
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig27.getConnectionCustomizer();
        hikariConfig27.setIdleTimeout((long) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig27.getConnectionCustomizer();
        hikariConfig17.copyState(hikariConfig27);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer33 = hikariConfig27.connectionCustomizer;
        hikariConfig27.isRegisterMbeans = false;
        boolean boolean36 = hikariConfig27.isRegisterMbeans();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig38.setPoolName("");
        java.lang.String str41 = hikariConfig38.connectionInitSql;
        hikariConfig38.setLeakDetectionThreshold((long) 139);
        hikariConfig38.setDataSourceClassName("HikariPool-21");
        long long46 = hikariConfig38.getAcquireRetryDelay();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig48.connectionTimeout = 0L;
        hikariConfig48.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig48.setAcquireRetryDelay((long) (byte) 1);
        int int55 = hikariConfig48.minPoolSize;
        java.util.Properties properties56 = hikariConfig48.getDataSourceProperties();
        hikariConfig38.dataSourceProperties = properties56;
        hikariConfig27.dataSourceProperties = properties56;
        hikariConfig14.setDataSourceProperties(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties56);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
        org.junit.Assert.assertNull(iConnectionCustomizer33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariConfig7);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        java.lang.String str7 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(hikariDataSource16);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        java.util.Properties properties23 = hikariConfig1.getDataSourceProperties();
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
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        int int13 = hikariConfig1.maxPoolSize;
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource10();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource14();
        java.lang.String str13 = serializedObjectSupporter7.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        java.lang.String str16 = serializedObjectSupporter7.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter7.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter7.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter7.deserializeObjectHikariDataSource3();
        java.lang.String str20 = serializedObjectSupporter7.deserializeObjectString6();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str16, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str20, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        long long13 = hikariConfig1.getCONNECTION_TIMEOUT();
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 100;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.poolName = "HikariPool-18";
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setAcquireRetryDelay(0L);
        hikariConfig1.dataSourceClassName = "HikariPool-11";
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        java.lang.String str17 = hikariConfig1.catalog;
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        long long19 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-18" + "'", str11, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.transactionIsolationName = "HikariPool-123";
        hikariConfig1.idleTimeout = 85;
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-123" + "'", str9, "HikariPool-123");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
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
        java.lang.String str12 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-51" + "'", str6, "HikariPool-51");
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-51" + "'", str12, "HikariPool-51");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
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
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig5.connectionCustomizer;
        boolean boolean7 = hikariConfig5.isAutoCommit;
        org.slf4j.Logger logger8 = hikariConfig5.getLOGGER();
        long long9 = hikariConfig5.getMaxLifetime();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
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
        long long14 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
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
        java.lang.String str11 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32";
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.setminPoolSize((int) (short) 10);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        hikariConfig1.setAcquireRetries(0);
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        int int8 = hikariConfig1.transactionIsolation;
        boolean boolean9 = hikariConfig1.isAutoCommit;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIDLE_TIMEOUT();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.acquireRetries = 244;
        hikariConfig1.setisInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-367");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-367 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionTestQuery("HikariPool-31");
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        hikariConfig1.idleTimeout = 20;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
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
        long long13 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        boolean boolean17 = hikariConfig1.getisRegisterMbeans();
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        int int19 = hikariConfig1.getpoolNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 65 + "'", int19 == 65);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.maxPoolSize;
        java.lang.String str11 = hikariConfig9.getCatalog();
        java.lang.String str12 = hikariConfig9.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setUseInstrumentation(false);
        java.lang.String str16 = hikariConfig9.getDataSourceClassName();
        java.util.Properties properties17 = hikariConfig9.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setTransactionIsolation("HikariPool-5");
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        int int14 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        int int17 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
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
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setisJdbc4connectionTest(false);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.dataSource = dataSource3;
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setisInitializationFailFast(true);
        long long8 = hikariConfig1.getIdleTimeout();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
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
        int int15 = hikariConfig1.getpoolNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 77 + "'", int15 == 77);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
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
        javax.sql.DataSource dataSource21 = null;
        hikariConfig11.setDataSource(dataSource21);
        hikariConfig11.setConnectionTestQuery("TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        java.lang.String str13 = serializedObjectSupporter7.deserializeObjectString7();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32" + "'", str13, "HikariPool-32");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
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
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAcquireRetryDelay((long) 99);
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
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
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.connectionInitSql = "HikariPool-90";
        hikariConfig1.setPoolName("HikariPool-139");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig20.getConnectionCustomizer();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig20.dataSource = dataSource22;
        hikariConfig20.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource1();
        hikariConfig20.serializedObjectSupporter = serializedObjectSupporter26;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.maxPoolSize;
        java.lang.String str32 = hikariConfig30.gettransactionIsolationName();
        hikariConfig30.minPoolSize = (short) -1;
        java.lang.String str35 = hikariConfig30.dataSourceClassName;
        java.util.Properties properties36 = hikariConfig30.getDataSourceProperties();
        hikariConfig20.dataSourceProperties = properties36;
        boolean boolean38 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.catalog = "HikariPool-22";
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        int int43 = hikariConfig42.maxPoolSize;
        java.lang.String str44 = hikariConfig42.getCatalog();
        boolean boolean45 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.maxLifetime = (byte) 0;
        hikariConfig42.setAcquireRetryDelay((long) (short) 0);
        hikariConfig42.connectionTimeout = (byte) -1;
        hikariConfig42.setConnectionTestQuery("HikariPool-32");
        int int54 = hikariConfig42.transactionIsolation;
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        int int57 = hikariConfig56.maxPoolSize;
        java.lang.String str58 = hikariConfig56.getCatalog();
        java.lang.String str59 = hikariConfig56.getConnectionCustomizerClassName();
        java.lang.String str60 = hikariConfig56.getConnectionTestQuery();
        hikariConfig56.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer63 = hikariConfig56.getConnectionCustomizer();
        hikariConfig56.maxLifetime = 1;
        java.util.Properties properties66 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties66);
        int int68 = hikariConfig67.maxPoolSize;
        java.lang.String str69 = hikariConfig67.getCatalog();
        java.lang.String str70 = hikariConfig67.getConnectionCustomizerClassName();
        java.lang.String str71 = hikariConfig67.getConnectionTestQuery();
        hikariConfig67.setUseInstrumentation(false);
        java.lang.String str74 = hikariConfig67.getDataSourceClassName();
        java.util.Properties properties75 = hikariConfig67.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties75);
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties75);
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig(properties75);
        hikariConfig56.setDataSourceProperties(properties75);
        hikariConfig42.dataSourceProperties = properties75;
        hikariConfig20.dataSourceProperties = properties75;
        hikariConfig1.dataSourceProperties = properties75;
        hikariConfig1.setAcquireIncrement(20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-83" + "'", str14, "HikariPool-83");
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 60 + "'", int57 == 60);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(iConnectionCustomizer63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 60 + "'", int68 == 60);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(properties75);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
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
        int int12 = hikariConfig1.getMinimumPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = hikariConfig1.serializedObjectSupporter;
        java.lang.String str14 = hikariConfig1.getPoolName();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(serializedObjectSupporter13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-92" + "'", str14, "HikariPool-92");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        hikariConfig1.connectionTimeout = 12;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
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
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.util.Properties properties22 = hikariConfig21.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.isInitializationFailFast = true;
        hikariConfig23.isAutoCommit = false;
        hikariConfig23.isInitializationFailFast = false;
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig23);
        hikariConfig23.transactionIsolation = 210;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.leakDetectionThreshold = 147;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.maxPoolSize;
        java.lang.String str14 = hikariConfig12.getCatalog();
        java.lang.String str15 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str16 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setUseInstrumentation(false);
        int int19 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setTransactionIsolation("hi!");
        hikariConfig12.setAutoCommit(false);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig12.setDataSource(dataSource24);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.connectionTimeout = 0L;
        javax.sql.DataSource dataSource30 = null;
        hikariConfig27.dataSource = dataSource30;
        boolean boolean32 = hikariConfig27.isAutoCommit;
        boolean boolean33 = hikariConfig27.isJdbc4connectionTest;
        long long34 = hikariConfig27.getIDLE_TIMEOUT();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer37 = hikariConfig36.getConnectionCustomizer();
        hikariConfig36.setDataSourceClassName("HikariPool-32");
        hikariConfig36.minPoolSize = 10;
        boolean boolean42 = hikariConfig36.isInitializationFailFast;
        int int43 = hikariConfig36.getminPoolSize();
        java.util.Properties properties44 = hikariConfig36.getDataSourceProperties();
        hikariConfig27.dataSourceProperties = properties44;
        hikariConfig12.setDataSourceProperties(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
        org.junit.Assert.assertNull(iConnectionCustomizer37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
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
        int int12 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig14.getConnectionCustomizer();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig14.dataSource = dataSource16;
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties18);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
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
        hikariConfig1.setDataSourceClassName("HikariPool-16");
        int int16 = hikariConfig1.getMinimumPoolSize();
        long long17 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig11.connectionCustomizer;
        hikariConfig11.maxPoolSize = 236;
        java.util.Properties properties24 = hikariConfig11.getDataSourceProperties();
        java.lang.String str25 = hikariConfig11.connectionTestQuery;
        hikariConfig11.setAcquireRetryDelay((long) 232);
        boolean boolean28 = hikariConfig11.isAutoCommit;
        hikariConfig11.setConnectionInitSql("HikariPool-48");
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
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        long long5 = hikariConfig1.maxLifetime;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setisAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
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
        org.junit.Assert.assertNull(hikariConfig19);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig11.dataSource = dataSource12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.leakDetectionThreshold = 1L;
        hikariConfig1.setAcquireRetries((int) ' ');
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        long long13 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.connectionInitSql;
        hikariConfig1.setLeakDetectionThreshold((long) 139);
        hikariConfig1.setDataSourceClassName("HikariPool-21");
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.connectionTimeout = 0L;
        hikariConfig11.connectionCustomizerClassName = "HikariPool-32";
        hikariConfig11.setAcquireRetryDelay((long) (byte) 1);
        int int18 = hikariConfig11.minPoolSize;
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties19;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.addDataSourceProperty("HikariPool-17", (java.lang.Object) 221);
        hikariConfig1.setTransactionIsolation("HikariPool-20");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        java.lang.String str14 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.poolName = "HikariPool-19";
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-54" + "'", str14, "HikariPool-54");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        java.lang.String str4 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setDataSourceClassName("HikariPool-35");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-158");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setmaxPoolSize((int) (short) 0);
        hikariConfig1.setminPoolSize(153);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.maxPoolSize;
        java.lang.String str26 = hikariConfig24.getCatalog();
        java.lang.String str27 = hikariConfig24.getConnectionCustomizerClassName();
        java.lang.String str28 = hikariConfig24.getConnectionTestQuery();
        hikariConfig24.setUseInstrumentation(false);
        java.lang.String str31 = hikariConfig24.getDataSourceClassName();
        java.util.Properties properties32 = hikariConfig24.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties32;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        int int11 = hikariConfig1.getmaxPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariConfig1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str4, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        hikariConfig1.acquireRetries = (short) 0;
        int int9 = hikariConfig1.maxPoolSize;
        int int10 = hikariConfig1.getmaxPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        java.lang.String str11 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
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
        boolean boolean17 = hikariConfig1.getisRegisterMbeans();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        int int19 = hikariConfig1.getAcquireIncrement();
        int int20 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = 146;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        java.lang.String str8 = hikariConfig1.poolName;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.maxLifetime = 68;
        hikariConfig1.setisAutoCommit(true);
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-126" + "'", str8, "HikariPool-126");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.minPoolSize = 'a';
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-16";
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionTestQuery("HikariPool-226");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        int int8 = hikariConfig1.getminPoolSize();
        java.lang.String str9 = hikariConfig1.catalog;
        int int10 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
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
        hikariConfig1.setDataSourceClassName("HikariPool-108");
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
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
        hikariConfig1.setisRegisterMbeans(true);
        hikariConfig1.setisJdbc4connectionTest(true);
        int int15 = hikariConfig1.getAcquireIncrement();
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        hikariConfig1.leakDetectionThreshold = 53;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-173");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-173 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setMaxLifetime((long) (-1));
        long long13 = hikariConfig1.getMAX_LIFETIME();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.maxPoolSize;
        java.lang.String str17 = hikariConfig15.getCatalog();
        java.lang.String str18 = hikariConfig15.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig15.connectionInitSql;
        hikariConfig15.setUseInstrumentation(false);
        long long22 = hikariConfig15.getMaxLifetime();
        javax.sql.DataSource dataSource23 = hikariConfig15.getDataSource();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig25.getConnectionCustomizer();
        hikariConfig25.setDataSourceClassName("HikariPool-32");
        hikariConfig25.minPoolSize = 10;
        java.lang.String str31 = hikariConfig25.gettransactionIsolationName();
        hikariConfig25.setConnectionInitSql("HikariPool-32");
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = hikariConfig35.getConnectionCustomizer();
        javax.sql.DataSource dataSource37 = null;
        hikariConfig35.dataSource = dataSource37;
        boolean boolean39 = hikariConfig35.isInitializationFailFast;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer42 = hikariConfig41.getConnectionCustomizer();
        javax.sql.DataSource dataSource43 = null;
        hikariConfig41.dataSource = dataSource43;
        boolean boolean45 = hikariConfig41.isInitializationFailFast;
        java.util.Properties properties46 = hikariConfig41.getDataSourceProperties();
        hikariConfig35.dataSourceProperties = properties46;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig25.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig15.setDataSourceProperties(properties46);
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer54 = hikariConfig53.getConnectionCustomizer();
        javax.sql.DataSource dataSource55 = null;
        hikariConfig53.dataSource = dataSource55;
        hikariConfig53.setInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter59 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource60 = serializedObjectSupporter59.deserializeObjectHikariDataSource1();
        hikariConfig53.serializedObjectSupporter = serializedObjectSupporter59;
        hikariConfig15.copyState(hikariConfig53);
        hikariConfig1.copyState(hikariConfig15);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter64 = hikariConfig15.serializedObjectSupporter;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-132" + "'", str6, "HikariPool-132");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(iConnectionCustomizer36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(iConnectionCustomizer54);
        org.junit.Assert.assertNull(hikariDataSource60);
        org.junit.Assert.assertNull(serializedObjectSupporter64);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.minPoolSize = 238;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.maxPoolSize = (byte) 0;
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        long long9 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
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
        hikariConfig14.setTransactionIsolation("HikariPool-133");
        java.lang.String str20 = hikariConfig14.getConnectionTestQuery();
        long long21 = hikariConfig14.getLeakDetectionThreshold();
        hikariConfig14.setRegisterMbeans(true);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
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
        hikariConfig25.isAutoCommit = false;
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
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
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
        hikariConfig1.setpoolNumber(221);
        hikariConfig1.setAutoCommit(false);
        long long20 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 152 + "'", int11 == 152);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
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
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.setMaxLifetime(32L);
        hikariConfig1.setIdleTimeout((long) 11);
        hikariConfig1.idleTimeout = 235;
        hikariConfig1.setisJdbc4connectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
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
        java.lang.String str28 = hikariConfig21.connectionCustomizerClassName;
        hikariConfig21.connectionCustomizerClassName = "HikariPool-154";
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.maxPoolSize;
        java.lang.String str34 = hikariConfig32.getCatalog();
        java.lang.String str35 = hikariConfig32.getConnectionCustomizerClassName();
        java.lang.String str36 = hikariConfig32.getConnectionTestQuery();
        hikariConfig32.setUseInstrumentation(false);
        java.lang.String str39 = hikariConfig32.getDataSourceClassName();
        java.util.Properties properties40 = hikariConfig32.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getMAX_LIFETIME();
        int int43 = hikariConfig41.getMaximumPoolSize();
        boolean boolean44 = hikariConfig41.isInitializationFailFast;
        hikariConfig41.setRegisterMbeans(false);
        hikariConfig41.setisJdbc4connectionTest(true);
        hikariConfig41.poolName = "HikariPool-136";
        hikariConfig21.copyState(hikariConfig41);
        int int52 = hikariConfig21.getTransactionIsolation();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1800000L + "'", long42 == 1800000L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-65");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        hikariConfig1.connectionInitSql = "HikariPool-130";
        int int14 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-110";
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        boolean boolean22 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str6 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) '4');
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        hikariConfig1.setConnectionTestQuery("HikariPool-134");
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-14" + "'", str6, "HikariPool-14");
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setPoolName("");
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.isAutoCommit = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        int int5 = hikariConfig1.transactionIsolation;
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
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
        hikariConfig1.setRegisterMbeans(false);
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
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        boolean boolean15 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.connectionTimeout = 205;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
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
        long long11 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.transactionIsolation = 141;
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.dataSource = dataSource4;
        long long6 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
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
        hikariConfig1.setmaxPoolSize((-1));
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolationName = "HikariPool-11";
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        long long9 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.setAcquireIncrement(120);
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-11" + "'", str8, "HikariPool-11");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
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
        org.junit.Assert.assertNull(hikariConfig11);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter15.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
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
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setTransactionIsolation("HikariPool-163");
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
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
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        int int15 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        hikariConfig1.setMaximumPoolSize(94);
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
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
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter6.deserializeObjectHikariDataSource11();
        java.lang.String str14 = serializedObjectSupporter6.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        java.lang.String str18 = serializedObjectSupporter6.deserializeObjectString6();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str14, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str18, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        int int16 = hikariConfig1.getminPoolSize();
        java.lang.String str17 = hikariConfig1.getPoolName();
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold((long) 12);
        hikariConfig1.setConnectionTestQuery("HikariPool-149");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-31" + "'", str17, "HikariPool-31");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        int int9 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setLeakDetectionThreshold((long) 0);
        hikariConfig1.connectionTimeout = 171;
        hikariConfig1.setisRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTimeout = 0L;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionTimeout = (short) 100;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setTransactionIsolation("HikariPool-54");
        int int16 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str17 = hikariConfig1.connectionInitSql;
        java.lang.String str18 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
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
        int int27 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str28 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
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
        boolean boolean16 = hikariConfig1.isAutoCommit;
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties6 = null;
        hikariConfig1.dataSourceProperties = properties6;
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setConnectionInitSql("HikariPool-102");
        java.lang.String str12 = hikariConfig1.getPoolName();
        int int13 = hikariConfig1.getminPoolSize();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setAcquireIncrement(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-39" + "'", str12, "HikariPool-39");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        int int5 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        boolean boolean7 = hikariConfig1.getisAutoCommit();
        int int8 = hikariConfig1.maxPoolSize;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.getConnectionCustomizer();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
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
        hikariConfig1.maxLifetime = 0L;
        hikariConfig1.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.maxPoolSize = 84;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolationName = "HikariPool-11";
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        long long9 = hikariConfig1.connectionTimeout;
        boolean boolean10 = hikariConfig1.getisAutoCommit();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig13.getConnectionCustomizer();
        hikariConfig13.setDataSourceClassName("HikariPool-32");
        hikariConfig13.minPoolSize = 10;
        java.lang.String str19 = hikariConfig13.gettransactionIsolationName();
        int int20 = hikariConfig13.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-86", (java.lang.Object) hikariConfig13);
        long long22 = hikariConfig1.getMAX_LIFETIME();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-11" + "'", str8, "HikariPool-11");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariConfig5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.Properties properties8 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNull(hikariConfig1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(hikariConfig7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
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
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        boolean boolean3 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionTestQuery("HikariPool-31");
        hikariConfig1.setisJdbc4connectionTest(false);
        long long8 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        int int9 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.gettransactionIsolationName();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.setisAutoCommit(true);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        hikariConfig1.setConnectionTestQuery("HikariPool-48");
        int int15 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter11.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
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
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariDataSource21);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.maxPoolSize;
        java.lang.String str3 = hikariConfig1.getCatalog();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.catalog = "";
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.minPoolSize = 114;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        boolean boolean15 = hikariConfig1.getisInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource16();
        java.lang.String str22 = serializedObjectSupporter20.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter20.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter20.deserializeObjectHikariDataSource5();
        java.lang.String str25 = serializedObjectSupporter20.deserializeObjectString7();
        java.lang.String str26 = serializedObjectSupporter20.deserializeObjectString4();
        java.lang.String str27 = serializedObjectSupporter20.deserializeObjectString2();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter20;
        int int29 = hikariConfig1.getMinimumPoolSize();
        long long30 = hikariConfig1.getIdleTimeout();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(hikariDataSource21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str22, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariConfig23);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-32" + "'", str25, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str26, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str27, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = 49;
        hikariConfig0.setPoolName("HikariPool-10");
        int int6 = hikariConfig0.maxPoolSize;
        int int7 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter8.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter8.deserializeObjectHikariDataSource17();
        java.lang.String str14 = serializedObjectSupporter8.deserializeObjectString6();
        java.lang.String str15 = serializedObjectSupporter8.deserializeObjectString8();
        java.lang.String str16 = serializedObjectSupporter8.deserializeObjectString6();
        org.slf4j.impl.SimpleLogger simpleLogger17 = serializedObjectSupporter8.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter8;
        org.slf4j.impl.SimpleLogger simpleLogger20 = serializedObjectSupporter8.deserializeObjectLogger1();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SELECT 1" + "'", str10, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-33" + "'", str15, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str16, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(simpleLogger17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNotNull(simpleLogger20);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-18";
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.transactionIsolationName = "HikariPool-152";
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter12.deserializeObjectString7();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter12.deserializeObjectHikariConfig2();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter12;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-32" + "'", str15, "HikariPool-32");
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNull(hikariConfig17);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.setDataSourceClassName("HikariPool-32");
        hikariConfig1.minPoolSize = 10;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.util.Properties properties11 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties11);
        int int13 = hikariConfig1.acquireRetries;
        long long14 = hikariConfig1.idleTimeout;
        int int15 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }
}
