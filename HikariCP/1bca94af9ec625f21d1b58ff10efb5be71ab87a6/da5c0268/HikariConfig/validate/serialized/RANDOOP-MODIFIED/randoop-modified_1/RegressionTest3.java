import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean4 = hikariConfig3.isAutoCommit();
        hikariConfig3.idleTimeout = (short) 10;
        hikariConfig3.poolName = "";
        int int9 = hikariConfig3.getminPoolSize();
        boolean boolean10 = hikariConfig3.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        boolean boolean5 = hikariDataSource4.isIsolateInternalQueries();
        boolean boolean6 = hikariDataSource4.getisRegisterMbeans();
        boolean boolean7 = hikariDataSource4.isRegisterMbeans();
        boolean boolean8 = hikariDataSource4.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.zaxxer.hikari.HikariConfig.poolNumber = 9;
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig7.maxLifetime = 0;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString7();
        java.util.Properties properties10 = serializedObjectSupporter6.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariDataSource2.setDataSourceProperties(properties10);
        int int13 = hikariDataSource2.maxPoolSize;
        long long14 = hikariDataSource2.leakDetectionThreshold;
        int int15 = hikariDataSource2.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-32" + "'", str9, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        int int6 = hikariDataSource1.acquireRetries;
        boolean boolean7 = hikariDataSource1.isAutoCommit();
        boolean boolean8 = hikariDataSource1.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setMaximumPoolSize(5);
        int int7 = hikariDataSource2.acquireRetries;
        boolean boolean8 = hikariDataSource2.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        hikariDataSource2.setLeakDetectionThreshold((long) 10);
        boolean boolean7 = hikariDataSource2.getisInitializationFailFast();
        int int8 = hikariDataSource2.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        int int7 = hikariDataSource1.getMaximumPoolSize();
        long long8 = hikariDataSource1.maxLifetime;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        int int10 = hikariDataSource1.getAcquireRetries();
        hikariDataSource1.setisAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isRegisterMbeans = true;
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.transactionIsolationName = "VALUES 1";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        boolean boolean18 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        boolean boolean6 = hikariDataSource5.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str8 = hikariDataSource7.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.acquireRetries = 60;
        hikariConfig1.transactionIsolationName = "hi!";
        long long10 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.catalog = "HikariPool-6";
        hikariConfig1.setConnectionInitSql("HikariPool-30");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource1.catalog = "HikariPool-28";
        hikariDataSource1.setJdbcUrl("HikariPool-4");
        hikariDataSource1.idleTimeout = '4';
        long long22 = hikariDataSource1.getMaxLifetime();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter23.deserializeObjectHikariDataSource8();
        boolean boolean26 = hikariDataSource25.isIsolateInternalQueries;
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource25);
        java.util.Properties properties28 = hikariDataSource25.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource2.setisReadOnly(false);
        long long5 = hikariDataSource2.acquireRetryDelay;
        long long6 = hikariDataSource2.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.settransactionIsolationName("HikariPool-32");
        int int12 = hikariDataSource1.getTransactionIsolation();
        hikariDataSource1.jdbcUrl = "HikariPool-32";
        int int15 = hikariDataSource1.acquireIncrement;
        hikariDataSource1.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.settransactionIsolationName("HikariPool-32");
        boolean boolean12 = hikariDataSource1.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = hikariConfig0.serializedObjectSupporter;
        boolean boolean2 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.leakDetectionThreshold = 5;
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = hikariConfig0.serializedObjectSupporter;
        boolean boolean2 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean6 = hikariConfig0.getisAutoCommit();
        javax.sql.DataSource dataSource7 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.jdbcUrl;
        hikariConfig3.setConnectionInitSql("HikariPool-5");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig5.leakDetectionThreshold = 0L;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.isRegisterMbeans = false;
        java.lang.String str6 = hikariDataSource2.transactionIsolationName;
        hikariDataSource2.setCatalog("hi!");
        long long9 = hikariDataSource2.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties9 = hikariConfig8.dataSourceProperties;
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setUser");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str9 = hikariDataSource8.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        java.lang.String str7 = hikariDataSource1.getConnectionInitSql();
        int int8 = hikariDataSource1.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        boolean boolean5 = hikariConfig1.isReadOnly;
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        long long7 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource4.transactionIsolationName = "HikariPool-17";
        boolean boolean7 = hikariDataSource4.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.transactionIsolation = 9;
        int int13 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource3();
        java.lang.String str11 = hikariDataSource10.connectionInitSql;
        hikariDataSource10.isRegisterMbeans = false;
        java.lang.String str14 = hikariDataSource10.connectionCustomizerClassName;
        java.util.Properties properties15 = hikariDataSource10.getDataSourceProperties();
        hikariDataSource10.jdbcUrl = "TRANSACTION_REPEATABLE_READ";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter18.deserializeObjectHikariConfig2();
        int int21 = hikariConfig20.getAcquireRetries();
        hikariConfig20.catalog = "";
        java.util.Properties properties24 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariDataSource10.setDataSourceProperties(properties24);
        long long29 = hikariDataSource10.acquireRetryDelay;
        hikariConfig7.dataSource = hikariDataSource10;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertNotNull(hikariConfig20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.isJdbc4connectionTest = true;
        long long6 = hikariDataSource1.maxLifetime;
        java.lang.String str7 = hikariDataSource1.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer8;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.poolName = "HikariPool-28";
        hikariDataSource1.connectionTimeout = 100;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.setConnectionInitSql("HikariPool-6");
        hikariDataSource1.setisAutoCommit(true);
        java.util.Properties properties12 = hikariDataSource1.getDataSourceProperties();
        hikariDataSource1.setTransactionIsolation("hi!");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setIdleTimeout((long) 35);
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setConnectionInitSql("HikariPool-4");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-28" + "'", str12, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource3.setisInitializationFailFast(false);
        hikariDataSource3.catalog = "HikariPool-19";
        boolean boolean10 = hikariDataSource3.isInitializationFailFast();
        int int11 = hikariDataSource3.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig6.setmaxPoolSize(39);
        long long9 = hikariConfig6.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        boolean boolean5 = hikariDataSource2.getisAutoCommit();
        java.util.Properties properties6 = hikariDataSource2.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setminPoolSize((-1));
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig7.setCatalog("TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setConnectionTestQuery("");
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setCatalog("HikariPool-30");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int6 = hikariConfig5.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig2.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig2.getisRegisterMbeans();
        long long6 = hikariConfig2.getLeakDetectionThreshold();
        int int7 = hikariConfig2.getmaxPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig2.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        hikariDataSource9.catalog = "hi!";
        long long12 = hikariDataSource9.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource16();
        hikariDataSource14.catalog = "hi!";
        long long17 = hikariDataSource14.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource21 = hikariDataSource20.dataSource;
        hikariDataSource14.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        hikariDataSource9.setDataSource((javax.sql.DataSource) hikariDataSource20);
        java.lang.String str24 = hikariDataSource20.getJdbcUrl();
        hikariDataSource20.setAcquireRetries((int) '#');
        long long27 = hikariDataSource20.getCONNECTION_TIMEOUT();
        hikariDataSource1.addDataSourceProperty("", (java.lang.Object) hikariDataSource20);
        hikariDataSource1.setConnectionInitSql("HikariPool-6");
        java.lang.String str31 = hikariDataSource1.catalog;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter10.deserializeObjectHikariDataSource6();
        java.lang.String str17 = serializedObjectSupporter10.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        hikariDataSource8.addDataSourceProperty("HikariPool-19", (java.lang.Object) serializedObjectSupporter10);
        java.lang.String str21 = serializedObjectSupporter10.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32" + "'", str13, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SELECT 1" + "'", str17, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig18);
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-32" + "'", str21, "HikariPool-32");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        hikariConfig1.setJdbcUrl("HikariPool-6");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        long long9 = hikariDataSource8.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        java.lang.String str12 = hikariDataSource11.poolName;
        int int13 = hikariDataSource11.minPoolSize;
        java.lang.String str14 = hikariDataSource11.getPoolName();
        java.lang.String str15 = hikariDataSource11.getPoolName();
        hikariDataSource11.isJdbc4connectionTest = false;
        java.util.Properties properties18 = hikariDataSource11.dataSourceProperties;
        hikariDataSource8.setDataSourceProperties(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-28" + "'", str12, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28" + "'", str14, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28" + "'", str15, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        java.lang.String str12 = serializedObjectSupporter5.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        long long14 = hikariConfig13.idleTimeout;
        long long15 = hikariConfig13.getConnectionTimeout();
        java.lang.String str16 = hikariConfig13.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-32" + "'", str12, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        hikariConfig1.idleTimeout = 0L;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setpoolNumber((int) '4');
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        boolean boolean11 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        java.lang.String str12 = serializedObjectSupporter5.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        java.lang.String str14 = serializedObjectSupporter5.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter5.deserializeObjectHikariDataSource2();
        java.lang.String str16 = serializedObjectSupporter5.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-32" + "'", str12, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-33" + "'", str14, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.validate();
        boolean boolean9 = hikariDataSource1.isJdbc4connectionTest;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter10.deserializeObjectHikariConfig2();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString6();
        java.lang.String str15 = serializedObjectSupporter10.deserializeObjectString3();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.String str17 = serializedObjectSupporter10.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-6" + "'", str15, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-33" + "'", str17, "HikariPool-33");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str11 = hikariDataSource10.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        hikariConfig1.dataSource = hikariDataSource10;
        java.lang.String str12 = hikariDataSource10.getDataSourceClassName();
        javax.sql.DataSource dataSource13 = hikariDataSource10.getDataSource();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-28";
        long long8 = hikariConfig1.connectionTimeout;
        hikariConfig1.connectionInitSql = "";
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SELECT 1" + "'", str11, "SELECT 1");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setMinimumPoolSize((int) '#');
        hikariDataSource1.setPoolName("HikariPool-28");
        hikariDataSource1.setConnectionCustomizerClassName("");
        hikariDataSource1.minPoolSize = 35;
        hikariDataSource1.setDataSourceClassName("HikariPool-5");
        boolean boolean15 = hikariDataSource1.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig8.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource10.setReadOnly(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setMinimumPoolSize((int) 'a');
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        int int9 = hikariDataSource3.acquireRetries;
        hikariDataSource3.isAutoCommit = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setMaxLifetime(750L);
        hikariDataSource1.dataSourceClassName = "VALUES 1";
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        hikariDataSource1.isInitializationFailFast = false;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.isRegisterMbeans = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource9();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter10.deserializeObjectHikariDataSource7();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.String str16 = hikariDataSource1.getConnectionCustomizerClassName();
        boolean boolean17 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setInitializationFailFast(false);
        hikariDataSource1.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str13, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = hikariDataSource6.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str11 = hikariDataSource10.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource12 = hikariDataSource10.dataSource;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        javax.sql.DataSource dataSource6 = hikariDataSource1.dataSource;
        hikariDataSource1.connectionCustomizerClassName = "SELECT 1";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariDataSource1.connectionCustomizer;
        long long10 = hikariDataSource1.getConnectionTimeout();
        boolean boolean11 = hikariDataSource1.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        boolean boolean8 = hikariConfig3.isRegisterMbeans;
        hikariConfig3.leakDetectionThreshold = (byte) 1;
        hikariConfig3.setDataSourceClassName("SELECT 1");
        int int13 = hikariConfig3.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig8.isInitializationFailFast = true;
        hikariConfig8.setTransactionIsolation("HikariPool-32");
        hikariConfig8.setisJdbc4connectionTest(true);
        hikariConfig8.setminPoolSize(20);
        hikariConfig8.setMaxLifetime((long) 15);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        hikariDataSource12.maxLifetime = 0L;
        hikariDataSource12.setMinimumPoolSize((int) 'a');
        java.lang.String str17 = hikariDataSource12.jdbcUrl;
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        java.lang.String str19 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource5.setAcquireIncrement(25);
        long long8 = hikariDataSource5.getIdleTimeout();
        boolean boolean9 = hikariDataSource5.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig4.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = hikariDataSource3.serializedObjectSupporter;
        hikariDataSource3.setminPoolSize(0);
        int int7 = hikariDataSource3.getpoolNumber();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariDataSource3.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54 + "'", int7 == 54);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        boolean boolean22 = hikariDataSource12.isAutoCommit();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter23.deserializeObjectHikariDataSource10();
        hikariDataSource25.setInitializationFailFast(true);
        hikariDataSource25.setisIsolateInternalQueries(false);
        boolean boolean30 = hikariDataSource25.isJdbc4connectionTest;
        hikariDataSource12.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource25);
        int int32 = hikariDataSource25.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        hikariDataSource2.setJdbcUrl("HikariPool-30");
        long long7 = hikariDataSource2.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        hikariDataSource2.setisIsolateInternalQueries(false);
        boolean boolean6 = hikariDataSource2.isIsolateInternalQueries();
        hikariDataSource2.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource17.setIsolateInternalQueries(false);
        java.lang.String str24 = hikariDataSource17.getConnectionCustomizerClassName();
        long long25 = hikariDataSource17.getConnectionTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter27 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter27.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = serializedObjectSupporter27.deserializeObjectHikariConfig2();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter27.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter27.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = serializedObjectSupporter27.deserializeObjectHikariConfig3();
        hikariConfig33.connectionInitSql = "HikariPool-28";
        long long36 = hikariConfig33.getConnectionTimeout();
        hikariDataSource17.addDataSourceProperty("VALUES 1", (java.lang.Object) hikariConfig33);
        hikariDataSource17.setConnectionTestQuery("HikariPool-4");
        java.lang.String str40 = hikariDataSource17.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNotNull(hikariConfig28);
        org.junit.Assert.assertNotNull(hikariConfig29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str30, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource31);
        org.junit.Assert.assertNotNull(hikariDataSource32);
        org.junit.Assert.assertNotNull(hikariConfig33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-4" + "'", str40, "HikariPool-4");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.maxLifetime = 2;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        long long9 = hikariConfig8.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        long long7 = hikariDataSource6.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariConfig11);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setMinimumPoolSize((int) 'a');
        boolean boolean8 = hikariDataSource3.isJdbc4ConnectionTest();
        hikariDataSource3.setConnectionInitSql("");
        hikariDataSource3.idleTimeout = 1800000L;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter13.deserializeObjectHikariConfig3();
        java.lang.String str18 = serializedObjectSupporter13.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter13.deserializeObjectHikariConfig3();
        long long20 = hikariConfig19.maxLifetime;
        hikariDataSource3.copyState(hikariConfig19);
        java.lang.String str22 = hikariConfig19.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SELECT 1" + "'", str18, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        hikariDataSource12.maxLifetime = 0L;
        hikariDataSource12.setMinimumPoolSize((int) 'a');
        java.lang.String str17 = hikariDataSource12.jdbcUrl;
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource12.setminPoolSize(11);
        boolean boolean21 = hikariDataSource12.getisInitializationFailFast();
        boolean boolean22 = hikariDataSource12.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean6 = hikariConfig5.isReadOnly;
        hikariConfig5.setAcquireRetries(22);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter5.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter5.deserializeObjectHikariDataSource8();
        hikariDataSource14.setisReadOnly(true);
        hikariDataSource14.setTransactionIsolation("HikariPool-7");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.setisReadOnly(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        hikariDataSource17.setUseInstrumentation(true);
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource17);
        java.lang.String str21 = hikariDataSource17.transactionIsolationName;
        java.lang.String str22 = hikariDataSource17.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig8.setAutoCommit(true);
        java.lang.String str11 = hikariConfig8.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource7.isIsolateInternalQueries = false;
        java.lang.String str10 = hikariDataSource7.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean5 = hikariDataSource4.getisJdbc4connectionTest();
        int int6 = hikariDataSource4.getMaximumPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource8();
        java.lang.String str13 = serializedObjectSupporter8.deserializeObjectString8();
        java.lang.String str14 = serializedObjectSupporter8.deserializeObjectString5();
        hikariDataSource4.addDataSourceProperty("HikariPool-28", (java.lang.Object) serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-33" + "'", str13, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        boolean boolean7 = hikariDataSource1.getisRegisterMbeans();
        hikariDataSource1.setisJdbc4connectionTest(false);
        int int10 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        hikariDataSource1.setMaxLifetime(5000L);
        long long9 = hikariDataSource1.maxLifetime;
        java.lang.String str10 = hikariDataSource1.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-28" + "'", str10, "HikariPool-28");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        long long3 = hikariDataSource2.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource16();
        java.lang.String str6 = hikariDataSource5.poolName;
        int int7 = hikariDataSource5.minPoolSize;
        java.lang.String str8 = hikariDataSource5.getPoolName();
        java.lang.String str9 = hikariDataSource5.getPoolName();
        hikariDataSource5.isJdbc4connectionTest = false;
        java.util.Properties properties12 = hikariDataSource5.dataSourceProperties;
        hikariDataSource2.setDataSourceProperties(properties12);
        java.lang.String str14 = hikariDataSource2.getConnectionTestQuery();
        hikariDataSource2.setIdleTimeout((long) 15);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-28" + "'", str6, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-28" + "'", str8, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-28" + "'", str9, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "VALUES 1" + "'", str14, "VALUES 1");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        long long6 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource7.setpoolNumber(111);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean4 = hikariConfig3.isAutoCommit();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.setminPoolSize((int) (short) 1);
        hikariDataSource6.validate();
        boolean boolean10 = hikariDataSource6.isJdbc4connectionTest;
        int int11 = hikariDataSource6.getMinimumPoolSize();
        hikariDataSource6.setMaxLifetime(5000L);
        long long14 = hikariDataSource6.maxLifetime;
        hikariConfig3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource6);
        boolean boolean16 = hikariConfig3.isRegisterMbeans();
        int int17 = hikariConfig3.transactionIsolation;
        java.lang.Class<?> wildcardClass18 = hikariConfig3.getClass();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str2 = hikariDataSource1.getCatalog();
        hikariDataSource1.transactionIsolationName = "HikariPool-11";
        java.lang.String str5 = hikariDataSource1.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        int int5 = hikariDataSource1.minPoolSize;
        long long6 = hikariDataSource1.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int7 = hikariDataSource6.getminPoolSize();
        hikariDataSource6.setTransactionIsolation("HikariPool-4");
        java.lang.String str10 = hikariDataSource6.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource1.catalog = "HikariPool-28";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariDataSource1.getConnectionCustomizer();
        long long19 = hikariDataSource1.getAcquireRetryDelay();
        hikariDataSource1.setminPoolSize(0);
        hikariDataSource1.connectionCustomizerClassName = "hi!";
        java.lang.String str24 = hikariDataSource1.connectionInitSql;
        boolean boolean25 = hikariDataSource1.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.setAcquireIncrement(19);
        int int11 = hikariDataSource3.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str11 = hikariConfig10.dataSourceClassName;
        hikariConfig10.setReadOnly(true);
        hikariConfig10.setConnectionTestQuery("SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        int int7 = hikariDataSource1.getMaximumPoolSize();
        long long8 = hikariDataSource1.maxLifetime;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        boolean boolean10 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setisIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig5.connectionCustomizer = iConnectionCustomizer6;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.dataSourceClassName = "HikariPool-28";
        javax.sql.DataSource dataSource5 = hikariDataSource2.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        int int5 = hikariDataSource4.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource7.dataSourceClassName = "SELECT 1";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource6.acquireIncrement = 35;
        java.lang.String str9 = hikariDataSource6.jdbcUrl;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource6.getConnectionCustomizer();
        java.lang.String str11 = hikariDataSource6.catalog;
        long long12 = hikariDataSource6.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean4 = hikariConfig3.isAutoCommit();
        hikariConfig3.setIdleTimeout(0L);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int11 = hikariConfig10.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource17.setIsolateInternalQueries(false);
        java.lang.String str24 = hikariDataSource17.getConnectionCustomizerClassName();
        long long25 = hikariDataSource17.getConnectionTimeout();
        hikariDataSource17.setIsolateInternalQueries(true);
        hikariDataSource17.minPoolSize = 10;
        hikariDataSource17.setIsolateInternalQueries(false);
        long long32 = hikariDataSource17.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.settransactionIsolationName("HikariPool-6");
        hikariDataSource1.isAutoCommit = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        hikariConfig6.isAutoCommit = false;
        hikariConfig6.setisJdbc4connectionTest(false);
        hikariConfig6.setJdbcUrl("HikariPool-4");
        hikariConfig6.setAcquireIncrement(9);
        hikariConfig6.acquireRetries = 52;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.acquireRetries = 60;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource5();
        hikariConfig1.dataSource = hikariDataSource12;
        hikariConfig1.setPoolName("HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        long long16 = hikariDataSource12.getMAX_LIFETIME();
        long long17 = hikariDataSource12.getACQUIRE_RETRY_DELAY();
        long long18 = hikariDataSource12.connectionTimeout;
        hikariDataSource12.setInitializationFailFast(false);
        hikariDataSource12.maxPoolSize = 6;
        long long23 = hikariDataSource12.leakDetectionThreshold;
        long long24 = hikariDataSource12.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 750L + "'", long24 == 750L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionTimeout = 2;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        long long12 = hikariConfig1.getACQUIRE_RETRY_DELAY();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionCustomizerClassName = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.setMaxLifetime((long) 9);
        boolean boolean7 = hikariConfig4.getisIsolateInternalQueries();
        hikariConfig4.setAutoCommit(true);
        long long10 = hikariConfig4.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SELECT 1" + "'", str10, "SELECT 1");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.idleTimeout = '4';
        int int11 = hikariDataSource3.acquireRetries;
        hikariDataSource3.poolName = "HikariPool-33";
        long long14 = hikariDataSource3.getAcquireRetryDelay();
        long long15 = hikariDataSource3.getCONNECTION_TIMEOUT();
        java.lang.String str16 = hikariDataSource3.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource17.setIsolateInternalQueries(false);
        long long24 = hikariDataSource17.getLeakDetectionThreshold();
        hikariDataSource17.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter27 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter27.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter27.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter27.deserializeObjectHikariDataSource17();
        hikariDataSource30.maxLifetime = 0L;
        hikariDataSource30.setisReadOnly(true);
        hikariDataSource30.transactionIsolationName = "hi!";
        hikariDataSource17.setDataSource((javax.sql.DataSource) hikariDataSource30);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter38 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariDataSource30.serializedObjectSupporter = serializedObjectSupporter38;
        java.lang.String str40 = serializedObjectSupporter38.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource41 = serializedObjectSupporter38.deserializeObjectHikariDataSource16();
        hikariDataSource41.setIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource28);
        org.junit.Assert.assertNotNull(hikariDataSource29);
        org.junit.Assert.assertNotNull(hikariDataSource30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-33" + "'", str40, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource41);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        boolean boolean4 = hikariDataSource1.isInitializationFailFast;
        int int5 = hikariDataSource1.minPoolSize;
        hikariDataSource1.acquireRetries = 8;
        hikariDataSource1.setCatalog("HikariPool-17");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource1.catalog = "HikariPool-28";
        hikariDataSource1.setJdbcUrl("HikariPool-4");
        hikariDataSource1.idleTimeout = '4';
        long long22 = hikariDataSource1.getMaxLifetime();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter23.deserializeObjectHikariDataSource8();
        boolean boolean26 = hikariDataSource25.isIsolateInternalQueries;
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource25);
        long long28 = hikariDataSource1.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        long long7 = hikariConfig1.idleTimeout;
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        hikariConfig1.connectionTestQuery = "hi!";
        hikariConfig1.maxLifetime = (short) -1;
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        int int12 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource5.catalog = "TRANSACTION_REPEATABLE_READ";
        hikariDataSource5.setAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = 60;
        hikariConfig0.setisReadOnly(true);
        hikariConfig0.setisIsolateInternalQueries(false);
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = hikariDataSource3.serializedObjectSupporter;
        hikariDataSource3.setminPoolSize(0);
        hikariDataSource3.idleTimeout = 36;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        boolean boolean8 = hikariConfig3.isRegisterMbeans;
        hikariConfig3.leakDetectionThreshold = (byte) 1;
        hikariConfig3.setDataSourceClassName("SELECT 1");
        hikariConfig3.connectionCustomizerClassName = "HikariPool-19";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-28");
        hikariConfig1.setmaxPoolSize(0);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean11 = hikariDataSource10.isRegisterMbeans();
        boolean boolean12 = hikariDataSource10.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource7.connectionTimeout = 3;
        hikariDataSource7.connectionTestQuery = "SELECT 1";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.settransactionIsolationName("HikariPool-32");
        int int12 = hikariDataSource1.getTransactionIsolation();
        hikariDataSource1.jdbcUrl = "HikariPool-32";
        int int15 = hikariDataSource1.acquireIncrement;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariDataSource1.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        hikariDataSource12.maxLifetime = 0L;
        hikariDataSource12.setMinimumPoolSize((int) 'a');
        java.lang.String str17 = hikariDataSource12.jdbcUrl;
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource12.setminPoolSize(11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariDataSource12.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.dataSourceClassName = "HikariPool-28";
        long long5 = hikariDataSource2.idleTimeout;
        long long6 = hikariDataSource2.getIDLE_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = hikariDataSource2.serializedObjectSupporter;
        hikariDataSource2.setminPoolSize(30);
        hikariDataSource2.jdbcUrl = "hi!";
        javax.sql.DataSource dataSource12 = hikariDataSource2.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.dataSourceClassName = "HikariPool-28";
        boolean boolean5 = hikariDataSource2.isAutoCommit;
        hikariDataSource2.validate();
        hikariDataSource2.setLeakDetectionThreshold(1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean5 = hikariDataSource4.getisJdbc4connectionTest();
        java.lang.String str6 = hikariDataSource4.connectionTestQuery;
        hikariDataSource4.setConnectionCustomizerClassName("VALUES 1");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isReadOnly = false;
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.minPoolSize = '#';
        hikariConfig1.connectionInitSql = "HikariPool-30";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        hikariDataSource7.catalog = "hi!";
        long long10 = hikariDataSource7.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        hikariDataSource12.catalog = "hi!";
        long long15 = hikariDataSource12.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter16.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource19 = hikariDataSource18.dataSource;
        hikariDataSource12.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource18);
        hikariDataSource7.setDataSource((javax.sql.DataSource) hikariDataSource18);
        hikariDataSource18.setPoolName("HikariPool-32");
        hikariDataSource5.setDataSource((javax.sql.DataSource) hikariDataSource18);
        hikariDataSource5.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str6 = hikariDataSource5.getPoolName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-11" + "'", str6, "HikariPool-11");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        boolean boolean4 = hikariDataSource3.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.acquireRetries = 60;
        hikariConfig1.transactionIsolationName = "hi!";
        long long10 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.catalog = "HikariPool-6";
        hikariConfig1.setConnectionInitSql("HikariPool-30");
        boolean boolean15 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource17.setIsolateInternalQueries(false);
        java.lang.String str24 = hikariDataSource17.getConnectionCustomizerClassName();
        long long25 = hikariDataSource17.getConnectionTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter27 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter27.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = serializedObjectSupporter27.deserializeObjectHikariConfig2();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter27.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter27.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = serializedObjectSupporter27.deserializeObjectHikariConfig3();
        hikariConfig33.connectionInitSql = "HikariPool-28";
        long long36 = hikariConfig33.getConnectionTimeout();
        hikariDataSource17.addDataSourceProperty("VALUES 1", (java.lang.Object) hikariConfig33);
        hikariConfig33.setIsolateInternalQueries(false);
        hikariConfig33.setisJdbc4connectionTest(false);
        int int42 = hikariConfig33.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNotNull(hikariConfig28);
        org.junit.Assert.assertNotNull(hikariConfig29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str30, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource31);
        org.junit.Assert.assertNotNull(hikariDataSource32);
        org.junit.Assert.assertNotNull(hikariConfig33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig3.setminPoolSize(22);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        int int12 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setAutoCommit(false);
        hikariDataSource1.setConnectionTestQuery("VALUES 1");
        java.lang.String str17 = hikariDataSource1.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "VALUES 1" + "'", str17, "VALUES 1");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = 60;
        hikariConfig0.jdbcUrl = "TRANSACTION_REPEATABLE_READ";
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold(750L);
        java.lang.String str13 = hikariConfig1.poolName;
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        hikariDataSource2.connectionTestQuery = "HikariPool-32";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        java.lang.String str12 = hikariConfig11.getJdbcUrl();
        hikariConfig11.leakDetectionThreshold = 1;
        hikariDataSource2.copyState(hikariConfig11);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter17.deserializeObjectHikariConfig2();
        hikariConfig18.poolName = "";
        boolean boolean21 = hikariConfig18.getisJdbc4connectionTest();
        hikariConfig18.setisRegisterMbeans(false);
        hikariConfig18.setTransactionIsolation("HikariPool-28");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig18.connectionCustomizer;
        int int27 = hikariConfig18.transactionIsolation;
        long long28 = hikariConfig18.getLeakDetectionThreshold();
        hikariDataSource2.addDataSourceProperty("HikariPool-33", (java.lang.Object) long28);
        hikariDataSource2.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(hikariConfig18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str6 = hikariDataSource5.connectionInitSql;
        hikariDataSource5.connectionTimeout = 1800000L;
        hikariDataSource5.transactionIsolationName = "HikariPool-11";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource6.idleTimeout = 58;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setIdleTimeout((long) 35);
        int int12 = hikariConfig1.acquireIncrement;
        long long13 = hikariConfig1.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource6.acquireIncrement = 35;
        java.lang.String str9 = hikariDataSource6.jdbcUrl;
        long long10 = hikariDataSource6.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        hikariConfig3.setConnectionCustomizerClassName("TRANSACTION_REPEATABLE_READ");
        java.lang.String str10 = hikariConfig3.connectionInitSql;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig3.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.getJdbcUrl();
        hikariConfig3.leakDetectionThreshold = 1;
        int int7 = hikariConfig3.getTransactionIsolation();
        int int8 = hikariConfig3.maxPoolSize;
        hikariConfig3.setReadOnly(true);
        boolean boolean11 = hikariConfig3.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource4.setJdbcUrl("HikariPool-19");
        boolean boolean7 = hikariDataSource4.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource4.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource4.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        long long9 = hikariDataSource4.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.util.Properties properties8 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties8);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource1.catalog = "HikariPool-28";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter18.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter18.deserializeObjectHikariDataSource6();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str26 = serializedObjectSupporter18.deserializeObjectString7();
        java.lang.String str27 = serializedObjectSupporter18.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter18.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertNotNull(hikariConfig20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-32" + "'", str21, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig22);
        org.junit.Assert.assertNotNull(hikariDataSource23);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-32" + "'", str26, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-32" + "'", str27, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource28);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter5.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter5.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter5.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        int int4 = hikariConfig2.getTransactionIsolation();
        boolean boolean5 = hikariConfig2.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        long long9 = hikariDataSource8.getIDLE_TIMEOUT();
        hikariDataSource8.poolName = "HikariPool-30";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource4.setMinimumPoolSize((int) (short) 1);
        hikariDataSource4.setisRegisterMbeans(true);
        int int11 = hikariDataSource4.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig7.dataSourceClassName = "HikariPool-17";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource7.setMinimumPoolSize(31);
        long long10 = hikariDataSource7.maxLifetime;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        java.util.Properties properties16 = hikariDataSource1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        boolean boolean6 = hikariDataSource5.isRegisterMbeans();
        long long7 = hikariDataSource5.getCONNECTION_TIMEOUT();
        hikariDataSource5.catalog = "HikariPool-17";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean4 = hikariConfig3.isAutoCommit();
        hikariConfig3.idleTimeout = (short) 10;
        hikariConfig3.idleTimeout = 2;
        long long9 = hikariConfig3.maxLifetime;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        boolean boolean8 = hikariConfig3.isRegisterMbeans;
        hikariConfig3.leakDetectionThreshold = (byte) 1;
        boolean boolean11 = hikariConfig3.isJdbc4connectionTest;
        int int12 = hikariConfig3.transactionIsolation;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig3.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL VALUES 1");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString7();
        java.util.Properties properties10 = serializedObjectSupporter6.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariDataSource2.setDataSourceProperties(properties10);
        hikariDataSource2.setCatalog("hi!");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariDataSource2.connectionCustomizer = iConnectionCustomizer15;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-32" + "'", str9, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.zaxxer.hikari.HikariConfig.poolNumber = 59;
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-33" + "'", str11, "HikariPool-33");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.acquireRetries = 60;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isAutoCommit = false;
        int int11 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource9.setMaximumPoolSize(100);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.catalog = "HikariPool-28";
        hikariConfig1.acquireRetries = 35;
        long long15 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setmaxPoolSize((int) '4');
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-32" + "'", str19, "HikariPool-32");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.dataSourceClassName = "HikariPool-28";
        boolean boolean5 = hikariDataSource2.isAutoCommit;
        boolean boolean6 = hikariDataSource2.getisInitializationFailFast();
        hikariDataSource2.setRegisterMbeans(true);
        boolean boolean9 = hikariDataSource2.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig2.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig2.getisRegisterMbeans();
        hikariConfig2.setisReadOnly(true);
        java.lang.String str8 = hikariConfig2.catalog;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        int int6 = hikariDataSource1.acquireRetries;
        javax.sql.DataSource dataSource7 = hikariDataSource1.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean5 = hikariConfig4.getisReadOnly();
        int int6 = hikariConfig4.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        int int10 = hikariConfig1.transactionIsolation;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        long long12 = hikariConfig1.getMAX_LIFETIME();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        long long6 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.acquireRetryDelay = 28;
        hikariConfig1.setMaxLifetime((long) 7);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig6.setAcquireIncrement((int) (byte) 1);
        javax.sql.DataSource dataSource9 = hikariConfig6.getDataSource();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str6 = hikariDataSource5.connectionInitSql;
        hikariDataSource5.transactionIsolationName = "HikariPool-7";
        long long9 = hikariDataSource5.getIDLE_TIMEOUT();
        boolean boolean10 = hikariDataSource5.isReadOnly();
        java.lang.String str11 = hikariDataSource5.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString7();
        java.util.Properties properties17 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.dataSourceProperties = properties17;
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        int int21 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.poolName = "TRANSACTION_REPEATABLE_READ";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        hikariDataSource9.catalog = "hi!";
        long long12 = hikariDataSource9.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource16();
        hikariDataSource14.catalog = "hi!";
        long long17 = hikariDataSource14.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource21 = hikariDataSource20.dataSource;
        hikariDataSource14.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        hikariDataSource9.setDataSource((javax.sql.DataSource) hikariDataSource20);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter24 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter24.deserializeObjectHikariDataSource16();
        java.lang.String str26 = hikariDataSource25.poolName;
        hikariDataSource25.setisReadOnly(true);
        hikariDataSource20.setDataSource((javax.sql.DataSource) hikariDataSource25);
        boolean boolean30 = hikariDataSource20.isAutoCommit();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariDataSource20.connectionCustomizer;
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource20);
        int int33 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-28" + "'", str26, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource8.setisInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        boolean boolean3 = hikariConfig2.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.catalog = "HikariPool-28";
        long long13 = hikariConfig1.connectionTimeout;
        hikariConfig1.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        boolean boolean18 = hikariConfig1.isAutoCommit;
        java.lang.String str19 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = hikariConfig0.serializedObjectSupporter;
        long long2 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.isInitializationFailFast = false;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.connectionInitSql;
        hikariConfig3.setisIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig3.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        boolean boolean7 = hikariDataSource1.getisInitializationFailFast();
        hikariDataSource1.setpoolNumber(22);
        hikariDataSource1.maxPoolSize = 3;
        hikariDataSource1.setIdleTimeout((long) 10);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource6.acquireIncrement = 35;
        java.lang.String str9 = hikariDataSource6.dataSourceClassName;
        java.lang.String str10 = hikariDataSource6.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        java.lang.String str7 = hikariDataSource2.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str6 = hikariConfig5.connectionTestQuery;
        boolean boolean7 = hikariConfig5.getisJdbc4connectionTest();
        int int8 = hikariConfig5.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource9();
        hikariDataSource11.acquireIncrement = '#';
        java.util.Properties properties14 = hikariDataSource11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariDataSource8.setDataSourceProperties(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-28";
        long long8 = hikariConfig1.connectionTimeout;
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean11 = hikariConfig1.getisReadOnly();
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        java.util.Properties properties5 = hikariDataSource2.getDataSourceProperties();
        int int6 = hikariDataSource2.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource17.setIsolateInternalQueries(false);
        long long24 = hikariDataSource17.getLeakDetectionThreshold();
        hikariDataSource17.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter27 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter27.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter27.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter27.deserializeObjectHikariDataSource17();
        hikariDataSource30.maxLifetime = 0L;
        hikariDataSource30.setisReadOnly(true);
        hikariDataSource30.transactionIsolationName = "hi!";
        hikariDataSource17.setDataSource((javax.sql.DataSource) hikariDataSource30);
        hikariDataSource17.poolName = "HikariPool-32";
        hikariDataSource17.connectionTimeout = (byte) 10;
        long long42 = hikariDataSource17.getAcquireRetryDelay();
        int int43 = hikariDataSource17.getmaxPoolSize();
        hikariDataSource17.isJdbc4connectionTest = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource28);
        org.junit.Assert.assertNotNull(hikariDataSource29);
        org.junit.Assert.assertNotNull(hikariDataSource30);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.acquireIncrement = 3;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource13();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter8;
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.lang.String str16 = hikariConfig15.getConnectionTestQuery();
        long long17 = hikariConfig15.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SELECT 1" + "'", str16, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        long long16 = hikariDataSource12.getMAX_LIFETIME();
        long long17 = hikariDataSource12.getACQUIRE_RETRY_DELAY();
        long long18 = hikariDataSource12.connectionTimeout;
        boolean boolean19 = hikariDataSource12.getisReadOnly();
        hikariDataSource12.maxPoolSize = 3;
        boolean boolean22 = hikariDataSource12.isRegisterMbeans();
        java.lang.String str23 = hikariDataSource12.catalog;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource5.setAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource5.minPoolSize = (short) 10;
        hikariDataSource5.setCatalog("HikariPool-11");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str9 = hikariDataSource8.transactionIsolationName;
        java.lang.String str10 = hikariDataSource8.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        hikariDataSource11.catalog = "hi!";
        long long14 = hikariDataSource11.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource18 = hikariDataSource17.dataSource;
        hikariDataSource11.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource17);
        hikariDataSource6.setDataSource((javax.sql.DataSource) hikariDataSource17);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource16();
        java.lang.String str23 = hikariDataSource22.poolName;
        hikariDataSource22.setisReadOnly(true);
        hikariDataSource17.setDataSource((javax.sql.DataSource) hikariDataSource22);
        hikariDataSource17.isJdbc4connectionTest = false;
        hikariDataSource17.setReadOnly(false);
        hikariDataSource4.setDataSource((javax.sql.DataSource) hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-28" + "'", str23, "HikariPool-28");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        int int7 = hikariDataSource1.getMaximumPoolSize();
        long long8 = hikariDataSource1.maxLifetime;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        long long10 = hikariDataSource1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        hikariConfig1.settransactionIsolationName("HikariPool-28");
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.maxLifetime;
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.isIsolateInternalQueries = true;
        hikariDataSource1.idleTimeout = 35;
        hikariDataSource1.maxLifetime = 0L;
        java.lang.String str11 = hikariDataSource1.connectionCustomizerClassName;
        long long12 = hikariDataSource1.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        hikariConfig1.dataSource = hikariDataSource10;
        long long12 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        int int6 = hikariDataSource3.acquireRetries;
        hikariDataSource3.setAcquireRetryDelay((long) 29);
        boolean boolean9 = hikariDataSource3.isReadOnly;
        long long10 = hikariDataSource3.getMaxLifetime();
        boolean boolean11 = hikariDataSource3.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        int int15 = hikariConfig14.acquireIncrement;
        int int16 = hikariConfig14.getMaximumPoolSize();
        boolean boolean17 = hikariConfig14.isAutoCommit;
        hikariConfig14.minPoolSize = 39;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource6.setPoolName("SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.isRegisterMbeans = false;
        javax.sql.DataSource dataSource7 = hikariConfig4.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int7 = hikariConfig6.getminPoolSize();
        java.lang.String str8 = hikariConfig6.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource17.setIsolateInternalQueries(false);
        long long24 = hikariDataSource17.getLeakDetectionThreshold();
        hikariDataSource17.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter27 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter27.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter27.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter27.deserializeObjectHikariDataSource17();
        hikariDataSource30.maxLifetime = 0L;
        hikariDataSource30.setisReadOnly(true);
        hikariDataSource30.transactionIsolationName = "hi!";
        hikariDataSource17.setDataSource((javax.sql.DataSource) hikariDataSource30);
        hikariDataSource17.poolName = "HikariPool-32";
        hikariDataSource17.connectionTimeout = (byte) 10;
        long long42 = hikariDataSource17.getAcquireRetryDelay();
        int int43 = hikariDataSource17.getmaxPoolSize();
        hikariDataSource17.connectionInitSql = "TRANSACTION_REPEATABLE_READ";
        boolean boolean46 = hikariDataSource17.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource28);
        org.junit.Assert.assertNotNull(hikariDataSource29);
        org.junit.Assert.assertNotNull(hikariDataSource30);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource6.acquireIncrement = 35;
        java.lang.String str9 = hikariDataSource6.jdbcUrl;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource6.getConnectionCustomizer();
        java.lang.String str11 = hikariDataSource6.catalog;
        hikariDataSource6.setminPoolSize(9);
        hikariDataSource6.setminPoolSize(6);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        hikariDataSource9.catalog = "hi!";
        long long12 = hikariDataSource9.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource16();
        hikariDataSource14.catalog = "hi!";
        long long17 = hikariDataSource14.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource21 = hikariDataSource20.dataSource;
        hikariDataSource14.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        hikariDataSource9.setDataSource((javax.sql.DataSource) hikariDataSource20);
        java.lang.String str24 = hikariDataSource20.getJdbcUrl();
        hikariDataSource20.setAcquireRetries((int) '#');
        long long27 = hikariDataSource20.getCONNECTION_TIMEOUT();
        hikariDataSource1.addDataSourceProperty("", (java.lang.Object) hikariDataSource20);
        java.lang.String str29 = hikariDataSource1.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setAcquireRetryDelay((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-28" + "'", str29, "HikariPool-28");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.acquireIncrement = (byte) -1;
        hikariConfig1.setisIsolateInternalQueries(false);
        hikariConfig1.minPoolSize = 55;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        int int6 = hikariDataSource3.acquireRetries;
        hikariDataSource3.setAcquireRetryDelay((long) 29);
        boolean boolean9 = hikariDataSource3.isReadOnly;
        javax.sql.DataSource dataSource10 = hikariDataSource3.dataSource;
        java.util.Properties properties11 = hikariDataSource3.dataSourceProperties;
        hikariDataSource3.setDataSourceClassName("VALUES 1");
        hikariDataSource3.setConnectionInitSql("HikariPool-11");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = 60;
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        boolean boolean6 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        hikariDataSource1.setMaxLifetime(5000L);
        hikariDataSource1.setLeakDetectionThreshold((long) (short) 1);
        hikariDataSource1.minPoolSize = (-1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.setUseInstrumentation(true);
        hikariConfig4.catalog = "HikariPool-11";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        int int5 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isReadOnly = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        javax.sql.DataSource dataSource6 = hikariDataSource1.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer7;
        java.util.Properties properties9 = hikariDataSource1.dataSourceProperties;
        hikariDataSource1.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        int int12 = hikariDataSource1.acquireIncrement;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.dataSourceClassName = "HikariPool-28";
        long long5 = hikariDataSource2.idleTimeout;
        long long6 = hikariDataSource2.getIDLE_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = hikariDataSource2.serializedObjectSupporter;
        hikariDataSource2.transactionIsolationName = "SELECT 1";
        java.lang.String str10 = hikariDataSource2.catalog;
        hikariDataSource2.maxPoolSize = 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        long long10 = hikariDataSource9.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str9 = hikariDataSource8.connectionCustomizerClassName;
        java.lang.String str10 = hikariDataSource8.getJdbcUrl();
        hikariDataSource8.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        boolean boolean7 = hikariDataSource1.getisRegisterMbeans();
        hikariDataSource1.poolName = "HikariPool-28";
        long long10 = hikariDataSource1.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.idleTimeout = '4';
        boolean boolean11 = hikariDataSource3.getisInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariDataSource3.getConnectionCustomizer();
        boolean boolean13 = hikariDataSource3.isReadOnly();
        boolean boolean14 = hikariDataSource3.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        int int4 = hikariDataSource2.getpoolNumber();
        hikariDataSource2.connectionTestQuery = "HikariPool-15";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 24 + "'", int4 == 24);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-6" + "'", str9, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource8.setReadOnly(false);
        hikariDataSource8.setAcquireRetryDelay((long) 2);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        long long7 = hikariConfig6.connectionTimeout;
        int int8 = hikariConfig6.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 24 + "'", int8 == 24);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setInitializationFailFast(true);
        hikariDataSource2.setisIsolateInternalQueries(false);
        java.lang.String str7 = hikariDataSource2.connectionInitSql;
        int int8 = hikariDataSource2.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = hikariConfig4.dataSourceClassName;
        hikariConfig4.setLeakDetectionThreshold(5000L);
        java.lang.String str8 = hikariConfig4.jdbcUrl;
        hikariConfig4.maxPoolSize = (short) 10;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        hikariDataSource1.connectionTestQuery = "hi!";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariDataSource1.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        long long16 = hikariDataSource12.getMAX_LIFETIME();
        long long17 = hikariDataSource12.getACQUIRE_RETRY_DELAY();
        long long18 = hikariDataSource12.connectionTimeout;
        boolean boolean19 = hikariDataSource12.getisReadOnly();
        hikariDataSource12.maxPoolSize = 3;
        boolean boolean22 = hikariDataSource12.isRegisterMbeans();
        java.lang.String str23 = hikariDataSource12.catalog;
        java.lang.String str24 = hikariDataSource12.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource4.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource4.setMaximumPoolSize((int) '#');
        hikariDataSource4.setMaxLifetime(0L);
        java.lang.String str11 = hikariDataSource4.jdbcUrl;
        boolean boolean12 = hikariDataSource4.getisReadOnly();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariDataSource4.connectionCustomizer = iConnectionCustomizer13;
        java.lang.String str15 = hikariDataSource4.getPoolName();
        int int16 = hikariDataSource4.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-17" + "'", str15, "HikariPool-17");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setisJdbc4connectionTest(true);
        long long10 = hikariConfig1.getACQUIRE_RETRY_DELAY();
        hikariConfig1.idleTimeout = 14;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.getConnectionCustomizer();
        long long14 = hikariConfig1.getCONNECTION_TIMEOUT();
        hikariConfig1.setTransactionIsolation("HikariPool-17");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean7 = hikariDataSource6.getisRegisterMbeans();
        boolean boolean8 = hikariDataSource6.getisAutoCommit();
        hikariDataSource6.dataSourceClassName = "VALUES 1";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setMinimumPoolSize((int) '#');
        boolean boolean7 = hikariDataSource1.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 24 + "'", int4 == 24);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = hikariDataSource4.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        boolean boolean5 = hikariDataSource2.getisAutoCommit();
        java.lang.String str6 = hikariDataSource2.poolName;
        long long7 = hikariDataSource2.getACQUIRE_RETRY_DELAY();
        int int8 = hikariDataSource2.getTransactionIsolation();
        hikariDataSource2.connectionCustomizerClassName = "HikariPool-15";
        java.lang.String str11 = hikariDataSource2.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-4" + "'", str6, "HikariPool-4");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        boolean boolean4 = hikariDataSource1.isInitializationFailFast;
        long long5 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.settransactionIsolationName("HikariPool-5");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int5 = hikariConfig4.transactionIsolation;
        java.lang.String str6 = hikariConfig4.connectionInitSql;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        hikariConfig4.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.String str15 = hikariConfig4.connectionTestQuery;
        boolean boolean16 = hikariConfig4.getisRegisterMbeans();
        java.lang.String str17 = hikariConfig4.gettransactionIsolationName();
        int int18 = hikariConfig4.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource16();
        java.lang.String str21 = hikariDataSource20.poolName;
        hikariDataSource20.setisReadOnly(true);
        long long24 = hikariDataSource20.getConnectionTimeout();
        java.lang.String str25 = hikariDataSource20.getJdbcUrl();
        boolean boolean26 = hikariDataSource20.getisRegisterMbeans();
        hikariDataSource20.poolName = "HikariPool-28";
        boolean boolean29 = hikariDataSource20.isAutoCommit();
        hikariConfig4.setDataSource((javax.sql.DataSource) hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SELECT 1" + "'", str12, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SELECT 1" + "'", str15, "SELECT 1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-28" + "'", str21, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str14 = hikariConfig13.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer4;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig6.connectionInitSql = "HikariPool-28";
        java.lang.String str9 = hikariConfig6.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig6.setConnectionTimeout((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        boolean boolean13 = hikariDataSource12.isReadOnly;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        int int11 = hikariDataSource10.acquireRetries;
        hikariDataSource10.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.Class<?> wildcardClass12 = hikariDataSource11.getClass();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        int int10 = hikariDataSource9.getAcquireRetries();
        java.lang.String str11 = hikariDataSource9.connectionInitSql;
        java.lang.String str12 = hikariDataSource9.poolName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-19" + "'", str12, "HikariPool-19");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int4 = hikariDataSource3.getAcquireRetries();
        hikariDataSource3.dataSourceClassName = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource1.catalog = "HikariPool-28";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource21 = hikariDataSource20.dataSource;
        hikariDataSource20.setpoolNumber(19);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource20);
        hikariDataSource20.setpoolNumber((int) (byte) 0);
        hikariDataSource20.isJdbc4connectionTest = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource8.acquireIncrement = 26;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.idleTimeout = 4;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource3.leakDetectionThreshold = 0;
        hikariDataSource3.setRegisterMbeans(false);
        boolean boolean8 = hikariDataSource3.isIsolateInternalQueries();
        java.lang.String str9 = hikariDataSource3.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.setConnectionInitSql("VALUES 1");
        hikariConfig1.catalog = "HikariPool-28";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setIdleTimeout(10L);
        boolean boolean9 = hikariConfig1.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetryDelay((long) 3);
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        boolean boolean8 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        java.util.Properties properties6 = hikariConfig2.getDataSourceProperties();
        java.lang.String str7 = hikariConfig2.transactionIsolationName;
        long long8 = hikariConfig2.getAcquireRetryDelay();
        java.lang.String str9 = hikariConfig2.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setminPoolSize(29);
        long long4 = hikariDataSource1.getIDLE_TIMEOUT();
        hikariDataSource1.isReadOnly = false;
        hikariDataSource1.isReadOnly = true;
        hikariDataSource1.connectionInitSql = "HikariPool-19";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource9.setInitializationFailFast(false);
        boolean boolean12 = hikariDataSource9.isRegisterMbeans();
        java.lang.String str13 = hikariDataSource9.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int4 = hikariConfig3.acquireRetries;
        hikariConfig3.setpoolNumber((int) (byte) 0);
        hikariConfig3.setAutoCommit(false);
        java.lang.String str9 = hikariConfig3.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        boolean boolean6 = hikariDataSource5.isIsolateInternalQueries();
        java.lang.String str7 = hikariDataSource5.dataSourceClassName;
        hikariDataSource5.setJdbcUrl("HikariPool-30");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource3.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setpoolNumber(11);
        hikariConfig1.isJdbc4connectionTest = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter7.deserializeObjectHikariConfig2();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource15();
        java.lang.String str13 = serializedObjectSupporter7.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter7.deserializeObjectHikariDataSource11();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        hikariDataSource2.isJdbc4connectionTest = true;
        long long13 = hikariDataSource2.connectionTimeout;
        hikariDataSource2.setAcquireRetries(52);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setMinimumPoolSize((int) 'a');
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        int int9 = hikariDataSource3.acquireRetries;
        hikariDataSource3.acquireIncrement = 100;
        hikariDataSource3.setpoolNumber((int) (short) 1);
        long long14 = hikariDataSource3.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-33" + "'", str9, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig6.maxPoolSize = 28;
        hikariConfig6.setminPoolSize((int) (byte) -1);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        java.lang.String str14 = serializedObjectSupporter7.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        java.util.Properties properties16 = serializedObjectSupporter7.deserializeObjectProperties1();
        hikariDataSource6.setDataSourceProperties(properties16);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource6.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL jdbc:stub");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SELECT 1" + "'", str12, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        boolean boolean4 = hikariDataSource3.getisIsolateInternalQueries();
        hikariDataSource3.acquireRetries = 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig5.connectionCustomizer = iConnectionCustomizer6;
        int int8 = hikariConfig5.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str9 = hikariConfig8.connectionCustomizerClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig8.setDriverClassName("HikariPool-5");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-5' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource5.setmaxPoolSize((int) '4');
        hikariDataSource5.isAutoCommit = true;
        java.lang.String str10 = hikariDataSource5.getConnectionTestQuery();
        hikariDataSource5.transactionIsolation = 7;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        boolean boolean3 = hikariDataSource2.getisAutoCommit();
        long long4 = hikariDataSource2.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.setisJdbc4connectionTest(true);
        boolean boolean9 = hikariConfig1.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.poolName = "HikariPool-28";
        boolean boolean5 = hikariDataSource1.isRegisterMbeans();
        hikariDataSource1.setMaximumPoolSize(31);
        int int8 = hikariDataSource1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter5.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter5.deserializeObjectHikariDataSource8();
        javax.sql.DataSource dataSource15 = hikariDataSource14.getDataSource();
        long long16 = hikariDataSource14.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource12.setPoolName("HikariPool-32");
        long long18 = hikariDataSource12.idleTimeout;
        hikariDataSource12.setpoolNumber(26);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setMaximumPoolSize(5);
        hikariDataSource2.setRegisterMbeans(false);
        int int9 = hikariDataSource2.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.idleTimeout = '4';
        boolean boolean11 = hikariDataSource3.getisInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariDataSource3.getConnectionCustomizer();
        hikariDataSource3.setUseInstrumentation(false);
        long long15 = hikariDataSource3.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = hikariConfig0.serializedObjectSupporter;
        boolean boolean2 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setUseInstrumentation(true);
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.isRegisterMbeans = false;
        java.lang.String str6 = hikariDataSource2.transactionIsolationName;
        hikariDataSource2.setAutoCommit(false);
        hikariDataSource2.setMinimumPoolSize(52);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean4 = hikariConfig3.isAutoCommit();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.setminPoolSize((int) (short) 1);
        hikariDataSource6.validate();
        boolean boolean10 = hikariDataSource6.isJdbc4connectionTest;
        int int11 = hikariDataSource6.getMinimumPoolSize();
        hikariDataSource6.setMaxLifetime(5000L);
        long long14 = hikariDataSource6.maxLifetime;
        hikariConfig3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource6);
        hikariConfig3.setisJdbc4connectionTest(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource4();
        hikariConfig3.setDataSource((javax.sql.DataSource) hikariDataSource20);
        long long22 = hikariConfig3.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        java.util.Properties properties5 = hikariDataSource2.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter7.deserializeObjectHikariDataSource6();
        java.lang.String str14 = serializedObjectSupporter7.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter7.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        hikariDataSource17.catalog = "hi!";
        long long20 = hikariDataSource17.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource16();
        hikariDataSource22.catalog = "hi!";
        long long25 = hikariDataSource22.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter26.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource29 = hikariDataSource28.dataSource;
        hikariDataSource22.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource28);
        hikariDataSource17.setDataSource((javax.sql.DataSource) hikariDataSource28);
        java.lang.String str32 = hikariDataSource28.getJdbcUrl();
        hikariDataSource28.setAcquireRetries((int) '#');
        hikariDataSource15.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource28);
        hikariConfig6.dataSource = hikariDataSource15;
        long long37 = hikariConfig6.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertNotNull(hikariDataSource28);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.validate();
        hikariDataSource1.setIsolateInternalQueries(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString7();
        java.util.Properties properties15 = serializedObjectSupporter11.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter11;
        hikariDataSource1.maxPoolSize = 35;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(hikariConfig16);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        int int12 = hikariDataSource1.maxPoolSize;
        long long13 = hikariDataSource1.acquireRetryDelay;
        long long14 = hikariDataSource1.connectionTimeout;
        boolean boolean15 = hikariDataSource1.getisRegisterMbeans();
        java.lang.String str16 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.validate();
        hikariDataSource1.setJdbc4ConnectionTest(false);
        java.lang.String str20 = hikariDataSource1.catalog;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = hikariDataSource1.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "VALUES 1" + "'", str16, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(serializedObjectSupporter21);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        java.lang.String str18 = hikariDataSource17.poolName;
        hikariDataSource17.setisReadOnly(true);
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource17.setIsolateInternalQueries(false);
        int int24 = hikariDataSource17.acquireIncrement;
        long long25 = hikariDataSource17.getIDLE_TIMEOUT();
        hikariDataSource17.setIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setConnectionInitSql("SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str4 = hikariDataSource3.dataSourceClassName;
        hikariDataSource3.poolName = "VALUES 1";
        boolean boolean7 = hikariDataSource3.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        long long6 = hikariDataSource2.getCONNECTION_TIMEOUT();
        long long7 = hikariDataSource2.getCONNECTION_TIMEOUT();
        hikariDataSource2.dataSourceClassName = "SELECT 1";
        long long10 = hikariDataSource2.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource2.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        boolean boolean9 = hikariDataSource2.isInitializationFailFast();
        hikariDataSource2.setIdleTimeout((-1L));
        hikariDataSource2.setMaximumPoolSize((int) (byte) 10);
        hikariDataSource2.idleTimeout = 3;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int10 = hikariDataSource9.getMaximumPoolSize();
        java.lang.String str11 = hikariDataSource9.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        hikariConfig1.setisReadOnly(true);
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SELECT 1" + "'", str15, "SELECT 1");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString7();
        java.util.Properties properties17 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.dataSourceProperties = properties17;
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str23 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        hikariDataSource1.isInitializationFailFast = false;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.isRegisterMbeans = true;
        boolean boolean10 = hikariDataSource1.isAutoCommit();
        hikariDataSource1.acquireRetries = 29;
        hikariDataSource1.setMaximumPoolSize(23);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource9.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str8 = hikariDataSource7.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        hikariDataSource2.connectionTestQuery = "HikariPool-32";
        hikariDataSource2.setpoolNumber(1);
        boolean boolean10 = hikariDataSource2.isAutoCommit;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter12.deserializeObjectHikariDataSource12();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString6();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString3();
        hikariDataSource2.addDataSourceProperty("HikariPool-19", (java.lang.Object) serializedObjectSupporter12);
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter12.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter12.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-6" + "'", str16, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig16);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        int int6 = hikariDataSource3.acquireRetries;
        hikariDataSource3.setAcquireRetryDelay((long) 29);
        boolean boolean9 = hikariDataSource3.isReadOnly;
        javax.sql.DataSource dataSource10 = hikariDataSource3.dataSource;
        java.util.Properties properties11 = hikariDataSource3.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setReadOnly(false);
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setPoolName("HikariPool-11");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        long long2 = hikariDataSource1.getCONNECTION_TIMEOUT();
        java.lang.String str3 = hikariDataSource1.transactionIsolationName;
        long long4 = hikariDataSource1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.util.Properties properties4 = hikariDataSource3.getDataSourceProperties();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString7();
        java.util.Properties properties17 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.dataSourceProperties = properties17;
        java.lang.String str20 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        int int5 = hikariDataSource1.minPoolSize;
        java.lang.String str6 = hikariDataSource1.getCatalog();
        hikariDataSource1.idleTimeout = 52;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.setminPoolSize(19);
        hikariDataSource1.catalog = "HikariPool-11";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        java.lang.String str4 = hikariDataSource1.getConnectionCustomizerClassName();
        hikariDataSource1.setMinimumPoolSize(0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.dataSourceClassName = "HikariPool-28";
        boolean boolean5 = hikariDataSource2.isAutoCommit;
        boolean boolean6 = hikariDataSource2.getisInitializationFailFast();
        hikariDataSource2.transactionIsolationName = "HikariPool-28";
        hikariDataSource2.setReadOnly(false);
        java.lang.String str11 = hikariDataSource2.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-4" + "'", str11, "HikariPool-4");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str11 = hikariDataSource10.connectionInitSql;
        hikariDataSource10.dataSourceClassName = "HikariPool-33";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setConnectionCustomizerClassName("hi!");
        hikariDataSource2.setConnectionCustomizerClassName("HikariPool-7");
        int int9 = hikariDataSource2.getmaxPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource2.setConnectionTimeout((long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig3.setMaxLifetime((long) 11);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-6" + "'", str3, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str4 = hikariDataSource3.dataSourceClassName;
        hikariDataSource3.catalog = "SELECT 1";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter7.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource9();
        int int13 = hikariDataSource12.maxPoolSize;
        hikariDataSource3.setDataSource((javax.sql.DataSource) hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int8 = hikariConfig7.acquireRetries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str7 = hikariDataSource6.getConnectionCustomizerClassName();
        hikariDataSource6.setPoolName("HikariPool-15");
        boolean boolean10 = hikariDataSource6.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        java.lang.String str16 = hikariDataSource1.poolName;
        hikariDataSource1.setMaximumPoolSize(26);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-28" + "'", str16, "HikariPool-28");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        javax.sql.DataSource dataSource6 = hikariDataSource1.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer7;
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-7");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer11;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str10 = hikariConfig9.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-28";
        long long8 = hikariConfig1.connectionTimeout;
        hikariConfig1.setInitializationFailFast(false);
        long long11 = hikariConfig1.getACQUIRE_RETRY_DELAY();
        hikariConfig1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        java.lang.String str14 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.settransactionIsolationName("HikariPool-32");
        long long12 = hikariDataSource1.connectionTimeout;
        hikariDataSource1.isAutoCommit = false;
        java.lang.String str15 = hikariDataSource1.getConnectionCustomizerClassName();
        int int16 = hikariDataSource1.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean6 = hikariConfig5.getisJdbc4connectionTest();
        hikariConfig5.transactionIsolationName = "HikariPool-15";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = null;
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter9;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        hikariConfig1.setJdbcUrl("HikariPool-6");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        long long9 = hikariDataSource8.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        java.lang.String str12 = hikariDataSource11.poolName;
        int int13 = hikariDataSource11.minPoolSize;
        java.lang.String str14 = hikariDataSource11.getPoolName();
        java.lang.String str15 = hikariDataSource11.getPoolName();
        hikariDataSource11.isJdbc4connectionTest = false;
        java.util.Properties properties18 = hikariDataSource11.dataSourceProperties;
        hikariDataSource8.setDataSourceProperties(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.setAcquireRetryDelay(600000L);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-28" + "'", str12, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28" + "'", str14, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28" + "'", str15, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        javax.sql.DataSource dataSource4 = hikariDataSource3.dataSource;
        java.lang.String str5 = hikariDataSource3.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource4.setCatalog("HikariPool-28");
        hikariDataSource4.setDataSourceClassName("VALUES 1");
        hikariDataSource4.catalog = "HikariPool-24";
        hikariDataSource4.setPoolName("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource2.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        boolean boolean9 = hikariDataSource2.isInitializationFailFast();
        boolean boolean10 = hikariDataSource2.isReadOnly;
        java.lang.String str11 = hikariDataSource2.getPoolName();
        hikariDataSource2.setLeakDetectionThreshold((long) (byte) 10);
        hikariDataSource2.setUseInstrumentation(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter16.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter16.deserializeObjectHikariConfig2();
        int int19 = hikariConfig18.getAcquireRetries();
        hikariConfig18.catalog = "";
        java.util.Properties properties22 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariDataSource2.dataSourceProperties = properties22;
        hikariDataSource2.setMinimumPoolSize(52);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-17" + "'", str11, "HikariPool-17");
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertNotNull(hikariConfig18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig6.setAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        int int5 = hikariDataSource1.getAcquireRetries();
        java.lang.String str6 = hikariDataSource1.gettransactionIsolationName();
        boolean boolean7 = hikariDataSource1.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig6.connectionTestQuery = "HikariPool-32";
        hikariConfig6.setAcquireRetryDelay((long) 10);
        boolean boolean11 = hikariConfig6.isRegisterMbeans();
        long long12 = hikariConfig6.getMAX_LIFETIME();
        hikariConfig6.setisReadOnly(false);
        hikariConfig6.setConnectionTestQuery("hi!");
        hikariConfig6.setAcquireIncrement(3);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource8();
        boolean boolean16 = hikariDataSource15.getisJdbc4connectionTest();
        hikariDataSource2.dataSource = hikariDataSource15;
        hikariDataSource2.setLeakDetectionThreshold((long) 60);
        hikariDataSource2.connectionTimeout = 0;
        long long22 = hikariDataSource2.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-28");
        hikariConfig1.setmaxPoolSize(0);
        long long9 = hikariConfig1.connectionTimeout;
        int int10 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean7 = hikariConfig6.isReadOnly;
        int int8 = hikariConfig6.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.Properties properties10 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig5.setisRegisterMbeans(true);
        hikariConfig5.setMaximumPoolSize((int) (short) 100);
        hikariConfig5.setTransactionIsolation("HikariPool-15");
        hikariConfig5.setIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        hikariConfig1.setJdbcUrl("HikariPool-6");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        long long9 = hikariDataSource8.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        java.lang.String str12 = hikariDataSource11.poolName;
        int int13 = hikariDataSource11.minPoolSize;
        java.lang.String str14 = hikariDataSource11.getPoolName();
        java.lang.String str15 = hikariDataSource11.getPoolName();
        hikariDataSource11.isJdbc4connectionTest = false;
        java.util.Properties properties18 = hikariDataSource11.dataSourceProperties;
        hikariDataSource8.setDataSourceProperties(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        java.lang.String str21 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-24");
        long long24 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-28" + "'", str12, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28" + "'", str14, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28" + "'", str15, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SELECT 1" + "'", str21, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-5");
        hikariConfig1.setpoolNumber((int) (short) 100);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter14.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter14.deserializeObjectHikariConfig2();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter14.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter14.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter14.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter14.deserializeObjectHikariConfig3();
        hikariConfig22.setMinimumPoolSize(0);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = serializedObjectSupporter25.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig26.connectionCustomizer = iConnectionCustomizer27;
        boolean boolean29 = hikariConfig26.isInitializationFailFast;
        long long30 = hikariConfig26.leakDetectionThreshold;
        int int31 = hikariConfig26.acquireIncrement;
        hikariConfig26.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        java.util.Properties properties34 = hikariConfig26.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig22.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        int int39 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str17, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariConfig20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNotNull(hikariConfig22);
        org.junit.Assert.assertNotNull(hikariConfig26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource9();
        hikariDataSource11.acquireIncrement = '#';
        java.util.Properties properties14 = hikariDataSource11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariDataSource8.setDataSourceProperties(properties14);
        java.lang.String str17 = hikariDataSource8.poolName;
        long long18 = hikariDataSource8.idleTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-20" + "'", str17, "HikariPool-20");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setDataSourceClassName("HikariPool-6");
        int int7 = hikariDataSource2.maxPoolSize;
        hikariDataSource2.setDataSourceClassName("");
        boolean boolean10 = hikariDataSource2.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        java.lang.Class<?> wildcardClass9 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        java.lang.String str16 = hikariDataSource12.getJdbcUrl();
        hikariDataSource12.setReadOnly(false);
        long long19 = hikariDataSource12.getLeakDetectionThreshold();
        java.util.Properties properties20 = hikariDataSource12.getDataSourceProperties();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        boolean boolean5 = hikariDataSource2.getisAutoCommit();
        java.util.Properties properties6 = hikariDataSource2.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        hikariDataSource9.catalog = "hi!";
        long long12 = hikariDataSource9.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource16();
        hikariDataSource14.catalog = "hi!";
        long long17 = hikariDataSource14.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource21 = hikariDataSource20.dataSource;
        hikariDataSource14.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        hikariDataSource9.setDataSource((javax.sql.DataSource) hikariDataSource20);
        boolean boolean24 = hikariDataSource20.isAutoCommit;
        hikariConfig7.setDataSource((javax.sql.DataSource) hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.idleTimeout = '4';
        boolean boolean11 = hikariDataSource3.getisInitializationFailFast();
        int int12 = hikariDataSource3.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        long long7 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setReadOnly(false);
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.setisReadOnly(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        hikariDataSource17.setUseInstrumentation(true);
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        hikariConfig1.connectionTestQuery = "hi!";
        hikariConfig1.maxLifetime = (short) -1;
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter12.deserializeObjectHikariConfig2();
        int int15 = hikariConfig14.getAcquireRetries();
        hikariConfig14.catalog = "";
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig22.setConnectionInitSql("HikariPool-17");
        boolean boolean25 = hikariConfig22.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.setisInitializationFailFast(false);
        hikariDataSource2.setConnectionTimeout(600000L);
        long long7 = hikariDataSource2.acquireRetryDelay;
        hikariDataSource2.setConnectionInitSql("HikariPool-24");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionTimeout = 2;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        boolean boolean13 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        java.lang.String str6 = hikariDataSource2.getConnectionInitSql();
        hikariDataSource2.setIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.acquireIncrement = 3;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource13();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter8;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter8.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str6 = hikariDataSource5.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.connectionInitSql;
        java.lang.String str5 = hikariConfig3.connectionInitSql;
        int int6 = hikariConfig3.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        hikariDataSource2.setpoolNumber(19);
        boolean boolean6 = hikariDataSource2.isRegisterMbeans();
        hikariDataSource2.maxLifetime = 39;
        hikariDataSource2.catalog = "HikariPool-15";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.idleTimeout = '4';
        boolean boolean11 = hikariDataSource3.getisInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariDataSource3.getConnectionCustomizer();
        hikariDataSource3.leakDetectionThreshold = 0L;
        java.lang.String str15 = hikariDataSource3.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str7 = hikariDataSource6.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariDataSource6.connectionInitSql;
        boolean boolean9 = hikariDataSource6.getisIsolateInternalQueries();
        hikariDataSource6.setIdleTimeout((long) (byte) 0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.getisAutoCommit();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        hikariConfig1.setJdbcUrl("HikariPool-6");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        long long9 = hikariDataSource8.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        java.lang.String str12 = hikariDataSource11.poolName;
        int int13 = hikariDataSource11.minPoolSize;
        java.lang.String str14 = hikariDataSource11.getPoolName();
        java.lang.String str15 = hikariDataSource11.getPoolName();
        hikariDataSource11.isJdbc4connectionTest = false;
        java.util.Properties properties18 = hikariDataSource11.dataSourceProperties;
        hikariDataSource8.setDataSourceProperties(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        java.lang.String str21 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-19");
        int int24 = hikariConfig1.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-28" + "'", str12, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28" + "'", str14, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28" + "'", str15, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SELECT 1" + "'", str21, "SELECT 1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        long long5 = hikariDataSource2.getMAX_LIFETIME();
        java.lang.String str6 = hikariDataSource2.poolName;
        hikariDataSource2.setAcquireIncrement(54);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-17" + "'", str6, "HikariPool-17");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        long long13 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.setpoolNumber(0);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-7";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setRegisterMbeans(true);
        hikariDataSource3.setMaximumPoolSize(8);
        hikariDataSource3.setRegisterMbeans(true);
        boolean boolean10 = hikariDataSource3.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SELECT 1" + "'", str12, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.setisReadOnly(false);
        hikariConfig1.setReadOnly(false);
        boolean boolean13 = hikariConfig1.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource3.transactionIsolation = (byte) 1;
        boolean boolean6 = hikariDataSource3.isJdbc4ConnectionTest();
        boolean boolean7 = hikariDataSource3.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString3();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-6" + "'", str9, "HikariPool-6");
        org.junit.Assert.assertNotNull(simpleLogger10);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        hikariDataSource4.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean2 = hikariConfig1.isAutoCommit();
        hikariConfig1.setCatalog("HikariPool-6");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-19");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = hikariConfig1.serializedObjectSupporter;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        hikariDataSource3.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.util.Properties properties9 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariDataSource15.connectionCustomizer;
        java.lang.String str17 = hikariDataSource15.poolName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-0" + "'", str17, "HikariPool-0");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.acquireRetries = 60;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        int int9 = hikariConfig1.acquireIncrement;
        hikariConfig1.setMinimumPoolSize((int) '#');
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariConfig11);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        hikariDataSource2.connectionTestQuery = "HikariPool-32";
        hikariDataSource2.setpoolNumber(1);
        boolean boolean10 = hikariDataSource2.isAutoCommit;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter12.deserializeObjectHikariDataSource12();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString6();
        java.lang.String str16 = serializedObjectSupporter12.deserializeObjectString3();
        hikariDataSource2.addDataSourceProperty("HikariPool-19", (java.lang.Object) serializedObjectSupporter12);
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter12.deserializeObjectHikariDataSource15();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString8();
        java.util.Properties properties20 = serializedObjectSupporter12.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-6" + "'", str16, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-33" + "'", str19, "HikariPool-33");
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        boolean boolean7 = hikariDataSource1.getisInitializationFailFast();
        hikariDataSource1.setpoolNumber(22);
        hikariDataSource1.setAcquireRetries((int) (byte) 1);
        long long12 = hikariDataSource1.getIDLE_TIMEOUT();
        hikariDataSource1.setAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int4 = hikariConfig3.getminPoolSize();
        boolean boolean5 = hikariConfig3.isInitializationFailFast();
        boolean boolean6 = hikariConfig3.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.isRegisterMbeans = false;
        java.lang.String str6 = hikariDataSource2.connectionCustomizerClassName;
        java.util.Properties properties7 = hikariDataSource2.getDataSourceProperties();
        hikariDataSource2.jdbcUrl = "TRANSACTION_REPEATABLE_READ";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig2();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.catalog = "";
        java.util.Properties properties16 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariDataSource2.setDataSourceProperties(properties16);
        hikariDataSource2.setAcquireRetryDelay((long) 53);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        long long16 = hikariDataSource12.getMAX_LIFETIME();
        long long17 = hikariDataSource12.getACQUIRE_RETRY_DELAY();
        long long18 = hikariDataSource12.connectionTimeout;
        hikariDataSource12.setInitializationFailFast(false);
        hikariDataSource12.connectionTestQuery = "HikariPool-6";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        java.util.Properties properties16 = hikariDataSource1.dataSourceProperties;
        hikariDataSource1.connectionTimeout = 53;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString7();
        java.util.Properties properties17 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.dataSourceProperties = properties17;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig20.isRegisterMbeans = true;
        hikariConfig20.acquireRetryDelay = 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter25.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter25.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger28 = serializedObjectSupporter25.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter25.deserializeObjectHikariDataSource10();
        hikariConfig20.setDataSource((javax.sql.DataSource) hikariDataSource29);
        hikariDataSource29.setIsolateInternalQueries(true);
        int int33 = hikariDataSource29.getAcquireIncrement();
        hikariDataSource29.acquireRetryDelay = 5;
        java.lang.String str36 = hikariDataSource29.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertNotNull(simpleLogger28);
        org.junit.Assert.assertNotNull(hikariDataSource29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "VALUES 1" + "'", str36, "VALUES 1");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = 60;
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter6.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        hikariConfig0.addDataSourceProperty("HikariPool-6", (java.lang.Object) serializedObjectSupporter6);
        hikariConfig0.setisInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(simpleLogger11);
        org.junit.Assert.assertNotNull(hikariConfig12);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean2 = hikariConfig1.isAutoCommit();
        hikariConfig1.setCatalog("HikariPool-6");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-19");
        int int7 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig12.getConnectionCustomizer();
        hikariConfig12.validate();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig5.setConnectionTimeout(0L);
        boolean boolean8 = hikariConfig5.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = hikariDataSource4.connectionTestQuery;
        hikariDataSource4.acquireRetryDelay = 1L;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter9.deserializeObjectHikariDataSource14();
        hikariDataSource4.addDataSourceProperty("HikariPool-2", (java.lang.Object) serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setDataSourceClassName("HikariPool-6");
        java.lang.String str7 = hikariDataSource2.catalog;
        long long8 = hikariDataSource2.getIDLE_TIMEOUT();
        boolean boolean9 = hikariDataSource2.isJdbc4connectionTest;
        hikariDataSource2.setReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setminPoolSize(29);
        hikariDataSource1.acquireRetryDelay = 'a';
        java.lang.String str6 = hikariDataSource1.dataSourceClassName;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource7.connectionTestQuery = "";
        hikariDataSource7.minPoolSize = ' ';
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        long long16 = hikariDataSource12.getMAX_LIFETIME();
        long long17 = hikariDataSource12.getACQUIRE_RETRY_DELAY();
        hikariDataSource12.setmaxPoolSize((int) (short) 0);
        hikariDataSource12.transactionIsolationName = "HikariPool-6";
        int int22 = hikariDataSource12.getpoolNumber();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter23.deserializeObjectHikariDataSource4();
        java.util.Properties properties26 = serializedObjectSupporter23.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariDataSource12.dataSourceProperties = properties26;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        int int4 = hikariDataSource2.maxPoolSize;
        boolean boolean5 = hikariDataSource2.isJdbc4ConnectionTest();
        boolean boolean6 = hikariDataSource2.isRegisterMbeans();
        hikariDataSource2.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        hikariConfig1.connectionTestQuery = "hi!";
        hikariConfig1.setAcquireIncrement(14);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.getisAutoCommit();
        int int7 = hikariConfig1.getTransactionIsolation();
        java.lang.String str8 = hikariConfig1.poolName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource1.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        int int12 = hikariDataSource1.maxPoolSize;
        long long13 = hikariDataSource1.acquireRetryDelay;
        long long14 = hikariDataSource1.connectionTimeout;
        boolean boolean15 = hikariDataSource1.getisRegisterMbeans();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        hikariDataSource17.catalog = "hi!";
        long long20 = hikariDataSource17.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource16();
        hikariDataSource22.catalog = "hi!";
        long long25 = hikariDataSource22.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter26.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource29 = hikariDataSource28.dataSource;
        hikariDataSource22.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource28);
        hikariDataSource17.setDataSource((javax.sql.DataSource) hikariDataSource28);
        hikariDataSource17.catalog = "HikariPool-28";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter34 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = serializedObjectSupporter34.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = serializedObjectSupporter34.deserializeObjectHikariConfig1();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = serializedObjectSupporter34.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource39 = serializedObjectSupporter34.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource40 = serializedObjectSupporter34.deserializeObjectHikariDataSource6();
        hikariDataSource17.serializedObjectSupporter = serializedObjectSupporter34;
        java.lang.String str42 = serializedObjectSupporter34.deserializeObjectString7();
        java.lang.String str43 = serializedObjectSupporter34.deserializeObjectString5();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter34;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertNotNull(hikariDataSource28);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(hikariConfig35);
        org.junit.Assert.assertNotNull(hikariConfig36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-32" + "'", str37, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig38);
        org.junit.Assert.assertNotNull(hikariDataSource39);
        org.junit.Assert.assertNotNull(hikariDataSource40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-32" + "'", str42, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "SELECT 1" + "'", str43, "SELECT 1");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        long long7 = hikariConfig6.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str10, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariConfig12);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter9.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter9.deserializeObjectHikariDataSource15();
        hikariDataSource8.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource15);
        boolean boolean17 = hikariDataSource15.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        java.lang.String str16 = hikariDataSource12.getJdbcUrl();
        hikariDataSource12.setConnectionCustomizerClassName("");
        hikariDataSource12.dataSourceClassName = "HikariPool-7";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int8 = hikariConfig7.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int5 = hikariConfig4.transactionIsolation;
        java.lang.String str6 = hikariConfig4.connectionInitSql;
        hikariConfig4.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig4.getisReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig4.setConnectionTimeout((long) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetryDelay((long) 3);
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        boolean boolean8 = hikariConfig3.isRegisterMbeans;
        int int9 = hikariConfig3.getMaximumPoolSize();
        hikariConfig3.setisInitializationFailFast(false);
        hikariConfig3.acquireIncrement = 28;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.setMaxLifetime((long) 9);
        boolean boolean7 = hikariConfig4.getisIsolateInternalQueries();
        java.lang.String str8 = hikariConfig4.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        int int4 = hikariDataSource2.getpoolNumber();
        javax.sql.DataSource dataSource5 = hikariDataSource2.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        hikariDataSource12.maxLifetime = 0L;
        hikariDataSource12.setMinimumPoolSize((int) 'a');
        java.lang.String str17 = hikariDataSource12.jdbcUrl;
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        int int19 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(simpleLogger10);
        org.junit.Assert.assertNotNull(hikariConfig11);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        java.lang.String str9 = hikariConfig1.getPoolName();
        int int10 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-32" + "'", str9, "HikariPool-32");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str4 = hikariDataSource3.dataSourceClassName;
        hikariDataSource3.catalog = "SELECT 1";
        int int7 = hikariDataSource3.getminPoolSize();
        hikariDataSource3.isJdbc4connectionTest = false;
        boolean boolean10 = hikariDataSource3.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        hikariConfig1.setTransactionIsolation("HikariPool-32");
        hikariConfig1.jdbcUrl = "HikariPool-32";
        hikariConfig1.setMaxLifetime((long) 6);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int5 = hikariConfig4.transactionIsolation;
        java.lang.String str6 = hikariConfig4.getDataSourceClassName();
        boolean boolean7 = hikariConfig4.isJdbc4connectionTest;
        int int8 = hikariConfig4.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int7 = hikariDataSource6.getminPoolSize();
        java.lang.String str8 = hikariDataSource6.catalog;
        hikariDataSource6.connectionInitSql = "hi!";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource5.maxLifetime = 39;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetryDelay((long) 3);
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        long long8 = hikariDataSource1.maxLifetime;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig2();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.transactionIsolationName = "SELECT 1";
        hikariDataSource1.addDataSourceProperty("", (java.lang.Object) hikariConfig12);
        hikariConfig12.maxLifetime = 22;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter19.deserializeObjectHikariConfig2();
        hikariConfig20.poolName = "";
        boolean boolean23 = hikariConfig20.getisJdbc4connectionTest();
        hikariConfig20.setisRegisterMbeans(false);
        hikariConfig20.maxPoolSize = 10;
        boolean boolean28 = hikariConfig20.getisRegisterMbeans();
        hikariConfig20.settransactionIsolationName("hi!");
        hikariConfig12.copyState(hikariConfig20);
        hikariConfig20.maxLifetime = 5;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(hikariConfig20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        long long17 = hikariDataSource16.maxLifetime;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties3 = hikariDataSource2.dataSourceProperties;
        hikariDataSource2.setisReadOnly(true);
        boolean boolean6 = hikariDataSource2.getisRegisterMbeans();
        hikariDataSource2.setMaximumPoolSize(2);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource2.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        boolean boolean9 = hikariDataSource2.isInitializationFailFast();
        boolean boolean10 = hikariDataSource2.isReadOnly;
        java.lang.String str11 = hikariDataSource2.getPoolName();
        hikariDataSource2.setLeakDetectionThreshold((long) (byte) 10);
        long long14 = hikariDataSource2.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-17" + "'", str11, "HikariPool-17");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource2.setisReadOnly(false);
        long long5 = hikariDataSource2.acquireRetryDelay;
        hikariDataSource2.setPoolName("HikariPool-15");
        hikariDataSource2.acquireRetries = 100;
        java.lang.String str10 = hikariDataSource2.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariDataSource6.catalog = "hi!";
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource13 = hikariDataSource12.dataSource;
        hikariDataSource6.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariDataSource1.catalog = "HikariPool-28";
        java.lang.String str18 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.setAutoCommit(true);
        long long21 = hikariDataSource1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "VALUES 1" + "'", str18, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        hikariDataSource2.setpoolNumber(19);
        boolean boolean6 = hikariDataSource2.isRegisterMbeans();
        hikariDataSource2.maxLifetime = 39;
        boolean boolean9 = hikariDataSource2.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.idleTimeout = '4';
        boolean boolean11 = hikariDataSource3.getisInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariDataSource3.getConnectionCustomizer();
        long long13 = hikariDataSource3.connectionTimeout;
        int int14 = hikariDataSource3.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource8.setConnectionTestQuery("HikariPool-33");
        int int11 = hikariDataSource8.minPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.util.Properties properties9 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter9.deserializeObjectHikariConfig2();
        hikariConfig10.poolName = "";
        int int13 = hikariConfig10.getmaxPoolSize();
        hikariDataSource8.copyState(hikariConfig10);
        hikariDataSource8.acquireRetryDelay = 52;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        int int8 = hikariDataSource7.getpoolNumber();
        int int9 = hikariDataSource7.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        boolean boolean8 = hikariDataSource7.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.isJdbc4connectionTest = false;
        long long14 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString5();
        java.lang.String str21 = serializedObjectSupporter15.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter15.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter15.deserializeObjectHikariDataSource9();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter15;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-32" + "'", str18, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SELECT 1" + "'", str20, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SELECT 1" + "'", str21, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig22);
        org.junit.Assert.assertNotNull(hikariDataSource23);
        org.junit.Assert.assertNotNull(hikariDataSource24);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-6" + "'", str11, "HikariPool-6");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig3.validate();
        java.util.Properties properties5 = hikariConfig3.getDataSourceProperties();
        java.lang.String str6 = hikariConfig3.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig3.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.acquireIncrement = 3;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource13();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.String str14 = serializedObjectSupporter8.deserializeObjectString7();
        org.slf4j.impl.SimpleLogger simpleLogger15 = serializedObjectSupporter8.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter8.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNotNull(simpleLogger15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.transactionIsolationName = "SELECT 1";
        hikariConfig2.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean8 = hikariConfig2.getisReadOnly();
        boolean boolean9 = hikariConfig2.isInitializationFailFast();
        hikariConfig2.acquireRetryDelay = 5;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.isIsolateInternalQueries = true;
        hikariDataSource1.maxLifetime = (short) 100;
        long long9 = hikariDataSource1.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource1.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionInitSql = "hi!";
        int int10 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setMinimumPoolSize((int) 'a');
        boolean boolean8 = hikariDataSource3.isJdbc4ConnectionTest();
        hikariDataSource3.setConnectionInitSql("");
        hikariDataSource3.idleTimeout = 1800000L;
        hikariDataSource3.connectionInitSql = "HikariPool-19";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig5.setminPoolSize(55);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.poolName = "HikariPool-20";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        java.util.Properties properties5 = hikariDataSource2.getDataSourceProperties();
        int int6 = hikariDataSource2.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        boolean boolean7 = hikariDataSource6.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setisRegisterMbeans(false);
        hikariDataSource1.setIdleTimeout((long) 7);
        long long9 = hikariDataSource1.connectionTimeout;
        hikariDataSource1.isInitializationFailFast = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.validate();
        long long9 = hikariDataSource1.maxLifetime;
        int int10 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        int int4 = hikariConfig2.getTransactionIsolation();
        java.util.Properties properties5 = hikariConfig2.dataSourceProperties;
        long long6 = hikariConfig2.getACQUIRE_RETRY_DELAY();
        hikariConfig2.setAcquireRetries(22);
        hikariConfig2.idleTimeout = 36;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean7 = hikariConfig6.isReadOnly;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter8.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter8.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter8.deserializeObjectString4();
        hikariConfig6.serializedObjectSupporter = serializedObjectSupporter8;
        hikariConfig6.setisAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str16, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        long long13 = hikariConfig12.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-33" + "'", str9, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource7.maxLifetime = 2;
        hikariDataSource7.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean5 = hikariConfig4.getisReadOnly();
        hikariConfig4.maxPoolSize = 26;
        boolean boolean8 = hikariConfig4.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        int int4 = hikariConfig1.getmaxPoolSize();
        int int5 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }
}
