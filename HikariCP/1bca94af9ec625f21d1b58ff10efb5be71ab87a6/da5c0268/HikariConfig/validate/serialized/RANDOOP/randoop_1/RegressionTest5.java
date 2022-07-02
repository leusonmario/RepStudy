import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource6.setisInitializationFailFast(false);
        hikariDataSource6.leakDetectionThreshold = 60;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str6 = hikariDataSource5.getConnectionInitSql();
        java.lang.String str7 = hikariDataSource5.getPoolName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-7" + "'", str7, "HikariPool-7");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setAcquireRetries((int) (short) 0);
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-30");
        boolean boolean10 = hikariDataSource1.isInitializationFailFast;
        java.lang.String str11 = hikariDataSource1.connectionCustomizerClassName;
        java.lang.String str12 = hikariDataSource1.getConnectionInitSql();
        long long13 = hikariDataSource1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-30" + "'", str11, "HikariPool-30");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString4();
        java.util.Properties properties10 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str9, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.setisReadOnly(false);
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties8 = serializedObjectSupporter7.deserializeObjectProperties1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        long long5 = hikariDataSource4.getACQUIRE_RETRY_DELAY();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource11();
        hikariDataSource10.acquireRetryDelay = (short) 10;
        long long13 = hikariDataSource10.getConnectionTimeout();
        hikariDataSource4.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) hikariDataSource10);
        java.lang.String str15 = hikariDataSource10.getConnectionCustomizerClassName();
        hikariDataSource10.setmaxPoolSize(103);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        long long5 = hikariDataSource4.getConnectionTimeout();
        hikariDataSource4.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        java.lang.String str5 = hikariConfig0.jdbcUrl;
        hikariConfig0.setReadOnly(false);
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        boolean boolean3 = hikariDataSource1.isAutoCommit;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource17();
        hikariDataSource6.setisReadOnly(false);
        hikariDataSource6.setpoolNumber((int) 'a');
        hikariDataSource6.setAcquireRetryDelay((long) 4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariDataSource6.serializedObjectSupporter = serializedObjectSupporter13;
        hikariDataSource1.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter13);
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SELECT 1" + "'", str16, "SELECT 1");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        int int6 = hikariDataSource5.acquireRetries;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter3.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter3.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter3.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter3.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter3.deserializeObjectHikariDataSource13();
        hikariDataSource2.dataSource = hikariDataSource9;
        boolean boolean11 = hikariDataSource2.getisAutoCommit();
        java.lang.String str12 = hikariDataSource2.getPoolName();
        boolean boolean13 = hikariDataSource2.isIsolateInternalQueries;
        hikariDataSource2.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-7" + "'", str12, "HikariPool-7");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        hikariDataSource1.setisRegisterMbeans(true);
        java.util.Properties properties7 = hikariDataSource1.dataSourceProperties;
        boolean boolean8 = hikariDataSource1.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        long long6 = hikariConfig5.getIdleTimeout();
        boolean boolean7 = hikariConfig5.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        int int5 = hikariDataSource4.getAcquireRetries();
        long long6 = hikariDataSource4.getAcquireRetryDelay();
        hikariDataSource4.setAcquireIncrement(11);
        hikariDataSource4.connectionTestQuery = "test";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        java.lang.String str8 = hikariDataSource4.getConnectionInitSql();
        boolean boolean9 = hikariDataSource4.isReadOnly();
        hikariDataSource4.setConnectionCustomizerClassName("hi!");
        int int12 = hikariDataSource4.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        hikariDataSource9.setIdleTimeout((long) (byte) 1);
        hikariDataSource9.leakDetectionThreshold = (short) 0;
        hikariDataSource9.acquireIncrement = 0;
        hikariDataSource9.setMinimumPoolSize((int) '4');
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource9);
        int int19 = hikariDataSource9.getMaximumPoolSize();
        hikariDataSource9.isRegisterMbeans = true;
        java.lang.String str22 = hikariDataSource9.connectionTestQuery;
        hikariDataSource9.validate();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "VALUES 1" + "'", str22, "VALUES 1");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        long long5 = hikariDataSource4.getMAX_LIFETIME();
        hikariDataSource4.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource5();
        hikariDataSource9.setAcquireRetries(0);
        hikariDataSource9.jdbcUrl = "SELECT 1";
        hikariConfig5.dataSource = hikariDataSource9;
        boolean boolean15 = hikariConfig5.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.setMaximumPoolSize((int) '#');
        boolean boolean9 = hikariDataSource1.getisAutoCommit();
        hikariDataSource1.setLeakDetectionThreshold(0L);
        int int12 = hikariDataSource1.getMinimumPoolSize();
        hikariDataSource1.setMaxLifetime((long) (byte) 100);
        java.lang.String str15 = hikariDataSource1.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-2" + "'", str15, "HikariPool-2");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        java.lang.String str11 = hikariDataSource1.connectionInitSql;
        int int12 = hikariDataSource1.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource5();
        hikariDataSource14.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource14);
        javax.sql.DataSource dataSource18 = hikariDataSource14.getDataSource();
        int int19 = hikariDataSource14.getAcquireRetries();
        boolean boolean20 = hikariDataSource14.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariDataSource7.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.setConnectionTimeout((long) 103);
        java.lang.String str6 = hikariConfig1.poolName;
        long long7 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        long long5 = hikariDataSource4.getACQUIRE_RETRY_DELAY();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource11();
        hikariDataSource10.acquireRetryDelay = (short) 10;
        long long13 = hikariDataSource10.getConnectionTimeout();
        hikariDataSource4.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) hikariDataSource10);
        boolean boolean15 = hikariDataSource4.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        java.util.Properties properties9 = hikariDataSource1.dataSourceProperties;
        hikariDataSource1.setisJdbc4connectionTest(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource5();
        java.lang.String str14 = serializedObjectSupporter12.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter12.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter12.deserializeObjectHikariDataSource8();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter12;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.getisAutoCommit();
        hikariDataSource3.validate();
        hikariDataSource3.dataSourceClassName = "HikariPool-98";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setJdbc4ConnectionTest(false);
        long long6 = hikariDataSource3.acquireRetryDelay;
        boolean boolean7 = hikariDataSource3.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setisRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariDataSource1.addDataSourceProperty("SELECT 1", (java.lang.Object) hikariConfig14);
        boolean boolean16 = hikariConfig14.getisAutoCommit();
        java.lang.String str17 = hikariConfig14.transactionIsolationName;
        int int18 = hikariConfig14.acquireIncrement;
        hikariConfig14.connectionTestQuery = "HikariPool-30";
        hikariConfig14.setJdbcUrl("HikariPool-17");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int6 = hikariConfig5.minPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource3.setCatalog("HikariPool-28");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.maxLifetime;
        hikariDataSource5.minPoolSize = 0;
        java.lang.String str14 = hikariDataSource5.getConnectionInitSql();
        hikariDataSource5.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource5.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setJdbc4ConnectionTest(false);
        hikariDataSource3.setisIsolateInternalQueries(false);
        hikariDataSource3.isIsolateInternalQueries = true;
        int int10 = hikariDataSource3.getAcquireIncrement();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource8.getConnectionCustomizer();
        java.lang.String str11 = hikariDataSource8.getConnectionTestQuery();
        hikariDataSource8.isInitializationFailFast = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource11();
        java.lang.String str18 = serializedObjectSupporter14.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter14.deserializeObjectHikariDataSource12();
        java.lang.String str20 = hikariDataSource19.getConnectionTestQuery();
        java.lang.String str21 = hikariDataSource19.gettransactionIsolationName();
        hikariDataSource19.setRegisterMbeans(false);
        java.lang.String str24 = hikariDataSource19.poolName;
        hikariDataSource8.setDataSource((javax.sql.DataSource) hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "VALUES 1" + "'", str11, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-6" + "'", str18, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "VALUES 1" + "'", str20, "VALUES 1");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-20" + "'", str24, "HikariPool-20");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        hikariDataSource1.addDataSourceProperty("hi!", (java.lang.Object) hikariDataSource12);
        hikariDataSource12.acquireRetryDelay = 100;
        long long16 = hikariDataSource12.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource5();
        hikariConfig4.addDataSourceProperty("", (java.lang.Object) hikariDataSource12);
        long long14 = hikariConfig4.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setMaximumPoolSize((int) ' ');
        hikariDataSource1.setInitializationFailFast(true);
        hikariDataSource1.setIsolateInternalQueries(false);
        hikariDataSource1.connectionTimeout = 36;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.zaxxer.hikari.HikariConfig.poolNumber = 106;
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        java.util.Properties properties4 = hikariDataSource1.dataSourceProperties;
        java.lang.String str5 = hikariDataSource1.getConnectionTestQuery();
        long long6 = hikariDataSource1.getLeakDetectionThreshold();
        java.lang.String str7 = hikariDataSource1.transactionIsolationName;
        int int8 = hikariDataSource1.getMaximumPoolSize();
        java.lang.String str9 = hikariDataSource1.catalog;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean8 = hikariDataSource1.isAutoCommit;
        hikariDataSource1.transactionIsolationName = "";
        hikariDataSource1.setDataSourceClassName("HikariPool-6");
        boolean boolean13 = hikariDataSource1.getisRegisterMbeans();
        hikariDataSource1.jdbcUrl = "VALUES 1";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.getLeakDetectionThreshold();
        int int8 = hikariDataSource1.getmaxPoolSize();
        hikariDataSource1.acquireRetries = 100;
        hikariDataSource1.setConnectionCustomizerClassName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.jdbcUrl = "HikariPool-4";
        boolean boolean15 = hikariDataSource1.isIsolateInternalQueries();
        boolean boolean16 = hikariDataSource1.isRegisterMbeans;
        long long17 = hikariDataSource1.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        hikariDataSource1.addDataSourceProperty("hi!", (java.lang.Object) hikariDataSource12);
        boolean boolean14 = hikariDataSource12.getisRegisterMbeans();
        long long15 = hikariDataSource12.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        boolean boolean9 = hikariDataSource1.isInitializationFailFast;
        java.lang.String str10 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean7 = hikariDataSource6.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource8.getConnectionCustomizer();
        java.lang.String str11 = hikariDataSource8.getConnectionTestQuery();
        hikariDataSource8.isInitializationFailFast = false;
        long long14 = hikariDataSource8.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "VALUES 1" + "'", str11, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.leakDetectionThreshold = (short) -1;
        hikariDataSource3.setpoolNumber(101);
        boolean boolean8 = hikariDataSource3.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setJdbcUrl("HikariPool-33");
        hikariDataSource1.poolName = "HikariPool-14";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource6.settransactionIsolationName("HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        boolean boolean7 = hikariDataSource6.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.setJdbcUrl("TRANSACTION_REPEATABLE_READ");
        hikariConfig1.setminPoolSize((int) (byte) -1);
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int6 = hikariDataSource5.getAcquireIncrement();
        hikariDataSource5.transactionIsolationName = "HikariPool-99";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.setConnectionInitSql("VALUES 1");
        hikariDataSource1.setReadOnly(true);
        hikariDataSource1.setMaxLifetime(0L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str7, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource6.setJdbcUrl("TRANSACTION_READ_COMMITTED");
        hikariDataSource6.isAutoCommit = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        long long10 = hikariConfig9.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        java.lang.String str8 = hikariDataSource4.getConnectionInitSql();
        boolean boolean9 = hikariDataSource4.getisIsolateInternalQueries();
        java.lang.String str10 = hikariDataSource4.getJdbcUrl();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        java.lang.String str13 = hikariDataSource12.dataSourceClassName;
        java.util.Properties properties14 = hikariDataSource12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariDataSource4.dataSourceProperties = properties14;
        long long17 = hikariDataSource4.connectionTimeout;
        hikariDataSource4.isReadOnly = true;
        hikariDataSource4.setConnectionInitSql("HikariPool-33");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter22.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter22.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter22.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter22.deserializeObjectHikariDataSource16();
        hikariDataSource26.setPoolName("HikariPool-32");
        hikariDataSource26.setConnectionInitSql("TRANSACTION_READ_COMMITTED");
        hikariDataSource4.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource26);
        hikariDataSource4.setCatalog("HikariPool-11");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNotNull(hikariDataSource23);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertNotNull(hikariDataSource26);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        long long6 = hikariDataSource1.maxLifetime;
        int int7 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setTransactionIsolation("TRANSACTION_READ_COMMITTED");
        boolean boolean10 = hikariDataSource1.getisAutoCommit();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = null;
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str13 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setisInitializationFailFast(true);
        java.lang.String str16 = hikariDataSource1.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_READ_COMMITTED" + "'", str13, "TRANSACTION_READ_COMMITTED");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setMaxLifetime((long) 100);
        long long5 = hikariDataSource2.acquireRetryDelay;
        hikariDataSource2.setmaxPoolSize((int) '4');
        long long8 = hikariDataSource2.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource10();
        hikariDataSource10.jdbcUrl = "hi!";
        boolean boolean13 = hikariDataSource10.getisJdbc4connectionTest();
        boolean boolean14 = hikariDataSource10.isReadOnly;
        hikariDataSource2.dataSource = hikariDataSource10;
        hikariDataSource2.setAcquireIncrement((int) 'a');
        hikariDataSource2.setInitializationFailFast(false);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource5.acquireIncrement = 0;
        hikariDataSource5.setAcquireIncrement(100);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        int int5 = hikariDataSource4.acquireRetries;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean8 = hikariDataSource1.isAutoCommit;
        long long9 = hikariDataSource1.maxLifetime;
        hikariDataSource1.setisInitializationFailFast(false);
        int int12 = hikariDataSource1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource4();
        java.lang.String str8 = hikariDataSource7.dataSourceClassName;
        hikariDataSource7.acquireRetries = '#';
        hikariDataSource7.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource7.setAutoCommit(false);
        hikariDataSource7.setConnectionTimeout((long) (byte) 0);
        hikariDataSource5.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource7.settransactionIsolationName("TRANSACTION_REPEATABLE_READ");
        hikariDataSource7.isJdbc4connectionTest = false;
        hikariDataSource7.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        boolean boolean24 = hikariDataSource7.isReadOnly();
        java.lang.String str25 = hikariDataSource7.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str25, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        boolean boolean5 = hikariDataSource4.getisInitializationFailFast();
        java.lang.String str6 = hikariDataSource4.connectionInitSql;
        hikariDataSource4.minPoolSize = 106;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource8.setLeakDetectionThreshold(0L);
        long long11 = hikariDataSource8.getIDLE_TIMEOUT();
        hikariDataSource8.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.leakDetectionThreshold = (byte) 1;
        hikariDataSource1.setAcquireRetries((int) (byte) 10);
        int int8 = hikariDataSource1.getAcquireIncrement();
        boolean boolean9 = hikariDataSource1.isRegisterMbeans();
        hikariDataSource1.setTransactionIsolation("VALUES 1");
        hikariDataSource1.settransactionIsolationName("HikariPool-0");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        long long3 = hikariDataSource2.getIdleTimeout();
        hikariDataSource2.setConnectionTestQuery("HikariPool-30");
        long long6 = hikariDataSource2.acquireRetryDelay;
        java.util.Properties properties7 = hikariDataSource2.getDataSourceProperties();
        hikariDataSource2.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.connectionCustomizer;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str5 = hikariConfig0.getPoolName();
        hikariConfig0.setIdleTimeout(0L);
        boolean boolean8 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-102" + "'", str5, "HikariPool-102");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        boolean boolean6 = hikariDataSource1.isRegisterMbeans;
        hikariDataSource1.setMaxLifetime((long) (byte) -1);
        hikariDataSource1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.idleTimeout = 103;
        java.lang.String str4 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.getLeakDetectionThreshold();
        boolean boolean8 = hikariDataSource1.isInitializationFailFast();
        hikariDataSource1.setAcquireRetries(114);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariDataSource7.connectionCustomizer;
        hikariDataSource7.isJdbc4connectionTest = false;
        boolean boolean11 = hikariDataSource7.isRegisterMbeans();
        hikariDataSource7.transactionIsolation = 103;
        int int14 = hikariDataSource7.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        int int10 = hikariDataSource9.getAcquireIncrement();
        long long11 = hikariDataSource9.connectionTimeout;
        long long12 = hikariDataSource9.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties14 = serializedObjectSupporter13.deserializeObjectProperties1();
        hikariDataSource9.dataSourceProperties = properties14;
        hikariDataSource1.setDataSourceProperties(properties14);
        hikariDataSource1.setTransactionIsolation("TRANSACTION_REPEATABLE_READ");
        boolean boolean19 = hikariDataSource1.isInitializationFailFast;
        hikariDataSource1.maxPoolSize = (short) 10;
        hikariDataSource1.setReadOnly(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter24 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter24.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter24.deserializeObjectHikariDataSource1();
        hikariDataSource26.setMaxLifetime((long) 33);
        hikariDataSource26.isRegisterMbeans = true;
        javax.sql.DataSource dataSource31 = hikariDataSource26.getDataSource();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource26);
        hikariDataSource26.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 500L + "'", long11 == 500L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(hikariConfig25);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNull(dataSource31);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        java.lang.String str10 = hikariDataSource3.getConnectionTestQuery();
        hikariDataSource3.maxPoolSize = (byte) 0;
        int int13 = hikariDataSource3.getAcquireRetries();
        long long14 = hikariDataSource3.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        boolean boolean4 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.dataSourceClassName = "SELECT 1";
        hikariDataSource1.isJdbc4connectionTest = true;
        boolean boolean9 = hikariDataSource1.isJdbc4connectionTest;
        long long10 = hikariDataSource1.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 500L + "'", long10 == 500L);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        boolean boolean7 = hikariDataSource4.isRegisterMbeans();
        hikariDataSource4.setRegisterMbeans(true);
        hikariDataSource4.setMaximumPoolSize(106);
        long long12 = hikariDataSource4.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setpoolNumber((int) 'a');
        hikariDataSource1.setAcquireRetryDelay((long) 4);
        hikariDataSource1.setConnectionTestQuery("hi!");
        hikariDataSource1.setisIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        boolean boolean11 = hikariDataSource10.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str8 = hikariDataSource7.getConnectionCustomizerClassName();
        hikariDataSource7.setIdleTimeout((long) 21);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        long long4 = hikariDataSource1.getAcquireRetryDelay();
        java.lang.String str5 = hikariDataSource1.getCatalog();
        long long6 = hikariDataSource1.connectionTimeout;
        hikariDataSource1.setLeakDetectionThreshold(32L);
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        hikariDataSource3.isReadOnly = true;
        boolean boolean12 = hikariDataSource3.isInitializationFailFast;
        hikariDataSource3.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        long long6 = hikariDataSource1.maxLifetime;
        int int7 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setDataSourceClassName("");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource17();
        java.lang.String str12 = serializedObjectSupporter10.deserializeObjectString5();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString8();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString8();
        org.slf4j.impl.SimpleLogger simpleLogger15 = serializedObjectSupporter10.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter10.deserializeObjectHikariDataSource5();
        hikariDataSource16.acquireIncrement = 105;
        hikariDataSource1.dataSource = hikariDataSource16;
        int int20 = hikariDataSource1.getMaximumPoolSize();
        long long21 = hikariDataSource1.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SELECT 1" + "'", str12, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-33" + "'", str13, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-33" + "'", str14, "HikariPool-33");
        org.junit.Assert.assertNotNull(simpleLogger15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        javax.sql.DataSource dataSource7 = hikariDataSource6.dataSource;
        hikariDataSource6.setminPoolSize((int) (short) 0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str5 = hikariConfig4.transactionIsolationName;
        java.lang.String str6 = hikariConfig4.getPoolName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-6" + "'", str3, "HikariPool-6");
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.getConnectionCustomizer();
        hikariDataSource6.poolName = "HikariPool-4";
        boolean boolean10 = hikariDataSource6.getisInitializationFailFast();
        int int11 = hikariDataSource6.getpoolNumber();
        java.lang.String str12 = hikariDataSource6.getPoolName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-4" + "'", str12, "HikariPool-4");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        hikariDataSource1.connectionInitSql = "SELECT 1";
        boolean boolean11 = hikariDataSource1.getisIsolateInternalQueries();
        int int12 = hikariDataSource1.maxPoolSize;
        javax.sql.DataSource dataSource13 = hikariDataSource1.getDataSource();
        int int14 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setMinimumPoolSize(33);
        long long17 = hikariDataSource1.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setisInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariDataSource3.connectionCustomizer = iConnectionCustomizer6;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariDataSource3.connectionCustomizer = iConnectionCustomizer8;
        hikariDataSource3.connectionInitSql = "HikariPool-0";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter13.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter13.deserializeObjectHikariConfig2();
        java.lang.String str18 = serializedObjectSupporter13.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter13.deserializeObjectHikariDataSource12();
        hikariDataSource3.addDataSourceProperty("HikariPool-100", (java.lang.Object) hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str18, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource19);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource7.connectionTestQuery = "HikariPool-17";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        int int3 = hikariDataSource1.getMinimumPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter4.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter4.deserializeObjectHikariDataSource14();
        hikariDataSource7.setAutoCommit(false);
        hikariDataSource7.minPoolSize = 0;
        java.util.Properties properties12 = hikariDataSource7.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariDataSource1.dataSourceProperties = properties12;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.isAutoCommit = false;
        hikariDataSource1.dataSourceClassName = "HikariPool-9";
        hikariDataSource1.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SELECT 1" + "'", str10, "SELECT 1");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str5 = hikariDataSource4.catalog;
        hikariDataSource4.settransactionIsolationName("HikariPool-17");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("test");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file test was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource3();
        hikariDataSource1.addDataSourceProperty("HikariPool-30", (java.lang.Object) hikariDataSource18);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource2();
        int int22 = hikariDataSource21.getAcquireIncrement();
        boolean boolean23 = hikariDataSource21.isJdbc4connectionTest;
        hikariDataSource21.connectionTimeout = 500L;
        java.lang.String str26 = hikariDataSource21.connectionTestQuery;
        int int27 = hikariDataSource21.getAcquireIncrement();
        int int28 = hikariDataSource21.getminPoolSize();
        int int29 = hikariDataSource21.minPoolSize;
        hikariDataSource21.setminPoolSize((int) (byte) 10);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource21);
        hikariDataSource1.transactionIsolation = 114;
        hikariDataSource1.transactionIsolation = 0;
        int int37 = hikariDataSource1.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "VALUES 1" + "'", str26, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource5.setConnectionCustomizerClassName("hi!");
        hikariDataSource5.dataSourceClassName = "HikariPool-14";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        long long4 = hikariDataSource3.getCONNECTION_TIMEOUT();
        hikariDataSource3.acquireRetryDelay = 2;
        boolean boolean7 = hikariDataSource3.isJdbc4ConnectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource17();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter8.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        hikariDataSource3.dataSource = hikariDataSource12;
        hikariDataSource12.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties7 = serializedObjectSupporter6.deserializeObjectProperties1();
        hikariConfig4.addDataSourceProperty("HikariPool-32", (java.lang.Object) serializedObjectSupporter6);
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        hikariDataSource9.setTransactionIsolation("TRANSACTION_REPEATABLE_READ");
        int int12 = hikariDataSource9.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource8.getConnectionCustomizer();
        hikariDataSource8.setisIsolateInternalQueries(false);
        hikariDataSource8.jdbcUrl = "HikariPool-105";
        javax.sql.DataSource dataSource15 = hikariDataSource8.dataSource;
        hikariDataSource8.setCatalog("HikariPool-15");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setisAutoCommit(true);
        boolean boolean5 = hikariConfig0.isInitializationFailFast;
        long long6 = hikariConfig0.getMAX_LIFETIME();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        long long4 = hikariDataSource1.getAcquireRetryDelay();
        java.lang.String str5 = hikariDataSource1.getCatalog();
        hikariDataSource1.setLeakDetectionThreshold((long) (byte) 0);
        hikariDataSource1.setAcquireRetryDelay((long) ' ');
        long long10 = hikariDataSource1.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.transactionIsolationName = "HikariPool-33";
        long long6 = hikariDataSource1.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        boolean boolean6 = hikariDataSource1.isIsolateInternalQueries();
        boolean boolean7 = hikariDataSource1.isInitializationFailFast;
        hikariDataSource1.setConnectionTestQuery("HikariPool-33");
        hikariDataSource1.acquireRetries = 32;
        javax.sql.DataSource dataSource12 = hikariDataSource1.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setisIsolateInternalQueries(false);
        int int6 = hikariDataSource1.maxPoolSize;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties8 = serializedObjectSupporter7.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        int int12 = hikariDataSource11.getAcquireIncrement();
        long long13 = hikariDataSource11.connectionTimeout;
        long long14 = hikariDataSource11.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties16 = serializedObjectSupporter15.deserializeObjectProperties1();
        hikariDataSource11.dataSourceProperties = properties16;
        hikariDataSource9.dataSourceProperties = properties16;
        hikariDataSource1.dataSourceProperties = properties16;
        hikariDataSource1.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setMaximumPoolSize((int) ' ');
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries();
        java.lang.String str10 = hikariDataSource1.getJdbcUrl();
        hikariDataSource1.setisRegisterMbeans(false);
        long long13 = hikariDataSource1.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        int int5 = hikariDataSource2.acquireIncrement;
        javax.sql.DataSource dataSource6 = hikariDataSource2.dataSource;
        boolean boolean7 = hikariDataSource2.isRegisterMbeans;
        boolean boolean8 = hikariDataSource2.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        java.lang.String str4 = hikariDataSource1.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "VALUES 1" + "'", str4, "VALUES 1");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str5 = hikariDataSource4.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.validate();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter3.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter3.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter3.deserializeObjectHikariDataSource11();
        hikariDataSource7.setJdbcUrl("SELECT 1");
        hikariDataSource7.setInitializationFailFast(true);
        hikariDataSource7.dataSourceClassName = "test";
        hikariConfig1.dataSource = hikariDataSource7;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setisIsolateInternalQueries(false);
        int int6 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionTimeout(100L);
        hikariDataSource1.isIsolateInternalQueries = true;
        hikariDataSource1.isReadOnly = false;
        boolean boolean13 = hikariDataSource1.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.acquireIncrement = 99;
        int int5 = hikariDataSource2.getminPoolSize();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setMaximumPoolSize((int) ' ');
        boolean boolean8 = hikariDataSource1.isJdbc4connectionTest;
        long long9 = hikariDataSource1.getConnectionTimeout();
        hikariDataSource1.setisIsolateInternalQueries(false);
        int int12 = hikariDataSource1.acquireIncrement;
        hikariDataSource1.setMaxLifetime(1L);
        hikariDataSource1.minPoolSize = (byte) 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 500L + "'", long9 == 500L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource1();
        hikariDataSource16.acquireIncrement = ' ';
        boolean boolean19 = hikariDataSource16.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-33" + "'", str15, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource2.isJdbc4connectionTest = true;
        hikariDataSource2.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        java.lang.String str7 = hikariDataSource2.catalog;
        java.lang.String str8 = hikariDataSource2.getConnectionCustomizerClassName();
        hikariDataSource2.isJdbc4connectionTest = false;
        hikariDataSource2.connectionCustomizerClassName = "HikariPool-8";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        int int7 = hikariDataSource4.getmaxPoolSize();
        javax.sql.DataSource dataSource8 = hikariDataSource4.dataSource;
        hikariDataSource4.connectionTestQuery = "VALUES 1";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        int int13 = hikariDataSource12.getAcquireIncrement();
        long long14 = hikariDataSource12.getLeakDetectionThreshold();
        hikariDataSource12.setpoolNumber((int) (short) -1);
        int int17 = hikariDataSource12.maxPoolSize;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter18.deserializeObjectHikariDataSource1();
        hikariDataSource12.serializedObjectSupporter = serializedObjectSupporter18;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = hikariDataSource12.serializedObjectSupporter;
        hikariDataSource4.setDataSource((javax.sql.DataSource) hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNotNull(serializedObjectSupporter23);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        hikariDataSource1.setConnectionInitSql("TRANSACTION_READ_COMMITTED");
        hikariDataSource1.leakDetectionThreshold = 14;
        boolean boolean13 = hikariDataSource1.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        long long5 = hikariDataSource1.getMAX_LIFETIME();
        long long6 = hikariDataSource1.getIdleTimeout();
        hikariDataSource1.setmaxPoolSize(100);
        hikariDataSource1.setCatalog("HikariPool-12");
        hikariDataSource1.isIsolateInternalQueries = true;
        hikariDataSource1.setMaxLifetime((long) 'a');
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource5();
        hikariDataSource9.setAcquireRetries(0);
        hikariDataSource9.jdbcUrl = "SELECT 1";
        hikariConfig5.dataSource = hikariDataSource9;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig5.getConnectionCustomizer();
        hikariConfig5.maxLifetime = 19;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        int int3 = hikariDataSource2.acquireRetries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        java.lang.String str4 = hikariDataSource1.catalog;
        int int5 = hikariDataSource1.acquireIncrement;
        int int6 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        int int6 = hikariDataSource3.getTransactionIsolation();
        boolean boolean7 = hikariDataSource3.isInitializationFailFast;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource5.setAcquireRetries(18);
        boolean boolean8 = hikariDataSource5.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean5 = hikariDataSource4.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariDataSource4.connectionCustomizer = iConnectionCustomizer6;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str4, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        boolean boolean7 = hikariDataSource1.getisJdbc4connectionTest();
        long long8 = hikariDataSource1.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        hikariDataSource2.isJdbc4connectionTest = false;
        int int6 = hikariDataSource2.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.connectionTestQuery = "HikariPool-33";
        int int10 = hikariConfig7.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        hikariConfig12.catalog = "HikariPool-33";
        hikariConfig12.maxLifetime = (byte) -1;
        long long17 = hikariConfig12.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource5();
        hikariConfig12.serializedObjectSupporter = serializedObjectSupporter18;
        hikariConfig7.serializedObjectSupporter = serializedObjectSupporter18;
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter18.deserializeObjectHikariDataSource11();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter18;
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter18.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter18.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource2();
        int int28 = hikariDataSource27.getAcquireIncrement();
        long long29 = hikariDataSource27.connectionTimeout;
        int int30 = hikariDataSource27.maxPoolSize;
        boolean boolean31 = hikariDataSource27.isIsolateInternalQueries;
        hikariDataSource27.setMaximumPoolSize((int) ' ');
        boolean boolean34 = hikariDataSource27.isJdbc4connectionTest;
        long long35 = hikariDataSource27.idleTimeout;
        hikariConfig25.setDataSource((javax.sql.DataSource) hikariDataSource27);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertNotNull(hikariConfig25);
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 500L + "'", long29 == 500L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 600000L + "'", long35 == 600000L);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        javax.sql.DataSource dataSource3 = null;
        hikariDataSource2.dataSource = dataSource3;
        int int5 = hikariDataSource2.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource2.setmaxPoolSize((int) 'a');
        hikariDataSource2.setisAutoCommit(false);
        boolean boolean7 = hikariDataSource2.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        long long4 = hikariDataSource1.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties6 = serializedObjectSupporter5.deserializeObjectProperties1();
        hikariDataSource1.dataSourceProperties = properties6;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.util.Properties properties10 = hikariConfig9.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        hikariDataSource1.setisRegisterMbeans(true);
        java.util.Properties properties7 = hikariDataSource1.dataSourceProperties;
        hikariDataSource1.setisRegisterMbeans(false);
        boolean boolean10 = hikariDataSource1.getisJdbc4connectionTest();
        hikariDataSource1.acquireRetryDelay = 9;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        java.lang.String str10 = hikariDataSource4.getCatalog();
        int int11 = hikariDataSource4.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        java.lang.String str7 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.transactionIsolation = 60;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter10.deserializeObjectHikariDataSource11();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter16.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter16.deserializeObjectHikariDataSource5();
        hikariDataSource19.setAcquireRetries(0);
        hikariDataSource19.jdbcUrl = "SELECT 1";
        hikariConfig15.dataSource = hikariDataSource19;
        hikariDataSource19.transactionIsolationName = "HikariPool-32";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter27 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter27.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter27.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter27.deserializeObjectHikariDataSource3();
        hikariDataSource30.setIdleTimeout((long) (byte) 1);
        boolean boolean33 = hikariDataSource30.isJdbc4connectionTest;
        hikariDataSource30.dataSourceClassName = "VALUES 1";
        hikariDataSource30.setDataSourceClassName("test");
        hikariDataSource30.setIdleTimeout((long) (byte) -1);
        hikariDataSource30.setLeakDetectionThreshold((long) 4);
        int int42 = hikariDataSource30.acquireIncrement;
        java.util.Properties properties43 = hikariDataSource30.dataSourceProperties;
        hikariDataSource19.dataSourceProperties = properties43;
        hikariDataSource1.dataSourceProperties = properties43;
        hikariDataSource1.setAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-6" + "'", str14, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource28);
        org.junit.Assert.assertNotNull(hikariDataSource29);
        org.junit.Assert.assertNotNull(hikariDataSource30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        boolean boolean4 = hikariDataSource1.getisAutoCommit();
        int int5 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-4");
        hikariDataSource1.setisRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource2.setAcquireRetryDelay(1800000L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource5();
        hikariDataSource8.setAcquireRetries(0);
        hikariDataSource2.setDataSource((javax.sql.DataSource) hikariDataSource8);
        long long12 = hikariDataSource8.getIdleTimeout();
        hikariDataSource8.acquireIncrement = 20;
        long long15 = hikariDataSource8.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getACQUIRE_RETRY_DELAY();
        hikariConfig8.idleTimeout = 32L;
        hikariConfig8.isAutoCommit = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.isReadOnly = false;
        hikariDataSource1.setisIsolateInternalQueries(true);
        int int6 = hikariDataSource1.getTransactionIsolation();
        long long7 = hikariDataSource1.idleTimeout;
        hikariDataSource1.connectionTimeout = 64;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        long long9 = hikariDataSource8.getConnectionTimeout();
        hikariDataSource8.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        java.lang.String str18 = hikariDataSource17.transactionIsolationName;
        hikariDataSource17.setCatalog("VALUES 1");
        long long21 = hikariDataSource17.getACQUIRE_RETRY_DELAY();
        hikariDataSource17.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        hikariDataSource5.acquireRetries = 16;
        hikariDataSource5.setAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource5.setJdbcUrl("HikariPool-13");
        boolean boolean8 = hikariDataSource5.isInitializationFailFast;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        hikariDataSource1.setJdbc4ConnectionTest(true);
        int int11 = hikariDataSource1.maxPoolSize;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource2();
        int int14 = hikariDataSource13.getAcquireIncrement();
        int int15 = hikariDataSource13.getMaximumPoolSize();
        hikariDataSource13.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource13.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean20 = hikariDataSource13.isAutoCommit;
        long long21 = hikariDataSource13.maxLifetime;
        hikariDataSource13.setisInitializationFailFast(false);
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource13);
        hikariDataSource1.poolName = "HikariPool-97";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource17();
        hikariDataSource10.idleTimeout = 1L;
        hikariDataSource10.setAcquireRetryDelay((long) 106);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        boolean boolean5 = hikariDataSource4.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setLeakDetectionThreshold(100L);
        hikariConfig0.jdbcUrl = "HikariPool-98";
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource4.setJdbcUrl("SELECT 1");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties8 = serializedObjectSupporter7.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource12();
        java.util.Properties properties11 = serializedObjectSupporter7.deserializeObjectProperties1();
        hikariDataSource4.setDataSourceProperties(properties11);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource2();
        int int15 = hikariDataSource14.getAcquireIncrement();
        long long16 = hikariDataSource14.getLeakDetectionThreshold();
        hikariDataSource14.maxPoolSize = (short) 1;
        long long19 = hikariDataSource14.acquireRetryDelay;
        hikariDataSource14.connectionTimeout = (short) -1;
        hikariDataSource14.setConnectionInitSql("TRANSACTION_READ_COMMITTED");
        long long24 = hikariDataSource14.getCONNECTION_TIMEOUT();
        hikariDataSource4.setDataSource((javax.sql.DataSource) hikariDataSource14);
        hikariDataSource14.setPoolName("HikariPool-2");
        hikariDataSource14.settransactionIsolationName("HikariPool-0");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource6.idleTimeout = 64;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        long long5 = hikariConfig4.acquireRetryDelay;
        hikariConfig4.catalog = "HikariPool-18";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        hikariDataSource2.isJdbc4connectionTest = false;
        int int6 = hikariDataSource2.getAcquireRetries();
        java.lang.String str7 = hikariDataSource2.jdbcUrl;
        boolean boolean8 = hikariDataSource2.isIsolateInternalQueries;
        hikariDataSource2.setReadOnly(true);
        hikariDataSource2.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.setAcquireIncrement(60);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.isInitializationFailFast = true;
        hikariDataSource1.setDataSourceClassName("HikariPool-15");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        long long9 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str10 = hikariDataSource1.getJdbcUrl();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter11.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        int int17 = hikariDataSource16.getAcquireIncrement();
        long long18 = hikariDataSource16.connectionTimeout;
        long long19 = hikariDataSource16.getAcquireRetryDelay();
        hikariDataSource14.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource16);
        long long21 = hikariDataSource16.getLeakDetectionThreshold();
        hikariDataSource16.dataSourceClassName = "HikariPool-33";
        hikariDataSource16.addDataSourceProperty("HikariPool-33", (java.lang.Object) (-1.0d));
        long long27 = hikariDataSource16.getCONNECTION_TIMEOUT();
        hikariDataSource1.dataSource = hikariDataSource16;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter29 = hikariDataSource16.serializedObjectSupporter;
        hikariDataSource16.connectionInitSql = "HikariPool-30";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 500L + "'", long18 == 500L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertNull(serializedObjectSupporter29);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int8 = hikariDataSource7.maxPoolSize;
        boolean boolean9 = hikariDataSource7.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        java.util.Properties properties6 = hikariDataSource1.dataSourceProperties;
        boolean boolean7 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.isIsolateInternalQueries = false;
        hikariDataSource1.isIsolateInternalQueries = true;
        java.lang.String str12 = hikariDataSource1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        int int8 = hikariDataSource7.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource3();
        hikariDataSource1.addDataSourceProperty("HikariPool-30", (java.lang.Object) hikariDataSource18);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter20.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter20.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter20.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter20.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter20.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter20.deserializeObjectHikariConfig3();
        java.lang.String str28 = serializedObjectSupporter20.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter20.deserializeObjectHikariDataSource11();
        java.lang.String str30 = serializedObjectSupporter20.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter20.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter20.deserializeObjectHikariDataSource2();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter20;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertNotNull(hikariDataSource23);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNotNull(hikariConfig27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SELECT 1" + "'", str28, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-6" + "'", str30, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource31);
        org.junit.Assert.assertNotNull(hikariDataSource32);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str6 = hikariDataSource5.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariDataSource1.connectionCustomizer;
        hikariDataSource1.setMaximumPoolSize(4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        int int12 = hikariDataSource11.getAcquireIncrement();
        long long13 = hikariDataSource11.connectionTimeout;
        long long14 = hikariDataSource11.getAcquireRetryDelay();
        hikariDataSource9.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource11);
        long long16 = hikariDataSource11.getLeakDetectionThreshold();
        long long17 = hikariDataSource11.maxLifetime;
        hikariDataSource11.minPoolSize = 0;
        hikariDataSource11.setIsolateInternalQueries(true);
        boolean boolean22 = hikariDataSource11.isJdbc4ConnectionTest();
        int int23 = hikariDataSource11.maxPoolSize;
        int int24 = hikariDataSource11.getminPoolSize();
        int int25 = hikariDataSource11.getMinimumPoolSize();
        hikariDataSource1.addDataSourceProperty("HikariPool-99", (java.lang.Object) hikariDataSource11);
        hikariDataSource11.setIdleTimeout((long) 101);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setmaxPoolSize(16);
        hikariDataSource2.isInitializationFailFast = false;
        hikariDataSource2.setDataSourceClassName("");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        long long6 = hikariDataSource5.idleTimeout;
        hikariDataSource5.setMinimumPoolSize((int) (short) 0);
        boolean boolean9 = hikariDataSource5.getisRegisterMbeans();
        hikariDataSource5.setAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        int int8 = hikariDataSource7.getminPoolSize();
        long long9 = hikariDataSource7.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setJdbc4ConnectionTest(false);
        boolean boolean6 = hikariDataSource3.isAutoCommit;
        hikariDataSource3.validate();
        int int8 = hikariDataSource3.acquireRetries;
        boolean boolean9 = hikariDataSource3.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties7 = serializedObjectSupporter6.deserializeObjectProperties1();
        hikariConfig4.addDataSourceProperty("HikariPool-32", (java.lang.Object) serializedObjectSupporter6);
        java.lang.String str9 = hikariConfig4.connectionTestQuery;
        hikariConfig4.setisReadOnly(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter12.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter12.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource2();
        int int18 = hikariDataSource17.getAcquireIncrement();
        long long19 = hikariDataSource17.connectionTimeout;
        long long20 = hikariDataSource17.getAcquireRetryDelay();
        hikariDataSource15.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource17);
        long long22 = hikariDataSource17.getLeakDetectionThreshold();
        long long23 = hikariDataSource17.maxLifetime;
        hikariDataSource17.minPoolSize = 0;
        hikariDataSource17.setIsolateInternalQueries(true);
        boolean boolean28 = hikariDataSource17.isJdbc4ConnectionTest();
        int int29 = hikariDataSource17.maxPoolSize;
        int int30 = hikariDataSource17.getminPoolSize();
        java.util.Properties properties31 = hikariDataSource17.dataSourceProperties;
        hikariConfig4.dataSourceProperties = properties31;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        int int7 = hikariDataSource4.getmaxPoolSize();
        hikariDataSource4.setisIsolateInternalQueries(false);
        hikariDataSource4.maxPoolSize = 0;
        int int12 = hikariDataSource4.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = hikariConfig5.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        long long6 = hikariDataSource1.maxLifetime;
        int int7 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setTransactionIsolation("TRANSACTION_READ_COMMITTED");
        boolean boolean10 = hikariDataSource1.getisAutoCommit();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource1();
        java.util.Properties properties14 = serializedObjectSupporter11.deserializeObjectProperties1();
        hikariDataSource1.setDataSourceProperties(properties14);
        hikariDataSource1.acquireRetries = (short) 0;
        long long18 = hikariDataSource1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        boolean boolean5 = hikariDataSource1.getisInitializationFailFast();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        long long4 = hikariDataSource3.getCONNECTION_TIMEOUT();
        hikariDataSource3.acquireRetryDelay = 2;
        boolean boolean7 = hikariDataSource3.isJdbc4ConnectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource17();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter8.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        hikariDataSource3.dataSource = hikariDataSource12;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource1();
        long long17 = hikariDataSource16.getIdleTimeout();
        int int18 = hikariDataSource16.getAcquireRetries();
        boolean boolean19 = hikariDataSource16.isInitializationFailFast;
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter10.deserializeObjectHikariDataSource5();
        org.slf4j.impl.SimpleLogger simpleLogger14 = serializedObjectSupporter10.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter10.deserializeObjectHikariDataSource17();
        java.util.Properties properties16 = serializedObjectSupporter10.deserializeObjectProperties1();
        hikariConfig9.setDataSourceProperties(properties16);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(simpleLogger14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource3.connectionTimeout = 16;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource4.setisInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-20" + "'", str5, "HikariPool-20");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean7 = hikariDataSource6.isReadOnly;
        java.lang.String str8 = hikariDataSource6.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-18" + "'", str8, "HikariPool-18");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.jdbcUrl;
        boolean boolean2 = hikariConfig0.isRegisterMbeans;
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        java.util.Properties properties6 = hikariDataSource1.dataSourceProperties;
        java.lang.String str7 = hikariDataSource1.getConnectionTestQuery();
        int int8 = hikariDataSource1.acquireIncrement;
        int int9 = hikariDataSource1.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource2.maxLifetime = 500L;
        boolean boolean5 = hikariDataSource2.isInitializationFailFast();
        hikariDataSource2.setDataSourceClassName("HikariPool-4");
        java.lang.String str8 = hikariDataSource2.getConnectionTestQuery();
        long long9 = hikariDataSource2.idleTimeout;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "VALUES 1" + "'", str8, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        long long9 = hikariDataSource8.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        int int7 = hikariDataSource4.getmaxPoolSize();
        javax.sql.DataSource dataSource8 = hikariDataSource4.dataSource;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource4.copyState(hikariConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Exception copying HikariConfig state: null");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource4.setpoolNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.leakDetectionThreshold = (short) -1;
        hikariDataSource3.setpoolNumber(101);
        boolean boolean8 = hikariDataSource3.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource4();
        java.lang.String str8 = hikariDataSource7.dataSourceClassName;
        hikariDataSource7.acquireRetries = '#';
        hikariDataSource7.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource7.setAutoCommit(false);
        hikariDataSource7.setConnectionTimeout((long) (byte) 0);
        hikariDataSource5.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource5.setInitializationFailFast(true);
        hikariDataSource5.setisAutoCommit(true);
        long long22 = hikariDataSource5.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setMaxLifetime((long) 100);
        long long5 = hikariDataSource2.acquireRetryDelay;
        hikariDataSource2.setMaximumPoolSize((int) (short) 0);
        int int8 = hikariDataSource2.getTransactionIsolation();
        java.lang.String str9 = hikariDataSource2.getConnectionTestQuery();
        hikariDataSource2.dataSourceClassName = "HikariPool-17";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        hikariDataSource1.connectionInitSql = "SELECT 1";
        boolean boolean11 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig6.setDriverClassName("HikariPool-19");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-19' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        java.lang.String str5 = hikariDataSource1.dataSourceClassName;
        long long6 = hikariDataSource1.getMaxLifetime();
        hikariDataSource1.settransactionIsolationName("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.maxLifetime;
        hikariDataSource5.minPoolSize = 0;
        hikariDataSource5.setIsolateInternalQueries(true);
        boolean boolean16 = hikariDataSource5.isJdbc4ConnectionTest();
        int int17 = hikariDataSource5.maxPoolSize;
        int int18 = hikariDataSource5.getminPoolSize();
        hikariDataSource5.setAcquireIncrement(35);
        long long21 = hikariDataSource5.leakDetectionThreshold;
        boolean boolean22 = hikariDataSource5.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        hikariConfig1.transactionIsolationName = "HikariPool-33";
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        long long10 = hikariConfig1.getIDLE_TIMEOUT();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        long long12 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        java.util.Properties properties9 = hikariDataSource1.dataSourceProperties;
        hikariDataSource1.setisJdbc4connectionTest(false);
        hikariDataSource1.setDataSourceClassName("HikariPool-8");
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setDataSourceClassName("");
        int int8 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setDataSourceClassName("TRANSACTION_READ_COMMITTED");
        hikariDataSource1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        hikariDataSource3.isIsolateInternalQueries = false;
        java.lang.String str7 = hikariDataSource3.getPoolName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties9 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter8.deserializeObjectHikariDataSource9();
        hikariDataSource11.setminPoolSize((int) (short) 10);
        hikariDataSource11.acquireIncrement = '#';
        hikariDataSource3.setDataSource((javax.sql.DataSource) hikariDataSource11);
        hikariDataSource3.setAcquireRetries(101);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-24" + "'", str7, "HikariPool-24");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.isInitializationFailFast = true;
        long long7 = hikariDataSource1.getMaxLifetime();
        hikariDataSource1.connectionTimeout = 0L;
        java.lang.String str10 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.isRegisterMbeans = true;
        long long10 = hikariDataSource4.acquireRetryDelay;
        hikariDataSource4.setpoolNumber((int) (byte) -1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        int int4 = hikariDataSource2.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        java.lang.String str4 = hikariDataSource1.connectionInitSql;
        hikariDataSource1.setInitializationFailFast(false);
        java.lang.String str7 = hikariDataSource1.connectionCustomizerClassName;
        long long8 = hikariDataSource1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setisAutoCommit(false);
        hikariDataSource4.setRegisterMbeans(true);
        java.lang.String str10 = hikariDataSource4.getDataSourceClassName();
        hikariDataSource4.transactionIsolationName = "HikariPool-32";
        boolean boolean13 = hikariDataSource4.isJdbc4connectionTest;
        boolean boolean14 = hikariDataSource4.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        hikariDataSource5.dataSourceClassName = "HikariPool-33";
        hikariDataSource5.addDataSourceProperty("HikariPool-33", (java.lang.Object) (-1.0d));
        long long16 = hikariDataSource5.getCONNECTION_TIMEOUT();
        hikariDataSource5.connectionCustomizerClassName = "HikariPool-22";
        hikariDataSource5.leakDetectionThreshold = 62;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource5();
        java.lang.String str7 = serializedObjectSupporter5.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariConfig4.serializedObjectSupporter = serializedObjectSupporter5;
        hikariConfig4.setInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        java.util.Properties properties4 = hikariDataSource1.dataSourceProperties;
        java.lang.String str5 = hikariDataSource1.getConnectionTestQuery();
        long long6 = hikariDataSource1.getLeakDetectionThreshold();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        int int10 = hikariDataSource9.getAcquireIncrement();
        boolean boolean11 = hikariDataSource9.isJdbc4connectionTest;
        java.lang.String str12 = hikariDataSource9.jdbcUrl;
        hikariDataSource9.setAutoCommit(false);
        hikariDataSource1.addDataSourceProperty("", (java.lang.Object) false);
        hikariDataSource1.setIsolateInternalQueries(false);
        boolean boolean18 = hikariDataSource1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setDriverClassName("HikariPool-22");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-22' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.setpoolNumber((int) (short) -1);
        java.lang.String str6 = hikariDataSource1.transactionIsolationName;
        long long7 = hikariDataSource1.maxLifetime;
        boolean boolean8 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.setRegisterMbeans(false);
        hikariDataSource1.setMaxLifetime((long) 102);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        hikariDataSource1.setJdbc4ConnectionTest(true);
        hikariDataSource1.isReadOnly = true;
        java.lang.String str13 = hikariDataSource1.connectionInitSql;
        boolean boolean14 = hikariDataSource1.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource5();
        hikariDataSource9.setAcquireRetries(0);
        hikariDataSource9.jdbcUrl = "SELECT 1";
        hikariConfig5.dataSource = hikariDataSource9;
        long long15 = hikariConfig5.getIDLE_TIMEOUT();
        java.lang.Class<?> wildcardClass16 = hikariConfig5.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setMaxLifetime((long) 100);
        long long5 = hikariDataSource2.acquireRetryDelay;
        hikariDataSource2.setmaxPoolSize((int) '4');
        long long8 = hikariDataSource2.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource10();
        hikariDataSource10.jdbcUrl = "hi!";
        boolean boolean13 = hikariDataSource10.getisJdbc4connectionTest();
        boolean boolean14 = hikariDataSource10.isReadOnly;
        hikariDataSource2.dataSource = hikariDataSource10;
        hikariDataSource2.setAcquireIncrement((int) 'a');
        java.lang.String str18 = hikariDataSource2.jdbcUrl;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        int int6 = hikariDataSource5.getminPoolSize();
        long long7 = hikariDataSource5.leakDetectionThreshold;
        long long8 = hikariDataSource5.acquireRetryDelay;
        java.lang.String str9 = hikariDataSource5.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        java.lang.String str17 = hikariDataSource16.connectionTestQuery;
        hikariDataSource16.idleTimeout = 32;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "VALUES 1" + "'", str17, "VALUES 1");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        int int12 = hikariDataSource11.getAcquireIncrement();
        boolean boolean13 = hikariDataSource11.isJdbc4connectionTest;
        hikariDataSource11.connectionTimeout = 500L;
        java.lang.String str16 = hikariDataSource11.connectionTestQuery;
        boolean boolean17 = hikariDataSource11.getisJdbc4connectionTest();
        hikariDataSource9.dataSource = hikariDataSource11;
        boolean boolean19 = hikariDataSource9.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "VALUES 1" + "'", str16, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        hikariDataSource3.minPoolSize = 0;
        java.lang.String str8 = hikariDataSource3.getConnectionTestQuery();
        int int9 = hikariDataSource3.acquireIncrement;
        hikariDataSource3.maxPoolSize = 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariDataSource3.getConnectionCustomizer();
        boolean boolean13 = hikariDataSource3.getisReadOnly();
        int int14 = hikariDataSource3.getminPoolSize();
        long long15 = hikariDataSource3.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "VALUES 1" + "'", str8, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        int int5 = hikariDataSource4.getAcquireRetries();
        long long6 = hikariDataSource4.getAcquireRetryDelay();
        long long7 = hikariDataSource4.getACQUIRE_RETRY_DELAY();
        hikariDataSource4.setisReadOnly(false);
        boolean boolean10 = hikariDataSource4.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource2();
        int int5 = hikariDataSource4.getAcquireIncrement();
        hikariDataSource4.settransactionIsolationName("hi!");
        hikariDataSource4.connectionTimeout = (byte) 1;
        java.lang.String str10 = hikariDataSource4.transactionIsolationName;
        int int11 = hikariDataSource4.getMinimumPoolSize();
        boolean boolean12 = hikariDataSource4.isReadOnly();
        hikariDataSource4.isInitializationFailFast = true;
        hikariDataSource2.setDataSource((javax.sql.DataSource) hikariDataSource4);
        int int16 = hikariDataSource4.acquireIncrement;
        long long17 = hikariDataSource4.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource4.setCatalog("TRANSACTION_REPEATABLE_READ");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource3();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter7.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter7.deserializeObjectHikariDataSource3();
        hikariDataSource4.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource14);
        int int16 = hikariDataSource4.getTransactionIsolation();
        long long17 = hikariDataSource4.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        hikariDataSource1.connectionTestQuery = "TRANSACTION_READ_COMMITTED";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariDataSource1.connectionCustomizer;
        hikariDataSource1.dataSourceClassName = "HikariPool-2";
        boolean boolean15 = hikariDataSource1.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource2.setAcquireRetryDelay(1800000L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter5.deserializeObjectHikariDataSource12();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter5.deserializeObjectHikariDataSource15();
        hikariDataSource11.setpoolNumber(4);
        boolean boolean14 = hikariDataSource11.isAutoCommit;
        hikariDataSource11.acquireRetryDelay = 1800000L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str9 = hikariDataSource8.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource2();
        int int5 = hikariDataSource4.getAcquireIncrement();
        hikariDataSource4.settransactionIsolationName("hi!");
        hikariDataSource4.connectionTimeout = (byte) 1;
        java.lang.String str10 = hikariDataSource4.transactionIsolationName;
        int int11 = hikariDataSource4.getMinimumPoolSize();
        boolean boolean12 = hikariDataSource4.isReadOnly();
        hikariDataSource4.isInitializationFailFast = true;
        hikariDataSource2.setDataSource((javax.sql.DataSource) hikariDataSource4);
        hikariDataSource2.isAutoCommit = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        long long3 = hikariConfig2.getAcquireRetryDelay();
        hikariConfig2.setMaxLifetime((long) 103);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int6 = hikariDataSource5.getAcquireIncrement();
        boolean boolean7 = hikariDataSource5.getisIsolateInternalQueries();
        hikariDataSource5.setInitializationFailFast(false);
        hikariDataSource5.isReadOnly = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.getConnectionCustomizer();
        hikariDataSource6.poolName = "HikariPool-4";
        boolean boolean10 = hikariDataSource6.getisInitializationFailFast();
        int int11 = hikariDataSource6.getpoolNumber();
        hikariDataSource6.setAcquireRetryDelay((long) ' ');
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        hikariDataSource1.setJdbc4ConnectionTest(true);
        int int11 = hikariDataSource1.maxPoolSize;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource2();
        int int14 = hikariDataSource13.getAcquireIncrement();
        int int15 = hikariDataSource13.getMaximumPoolSize();
        hikariDataSource13.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource13.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean20 = hikariDataSource13.isAutoCommit;
        long long21 = hikariDataSource13.maxLifetime;
        hikariDataSource13.setisInitializationFailFast(false);
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource13);
        int int25 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        long long9 = hikariDataSource1.getConnectionTimeout();
        hikariDataSource1.settransactionIsolationName("VALUES 1");
        hikariDataSource1.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.setMaximumPoolSize((int) '#');
        boolean boolean9 = hikariDataSource1.getisAutoCommit();
        hikariDataSource1.setLeakDetectionThreshold(0L);
        int int12 = hikariDataSource1.getminPoolSize();
        long long13 = hikariDataSource1.connectionTimeout;
        java.lang.String str14 = hikariDataSource1.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        boolean boolean6 = hikariDataSource3.isRegisterMbeans;
        long long7 = hikariDataSource3.getMaxLifetime();
        java.lang.String str8 = hikariDataSource3.transactionIsolationName;
        boolean boolean9 = hikariDataSource3.getisAutoCommit();
        boolean boolean10 = hikariDataSource3.getisReadOnly();
        long long11 = hikariDataSource3.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.acquireRetries = '#';
        hikariDataSource1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.setAutoCommit(false);
        hikariDataSource1.setConnectionTimeout((long) (byte) 0);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        hikariConfig12.setisReadOnly(false);
        long long15 = hikariConfig12.getAcquireRetryDelay();
        hikariDataSource1.copyState(hikariConfig12);
        hikariDataSource1.isIsolateInternalQueries = true;
        boolean boolean19 = hikariDataSource1.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.isInitializationFailFast = true;
        long long7 = hikariDataSource1.idleTimeout;
        boolean boolean8 = hikariDataSource1.isReadOnly();
        hikariDataSource1.setMaxLifetime((long) (short) -1);
        long long11 = hikariDataSource1.getIdleTimeout();
        int int12 = hikariDataSource1.minPoolSize;
        java.lang.String str13 = hikariDataSource1.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        java.lang.String str8 = hikariDataSource4.getConnectionInitSql();
        boolean boolean9 = hikariDataSource4.getisIsolateInternalQueries();
        java.lang.String str10 = hikariDataSource4.getJdbcUrl();
        java.lang.String str11 = hikariDataSource4.getPoolName();
        boolean boolean12 = hikariDataSource4.isReadOnly();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter13.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter13.deserializeObjectHikariDataSource3();
        boolean boolean18 = hikariDataSource17.getisAutoCommit();
        hikariDataSource4.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "VALUES 1" + "'", str11, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        int int6 = hikariDataSource5.transactionIsolation;
        boolean boolean7 = hikariDataSource5.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str9, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setReadOnly(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        int int13 = hikariDataSource12.getAcquireIncrement();
        hikariDataSource12.settransactionIsolationName("hi!");
        hikariDataSource12.acquireRetries = (short) 10;
        hikariDataSource12.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource12.poolName = "";
        hikariDataSource12.setMaxLifetime(600000L);
        hikariDataSource12.setpoolNumber((int) (byte) 1);
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource12);
        hikariConfig1.connectionCustomizerClassName = "";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        long long9 = hikariDataSource8.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        long long6 = hikariDataSource5.idleTimeout;
        hikariDataSource5.setMinimumPoolSize((int) (short) 0);
        long long9 = hikariDataSource5.getIdleTimeout();
        int int10 = hikariDataSource5.getTransactionIsolation();
        hikariDataSource5.setConnectionCustomizerClassName("hi!");
        long long13 = hikariDataSource5.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        hikariConfig1.transactionIsolationName = "HikariPool-33";
        hikariConfig1.dataSourceClassName = "HikariPool-18";
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        hikariDataSource3.setCatalog("HikariPool-30");
        hikariDataSource3.poolName = "HikariPool-99";
        long long8 = hikariDataSource3.getCONNECTION_TIMEOUT();
        hikariDataSource3.jdbcUrl = "HikariPool-100";
        int int11 = hikariDataSource3.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = null;
        hikariDataSource3.connectionCustomizer = iConnectionCustomizer4;
        boolean boolean6 = hikariDataSource3.isAutoCommit;
        boolean boolean7 = hikariDataSource3.isAutoCommit();
        int int8 = hikariDataSource3.minPoolSize;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        hikariDataSource1.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.setisReadOnly(true);
        boolean boolean9 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.transactionIsolationName = "TRANSACTION_READ_COMMITTED";
        hikariDataSource1.leakDetectionThreshold = 14;
        hikariDataSource1.setisInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int3 = hikariConfig0.getAcquireIncrement();
        int int4 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        hikariDataSource7.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        hikariDataSource3.minPoolSize = 0;
        hikariDataSource3.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        java.util.Properties properties9 = hikariDataSource1.dataSourceProperties;
        hikariDataSource1.setisJdbc4connectionTest(false);
        hikariDataSource1.setDataSourceClassName("HikariPool-8");
        java.lang.String str14 = hikariDataSource1.catalog;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource3.isAutoCommit = true;
        int int6 = hikariDataSource3.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.getLeakDetectionThreshold();
        long long8 = hikariDataSource1.getIDLE_TIMEOUT();
        hikariDataSource1.setConnectionInitSql("HikariPool-9");
        boolean boolean11 = hikariDataSource1.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setMaximumPoolSize((int) ' ');
        hikariDataSource1.validate();
        hikariDataSource1.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource5();
        java.lang.String str7 = serializedObjectSupporter5.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariConfig4.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString3();
        java.lang.String str11 = serializedObjectSupporter5.deserializeObjectString7();
        java.lang.String str12 = serializedObjectSupporter5.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter5.deserializeObjectHikariDataSource5();
        javax.sql.DataSource dataSource14 = hikariDataSource13.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-6" + "'", str10, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-32" + "'", str11, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SELECT 1" + "'", str12, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource16();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariConfig13);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "HikariPool-33";
        hikariDataSource1.setisJdbc4connectionTest(true);
        int int6 = hikariDataSource1.acquireRetries;
        java.lang.String str7 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setpoolNumber(32);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isIsolateInternalQueries();
        boolean boolean6 = hikariDataSource4.isInitializationFailFast();
        hikariDataSource4.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        java.lang.String str4 = hikariDataSource1.connectionInitSql;
        hikariDataSource1.setInitializationFailFast(false);
        java.lang.String str7 = hikariDataSource1.getJdbcUrl();
        javax.sql.DataSource dataSource8 = hikariDataSource1.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.getConnectionCustomizer();
        long long8 = hikariDataSource6.getLeakDetectionThreshold();
        hikariDataSource6.setAcquireRetries((int) (byte) 100);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        hikariDataSource1.setJdbc4ConnectionTest(true);
        long long11 = hikariDataSource1.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str4 = hikariDataSource3.getConnectionCustomizerClassName();
        hikariDataSource3.setLeakDetectionThreshold((long) (byte) 100);
        hikariDataSource3.acquireRetryDelay = 114;
        java.lang.String str9 = hikariDataSource3.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        int int10 = hikariDataSource4.getTransactionIsolation();
        java.lang.String str11 = hikariDataSource4.jdbcUrl;
        int int12 = hikariDataSource4.getmaxPoolSize();
        java.util.Properties properties13 = hikariDataSource4.getDataSourceProperties();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        long long5 = hikariDataSource4.getConnectionTimeout();
        hikariDataSource4.setAcquireIncrement(19);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        boolean boolean7 = hikariDataSource6.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        int int4 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.connectionCustomizerClassName = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        int int5 = hikariDataSource4.getMinimumPoolSize();
        hikariDataSource4.acquireRetryDelay = 21;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        long long6 = hikariDataSource5.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource2.isJdbc4connectionTest = true;
        boolean boolean5 = hikariDataSource2.getisJdbc4connectionTest();
        java.lang.String str6 = hikariDataSource2.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int7 = hikariDataSource6.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        long long4 = hikariConfig3.maxLifetime;
        int int5 = hikariConfig3.getAcquireIncrement();
        hikariConfig3.acquireRetryDelay = 62;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource3();
        hikariDataSource1.addDataSourceProperty("HikariPool-30", (java.lang.Object) hikariDataSource18);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource2();
        int int22 = hikariDataSource21.getAcquireIncrement();
        boolean boolean23 = hikariDataSource21.isJdbc4connectionTest;
        hikariDataSource21.connectionTimeout = 500L;
        java.lang.String str26 = hikariDataSource21.connectionTestQuery;
        int int27 = hikariDataSource21.getAcquireIncrement();
        int int28 = hikariDataSource21.getminPoolSize();
        int int29 = hikariDataSource21.minPoolSize;
        hikariDataSource21.setminPoolSize((int) (byte) 10);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource21);
        hikariDataSource21.setminPoolSize(103);
        int int35 = hikariDataSource21.getminPoolSize();
        java.lang.String str36 = hikariDataSource21.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "VALUES 1" + "'", str26, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 103 + "'", int35 == 103);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        hikariDataSource9.setIdleTimeout((long) (byte) 1);
        hikariDataSource9.leakDetectionThreshold = (short) 0;
        hikariDataSource9.acquireIncrement = 0;
        hikariDataSource9.setMinimumPoolSize((int) '4');
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource9);
        hikariDataSource3.setisAutoCommit(false);
        boolean boolean21 = hikariDataSource3.isReadOnly();
        long long22 = hikariDataSource3.getAcquireRetryDelay();
        hikariDataSource3.setisIsolateInternalQueries(false);
        java.lang.String str25 = hikariDataSource3.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setTransactionIsolation("");
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        java.lang.String str6 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.dataSourceClassName = "HikariPool-0";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.isIsolateInternalQueries = true;
        boolean boolean8 = hikariDataSource1.isInitializationFailFast();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource2();
        int int11 = hikariDataSource10.getAcquireIncrement();
        long long12 = hikariDataSource10.getLeakDetectionThreshold();
        hikariDataSource10.maxPoolSize = (short) 1;
        boolean boolean15 = hikariDataSource10.getisIsolateInternalQueries();
        hikariDataSource10.setIsolateInternalQueries(true);
        java.lang.String str18 = hikariDataSource10.gettransactionIsolationName();
        hikariDataSource10.setPoolName("HikariPool-13");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = hikariDataSource22.serializedObjectSupporter;
        hikariDataSource22.setIsolateInternalQueries(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource4();
        java.lang.String str28 = hikariDataSource27.dataSourceClassName;
        java.util.Properties properties29 = hikariDataSource27.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariDataSource22.setDataSourceProperties(properties29);
        hikariDataSource10.setDataSourceProperties(properties29);
        hikariDataSource1.setDataSourceProperties(properties29);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str28, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        int int10 = hikariDataSource3.acquireIncrement;
        long long11 = hikariDataSource3.leakDetectionThreshold;
        hikariDataSource3.catalog = "SELECT 1";
        long long14 = hikariDataSource3.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties7 = serializedObjectSupporter6.deserializeObjectProperties1();
        hikariConfig4.addDataSourceProperty("HikariPool-32", (java.lang.Object) serializedObjectSupporter6);
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        boolean boolean10 = hikariDataSource9.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties7 = serializedObjectSupporter6.deserializeObjectProperties1();
        hikariConfig4.addDataSourceProperty("HikariPool-32", (java.lang.Object) serializedObjectSupporter6);
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        hikariDataSource9.transactionIsolationName = "HikariPool-33";
        boolean boolean12 = hikariDataSource9.isAutoCommit();
        java.lang.String str13 = hikariDataSource9.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariDataSource1.connectionCustomizer;
        hikariDataSource1.setMaximumPoolSize(4);
        java.lang.String str5 = hikariDataSource1.connectionTestQuery;
        hikariDataSource1.setmaxPoolSize(0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource8.getConnectionCustomizer();
        hikariDataSource8.setisIsolateInternalQueries(false);
        hikariDataSource8.jdbcUrl = "HikariPool-105";
        int int15 = hikariDataSource8.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariDataSource1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource14();
        java.lang.String str10 = hikariDataSource9.connectionInitSql;
        hikariDataSource9.isIsolateInternalQueries = false;
        java.lang.String str13 = hikariDataSource9.getPoolName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties15 = serializedObjectSupporter14.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource9();
        hikariDataSource17.setminPoolSize((int) (short) 10);
        hikariDataSource17.acquireIncrement = '#';
        hikariDataSource9.setDataSource((javax.sql.DataSource) hikariDataSource17);
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-24" + "'", str13, "HikariPool-24");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource5.setConnectionInitSql("TRANSACTION_READ_COMMITTED");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        int int10 = hikariDataSource9.getAcquireIncrement();
        hikariDataSource9.setIsolateInternalQueries(false);
        hikariDataSource9.acquireIncrement = (byte) 0;
        long long15 = hikariDataSource9.getCONNECTION_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter16.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter16.deserializeObjectHikariDataSource3();
        java.lang.String str20 = serializedObjectSupporter16.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter16.deserializeObjectHikariConfig3();
        java.lang.String str22 = serializedObjectSupporter16.deserializeObjectString6();
        java.util.Properties properties23 = serializedObjectSupporter16.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariDataSource9.setDataSourceProperties(properties23);
        hikariDataSource5.setDataSourceProperties(properties23);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str20, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str22, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setUseInstrumentation(false);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        int int6 = hikariDataSource1.getmaxPoolSize();
        long long7 = hikariDataSource1.leakDetectionThreshold;
        hikariDataSource1.transactionIsolation = 102;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str7 = hikariDataSource6.connectionTestQuery;
        boolean boolean8 = hikariDataSource6.getisReadOnly();
        long long9 = hikariDataSource6.getMAX_LIFETIME();
        java.lang.String str10 = hikariDataSource6.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource9.minPoolSize = 21;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        hikariDataSource5.dataSourceClassName = "HikariPool-33";
        hikariDataSource5.addDataSourceProperty("HikariPool-33", (java.lang.Object) (-1.0d));
        long long16 = hikariDataSource5.getCONNECTION_TIMEOUT();
        long long17 = hikariDataSource5.connectionTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter18.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = hikariDataSource21.serializedObjectSupporter;
        hikariDataSource5.dataSource = hikariDataSource21;
        long long24 = hikariDataSource21.getAcquireRetryDelay();
        java.lang.String str25 = hikariDataSource21.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource5();
        java.lang.String str7 = serializedObjectSupporter5.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        hikariConfig4.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter5.deserializeObjectHikariDataSource17();
        boolean boolean12 = hikariDataSource11.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-6" + "'", str10, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setisIsolateInternalQueries(false);
        int int6 = hikariDataSource1.maxPoolSize;
        javax.sql.DataSource dataSource7 = hikariDataSource1.getDataSource();
        java.lang.String str8 = hikariDataSource1.dataSourceClassName;
        long long9 = hikariDataSource1.getAcquireRetryDelay();
        hikariDataSource1.setAcquireIncrement(1);
        javax.sql.DataSource dataSource12 = hikariDataSource1.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        long long10 = hikariDataSource9.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        int int7 = hikariDataSource4.getmaxPoolSize();
        hikariDataSource4.setAcquireRetries(3);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        int int12 = hikariDataSource11.getAcquireIncrement();
        hikariDataSource11.settransactionIsolationName("hi!");
        hikariDataSource11.acquireRetries = (short) 10;
        hikariDataSource11.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource11.poolName = "";
        hikariDataSource11.setisRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariDataSource11.addDataSourceProperty("SELECT 1", (java.lang.Object) hikariConfig24);
        long long26 = hikariDataSource11.getACQUIRE_RETRY_DELAY();
        hikariDataSource4.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource11);
        hikariDataSource11.setminPoolSize(4);
        hikariDataSource11.setisJdbc4connectionTest(false);
        hikariDataSource11.setDataSourceClassName("HikariPool-99");
        hikariDataSource11.setAcquireRetries(18);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 750L + "'", long26 == 750L);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        int int6 = hikariDataSource1.getmaxPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        hikariDataSource1.dataSource = hikariDataSource9;
        hikariDataSource1.isReadOnly = false;
        hikariDataSource1.setpoolNumber(97);
        hikariDataSource1.isAutoCommit = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource2.maxLifetime = 500L;
        boolean boolean5 = hikariDataSource2.isInitializationFailFast();
        hikariDataSource2.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str5 = hikariConfig0.getPoolName();
        int int6 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-97" + "'", str5, "HikariPool-97");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariDataSource1.isRegisterMbeans();
        hikariDataSource1.isInitializationFailFast = false;
        hikariDataSource1.setJdbcUrl("HikariPool-14");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.Properties properties8 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        long long4 = hikariDataSource1.getAcquireRetryDelay();
        java.lang.String str5 = hikariDataSource1.getCatalog();
        hikariDataSource1.setLeakDetectionThreshold((long) (byte) 0);
        hikariDataSource1.setAcquireRetryDelay((long) ' ');
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter10.deserializeObjectHikariDataSource11();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter10.deserializeObjectHikariDataSource12();
        org.slf4j.impl.SimpleLogger simpleLogger16 = serializedObjectSupporter10.deserializeObjectLogger1();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter10;
        long long18 = hikariDataSource1.getAcquireRetryDelay();
        hikariDataSource1.setAcquireIncrement(105);
        int int21 = hikariDataSource1.getmaxPoolSize();
        hikariDataSource1.validate();
        hikariDataSource1.setUseInstrumentation(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-6" + "'", str14, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(simpleLogger16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        int int6 = hikariDataSource1.getmaxPoolSize();
        boolean boolean7 = hikariDataSource1.isRegisterMbeans;
        hikariDataSource1.setMinimumPoolSize(0);
        boolean boolean10 = hikariDataSource1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str7 = hikariDataSource6.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_READ_COMMITTED" + "'", str7, "TRANSACTION_READ_COMMITTED");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        long long6 = hikariDataSource1.idleTimeout;
        hikariDataSource1.setminPoolSize(35);
        hikariDataSource1.setisJdbc4connectionTest(false);
        boolean boolean11 = hikariDataSource1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        hikariDataSource1.setConnectionTestQuery("HikariPool-32");
        long long6 = hikariDataSource1.idleTimeout;
        java.lang.String str7 = hikariDataSource1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str9 = hikariDataSource8.connectionTestQuery;
        long long10 = hikariDataSource8.acquireRetryDelay;
        boolean boolean11 = hikariDataSource8.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean4 = hikariDataSource3.isInitializationFailFast;
        boolean boolean5 = hikariDataSource3.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        boolean boolean7 = hikariDataSource4.isRegisterMbeans();
        hikariDataSource4.setRegisterMbeans(true);
        boolean boolean10 = hikariDataSource4.isReadOnly;
        boolean boolean11 = hikariDataSource4.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        java.util.Properties properties6 = hikariDataSource1.dataSourceProperties;
        boolean boolean7 = hikariDataSource1.isJdbc4ConnectionTest();
        boolean boolean8 = hikariDataSource1.isIsolateInternalQueries;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = hikariDataSource1.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str2 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean3 = hikariConfig1.isRegisterMbeans;
        long long4 = hikariConfig1.getMaxLifetime();
        int int5 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setisAutoCommit(false);
        boolean boolean8 = hikariDataSource4.getisIsolateInternalQueries();
        hikariDataSource4.catalog = "HikariPool-13";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.acquireRetries = '#';
        hikariDataSource1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.setAutoCommit(false);
        int int9 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setTransactionIsolation("TRANSACTION_READ_COMMITTED");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = hikariDataSource1.serializedObjectSupporter;
        javax.sql.DataSource dataSource13 = hikariDataSource1.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.setMaximumPoolSize((int) '#');
        long long9 = hikariDataSource1.getIdleTimeout();
        java.lang.String str10 = hikariDataSource1.poolName;
        hikariDataSource1.leakDetectionThreshold = 0L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-2" + "'", str10, "HikariPool-2");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        long long5 = hikariDataSource1.getCONNECTION_TIMEOUT();
        hikariDataSource1.leakDetectionThreshold = (short) -1;
        hikariDataSource1.connectionTimeout = (-1);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL hi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.setpoolNumber((int) (short) -1);
        int int6 = hikariDataSource1.maxPoolSize;
        boolean boolean7 = hikariDataSource1.getisReadOnly();
        int int8 = hikariDataSource1.getAcquireIncrement();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter9.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource5();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource16();
        hikariConfig13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString3();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter14;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer21;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-6" + "'", str19, "HikariPool-6");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.acquireRetries = '#';
        hikariDataSource1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.setAutoCommit(false);
        hikariDataSource1.setConnectionTimeout((long) (byte) 0);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        hikariConfig12.setisReadOnly(false);
        long long15 = hikariConfig12.getAcquireRetryDelay();
        hikariDataSource1.copyState(hikariConfig12);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = hikariConfig12.serializedObjectSupporter;
        java.util.Properties properties18 = hikariConfig12.dataSourceProperties;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        long long5 = hikariDataSource4.getACQUIRE_RETRY_DELAY();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource11();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        hikariDataSource4.serializedObjectSupporter = serializedObjectSupporter6;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-6" + "'", str10, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariConfig13);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.util.Properties properties8 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-33" + "'", str9, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        java.lang.String str17 = hikariDataSource16.connectionTestQuery;
        boolean boolean18 = hikariDataSource16.isRegisterMbeans();
        hikariDataSource16.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "VALUES 1" + "'", str17, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        boolean boolean6 = hikariDataSource3.isJdbc4connectionTest;
        hikariDataSource3.dataSourceClassName = "VALUES 1";
        boolean boolean9 = hikariDataSource3.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariDataSource5.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        int int7 = hikariDataSource6.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.connectionTestQuery = "HikariPool-33";
        hikariConfig9.setLeakDetectionThreshold(100L);
        java.lang.String str14 = hikariConfig9.connectionCustomizerClassName;
        hikariDataSource1.copyState(hikariConfig9);
        java.util.Properties properties16 = hikariDataSource1.dataSourceProperties;
        java.lang.String str17 = hikariDataSource1.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str10 = hikariDataSource9.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.setmaxPoolSize(105);
        hikariDataSource1.settransactionIsolationName("HikariPool-9");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setJdbc4ConnectionTest(false);
        hikariDataSource3.setisIsolateInternalQueries(false);
        java.lang.String str8 = hikariDataSource3.connectionCustomizerClassName;
        hikariDataSource3.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isAutoCommit();
        hikariDataSource1.isIsolateInternalQueries = false;
        hikariDataSource1.setisIsolateInternalQueries(true);
        java.lang.String str11 = hikariDataSource1.transactionIsolationName;
        boolean boolean12 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.maxLifetime = (byte) 10;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        boolean boolean4 = hikariDataSource3.getisInitializationFailFast();
        hikariDataSource3.dataSourceClassName = "test";
        hikariDataSource3.dataSourceClassName = "HikariPool-33";
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource5.connectionTestQuery = "HikariPool-14";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        boolean boolean4 = hikariDataSource3.getisJdbc4connectionTest();
        long long5 = hikariDataSource3.maxLifetime;
        boolean boolean6 = hikariDataSource3.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource4.poolName = "HikariPool-33";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter7.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource11();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString8();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString8();
        hikariDataSource4.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter7.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter7.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-33" + "'", str11, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-33" + "'", str12, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean9 = hikariDataSource1.isRegisterMbeans();
        hikariDataSource1.isInitializationFailFast = false;
        boolean boolean12 = hikariDataSource1.isRegisterMbeans();
        hikariDataSource1.minPoolSize = 0;
        java.lang.String str15 = hikariDataSource1.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource3();
        hikariDataSource1.addDataSourceProperty("HikariPool-30", (java.lang.Object) hikariDataSource18);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource2();
        int int22 = hikariDataSource21.getAcquireIncrement();
        boolean boolean23 = hikariDataSource21.isJdbc4connectionTest;
        hikariDataSource21.connectionTimeout = 500L;
        java.lang.String str26 = hikariDataSource21.connectionTestQuery;
        int int27 = hikariDataSource21.getAcquireIncrement();
        int int28 = hikariDataSource21.getminPoolSize();
        int int29 = hikariDataSource21.minPoolSize;
        hikariDataSource21.setminPoolSize((int) (byte) 10);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource21);
        java.lang.String str33 = hikariDataSource21.getDataSourceClassName();
        hikariDataSource21.poolName = "HikariPool-105";
        hikariDataSource21.acquireIncrement = '#';
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "VALUES 1" + "'", str26, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str33, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str5 = hikariDataSource4.getCatalog();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setMaxLifetime((long) 100);
        long long5 = hikariDataSource2.acquireRetryDelay;
        hikariDataSource2.setmaxPoolSize((int) '4');
        long long8 = hikariDataSource2.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource10();
        hikariDataSource10.jdbcUrl = "hi!";
        boolean boolean13 = hikariDataSource10.getisJdbc4connectionTest();
        boolean boolean14 = hikariDataSource10.isReadOnly;
        hikariDataSource2.dataSource = hikariDataSource10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariDataSource2.connectionCustomizer = iConnectionCustomizer16;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter18.deserializeObjectHikariDataSource17();
        boolean boolean23 = hikariDataSource22.getisAutoCommit();
        java.lang.String str24 = hikariDataSource22.jdbcUrl;
        hikariDataSource22.setisAutoCommit(false);
        boolean boolean27 = hikariDataSource22.isInitializationFailFast();
        hikariDataSource2.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource22);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        hikariDataSource9.setIdleTimeout((long) (byte) 1);
        hikariDataSource9.leakDetectionThreshold = (short) 0;
        hikariDataSource9.acquireIncrement = 0;
        hikariDataSource9.setMinimumPoolSize((int) '4');
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource9);
        int int19 = hikariDataSource9.getMaximumPoolSize();
        hikariDataSource9.isRegisterMbeans = true;
        long long22 = hikariDataSource9.idleTimeout;
        java.lang.String str23 = hikariDataSource9.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "VALUES 1" + "'", str23, "VALUES 1");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource5.setRegisterMbeans(true);
        hikariDataSource5.setPoolName("HikariPool-13");
        hikariDataSource5.setPoolName("HikariPool-12");
        hikariDataSource5.isIsolateInternalQueries = true;
        long long14 = hikariDataSource5.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        long long3 = hikariConfig2.getAcquireRetryDelay();
        boolean boolean4 = hikariConfig2.isReadOnly();
        int int5 = hikariConfig2.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource8.setpoolNumber((int) (short) 1);
        long long11 = hikariDataSource8.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource10.setisRegisterMbeans(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties14 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter13.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource9();
        hikariDataSource16.setminPoolSize((int) (short) 10);
        java.lang.String str19 = hikariDataSource16.jdbcUrl;
        hikariDataSource10.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-33" + "'", str7, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource7.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str6 = hikariDataSource5.catalog;
        boolean boolean7 = hikariDataSource5.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource3.acquireRetryDelay = (short) 10;
        long long6 = hikariDataSource3.getConnectionTimeout();
        java.lang.String str7 = hikariDataSource3.gettransactionIsolationName();
        long long8 = hikariDataSource3.getMAX_LIFETIME();
        hikariDataSource3.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_READ_COMMITTED" + "'", str7, "TRANSACTION_READ_COMMITTED");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean6 = hikariConfig0.isJdbc4connectionTest;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = hikariConfig0.serializedObjectSupporter;
        long long8 = hikariConfig0.getMAX_LIFETIME();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str9 = hikariDataSource1.gettransactionIsolationName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        int int12 = hikariDataSource11.getAcquireIncrement();
        long long13 = hikariDataSource11.getLeakDetectionThreshold();
        hikariDataSource11.maxPoolSize = (short) 1;
        java.util.Properties properties16 = hikariDataSource11.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource2();
        int int20 = hikariDataSource19.getAcquireIncrement();
        long long21 = hikariDataSource19.connectionTimeout;
        boolean boolean22 = hikariDataSource19.isJdbc4connectionTest;
        hikariDataSource19.dataSourceClassName = "SELECT 1";
        java.util.Properties properties25 = hikariDataSource19.getDataSourceProperties();
        hikariConfig17.dataSourceProperties = properties25;
        hikariDataSource1.setDataSourceProperties(properties25);
        hikariDataSource1.setAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 500L + "'", long21 == 500L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        int int7 = hikariDataSource1.getAcquireIncrement();
        java.lang.String str8 = hikariDataSource1.connectionCustomizerClassName;
        hikariDataSource1.isAutoCommit = false;
        hikariDataSource1.setmaxPoolSize(10);
        java.lang.String str13 = hikariDataSource1.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setMinimumPoolSize((int) (short) 10);
        hikariDataSource2.setDataSourceClassName("HikariPool-98");
        int int8 = hikariDataSource2.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        int int5 = hikariDataSource2.acquireIncrement;
        hikariDataSource2.isAutoCommit = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = hikariDataSource6.getConnectionTestQuery();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource14();
        hikariDataSource12.setAutoCommit(false);
        boolean boolean15 = hikariDataSource12.isRegisterMbeans;
        boolean boolean16 = hikariDataSource12.isInitializationFailFast;
        hikariDataSource12.setConnectionCustomizerClassName("VALUES 1");
        hikariDataSource12.setIdleTimeout(5000L);
        hikariDataSource12.setLeakDetectionThreshold((long) (-1));
        hikariDataSource12.setMaxLifetime(100L);
        hikariDataSource6.addDataSourceProperty("", (java.lang.Object) hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        int int7 = hikariDataSource4.getmaxPoolSize();
        java.lang.String str8 = hikariDataSource4.getDataSourceClassName();
        hikariDataSource4.acquireIncrement = ' ';
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = hikariDataSource3.poolName;
        hikariDataSource3.setPoolName("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-13" + "'", str4, "HikariPool-13");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        long long6 = hikariDataSource4.getAcquireRetryDelay();
        hikariDataSource4.setisInitializationFailFast(false);
        hikariDataSource4.setMaximumPoolSize((int) '#');
        int int11 = hikariDataSource4.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource2.isIsolateInternalQueries = true;
        hikariDataSource2.setReadOnly(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        int int9 = hikariDataSource8.getAcquireIncrement();
        long long10 = hikariDataSource8.getLeakDetectionThreshold();
        hikariDataSource8.maxPoolSize = (short) 1;
        java.util.Properties properties13 = hikariDataSource8.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        int int17 = hikariDataSource16.getAcquireIncrement();
        long long18 = hikariDataSource16.connectionTimeout;
        boolean boolean19 = hikariDataSource16.isJdbc4connectionTest;
        hikariDataSource16.dataSourceClassName = "SELECT 1";
        java.util.Properties properties22 = hikariDataSource16.getDataSourceProperties();
        hikariConfig14.dataSourceProperties = properties22;
        java.util.Properties properties24 = hikariConfig14.getDataSourceProperties();
        hikariDataSource2.dataSourceProperties = properties24;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 500L + "'", long18 == 500L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.acquireIncrement = 99;
        boolean boolean5 = hikariDataSource2.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.maxLifetime;
        hikariDataSource5.minPoolSize = 0;
        hikariDataSource5.setIsolateInternalQueries(true);
        hikariDataSource5.setJdbc4ConnectionTest(true);
        hikariDataSource5.setMaxLifetime((long) (short) 0);
        long long20 = hikariDataSource5.getCONNECTION_TIMEOUT();
        int int21 = hikariDataSource5.getpoolNumber();
        hikariDataSource5.catalog = "HikariPool-33";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.getCatalog();
        long long7 = hikariDataSource1.getIDLE_TIMEOUT();
        hikariDataSource1.setConnectionTestQuery("HikariPool-7");
        long long10 = hikariDataSource1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 500L + "'", long10 == 500L);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource3();
        hikariDataSource1.addDataSourceProperty("HikariPool-30", (java.lang.Object) hikariDataSource18);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource2();
        int int22 = hikariDataSource21.getAcquireIncrement();
        boolean boolean23 = hikariDataSource21.isJdbc4connectionTest;
        hikariDataSource21.connectionTimeout = 500L;
        java.lang.String str26 = hikariDataSource21.connectionTestQuery;
        int int27 = hikariDataSource21.getAcquireIncrement();
        int int28 = hikariDataSource21.getminPoolSize();
        int int29 = hikariDataSource21.minPoolSize;
        hikariDataSource21.setminPoolSize((int) (byte) 10);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource21);
        hikariDataSource1.transactionIsolation = 114;
        hikariDataSource1.setMinimumPoolSize(60);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "VALUES 1" + "'", str26, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = hikariConfig4.getCatalog();
        java.lang.String str6 = hikariConfig4.getConnectionInitSql();
        hikariConfig4.leakDetectionThreshold = (short) 100;
        java.util.Properties properties9 = hikariConfig4.getDataSourceProperties();
        hikariConfig4.acquireRetries = (byte) 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        hikariDataSource2.isJdbc4connectionTest = false;
        int int6 = hikariDataSource2.getAcquireRetries();
        java.lang.String str7 = hikariDataSource2.jdbcUrl;
        boolean boolean8 = hikariDataSource2.isIsolateInternalQueries;
        hikariDataSource2.setIdleTimeout((long) 1);
        hikariDataSource2.isReadOnly = false;
        long long13 = hikariDataSource2.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean5 = hikariDataSource4.isReadOnly();
        int int6 = hikariDataSource4.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource4.setminPoolSize((int) (short) -1);
        hikariDataSource4.setReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.maxLifetime;
        hikariDataSource5.minPoolSize = 0;
        hikariDataSource5.setIsolateInternalQueries(true);
        boolean boolean16 = hikariDataSource5.isJdbc4ConnectionTest();
        int int17 = hikariDataSource5.maxPoolSize;
        int int18 = hikariDataSource5.getminPoolSize();
        int int19 = hikariDataSource5.getMinimumPoolSize();
        hikariDataSource5.maxLifetime = 33;
        java.lang.String str22 = hikariDataSource5.jdbcUrl;
        hikariDataSource5.connectionCustomizerClassName = "HikariPool-28";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource2.isJdbc4connectionTest = true;
        hikariDataSource2.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource2.isInitializationFailFast = false;
        hikariDataSource2.setConnectionTestQuery("HikariPool-7");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        hikariDataSource4.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.setMaximumPoolSize((int) '#');
        hikariDataSource1.maxPoolSize = (byte) 1;
        boolean boolean11 = hikariDataSource1.isInitializationFailFast();
        boolean boolean12 = hikariDataSource1.getisJdbc4connectionTest();
        long long13 = hikariDataSource1.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str5 = hikariDataSource4.gettransactionIsolationName();
        hikariDataSource4.setAcquireRetryDelay((long) 100);
        boolean boolean8 = hikariDataSource4.isInitializationFailFast;
        java.lang.String str9 = hikariDataSource4.getConnectionTestQuery();
        hikariDataSource4.transactionIsolationName = "HikariPool-17";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        long long6 = hikariDataSource1.idleTimeout;
        java.util.Properties properties7 = hikariDataSource1.getDataSourceProperties();
        hikariDataSource1.setAcquireIncrement((int) '4');
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.maxLifetime;
        hikariDataSource5.setCatalog("HikariPool-97");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = hikariConfig4.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariConfig4.serializedObjectSupporter;
        hikariConfig4.setisReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource5.setConnectionCustomizerClassName("hi!");
        hikariDataSource5.setisIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource6.connectionCustomizerClassName = "";
        int int9 = hikariDataSource6.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        hikariDataSource1.setisRegisterMbeans(true);
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        int int8 = hikariDataSource1.transactionIsolation;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter9.deserializeObjectHikariDataSource3();
        boolean boolean14 = hikariDataSource13.isRegisterMbeans;
        int int15 = hikariDataSource13.getminPoolSize();
        int int16 = hikariDataSource13.getmaxPoolSize();
        boolean boolean17 = hikariDataSource13.isJdbc4ConnectionTest();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource13);
        hikariDataSource13.setUseInstrumentation(false);
        boolean boolean21 = hikariDataSource13.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter14.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource3();
        hikariDataSource1.addDataSourceProperty("HikariPool-30", (java.lang.Object) hikariDataSource18);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource2();
        int int22 = hikariDataSource21.getAcquireIncrement();
        boolean boolean23 = hikariDataSource21.isJdbc4connectionTest;
        hikariDataSource21.connectionTimeout = 500L;
        java.lang.String str26 = hikariDataSource21.connectionTestQuery;
        int int27 = hikariDataSource21.getAcquireIncrement();
        int int28 = hikariDataSource21.getminPoolSize();
        int int29 = hikariDataSource21.minPoolSize;
        hikariDataSource21.setminPoolSize((int) (byte) 10);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource21);
        java.lang.String str33 = hikariDataSource1.getCatalog();
        int int34 = hikariDataSource1.minPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "VALUES 1" + "'", str26, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        hikariDataSource3.setMinimumPoolSize((int) '4');
        long long12 = hikariDataSource3.connectionTimeout;
        java.util.Properties properties13 = hikariDataSource3.getDataSourceProperties();
        hikariDataSource3.setConnectionInitSql("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.validate();
        hikariDataSource1.setmaxPoolSize(114);
        hikariDataSource1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource2.setAcquireRetryDelay(1800000L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource5();
        hikariDataSource8.setAcquireRetries(0);
        hikariDataSource2.setDataSource((javax.sql.DataSource) hikariDataSource8);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource2();
        int int14 = hikariDataSource13.getAcquireIncrement();
        long long15 = hikariDataSource13.getLeakDetectionThreshold();
        hikariDataSource13.maxPoolSize = (short) 1;
        long long18 = hikariDataSource13.acquireRetryDelay;
        hikariDataSource13.setMaximumPoolSize((int) '#');
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource2();
        int int23 = hikariDataSource22.getAcquireIncrement();
        long long24 = hikariDataSource22.connectionTimeout;
        long long25 = hikariDataSource22.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties27 = serializedObjectSupporter26.deserializeObjectProperties1();
        hikariDataSource22.dataSourceProperties = properties27;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariDataSource13.dataSourceProperties = properties27;
        hikariDataSource2.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource13);
        javax.sql.DataSource dataSource32 = hikariDataSource2.dataSource;
        int int33 = hikariDataSource2.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 500L + "'", long24 == 500L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(dataSource32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig8.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.getConnectionCustomizer();
        int int8 = hikariDataSource6.getTransactionIsolation();
        javax.sql.DataSource dataSource9 = hikariDataSource6.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariDataSource17.acquireIncrement = (short) 10;
        int int20 = hikariDataSource17.acquireIncrement;
        hikariDataSource17.acquireIncrement = 1;
        hikariDataSource17.maxPoolSize = 64;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.util.Properties properties8 = hikariDataSource7.dataSourceProperties;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.isInitializationFailFast = true;
        long long7 = hikariDataSource1.getMaxLifetime();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer8;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource4.poolName = "HikariPool-33";
        long long7 = hikariDataSource4.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource5.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        hikariDataSource3.acquireRetries = (byte) 100;
        long long7 = hikariDataSource3.maxLifetime;
        java.lang.String str8 = hikariDataSource3.catalog;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setmaxPoolSize((int) (short) -1);
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean5 = hikariConfig0.isAutoCommit;
        long long6 = hikariConfig0.leakDetectionThreshold;
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        hikariDataSource3.setMinimumPoolSize((int) '4');
        hikariDataSource3.maxPoolSize = 10;
        hikariDataSource3.setCatalog("HikariPool-102");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        hikariDataSource1.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.setInitializationFailFast(false);
        hikariDataSource1.settransactionIsolationName("HikariPool-12");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        java.lang.String str8 = serializedObjectSupporter6.deserializeObjectString5();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource5();
        java.util.Properties properties12 = serializedObjectSupporter6.deserializeObjectProperties1();
        hikariDataSource1.dataSourceProperties = properties12;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str9, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.poolName = "HikariPool-100";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        java.lang.String str4 = hikariDataSource2.getDataSourceClassName();
        boolean boolean5 = hikariDataSource2.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-6" + "'", str3, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        hikariDataSource5.dataSourceClassName = "HikariPool-33";
        hikariDataSource5.addDataSourceProperty("HikariPool-33", (java.lang.Object) (-1.0d));
        long long16 = hikariDataSource5.getCONNECTION_TIMEOUT();
        int int17 = hikariDataSource5.minPoolSize;
        boolean boolean18 = hikariDataSource5.isInitializationFailFast;
        boolean boolean19 = hikariDataSource5.isRegisterMbeans;
        hikariDataSource5.setInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-32" + "'", str6, "HikariPool-32");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setisAutoCommit(false);
        hikariDataSource4.setRegisterMbeans(true);
        java.lang.String str10 = hikariDataSource4.getDataSourceClassName();
        hikariDataSource4.setAcquireRetries((int) (short) 1);
        hikariDataSource4.setDataSourceClassName("HikariPool-13");
        java.lang.String str15 = hikariDataSource4.getPoolName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-15" + "'", str15, "HikariPool-15");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        long long5 = hikariDataSource4.getIDLE_TIMEOUT();
        long long6 = hikariDataSource4.getAcquireRetryDelay();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource4.getConnectionCustomizer();
        int int8 = hikariDataSource4.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig4.connectionTimeout = 0L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        int int5 = hikariDataSource2.getpoolNumber();
        int int6 = hikariDataSource2.getminPoolSize();
        boolean boolean7 = hikariDataSource2.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setMinimumPoolSize((int) (short) 10);
        hikariDataSource2.setDataSourceClassName("HikariPool-98");
        hikariDataSource2.connectionTimeout = 0L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        long long4 = hikariDataSource1.getAcquireRetryDelay();
        java.lang.String str5 = hikariDataSource1.getCatalog();
        hikariDataSource1.setLeakDetectionThreshold((long) (byte) 0);
        hikariDataSource1.setAcquireRetryDelay((long) ' ');
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter10.deserializeObjectHikariDataSource11();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter10.deserializeObjectHikariDataSource12();
        org.slf4j.impl.SimpleLogger simpleLogger16 = serializedObjectSupporter10.deserializeObjectLogger1();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter10;
        long long18 = hikariDataSource1.getAcquireRetryDelay();
        hikariDataSource1.maxPoolSize = 0;
        java.lang.String str21 = hikariDataSource1.getConnectionTestQuery();
        java.lang.String str22 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-6" + "'", str14, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(simpleLogger16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "VALUES 1" + "'", str21, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str22, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariDataSource2.getConnectionCustomizer();
        hikariDataSource2.setConnectionCustomizerClassName("jdbc:stub");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-6");
        java.util.Properties properties8 = hikariDataSource1.getDataSourceProperties();
        hikariDataSource1.setDataSourceClassName("HikariPool-17");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.util.Properties properties8 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.maxPoolSize = (-1);
        hikariConfig0.catalog = "TRANSACTION_REPEATABLE_READ";
        hikariConfig0.setIdleTimeout((long) 'a');
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.isInitializationFailFast = false;
        int int10 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str7, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        hikariDataSource15.setAcquireRetryDelay(750L);
        boolean boolean18 = hikariDataSource15.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-6" + "'", str10, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str7 = hikariDataSource6.connectionTestQuery;
        boolean boolean8 = hikariDataSource6.getisReadOnly();
        hikariDataSource6.connectionTimeout = 114;
        java.lang.String str11 = hikariDataSource6.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str11 = hikariDataSource10.getPoolName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-7" + "'", str11, "HikariPool-7");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.getConnectionCustomizer();
        hikariDataSource6.poolName = "HikariPool-4";
        boolean boolean10 = hikariDataSource6.getisInitializationFailFast();
        int int11 = hikariDataSource6.getpoolNumber();
        hikariDataSource6.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 103 + "'", int11 == 103);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        java.lang.String str4 = hikariDataSource1.connectionInitSql;
        hikariDataSource1.setInitializationFailFast(false);
        java.lang.String str7 = hikariDataSource1.connectionCustomizerClassName;
        hikariDataSource1.dataSourceClassName = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource3.setAcquireRetries(0);
        hikariDataSource3.jdbcUrl = "SELECT 1";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString5();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource8();
        int int13 = hikariDataSource12.getTransactionIsolation();
        hikariDataSource3.setDataSource((javax.sql.DataSource) hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SELECT 1" + "'", str10, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str11, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        hikariDataSource2.setAcquireRetries((int) (short) 1);
        hikariDataSource2.setConnectionCustomizerClassName("TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        int int5 = hikariDataSource2.acquireIncrement;
        javax.sql.DataSource dataSource6 = hikariDataSource2.dataSource;
        boolean boolean7 = hikariDataSource2.isRegisterMbeans;
        boolean boolean8 = hikariDataSource2.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str7 = hikariDataSource6.transactionIsolationName;
        boolean boolean8 = hikariDataSource6.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource8.setLeakDetectionThreshold((long) 6);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariConfig0.serializedObjectSupporter;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource17();
        hikariDataSource5.isReadOnly = false;
        hikariDataSource5.setisIsolateInternalQueries(true);
        hikariConfig0.setDataSource((javax.sql.DataSource) hikariDataSource5);
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        long long6 = hikariConfig5.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.maxLifetime;
        hikariDataSource5.minPoolSize = 0;
        hikariDataSource5.setIsolateInternalQueries(true);
        boolean boolean16 = hikariDataSource5.isJdbc4ConnectionTest();
        int int17 = hikariDataSource5.maxPoolSize;
        int int18 = hikariDataSource5.getminPoolSize();
        hikariDataSource5.setJdbcUrl("");
        int int21 = hikariDataSource5.getTransactionIsolation();
        hikariDataSource5.setInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        long long4 = hikariDataSource1.getCONNECTION_TIMEOUT();
        hikariDataSource1.maxPoolSize = 100;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        hikariDataSource5.dataSourceClassName = "HikariPool-33";
        java.lang.String str13 = hikariDataSource5.connectionCustomizerClassName;
        boolean boolean14 = hikariDataSource5.isJdbc4ConnectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        int int17 = hikariDataSource16.getAcquireIncrement();
        int int18 = hikariDataSource16.getMaximumPoolSize();
        hikariDataSource16.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource16.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean23 = hikariDataSource16.isAutoCommit;
        hikariDataSource16.transactionIsolationName = "";
        java.lang.String str26 = hikariDataSource16.getPoolName();
        hikariDataSource5.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource16);
        long long28 = hikariDataSource16.leakDetectionThreshold;
        hikariDataSource16.setIdleTimeout(600000L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-2" + "'", str26, "HikariPool-2");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        int int3 = hikariDataSource1.getMinimumPoolSize();
        hikariDataSource1.setAutoCommit(true);
        int int6 = hikariDataSource1.getmaxPoolSize();
        hikariDataSource1.setPoolName("HikariPool-99");
        boolean boolean9 = hikariDataSource1.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.isInitializationFailFast = true;
        long long7 = hikariDataSource1.idleTimeout;
        boolean boolean8 = hikariDataSource1.isReadOnly();
        hikariDataSource1.setMaxLifetime((long) (short) -1);
        int int11 = hikariDataSource1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString8();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString3();
        java.lang.String str17 = serializedObjectSupporter11.deserializeObjectString5();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-33" + "'", str15, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-6" + "'", str16, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SELECT 1" + "'", str17, "SELECT 1");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariDataSource2.serializedObjectSupporter;
        boolean boolean4 = hikariDataSource2.getisAutoCommit();
        java.lang.String str5 = hikariDataSource2.getConnectionTestQuery();
        hikariDataSource2.setReadOnly(true);
        hikariDataSource2.isAutoCommit = false;
        hikariDataSource2.leakDetectionThreshold = 20;
        java.lang.String str12 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.connectionTimeout = 36;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.isInitializationFailFast = true;
        long long7 = hikariDataSource1.getMaxLifetime();
        hikariDataSource1.connectionTimeout = 0L;
        int int10 = hikariDataSource1.acquireRetries;
        long long11 = hikariDataSource1.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource2.setisIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        hikariDataSource1.acquireRetries = 3;
        long long8 = hikariDataSource1.maxLifetime;
        java.lang.String str9 = hikariDataSource1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        hikariDataSource3.setCatalog("HikariPool-30");
        hikariDataSource3.poolName = "HikariPool-99";
        long long8 = hikariDataSource3.getCONNECTION_TIMEOUT();
        boolean boolean9 = hikariDataSource3.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource2.maxPoolSize = 'a';
        java.lang.String str5 = hikariDataSource2.catalog;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.getCatalog();
        long long7 = hikariDataSource1.getIDLE_TIMEOUT();
        hikariDataSource1.setReadOnly(false);
        java.lang.String str10 = hikariDataSource1.getDataSourceClassName();
        int int11 = hikariDataSource1.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setisAutoCommit(false);
        hikariDataSource4.setRegisterMbeans(true);
        java.lang.String str10 = hikariDataSource4.dataSourceClassName;
        int int11 = hikariDataSource4.getminPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariDataSource4.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.connectionTimeout = (byte) 1;
        java.lang.String str7 = hikariDataSource1.transactionIsolationName;
        int int8 = hikariDataSource1.getMinimumPoolSize();
        javax.sql.DataSource dataSource9 = hikariDataSource1.getDataSource();
        hikariDataSource1.connectionTimeout = (byte) 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        java.util.Properties properties4 = hikariDataSource1.dataSourceProperties;
        java.lang.String str5 = hikariDataSource1.getConnectionTestQuery();
        long long6 = hikariDataSource1.getLeakDetectionThreshold();
        java.lang.String str7 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setMaximumPoolSize(3);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str6 = hikariDataSource5.getCatalog();
        hikariDataSource5.acquireIncrement = ' ';
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource5.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.idleTimeout;
        hikariDataSource1.setReadOnly(false);
        hikariDataSource1.setminPoolSize(35);
        int int12 = hikariDataSource1.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str5 = hikariDataSource4.gettransactionIsolationName();
        long long6 = hikariDataSource4.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int9 = hikariConfig8.acquireIncrement;
        hikariConfig8.transactionIsolation = 114;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        long long9 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str10 = hikariDataSource1.getJdbcUrl();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter11.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        int int17 = hikariDataSource16.getAcquireIncrement();
        long long18 = hikariDataSource16.connectionTimeout;
        long long19 = hikariDataSource16.getAcquireRetryDelay();
        hikariDataSource14.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource16);
        long long21 = hikariDataSource16.getLeakDetectionThreshold();
        hikariDataSource16.dataSourceClassName = "HikariPool-33";
        hikariDataSource16.addDataSourceProperty("HikariPool-33", (java.lang.Object) (-1.0d));
        long long27 = hikariDataSource16.getCONNECTION_TIMEOUT();
        hikariDataSource1.dataSource = hikariDataSource16;
        hikariDataSource1.connectionCustomizerClassName = "test";
        boolean boolean31 = hikariDataSource1.isInitializationFailFast();
        boolean boolean32 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.isInitializationFailFast = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 500L + "'", long18 == 500L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        hikariDataSource9.setIdleTimeout((long) (byte) 1);
        hikariDataSource9.leakDetectionThreshold = (short) 0;
        hikariDataSource9.acquireIncrement = 0;
        hikariDataSource9.setMinimumPoolSize((int) '4');
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource9);
        hikariDataSource3.setpoolNumber((int) (short) -1);
        boolean boolean21 = hikariDataSource3.isAutoCommit;
        hikariDataSource3.setminPoolSize(105);
        int int24 = hikariDataSource3.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        int int10 = hikariDataSource9.getAcquireIncrement();
        long long11 = hikariDataSource9.connectionTimeout;
        long long12 = hikariDataSource9.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties14 = serializedObjectSupporter13.deserializeObjectProperties1();
        hikariDataSource9.dataSourceProperties = properties14;
        hikariDataSource1.setDataSourceProperties(properties14);
        hikariDataSource1.setTransactionIsolation("TRANSACTION_REPEATABLE_READ");
        boolean boolean19 = hikariDataSource1.isInitializationFailFast;
        long long20 = hikariDataSource1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 500L + "'", long11 == 500L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setTransactionIsolation("");
        boolean boolean5 = hikariDataSource1.getisRegisterMbeans();
        int int6 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setLeakDetectionThreshold((long) 4);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        int int12 = hikariDataSource11.getAcquireIncrement();
        long long13 = hikariDataSource11.connectionTimeout;
        long long14 = hikariDataSource11.getAcquireRetryDelay();
        hikariDataSource9.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource11);
        hikariDataSource1.dataSource = hikariDataSource9;
        long long17 = hikariDataSource1.getAcquireRetryDelay();
        hikariDataSource1.isRegisterMbeans = true;
        java.lang.String str20 = hikariDataSource1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-33" + "'", str20, "HikariPool-33");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        int int4 = hikariDataSource1.minPoolSize;
        hikariDataSource1.acquireRetryDelay = '#';
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-7");
        hikariDataSource1.connectionCustomizerClassName = "HikariPool-14";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        hikariDataSource5.dataSourceClassName = "HikariPool-33";
        hikariDataSource5.addDataSourceProperty("HikariPool-33", (java.lang.Object) (-1.0d));
        java.lang.String str16 = hikariDataSource5.dataSourceClassName;
        hikariDataSource5.connectionTimeout = 60;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource4();
        hikariDataSource20.jdbcUrl = "HikariPool-33";
        hikariDataSource20.setAcquireIncrement((int) (byte) 1);
        hikariDataSource20.setConnectionCustomizerClassName("HikariPool-6");
        java.util.Properties properties27 = hikariDataSource20.getDataSourceProperties();
        hikariDataSource5.dataSourceProperties = properties27;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-33" + "'", str16, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource3.setJdbcUrl("VALUES 1");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariDataSource3.serializedObjectSupporter;
        boolean boolean7 = hikariDataSource3.isJdbc4ConnectionTest();
        hikariDataSource3.setisRegisterMbeans(true);
        java.lang.String str10 = hikariDataSource3.dataSourceClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource3.setAcquireRetries(0);
        java.util.Properties properties6 = hikariDataSource3.getDataSourceProperties();
        long long7 = hikariDataSource3.getMaxLifetime();
        hikariDataSource3.setInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource8.setpoolNumber((int) (short) 1);
        hikariDataSource8.maxLifetime = 101;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        java.lang.String str11 = hikariDataSource5.getPoolName();
        hikariDataSource5.isAutoCommit = true;
        long long14 = hikariDataSource5.maxLifetime;
        long long15 = hikariDataSource5.acquireRetryDelay;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-4" + "'", str11, "HikariPool-4");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setAcquireRetries((int) (short) 0);
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-30");
        boolean boolean10 = hikariDataSource1.isInitializationFailFast;
        java.util.Properties properties11 = hikariDataSource1.dataSourceProperties;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str7 = hikariDataSource6.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str4, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        hikariDataSource1.setConnectionTestQuery("HikariPool-32");
        long long6 = hikariDataSource1.acquireRetryDelay;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        java.lang.String str9 = hikariDataSource1.getConnectionCustomizerClassName();
        hikariDataSource1.transactionIsolationName = "HikariPool-97";
        hikariDataSource1.setPoolName("jdbc:stub");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean5 = hikariConfig0.isAutoCommit();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.getConnectionCustomizer();
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariConfig0.serializedObjectSupporter;
        hikariConfig0.setpoolNumber((int) 'a');
        boolean boolean9 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        java.util.Properties properties6 = hikariDataSource1.dataSourceProperties;
        boolean boolean7 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.isIsolateInternalQueries = false;
        java.lang.String str10 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        int int4 = hikariDataSource2.getTransactionIsolation();
        hikariDataSource2.leakDetectionThreshold = (byte) -1;
        int int7 = hikariDataSource2.getminPoolSize();
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource2.setDataSourceProperties(properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        boolean boolean7 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.setInitializationFailFast(false);
        hikariDataSource1.connectionTimeout = 3;
        int int12 = hikariDataSource1.getAcquireRetries();
        hikariDataSource1.setConnectionTestQuery("HikariPool-30");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str5 = hikariConfig0.getPoolName();
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-97" + "'", str5, "HikariPool-97");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource2.setAcquireRetryDelay(1800000L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter5.deserializeObjectHikariDataSource12();
        hikariDataSource2.serializedObjectSupporter = serializedObjectSupporter5;
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter5.deserializeObjectHikariDataSource12();
        java.lang.String str12 = serializedObjectSupporter5.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter5.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter5.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource14);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        long long5 = hikariDataSource4.acquireRetryDelay;
        hikariDataSource4.setisIsolateInternalQueries(false);
        hikariDataSource4.setAcquireRetries(3);
        hikariDataSource4.setTransactionIsolation("HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource5.transactionIsolation = (short) 10;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource7.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource4.dataSourceClassName = "HikariPool-102";
        hikariDataSource4.maxPoolSize = (short) 1;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean7 = hikariDataSource6.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        boolean boolean5 = hikariDataSource4.getisAutoCommit();
        hikariDataSource4.setisRegisterMbeans(true);
        hikariDataSource4.setminPoolSize(14);
        hikariDataSource4.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        long long10 = hikariDataSource5.getLeakDetectionThreshold();
        long long11 = hikariDataSource5.maxLifetime;
        hikariDataSource5.minPoolSize = 0;
        hikariDataSource5.setIsolateInternalQueries(true);
        boolean boolean16 = hikariDataSource5.isJdbc4ConnectionTest();
        hikariDataSource5.leakDetectionThreshold = 0L;
        java.lang.String str19 = hikariDataSource5.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource2();
        int int6 = hikariDataSource5.getAcquireIncrement();
        long long7 = hikariDataSource5.connectionTimeout;
        long long8 = hikariDataSource5.getAcquireRetryDelay();
        hikariDataSource3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource5);
        java.lang.String str10 = hikariDataSource3.getConnectionTestQuery();
        hikariDataSource3.maxPoolSize = (byte) 0;
        java.lang.String str13 = hikariDataSource3.getConnectionTestQuery();
        hikariDataSource3.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "VALUES 1" + "'", str13, "VALUES 1");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer2;
        int int4 = hikariDataSource1.transactionIsolation;
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        long long6 = hikariDataSource1.getACQUIRE_RETRY_DELAY();
        boolean boolean7 = hikariDataSource1.getisAutoCommit();
        java.lang.String str8 = hikariDataSource1.gettransactionIsolationName();
        hikariDataSource1.setisAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter4.deserializeObjectHikariConfig1();
        hikariConfig5.catalog = "HikariPool-33";
        hikariConfig5.maxLifetime = (byte) -1;
        long long10 = hikariConfig5.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        hikariDataSource17.acquireIncrement = (short) 10;
        long long20 = hikariDataSource17.acquireRetryDelay;
        hikariDataSource17.setisInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean8 = hikariDataSource1.isAutoCommit;
        hikariDataSource1.transactionIsolationName = "";
        hikariDataSource1.setConnectionTimeout((long) 101);
        hikariDataSource1.setIsolateInternalQueries(true);
        boolean boolean15 = hikariDataSource1.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}
